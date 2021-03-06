/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neuroph.netbeans.tcr.wizards;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.openide.util.Exceptions;

public final class DocumentRecognitionVisualPanel1 extends JPanel {

    private ImageTableModel imageTableModel;
    
    /**
     * Creates new form DocumentRecognitionVisualPanel1
     */
    public DocumentRecognitionVisualPanel1() {
        initComponents();
        imageTableModel = new ImageTableModel();
        tbmDocuments.setModel(imageTableModel);
        tbmDocuments.addMouseListener(new DocumentRecognitionVisualPanel1.RightClickMouseAdapter());
    }

    @Override
    public String getName() {
        return "Choose documents and texts";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbmDocuments = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAddRow = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnDeleteRow = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        tbmDocuments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbmDocuments);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(DocumentRecognitionVisualPanel1.class, "DocumentRecognitionVisualPanel1.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(DocumentRecognitionVisualPanel1.class, "DocumentRecognitionVisualPanel1.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnAddRow, org.openide.util.NbBundle.getMessage(DocumentRecognitionVisualPanel1.class, "DocumentRecognitionVisualPanel1.btnAddRow.text")); // NOI18N
        btnAddRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRowActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(DocumentRecognitionVisualPanel1.class, "DocumentRecognitionVisualPanel1.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnDeleteRow, org.openide.util.NbBundle.getMessage(DocumentRecognitionVisualPanel1.class, "DocumentRecognitionVisualPanel1.btnDeleteRow.text")); // NOI18N
        btnDeleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRowActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(DocumentRecognitionVisualPanel1.class, "DocumentRecognitionVisualPanel1.jLabel4.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeleteRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeleteRow)))
                .addGap(43, 43, 43)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRowActionPerformed
        imageTableModel.addNewRow();
    }//GEN-LAST:event_btnAddRowActionPerformed

    private void btnDeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRowActionPerformed
        
        int row = tbmDocuments.getSelectedRow();
        if (row == -1)
            return;
        imageTableModel.deleteRow(row);
        
        
        
    }//GEN-LAST:event_btnDeleteRowActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRow;
    private javax.swing.JButton btnDeleteRow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbmDocuments;
    // End of variables declaration//GEN-END:variables



    class RightClickMouseAdapter extends MouseAdapter {

        
        @Override
        public void  mouseReleased(MouseEvent e) {
            int r = tbmDocuments.rowAtPoint(e.getPoint());
            if (r >= 0 && r < tbmDocuments.getRowCount()) {
                tbmDocuments.setRowSelectionInterval(r, r);
            } else {
                tbmDocuments.clearSelection();
            }

            int c = tbmDocuments.columnAtPoint(e.getPoint());
            if (c < 0 || c > 1)
                return;
            
            int rowindex = tbmDocuments.getSelectedRow();
            if (rowindex < 0) 
                return;
            
//            int columnIndex = tbmDocuments.getSelectedColumn();
//            if (columnIndex < 0 || columnIndex > 1)
//                return;
            int columnIndex = c;
            
            if (e.isPopupTrigger() && e.getComponent() instanceof JTable) {
                if (columnIndex == 0) {
                    JPopupMenu popup = createPopChooseImage(rowindex, columnIndex);
                    popup.show(e.getComponent(), e.getX(), e.getY());
                    popup.setVisible(true);
                }
                if (columnIndex == 1) {
                    JPopupMenu popup = createPopChooseText(rowindex, columnIndex);
                    popup.show(e.getComponent(), e.getX(), e.getY());
                    popup.setVisible(true);
                }
            }
        }

        private JPopupMenu createPopChooseImage(final int row, final int columnIndex) {
            JPopupMenu popup = new JPopupMenu();
            JMenuItem chooseImage = new JMenuItem("Choose image/document");
            chooseImage.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    String absPath = getFilePathChooser();
                    if (absPath == null) {
                        return;
                    }
                    int index = absPath.lastIndexOf("\\")+1;
                    String name = absPath.substring(index);
                    BufferedImage image = null;
                    try {
                        image = ImageIO.read(new File(absPath));
                    } catch (IOException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                    
                    imageTableModel.updateRowWithImage(row, name, image);
                    
                    
                }
            });
            popup.add(chooseImage);
            
            return popup;
        }
        
        
        private JPopupMenu createPopChooseText(final int row, final int columnIndex) {
            JPopupMenu popup = new JPopupMenu();

            JMenuItem chhoseText = new JMenuItem("Choose text/document");
            chhoseText.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    String absPath = getFilePathChooser();
                    if (absPath == null) {
                        return;
                    }
                    int index = absPath.lastIndexOf("\\")+1;
                    String name = absPath.substring(index);
                   
                    
                    imageTableModel.updateRowWithText(row, absPath, name);
                }
            });
            popup.add(chhoseText);
            return popup;
        }
    }
    


    
    
    
    
    
    
 private String getFilePathChooser() {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Choose file:");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile().getAbsolutePath();
        } else {
            return null;
        }
    }

    public List<DocumentWrapper> getDocuments() {
        return imageTableModel.getList();
    }




}
