
package com.mycompany.iniciosesion;

import static com.mycompany.iniciosesion.IniciarSesion.idUsuario;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;


public class Menuframe extends javax.swing.JFrame {
    JScrollPane scrollPane;
 
    public Menuframe() {
        initComponents();
        setLocationRelativeTo(null);
        cargarImagenUsuario(IniciarSesion.idUsuario);
        actualizarNombreUsuario(IniciarSesion.idUsuario);
        P_config.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        InicioBtn = new javax.swing.JButton();
        AmigosBtn = new javax.swing.JButton();
        PerfilBtn = new javax.swing.JButton();
        NotificacionesBtn = new javax.swing.JButton();
        MenuBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        B_config = new javax.swing.JButton();
        usuario = new javax.swing.JLabel();
        fotoperfil = new javax.swing.JLabel();
        P_config = new javax.swing.JPanel();
        B_configNom = new javax.swing.JButton();
        B_configCorreo = new javax.swing.JButton();
        B_configContraseña = new javax.swing.JButton();
        B_configContraseña1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(372, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        InicioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N
        InicioBtn.setBorder(null);
        InicioBtn.setBorderPainted(false);
        InicioBtn.setContentAreaFilled(false);
        InicioBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/homeS.png"))); // NOI18N
        InicioBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/homeS.png"))); // NOI18N
        InicioBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/homeS.png"))); // NOI18N
        InicioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioBtnActionPerformed(evt);
            }
        });

        AmigosBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amigos.png"))); // NOI18N
        AmigosBtn.setBorder(null);
        AmigosBtn.setBorderPainted(false);
        AmigosBtn.setContentAreaFilled(false);
        AmigosBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/amigosS.png"))); // NOI18N
        AmigosBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/amigosS.png"))); // NOI18N
        AmigosBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/amigosS.png"))); // NOI18N
        AmigosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmigosBtnActionPerformed(evt);
            }
        });

        PerfilBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        PerfilBtn.setBorder(null);
        PerfilBtn.setBorderPainted(false);
        PerfilBtn.setContentAreaFilled(false);
        PerfilBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UserS.png"))); // NOI18N
        PerfilBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UserS.png"))); // NOI18N
        PerfilBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UserS.png"))); // NOI18N
        PerfilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilBtnActionPerformed(evt);
            }
        });

        NotificacionesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notificaciones.png"))); // NOI18N
        NotificacionesBtn.setBorder(null);
        NotificacionesBtn.setBorderPainted(false);
        NotificacionesBtn.setContentAreaFilled(false);
        NotificacionesBtn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificacionS.png"))); // NOI18N
        NotificacionesBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificacionS.png"))); // NOI18N
        NotificacionesBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificacionS.png"))); // NOI18N
        NotificacionesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificacionesBtnActionPerformed(evt);
            }
        });

        MenuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuS.png"))); // NOI18N
        MenuBtn.setBorder(null);
        MenuBtn.setBorderPainted(false);
        MenuBtn.setContentAreaFilled(false);
        MenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Menú");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configuracion-gear.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchp.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);

        B_config.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        B_config.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajustes.png"))); // NOI18N
        B_config.setText("Configuración y privacidad");
        B_config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_configMouseClicked(evt);
            }
        });
        B_config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_configActionPerformed(evt);
            }
        });

        usuario.setText("Desconocido");

        fotoperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N

        P_config.setBackground(new java.awt.Color(255, 255, 255));

        B_configNom.setText("Cambiar Nombre");
        B_configNom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_configNom.setContentAreaFilled(false);
        B_configNom.setFocusPainted(false);
        B_configNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_configNomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_configNomMouseExited(evt);
            }
        });
        B_configNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_configNomActionPerformed(evt);
            }
        });

        B_configCorreo.setText("Cambiar Correo");
        B_configCorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_configCorreo.setContentAreaFilled(false);
        B_configCorreo.setFocusPainted(false);
        B_configCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_configCorreoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_configCorreoMouseExited(evt);
            }
        });
        B_configCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_configCorreoActionPerformed(evt);
            }
        });

        B_configContraseña.setText("Cambiar Contraseña");
        B_configContraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_configContraseña.setContentAreaFilled(false);
        B_configContraseña.setFocusPainted(false);
        B_configContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_configContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_configContraseñaMouseExited(evt);
            }
        });
        B_configContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_configContraseñaActionPerformed(evt);
            }
        });

        B_configContraseña1.setText("Cerrar Sesion");
        B_configContraseña1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_configContraseña1.setContentAreaFilled(false);
        B_configContraseña1.setFocusPainted(false);
        B_configContraseña1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_configContraseña1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_configContraseña1MouseExited(evt);
            }
        });
        B_configContraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_configContraseña1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_configLayout = new javax.swing.GroupLayout(P_config);
        P_config.setLayout(P_configLayout);
        P_configLayout.setHorizontalGroup(
            P_configLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(B_configNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(B_configCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(B_configContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(B_configContraseña1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P_configLayout.setVerticalGroup(
            P_configLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_configLayout.createSequentialGroup()
                .addComponent(B_configNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_configCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_configContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_configContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton7)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(InicioBtn)
                        .addGap(50, 50, 50)
                        .addComponent(AmigosBtn)
                        .addGap(45, 45, 45)
                        .addComponent(PerfilBtn)
                        .addGap(49, 49, 49)
                        .addComponent(NotificacionesBtn)
                        .addGap(51, 51, 51)
                        .addComponent(MenuBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_config, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(P_config, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 59, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(fotoperfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuario)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InicioBtn)
                    .addComponent(NotificacionesBtn)
                    .addComponent(AmigosBtn)
                    .addComponent(MenuBtn)
                    .addComponent(PerfilBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario)
                    .addComponent(fotoperfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_config)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_config, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(785, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void cargarImagenUsuario(int userId) {
    final Connection conn;  // Hacer final la variable
    final PreparedStatement stmt;  // Hacer final la variable
    final ResultSet rs;  // Hacer final la variable

    try {
        // Configuración de la conexión a la base de datos
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        // Consulta SQL para obtener la imagen del usuario usando la columna 'ID_Usuario'
        String sql = "SELECT Foto_perfil FROM perfil_usuario WHERE ID_Usuario = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, userId); // Establecer el ID del usuario en la consulta

        // Ejecutar la consulta
        rs = stmt.executeQuery();

        // Usar invokeLater para asegurar que el código se ejecute en el hilo de la interfaz gráfica
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    if (rs.next()) {  // Si hay una imagen para el usuario
                        byte[] fotoPerfil = rs.getBytes("Foto_perfil"); // Obtener el arreglo de bytes de la imagen

                        // Si la imagen no es nula
                        if (fotoPerfil != null) {
                            ImageIcon imageIcon = new ImageIcon(fotoPerfil); // Convertir el arreglo de bytes en una imagen
                            Image image = imageIcon.getImage(); // Obtener la imagen

                            // Escalar la imagen (opcional)
                            Image imagenEscalada = image.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

                            // Establecer la imagen escalada en el botón
                            fotoperfil.setIcon(new ImageIcon(imagenEscalada));
                            fotoperfil.setText(""); // Limpiar el texto del botón si existe
                        } else {
                            fotoperfil.setText("Sin imagen");
                        }
                    } else {
                        // Si no se encuentra el usuario en la base de datos
                        fotoperfil.setText("Usuario no encontrado");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    fotoperfil.setText("Error al cargar la imagen.");
                } finally {
                    // Cerrar recursos
                    try {
                        if (rs != null) rs.close();
                        if (stmt != null) stmt.close();
                        if (conn != null) conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

    } catch (SQLException e) {
        e.printStackTrace();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                fotoperfil.setText("Error al cargar la imagen.");
            }
        });
    }
}
    
    public void actualizarNombreUsuario(int userId) {
    final Connection conn;  // Hacer final la variable
    final PreparedStatement stmt;  // Hacer final la variable
    final ResultSet rs;  // Hacer final la variable

    try {
        // Configuración de la conexión a la base de datos
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        // Consulta SQL para obtener el nombre del usuario usando la columna 'ID_Usuario'
        String sql = "SELECT Nombre, Apellido FROM perfil_usuario WHERE ID_Usuario = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, userId); // Establecer el ID del usuario en la consulta

        // Ejecutar la consulta
        rs = stmt.executeQuery();

        // Usar invokeLater para asegurar que el código se ejecute en el hilo de la interfaz gráfica
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    if (rs.next()) {  // Usar rs dentro del Runnable
                        String nombre = rs.getString("Nombre");
                        String apellido = rs.getString("Apellido");// Obtener el nombre del usuario
                        usuario.setText(nombre + " " + apellido); // Establecer el nombre en el JLabel
                    } else {
                        usuario.setText("Usuario no encontrado"); // Si no se encuentra el usuario
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    usuario.setText("Error al obtener el nombre del usuario."); // Si ocurre un error
                } finally {
                    // Cerrar recursos
                    try {
                        if (rs != null) rs.close();
                        if (stmt != null) stmt.close();
                        if (conn != null) conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

    } catch (SQLException e) {
        e.printStackTrace();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                usuario.setText("Error al obtener el nombre del usuario."); // Si ocurre un error
            }
        });
    }
}


    private void MenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBtnActionPerformed
        this.dispose();
        IniciarSesion IS = new IniciarSesion();
        Menuframe Mf = new Menuframe();
        Mf.actualizarNombreUsuario(IS.idUsuario);
        Mf.setVisible(true);
    }//GEN-LAST:event_MenuBtnActionPerformed

    private void PerfilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilBtnActionPerformed
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
    }//GEN-LAST:event_PerfilBtnActionPerformed
private boolean isConfigVisible = false;
    private void B_configMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_configMouseClicked
      isConfigVisible = !isConfigVisible; // Alterna el estado
    P_config.setVisible(isConfigVisible);  // TODO add your handling code here:
    }//GEN-LAST:event_B_configMouseClicked

    private void B_configNomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_configNomMouseEntered
    B_configNom.setForeground(new Color(51,153,255));   // TODO add your handling code here:
    }//GEN-LAST:event_B_configNomMouseEntered

    private void B_configNomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_configNomMouseExited
    B_configNom.setForeground(new Color(0,0,0));    // TODO add your handling code here:
    }//GEN-LAST:event_B_configNomMouseExited

    private void B_configCorreoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_configCorreoMouseEntered
    B_configCorreo.setForeground(new Color(51,153,255));    // TODO add your handling code here:
    }//GEN-LAST:event_B_configCorreoMouseEntered

    private void B_configCorreoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_configCorreoMouseExited
    B_configCorreo.setForeground(new Color(0,0,0));    // TODO add your handling code here:
    }//GEN-LAST:event_B_configCorreoMouseExited

    private void B_configContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_configContraseñaMouseEntered
    B_configContraseña.setForeground(new Color(51,153,255));   // TODO add your handling code here:
    }//GEN-LAST:event_B_configContraseñaMouseEntered

    private void B_configContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_configContraseñaMouseExited
    B_configContraseña.setForeground(new Color(0,0,0));    // TODO add your handling code here:
    }//GEN-LAST:event_B_configContraseñaMouseExited

    private void B_configNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_configNomActionPerformed
        this.dispose();
        CambiarNombre CN = new CambiarNombre();
        CN.setVisible(true);
    }//GEN-LAST:event_B_configNomActionPerformed

    private void B_configCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_configCorreoActionPerformed
        this.dispose();
        CambiarCorreo CC = new CambiarCorreo();
        CC.setVisible(true);    }//GEN-LAST:event_B_configCorreoActionPerformed

    private void B_configContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_configContraseñaActionPerformed
        this.dispose();
        CambiarContraseña pp= new CambiarContraseña();
        pp.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_B_configContraseñaActionPerformed

    private void B_configContraseña1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_configContraseña1MouseEntered
        B_configContraseña1.setForeground(new Color(51,153,255));        // TODO add your handling code here:
    }//GEN-LAST:event_B_configContraseña1MouseEntered

    private void B_configContraseña1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_configContraseña1MouseExited
        B_configContraseña1.setForeground(new Color(0,0,0));        // TODO add your handling code here:
    }//GEN-LAST:event_B_configContraseña1MouseExited

    private void B_configContraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_configContraseña1ActionPerformed
        this.dispose();
        IniciarSesion IS = new IniciarSesion();
        IS.setVisible(true);
    }//GEN-LAST:event_B_configContraseña1ActionPerformed

    private void B_configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_configActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_configActionPerformed

    private void InicioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioBtnActionPerformed
       this.dispose();
        InicioF If = new InicioF();
        If.cargarImagenUsuario(idUsuario);
        If.cargarPublicaciones(If.offset2, idUsuario);
        If.setVisible(true);
    }//GEN-LAST:event_InicioBtnActionPerformed

    private void AmigosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmigosBtnActionPerformed
        this.dispose();
        FacebookFriends FF = new FacebookFriends();
        FF.setVisible(true);
    }//GEN-LAST:event_AmigosBtnActionPerformed

    private void NotificacionesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificacionesBtnActionPerformed
        this.dispose();
        Notificaciones N = new Notificaciones();
        N.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_NotificacionesBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Menuframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmigosBtn;
    private javax.swing.JButton B_config;
    private javax.swing.JButton B_configContraseña;
    private javax.swing.JButton B_configContraseña1;
    private javax.swing.JButton B_configCorreo;
    private javax.swing.JButton B_configNom;
    private javax.swing.JButton InicioBtn;
    private javax.swing.JButton MenuBtn;
    private javax.swing.JButton NotificacionesBtn;
    private javax.swing.JPanel P_config;
    private javax.swing.JButton PerfilBtn;
    private javax.swing.JLabel fotoperfil;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
