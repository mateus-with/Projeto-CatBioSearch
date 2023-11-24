/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacao;

import java.awt.FontFormatException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dsm2
 */
public class Config extends javax.swing.JFrame {

    /**
     * Creates new form Config
     */
    public Config() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnPerfil = new javax.swing.JLabel();
        btnEstatistica = new javax.swing.JLabel();
        btnCfg = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(15, 15, 15));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Group 31(1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(288, 288, 288))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1)
                .addContainerGap(391, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 1540, 1080));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/RelatorionotClicked.png"))); // NOI18N
        btnPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPerfilMouseExited(evt);
            }
        });

        btnEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/estatisticasNotClicked.png"))); // NOI18N
        btnEstatistica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstatisticaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstatisticaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstatisticaMouseExited(evt);
            }
        });

        btnCfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/configuraçao.png"))); // NOI18N
        btnCfg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCfgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCfgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCfgMouseExited(evt);
            }
        });

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/homeNotClicked.png"))); // NOI18N
        btnHome.setToolTipText("");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeHomeClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/cadastroNotClicked.png"))); // NOI18N
        btnCadastro.setText("jLabel2");
        btnCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastroMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo_branca(1) 1(2).png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstatistica, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCfg, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel7)
                .addGap(74, 74, 74)
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEstatistica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCfg)
                .addContainerGap(480, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 382, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeHomeClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeHomeClicked
        // TODO add your handling code here:

        dispose();
        PaginaInicial pg = new PaginaInicial();
        pg.setVisible(true);

    }//GEN-LAST:event_btnHomeHomeClicked

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        // TODO add your handling code here:

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/homeClicked.png")));
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        // TODO add your handling code here:

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/homeNotClicked.png")));
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseClicked
        // TODO add your handling code here:
       dispose();
        CadastroDono cadd = new CadastroDono();
        new CadastroDono().setVisible(true);
    }//GEN-LAST:event_btnCadastroMouseClicked

    private void btnCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseEntered
        // TODO add your handling code here:

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cadastro.png")));
    }//GEN-LAST:event_btnCadastroMouseEntered

    private void btnCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseExited
        // TODO add your handling code here:
        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/cadastroNotClicked.png")));
    }//GEN-LAST:event_btnCadastroMouseExited

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void btnPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseClicked
        // TODO add your handling code here:

        dispose();
        try {
            new Relatorio().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnPerfilMouseClicked

    private void btnPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseEntered
        // TODO add your handling code here:

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Relatorioclicked.png")));
    }//GEN-LAST:event_btnPerfilMouseEntered

    private void btnPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseExited
        // TODO add your handling code here:

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/RelatorionotClicked.png")));
    }//GEN-LAST:event_btnPerfilMouseExited

    private void btnEstatisticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticaMouseClicked
        // TODO add your handling code here:
        dispose();
        new Estatistica().setVisible(true);

    }//GEN-LAST:event_btnEstatisticaMouseClicked

    private void btnEstatisticaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticaMouseEntered
        // TODO add your handling code here:

        btnEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/estatisticasClicked.png")));
    }//GEN-LAST:event_btnEstatisticaMouseEntered

    private void btnEstatisticaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticaMouseExited
        // TODO add your handling code here:

        btnEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/estatisticasNotClicked.png")));
    }//GEN-LAST:event_btnEstatisticaMouseExited

    private void btnCfgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseClicked
        // TODO add your handling code here:
        dispose();
        Config conf = new Config();
        conf.setVisible(true);
    }//GEN-LAST:event_btnCfgMouseClicked

    private void btnCfgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_btnCfgMouseEntered

    private void btnCfgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseExited
        // TODO add your handling code here
    }//GEN-LAST:event_btnCfgMouseExited

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
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Config().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCadastro;
    private javax.swing.JLabel btnCfg;
    private javax.swing.JLabel btnEstatistica;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
