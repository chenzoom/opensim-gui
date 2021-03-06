/* -------------------------------------------------------------------------- *
 * OpenSim: ExcitationColumnJPanel.java                                       *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib                                                     *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain a  *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0          *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 * -------------------------------------------------------------------------- */

/*
 * ExcitationColumnJPanel.java
 *
 * Created on February 13, 2008, 11:56 AM
 */

package org.opensim.view.excitationEditor;

import java.awt.Component;
import java.awt.Dimension;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Vector;
import org.opensim.modeling.ControlLinear;
import org.opensim.modeling.XYFunctionInterface;

/**
 *
 * @author  Ayman
 */
public class ExcitationColumnJPanel extends javax.swing.JPanel {
    
    Vector<ExcitationPanel> cache= new Vector<ExcitationPanel>(4);
    // When adding panels, the only way to specify location is adding them as JComponents at index. 
    // this number accounts for components other than ExcitationPanels in 
    int componentOffset=1;  
    int ratioUncollapsedToCollapsedSize=16;
    //Vector<ExcitationPanelListener> listeners = new Vector<ExcitationPanelListener>(4);
    /** Creates new form ExcitationColumnJPanel */
    public ExcitationColumnJPanel() {
        initComponents();
        //setPreferredSize(new Dimension(100, 300));
    }
        
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jColumnNameLabel = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        setToolTipText("\"Column of Excitations\"");
        setAutoscrolls(true);
        setName("name");
        jColumnNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jColumnNameLabel.setText("jColumnLabel");
        jColumnNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jColumnNameLabel);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jColumnNameLabel;
    // End of variables declaration//GEN-END:variables
    
    void exchange(int position1, int position2)
    {
        // Need to remove and insert
        int lower, upper;
        if(position1<position2){
            upper = position1;
            lower = position2;
        }
        else {
            upper = position2;
            lower = position1;            
        }
            
        ExcitationPanel p1 = getPanel(lower);
        ExcitationPanel p2 = getPanel(upper);
        this.remove(p1);
        this.remove(p2);
        this.add(p1, upper+1);
        this.add(p2, lower+1);
        validate();
    }

    void removePanel(int row) {
        ExcitationPanel fp = cache.get(row);
        int index = cache.indexOf(fp);
        remove(fp);
        validate();
    }
    
    void removePanel(ExcitationPanel aPanel) {
        //System.out.println("Removing panel "+aPanel.toString()+" from column "+jColumnNameLabel.getText());
        remove(aPanel);
        int idx=cache.indexOf(aPanel);
        cache.remove(aPanel);
        Component component[] = getComponents();
        for (int i=0; i<component.length; i++){
            Component c=component[i];
            int unused = 1;
        }
        validate();
    }
    
    void appendPanel(ExcitationPanel excitationPanel) {
        //System.out.println("Appending panel "+excitationPanel.toString()+" to column "+jColumnNameLabel.getText());
        add(excitationPanel);
        cache.add(excitationPanel);
        validate();
    }
    
    void addPanel(ExcitationPanel excitationPanel, int i) {
        add(excitationPanel, i+1);
        cache.insertElementAt(excitationPanel, i);
        validate();
    }

    public ExcitationPanel getPanel(int row)
    {
        return (ExcitationPanel) getComponents()[row+1];
    }
    
    void set(int row, ExcitationPanel panel)
    {
        add(panel);
        if (cache.size()<row+1){  // We should make sure cache.size()
            cache.add(panel);
        }
        cache.set(row, panel);
    }
    
    void append(ExcitationPanel excitationPanel, ControlLinear excitation, Vector<XYFunctionInterface> functionsToEdit)
    {
        excitationPanel.setPreferredSize(new Dimension(300, 100));
        add(excitationPanel);
        cache.add(excitationPanel);
        // Create listener and add it too
        ExcitationPanelListener listener= new ExcitationPanelListener(excitationPanel, excitation, functionsToEdit);
        //listeners.add(listener);
        excitationPanel.addFunctionPanelListener(listener);
    }
    public ExcitationColumnJPanel(String[] names) {
        initComponents();
        //setPreferredSize(new Dimension(100, 300));
    }
    
    public void applyValueToSelectedNodes(double valueDouble) {
        for(int i=0; i<cache.size(); i++)
            cache.get(i).setSelectedNodesToValue(0, valueDouble);
    }
    
    public void removeSelectedNodes() {
        
        for(int i=0; i<cache.size(); i++)
            cache.get(i).deleteSelectedNodes();
    }

    public String toString() {
        return jColumnNameLabel.getText();
    }

    void setLabel(String colLabel) {
        jColumnNameLabel.setText(colLabel);
        validate();
    }

    void toggle(ExcitationPanel dPanel) {
        // Compute size of panel. Expanded panels are ratioUncollapsedToCollapsedSize times as big as collapsed ones
        int totalheight = this.getHeight();
        int width = this.getWidth();
        int numCollapsed = 0;
        int numTotal = cache.size();
        for (int i=0; i<cache.size(); i++){
            ExcitationPanel p1 = getPanel(i);
            if (p1.equals(dPanel)){
                p1.setCollapsed(!p1.isCollapsed());
            }
            numCollapsed += (cache.get(i).isCollapsed()?1:0);
        }
        int collapsedHeight = (int)((double) totalheight)/(numCollapsed + (numTotal-numCollapsed)*ratioUncollapsedToCollapsedSize);
        //System.out.println("collapsedHeight="+collapsedHeight);
        for (int i=0; i<cache.size(); i++){
            ExcitationPanel p1 = getPanel(i);
            if (p1.isCollapsed()){
                p1.setSize(new Dimension(width, collapsedHeight));
                p1.setPreferredSize(new Dimension(width, collapsedHeight));
                p1.setMaximumDrawHeight(collapsedHeight);
            }
            else{
                p1.setPreferredSize(new Dimension(width, ratioUncollapsedToCollapsedSize*collapsedHeight));
                p1.setSize(new Dimension(width, ratioUncollapsedToCollapsedSize*collapsedHeight));
                p1.setMaximumDrawHeight(ratioUncollapsedToCollapsedSize*collapsedHeight);
           }
        }
        invalidate();
        doLayout();
    }

    public String getColumnNameLabelText() {
        return jColumnNameLabel.getText();
    }

    public void setColumnNameLabelText(String newColumnNameLabel) {
        this.jColumnNameLabel.setText(newColumnNameLabel);
    }

    void write(BufferedWriter writer) throws IOException {
        writer.write(getColumnNameLabelText()+"\n");
        writer.write(cache.size()+"\n");
         for(int i=0; i<cache.size(); i++) {
            ExcitationPanel p1 = getPanel(i);
            writer.write(p1.getControlName()+"\n");
        }
    }

    void backup() {
         for(int i=0; i<cache.size(); i++) {
            ExcitationPanel p1 = getPanel(i);
            p1.backup();
         }
    }

    void restore() {
         for(int i=0; i<cache.size(); i++) {
            ExcitationPanel p1 = getPanel(i);
            p1.restore();
         }
    }

    void showBaseShape(int series, boolean b) {
         for(int i=0; i<cache.size(); i++) {
            ExcitationPanel p1 = getPanel(i);
            p1.showBaseShape(series, b);
         }        
    }

    void toggleMinMaxShading(boolean b) {
         for(int i=0; i<cache.size(); i++) {
            ExcitationPanel p1 = getPanel(i);
            p1.toggleMinMaxShading(b);
         }        
    }

}
