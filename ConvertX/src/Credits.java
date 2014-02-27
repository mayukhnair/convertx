
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shubham
 */
public class Credits extends javax.swing.JFrame {

    /**
     * Creates new form NewCredits
     */
    public Credits() {
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

        Version = new javax.swing.JLabel();
        appTitle = new javax.swing.JLabel();
        copyrigtText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        credit = new javax.swing.JTextArea();
        closeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        credit1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Version.setText("Version: 0.2-alpha (video only)");
        Version.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        appTitle.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        appTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        appTitle.setText("ConvertX ");
        appTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        copyrigtText.setText("© 2014 Mayukh Nair. All rights reserved.");

        credit.setColumns(20);
        credit.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        credit.setLineWrap(true);
        credit.setRows(5);
        credit.setTabSize(4);
        credit.setText("Powered by JAVE-Java Audio Video Encoder. \n© 2009 Sauron Software S.p.A.\n\nJava, the Java Mug Logo, Duke and other logos are registered trademarks of Sun Microsystems, Inc./ Oracle Corporation. ©1993-2014 Sun Microsystems/Oracle Corporation. By using this program, you agree to any terms and conditions put forward by Sun Microsystems, Inc. and Oracle Corporation.\n\nThis program uses libraries from the FFMPEG project and it's contributors. © 2014 The FFMPEG Project and it's contributors. All rights reserved. By using this program, you agree to any terms and conditions put forward by the FFMPEG project and it's contributors.\n");
        credit.setWrapStyleWord(true);
        credit.setCaretColor(java.awt.Color.red);
        credit.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(credit);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        credit1.setColumns(20);
        credit1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        credit1.setLineWrap(true);
        credit1.setRows(5);
        credit1.setTabSize(4);
        credit1.setText("Coding, Design and Support by Mayukh Nair\nTesting: Mayukh Nair, Rohitashva Vashishtha (Windows), Shubham Rao (Ubuntu/OpenSUSE), Harsh Songra (Mac OS X)\nGUI Tweaking (Linux) and Issue patching by Shubham Rao\nFor feedback/complaints, contact the developer at nairmayukh@gmail.com.\nHave an issue? Let the developers know. File an issue at http://www.github.com/mayukhnair/convertx");
        credit1.setWrapStyleWord(true);
        credit1.setCaretColor(java.awt.Color.red);
        credit1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(credit1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imglib/ffmpeg-logo.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imglib/java.svg.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(appTitle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18))
                                    .addComponent(copyrigtText)
                                    .addComponent(Version))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(appTitle)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Version)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyrigtText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName());
        } 
        catch (ClassNotFoundException | InstantiationException | 
                IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Credits.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NewCredits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NewCredits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NewCredits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NewCredits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Credits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Version;
    private javax.swing.JLabel appTitle;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel copyrigtText;
    private javax.swing.JTextArea credit;
    private javax.swing.JTextArea credit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
