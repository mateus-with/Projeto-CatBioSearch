/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacao;

/**
 *
 * @author cleoc
 */
public class ArquivoFATA extends javax.swing.JFrame {

    /**
     * Creates new form ArquivoFATA
     */
    public ArquivoFATA() {
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
        btnHome = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JLabel();
        btnAgenda = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JLabel();
        btnEstatistica = new javax.swing.JLabel();
        btnCfg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 256, -1, -1));

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cadastro.png"))); // NOI18N
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
        jPanel2.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 334, 322, -1));

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/agendaNotClicked.png"))); // NOI18N
        btnAgenda.setText("jLabel3");
        btnAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgendaAgendaClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgendaMouseExited(evt);
            }
        });
        jPanel2.add(btnAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 428, 322, -1));

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/perfilNotClicked.png"))); // NOI18N
        btnPerfil.setText("jLabel4");
        btnPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPerfilMouseExited(evt);
            }
        });
        jPanel2.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 512, 370, -1));

        btnEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/estatisticasNotClicked.png"))); // NOI18N
        btnEstatistica.setText("jLabel5");
        btnEstatistica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstatisticaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstatisticaMouseExited(evt);
            }
        });
        jPanel2.add(btnEstatistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 350, -1));

        btnCfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/configuraçaoNotClicked.png"))); // NOI18N
        btnCfg.setText("jLabel6");
        btnCfg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCfgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCfgMouseExited(evt);
            }
        });
        jPanel2.add(btnCfg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 668, 360, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo_branca(1) 1(2).png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 300, -1));

        jPanel3.setBackground(new java.awt.Color(13, 13, 14));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, -1, -1));

        jPanel1.setBackground(new java.awt.Color(53, 53, 53));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnSalvar.setBackground(new java.awt.Color(255, 191, 27));
        btnSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar e continuar");
        btnSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 191, 27), 5, true));
        btnSalvar.setContentAreaFilled(false);

        jPanel4.setBackground(new java.awt.Color(147, 147, 147));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Selecione um arquvio do tipo FATA");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/arquivos.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        btnUpload.setBackground(new java.awt.Color(255, 191, 27));
        btnUpload.setText("Upload");
        btnUpload.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnUpload.setDefaultCapable(false);
        jPanel5.add(btnUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 910, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
    }//GEN-LAST:event_btnCadastroMouseClicked

    private void btnCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseEntered
        // TODO add your handling code here:

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cadastro.png")));
    }//GEN-LAST:event_btnCadastroMouseEntered

    private void btnCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseExited
        // TODO add your handling code here:

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cadastroNotClicked.png")));
    }//GEN-LAST:event_btnCadastroMouseExited

    private void btnAgendaAgendaClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendaAgendaClicked

    }//GEN-LAST:event_btnAgendaAgendaClicked

    private void btnAgendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendaMouseEntered
        // TODO add your handling code here:

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/agendaClicked.png")));
    }//GEN-LAST:event_btnAgendaMouseEntered

    private void btnAgendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendaMouseExited
        // TODO add your handling code here:

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/agendaNotClicked.png")));
    }//GEN-LAST:event_btnAgendaMouseExited

    private void btnPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseEntered
        // TODO add your handling code here:

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/perfil.png")));
    }//GEN-LAST:event_btnPerfilMouseEntered

    private void btnPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseExited
        // TODO add your handling code here:

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/perfilNotClicked.png")));
    }//GEN-LAST:event_btnPerfilMouseExited

    private void btnEstatisticaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticaMouseEntered
        // TODO add your handling code here:

        btnEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/estatisticasClicked.png")));
    }//GEN-LAST:event_btnEstatisticaMouseEntered

    private void btnEstatisticaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticaMouseExited
        // TODO add your handling code here:

        btnEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/estatisticasNotClicked.png")));
    }//GEN-LAST:event_btnEstatisticaMouseExited

    private void btnCfgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseEntered
        // TODO add your handling code here:

        btnCfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/configuraçao.png")));
    }//GEN-LAST:event_btnCfgMouseEntered

    private void btnCfgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseExited
        // TODO add your handling code here:

        btnCfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/configuraçaoNotClicked.png")));
    }//GEN-LAST:event_btnCfgMouseExited

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

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
            java.util.logging.Logger.getLogger(ArquivoFATA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArquivoFATA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArquivoFATA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArquivoFATA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArquivoFATA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgenda;
    private javax.swing.JLabel btnCadastro;
    private javax.swing.JLabel btnCfg;
    private javax.swing.JLabel btnEstatistica;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnPerfil;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}