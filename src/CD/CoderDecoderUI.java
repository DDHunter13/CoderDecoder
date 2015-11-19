/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CD;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class CoderDecoderUI extends javax.swing.JFrame {

    /**
     * Creates new form CoderDecoderUI
     */
    public CoderDecoderUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codeMethodButtonGroup = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        dilaogGenerateButton = new javax.swing.JButton();
        dialogTextField = new javax.swing.JTextField();
        dialogKeyLabel = new javax.swing.JLabel();
        dialogEnterButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        selectedMethodLabel = new javax.swing.JLabel();
        codeMethodLabel = new javax.swing.JLabel();
        keyLabel = new javax.swing.JLabel();
        currentKeyLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        outTextField = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        encodeButton = new javax.swing.JButton();
        decodeButton = new javax.swing.JButton();
        encodeLable = new javax.swing.JLabel();
        decodeLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inTextField = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuCodeMethods = new javax.swing.JMenu();
        noButton = new javax.swing.JRadioButtonMenuItem();
        rot13Button = new javax.swing.JRadioButtonMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        settingsMenuButton = new javax.swing.JMenuItem();

        jDialog1.setTitle("Encoding Settings");
        jDialog1.setMinimumSize(new java.awt.Dimension(300, 150));
        jDialog1.setModal(true);
        jDialog1.setResizable(false);

        jPanel3.setMaximumSize(new java.awt.Dimension(400, 200));
        jPanel3.setMinimumSize(new java.awt.Dimension(400, 200));

        dilaogGenerateButton.setText("Generate");
        dilaogGenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dilaogGenerateButtonActionPerformed(evt);
            }
        });

        dialogTextField.setText("13");

        dialogKeyLabel.setText("Current Key:");

        dialogEnterButton.setText("Enter Key");
        dialogEnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialogEnterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dialogKeyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dialogEnterButton)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(dialogTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dilaogGenerateButton)))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dilaogGenerateButton)
                    .addComponent(dialogTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dialogKeyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dialogEnterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coder Decoder");
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        selectedMethodLabel.setText("Rot13");

        codeMethodLabel.setText("Code Method:");

        keyLabel.setText("Key:");

        currentKeyLabel.setText("13");

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        outTextField.setColumns(20);
        outTextField.setRows(5);
        jScrollPane3.setViewportView(outTextField);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        encodeButton.setText("►");
        encodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(encodeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 20));

        decodeButton.setText("◄");
        decodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(decodeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 20));

        encodeLable.setText("Encode:");
        jPanel1.add(encodeLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        decodeLabel.setText("Decode:");
        jPanel1.add(decodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        inTextField.setColumns(20);
        inTextField.setRows(5);
        inTextField.setMinimumSize(new java.awt.Dimension(1, 1));
        jScrollPane2.setViewportView(inTextField);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );

        menuFile.setText("File");
        jMenuBar1.add(menuFile);

        menuCodeMethods.setText("Code methods");
        codeMethodButtonGroup.add(menuCodeMethods);
        menuCodeMethods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCodeMethodsActionPerformed(evt);
            }
        });

        codeMethodButtonGroup.add(noButton);
        noButton.setText("No");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });
        menuCodeMethods.add(noButton);

        codeMethodButtonGroup.add(rot13Button);
        rot13Button.setSelected(true);
        rot13Button.setText("Rot13");
        rot13Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rot13ButtonActionPerformed(evt);
            }
        });
        menuCodeMethods.add(rot13Button);
        menuCodeMethods.add(jSeparator2);

        settingsMenuButton.setText("Settings");
        settingsMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsMenuButtonActionPerformed(evt);
            }
        });
        menuCodeMethods.add(settingsMenuButton);

        jMenuBar1.add(menuCodeMethods);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codeMethodLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedMethodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(keyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentKeyLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeMethodLabel)
                    .addComponent(selectedMethodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyLabel)
                    .addComponent(currentKeyLabel))
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeButtonActionPerformed
        outTextField.setText(CoderDecoder.encode(inTextField.getText()));
    }//GEN-LAST:event_encodeButtonActionPerformed

    private void decodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeButtonActionPerformed
        inTextField.setText(CoderDecoder.decode(outTextField.getText()));
    }//GEN-LAST:event_decodeButtonActionPerformed

    private void menuCodeMethodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCodeMethodsActionPerformed
        
    }//GEN-LAST:event_menuCodeMethodsActionPerformed

    private void settingsMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsMenuButtonActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_settingsMenuButtonActionPerformed

    private void rot13ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rot13ButtonActionPerformed
        SettingsChanger.methodChanged(rot13Button.getText());
    }//GEN-LAST:event_rot13ButtonActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        SettingsChanger.methodChanged(noButton.getText());
    }//GEN-LAST:event_noButtonActionPerformed

    private void dialogEnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialogEnterButtonActionPerformed
        CoderDecoder.keyChaged(dialogTextField.getText());
        jDialog1.setVisible(false);
    }//GEN-LAST:event_dialogEnterButtonActionPerformed

    private void dilaogGenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dilaogGenerateButtonActionPerformed
        dialogTextField.setText(KeyGenerator.generateKey());
    }//GEN-LAST:event_dilaogGenerateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CoderDecoderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoderDecoderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoderDecoderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoderDecoderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoderDecoderUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup codeMethodButtonGroup;
    private javax.swing.JLabel codeMethodLabel;
    private javax.swing.JLabel currentKeyLabel;
    private javax.swing.JButton decodeButton;
    private javax.swing.JLabel decodeLabel;
    private javax.swing.JButton dialogEnterButton;
    private javax.swing.JLabel dialogKeyLabel;
    private javax.swing.JTextField dialogTextField;
    private javax.swing.JButton dilaogGenerateButton;
    private javax.swing.JButton encodeButton;
    private javax.swing.JLabel encodeLable;
    private javax.swing.JTextArea inTextField;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel keyLabel;
    private javax.swing.JMenu menuCodeMethods;
    private javax.swing.JMenu menuFile;
    private javax.swing.JRadioButtonMenuItem noButton;
    private javax.swing.JTextArea outTextField;
    private javax.swing.JRadioButtonMenuItem rot13Button;
    private javax.swing.JLabel selectedMethodLabel;
    private javax.swing.JMenuItem settingsMenuButton;
    // End of variables declaration//GEN-END:variables
}
