
package quienquieresermillonario;

import Formularios.IngresoDatosJugados;
import app.UsersType.Participante;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame 
{

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setLocationRelativeTo(null);/// centrarlo
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Administrador = new javax.swing.JButton();
        Participante = new javax.swing.JButton();
        SalirHome = new javax.swing.JButton();
        SeleccionaTuTipoDeUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(10, 56, 245));
        setExtendedState(6);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Presentador");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresentadorActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 130, 180, 40);

        Administrador.setBackground(new java.awt.Color(51, 204, 255));
        Administrador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Administrador.setText("Administrador");
        Administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdministradorMouseClicked(evt);
            }
        });
        Administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(Administrador);
        Administrador.setBounds(220, 130, 180, 40);

        Participante.setBackground(new java.awt.Color(51, 204, 255));
        Participante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Participante.setText("Participante");
        Participante.setToolTipText("");
        Participante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ParticipanteMouseClicked(evt);
            }
        });
        Participante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParticipanteActionPerformed(evt);
            }
        });
        getContentPane().add(Participante);
        Participante.setBounds(420, 130, 180, 40);

        SalirHome.setBackground(new java.awt.Color(51, 204, 255));
        SalirHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SalirHome.setText("Salir");
        SalirHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirHomeActionPerformed(evt);
            }
        });
        getContentPane().add(SalirHome);
        SalirHome.setBounds(220, 180, 180, 40);

        SeleccionaTuTipoDeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        SeleccionaTuTipoDeUsuario.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        SeleccionaTuTipoDeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SeleccionaTuTipoDeUsuario.setText("Selecciona tu tipo de usuario:");
        getContentPane().add(SeleccionaTuTipoDeUsuario);
        SeleccionaTuTipoDeUsuario.setBounds(0, 30, 610, 50);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-300, 0, 990, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PresentadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresentadorActionPerformed
       Presentador Pre=new Presentador(); 
       Pre.setVisible(true);  
    }//GEN-LAST:event_PresentadorActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        JOptionPane.showMessageDialog(null, "Bienvenido Presentador");
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void AdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdministradorMouseClicked
        
        JOptionPane.showMessageDialog(null, "Bievenido Administrador");
        
    }//GEN-LAST:event_AdministradorMouseClicked

    private void ParticipanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParticipanteMouseClicked

        ///JOptionPane.showMessageDialog(null, "Bievenido Participante");
        
    }//GEN-LAST:event_ParticipanteMouseClicked

    private void SalirHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirHomeActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_SalirHomeActionPerformed

    private void AdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministradorActionPerformed
        
        Administrador Admin = new Administrador();
        Admin.setVisible(true);
    }//GEN-LAST:event_AdministradorActionPerformed

    private void ParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParticipanteActionPerformed
        
        //Participante Pa = new Participante();
        //Pa.setVisible(true);
        
        IngresoDatosJugados IDJ = new IngresoDatosJugados();
        IDJ.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_ParticipanteActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Administrador;
    private javax.swing.JButton Participante;
    private javax.swing.JButton SalirHome;
    private javax.swing.JLabel SeleccionaTuTipoDeUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
