/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author LENOVO
 */
public class PilihGambarButtonFullScreen extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButtonFullScreen() {
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

        buttonpanel = new javax.swing.JPanel();
        pdiBT = new javax.swing.JButton();
        demokratBT = new javax.swing.JButton();
        golkarBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();
        imagepanel = new javax.swing.JPanel();
        pdiLB = new javax.swing.JLabel();
        demokratLB = new javax.swing.JLabel();
        golkarLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        buttonpanel.setBackground(new java.awt.Color(153, 153, 153));

        pdiBT.setText("PDI");
        pdiBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdiBTActionPerformed(evt);
            }
        });
        buttonpanel.add(pdiBT);

        demokratBT.setText("Demokrat");
        demokratBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demokratBTActionPerformed(evt);
            }
        });
        buttonpanel.add(demokratBT);

        golkarBT.setText("Golkar");
        golkarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golkarBTActionPerformed(evt);
            }
        });
        buttonpanel.add(golkarBT);

        exitBT.setText("Exit");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });
        buttonpanel.add(exitBT);

        getContentPane().add(buttonpanel, java.awt.BorderLayout.PAGE_START);

        imagepanel.setLayout(new java.awt.CardLayout());

        pdiLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdi.png"))); // NOI18N
        imagepanel.add(pdiLB, "0");

        demokratLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/demokrat.png"))); // NOI18N
        imagepanel.add(demokratLB, "1");

        golkarLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/golkar.png"))); // NOI18N
        golkarLB.setMaximumSize(new java.awt.Dimension(800, 422));
        imagepanel.add(golkarLB, "2");

        getContentPane().add(imagepanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

    private void pdiBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdiBTActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"0");
    }//GEN-LAST:event_pdiBTActionPerformed

    private void demokratBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demokratBTActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"1");
    }//GEN-LAST:event_demokratBTActionPerformed

    private void golkarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golkarBTActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"2");
    }//GEN-LAST:event_golkarBTActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                PilihGambarButtonFullScreen fullFrame = new PilihGambarButtonFullScreen();
                
                GraphicsDevice device =
                        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(fullFrame);
                
                fullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonpanel;
    private javax.swing.JButton demokratBT;
    private javax.swing.JLabel demokratLB;
    private javax.swing.JButton exitBT;
    private javax.swing.JButton golkarBT;
    private javax.swing.JLabel golkarLB;
    private javax.swing.JPanel imagepanel;
    private javax.swing.JButton pdiBT;
    private javax.swing.JLabel pdiLB;
    // End of variables declaration//GEN-END:variables
}
