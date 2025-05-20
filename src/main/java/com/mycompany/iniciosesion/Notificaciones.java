
package com.mycompany.iniciosesion;

import static com.mycompany.iniciosesion.Busqueda.idUsuarioSeleccionado;
import static com.mycompany.iniciosesion.IniciarSesion.idUsuario;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.sound.sampled.*;




public class Notificaciones extends javax.swing.JFrame {

    
    private javax.swing.JPanel panelNotificaciones;
    public Notificaciones() {
        
        initComponents();
        cargarNotificaciones(IniciarSesion.idUsuario);
        setLocationRelativeTo(null);
        
        }
    
    

    private void reproducirSonido(String ruta) {
    try {
        AudioInputStream audio = AudioSystem.getAudioInputStream(getClass().getResource(ruta));
        Clip clip = AudioSystem.getClip();
        clip.open(audio);
        clip.start();
    } catch (Exception e) {
        System.out.println("Error al reproducir sonido: " + e.getMessage());
    }
}
    
   public void cargarNotificaciones(int idUsuario) {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        String query = "SELECT ID_Notificacion, Tipo, Mensaje, Leida, Fecha, Referencia FROM notificaciones " +
                       "WHERE ID_Usuario = ? ORDER BY Fecha DESC";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, idUsuario);
        ResultSet rs = pst.executeQuery();

        contenedorNotis.removeAll();

        while (rs.next()) {
            int idNotif = rs.getInt("ID_Notificacion");
            String tipo = rs.getString("Tipo");
            String mensaje = rs.getString("Mensaje");
            int leida = rs.getInt("Leida");
            int referencia = rs.getInt("Referencia");

            // Panel individual para la notificación
            JPanel panelNotif = new JPanel();
            panelNotif.setLayout(new java.awt.BorderLayout());
            panelNotif.setBorder(javax.swing.BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            panelNotif.setBackground(leida == 1 ? Color.WHITE : new Color(230, 245, 255)); // No leída = azul claro

            // Ícono según el tipo
            JLabel icono = new JLabel();
            switch (tipo) {
                case "reaccion":
                    icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono_reaccion.png")));
                    break;
                case "comentario":
                    icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono_comentario.png")));
                    break;
                case "amistad":
                    icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono_amistad.png")));
                    break;
            }
            icono.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
            panelNotif.add(icono, java.awt.BorderLayout.WEST);

            // Texto del mensaje
            JLabel texto = new JLabel(mensaje);
            texto.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
            panelNotif.add(texto, java.awt.BorderLayout.CENTER);

            // Botón "ver"
            JButton btnVer = new JButton("Ver");
            btnVer.addActionListener(e -> {
                marcarNotificacionComoLeida(idNotif);
                if (tipo.equals("comentario") || tipo.equals("reaccion")) {
                    abrirPublicacion(referencia);
                } else if (tipo.equals("amistad")) {
                    abrirPerfil(referencia);
                }
            });
            panelNotif.add(btnVer, java.awt.BorderLayout.EAST);

            contenedorNotis.add(panelNotif);
        }

        contenedorNotis.revalidate();
        contenedorNotis.repaint();
        con.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar notificaciones: " + e.getMessage());
    }
}

   private void marcarNotificacionComoLeida(int idNotif) {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");
        PreparedStatement pst = con.prepareStatement("UPDATE notificaciones SET Leida = 1 WHERE ID_Notificacion = ?");
        pst.setInt(1, idNotif);
        pst.executeUpdate();
        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al marcar como leída: " + e.getMessage());
    }
}

private void abrirPublicacion(int idPublicacion) {
    ComentariosInicio ci = new ComentariosInicio();
    Perfil p = new Perfil();
    InicioF.idSeleccionada = idPublicacion;
    ci.cargarComentarios(p.offset3, idPublicacion);
    ci.setVisible(true);
}

private void abrirPerfil(int idUsuarioSeleccionado) {
    Perfil_Amigo PA = new Perfil_Amigo();
    PA.setVisible(true);
    PA.actualizarNombreUsuario(idUsuarioSeleccionado);
    PA.cargarImagenUsuario(idUsuarioSeleccionado);
    PA.cargarImagenPortada(idUsuarioSeleccionado, PA.fotoportada);
    PA.cargarDestacadasPerfil(PA .offset, idUsuarioSeleccionado);
    PA.cargarPublicacion(PA.offset3, idUsuarioSeleccionado);
    PA.cargarReacciones();
    PA.actualizarBotonAmistad();
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barramenu = new javax.swing.JPanel();
        inicio = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        perfil = new javax.swing.JButton();
        amigos = new javax.swing.JButton();
        noti = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenedorNotis = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTitulo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Notificaciones");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barramenu.setBackground(new java.awt.Color(255, 255, 255));

        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N
        inicio.setBorder(null);
        inicio.setBorderPainted(false);
        inicio.setContentAreaFilled(false);
        inicio.setFocusPainted(false);
        inicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/homeS.png"))); // NOI18N
        inicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/homeS.png"))); // NOI18N
        inicio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/homeS.png"))); // NOI18N
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        menu.setBorder(null);
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.setFocusPainted(false);
        menu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/menuS.png"))); // NOI18N
        menu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/menuS.png"))); // NOI18N
        menu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/menuS.png"))); // NOI18N
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        perfil.setBorder(null);
        perfil.setBorderPainted(false);
        perfil.setContentAreaFilled(false);
        perfil.setFocusPainted(false);
        perfil.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UserS.png"))); // NOI18N
        perfil.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UserS.png"))); // NOI18N
        perfil.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UserS.png"))); // NOI18N
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });

        amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amigos.png"))); // NOI18N
        amigos.setBorder(null);
        amigos.setBorderPainted(false);
        amigos.setContentAreaFilled(false);
        amigos.setFocusPainted(false);
        amigos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/amigosS.png"))); // NOI18N
        amigos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/amigosS.png"))); // NOI18N
        amigos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/amigosS.png"))); // NOI18N
        amigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amigosActionPerformed(evt);
            }
        });

        noti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificacionS.png"))); // NOI18N
        noti.setBorder(null);
        noti.setBorderPainted(false);
        noti.setContentAreaFilled(false);
        noti.setFocusPainted(false);
        noti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barramenuLayout = new javax.swing.GroupLayout(barramenu);
        barramenu.setLayout(barramenuLayout);
        barramenuLayout.setHorizontalGroup(
            barramenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barramenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(amigos)
                .addGap(51, 51, 51)
                .addComponent(perfil)
                .addGap(46, 46, 46)
                .addComponent(noti)
                .addGap(51, 51, 51)
                .addComponent(menu)
                .addContainerGap())
        );
        barramenuLayout.setVerticalGroup(
            barramenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barramenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barramenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(perfil)
                    .addGroup(barramenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(inicio))
                    .addComponent(amigos)
                    .addComponent(noti))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        contenedorNotis.setLayout(new javax.swing.BoxLayout(contenedorNotis, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(contenedorNotis);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barramenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barramenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        this.dispose();
        InicioF If = new InicioF();
        If.cargarImagenUsuario(idUsuario);
        If.cargarPublicaciones(If.offset2, idUsuario);
        If.setVisible(true);
    }//GEN-LAST:event_inicioActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        this.dispose();
        IniciarSesion IS = new IniciarSesion();
        Menuframe Mf = new Menuframe();
        Mf.actualizarNombreUsuario(IS.idUsuario);
        Mf.setVisible(true);
    }//GEN-LAST:event_menuActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.cargarPublicacion(P.offset2, IS.idUsuario);
        P.cargarReacciones();
        P.actualizarInfoPerfil(IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_perfilActionPerformed

    private void amigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amigosActionPerformed
        this.dispose();
        FacebookFriends FF = new FacebookFriends();
        FF.setVisible(true);
    }//GEN-LAST:event_amigosActionPerformed

    private void notiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notiActionPerformed
        this.dispose();
        Notificaciones N = new Notificaciones();
        N.setVisible(true);
    }//GEN-LAST:event_notiActionPerformed

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
            java.util.logging.Logger.getLogger(Notificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton amigos;
    private javax.swing.JPanel barramenu;
    private javax.swing.JPanel contenedorNotis;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu;
    private javax.swing.JButton noti;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JButton perfil;
    // End of variables declaration//GEN-END:variables
}
