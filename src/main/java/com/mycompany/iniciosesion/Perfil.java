package com.mycompany.iniciosesion;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class Perfil extends javax.swing.JFrame {

    public Perfil() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        amigos = new javax.swing.JButton();
        perfil_u = new javax.swing.JButton();
        menu_u = new javax.swing.JButton();
        notificaciones = new javax.swing.JButton();
        inicio = new javax.swing.JButton();
        publicaciones = new javax.swing.JScrollPane();
        info_usuario = new javax.swing.JPanel();
        editperfil = new javax.swing.JButton();
        publicaciones_usuario = new javax.swing.JButton();
        fotos_usuario = new javax.swing.JButton();
        videos_usuario = new javax.swing.JButton();
        detallesperfil = new javax.swing.JLabel();
        nuevahistoria = new javax.swing.JButton();
        añadirhistoria = new javax.swing.JButton();
        editperfilpublico = new javax.swing.JButton();
        amigos_usuario = new javax.swing.JButton();
        buscamigos = new javax.swing.JButton();
        veramigos = new javax.swing.JButton();
        filtrospublicacion = new javax.swing.JButton();
        histpublicaciones = new javax.swing.JLabel();
        newpost = new javax.swing.JPanel();
        newpublicacion = new javax.swing.JButton();
        publicacionformato = new javax.swing.JPanel();
        foto = new javax.swing.JButton();
        nombre = new javax.swing.JButton();
        publicacion_compartida = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        usuario = new javax.swing.JLabel();
        fotoperfil = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JLabel();
        nuevahistoria1 = new javax.swing.JButton();
        nuevahistoria2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        menu.setBackground(new java.awt.Color(255, 255, 255));

        amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amigos.png"))); // NOI18N
        amigos.setBorder(null);
        amigos.setBorderPainted(false);
        amigos.setContentAreaFilled(false);
        amigos.setFocusPainted(false);
        amigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amigosActionPerformed(evt);
            }
        });

        perfil_u.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        perfil_u.setBorder(null);
        perfil_u.setBorderPainted(false);
        perfil_u.setContentAreaFilled(false);
        perfil_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfil_uActionPerformed(evt);
            }
        });

        menu_u.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        menu_u.setBorder(null);
        menu_u.setBorderPainted(false);
        menu_u.setContentAreaFilled(false);
        menu_u.setFocusPainted(false);
        menu_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_uActionPerformed(evt);
            }
        });

        notificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notificaciones.png"))); // NOI18N
        notificaciones.setBorder(null);
        notificaciones.setBorderPainted(false);
        notificaciones.setContentAreaFilled(false);
        notificaciones.setFocusPainted(false);
        notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificacionesActionPerformed(evt);
            }
        });

        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N
        inicio.setBorder(null);
        inicio.setBorderPainted(false);
        inicio.setContentAreaFilled(false);
        inicio.setFocusPainted(false);
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(inicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(amigos)
                .addGap(47, 47, 47)
                .addComponent(perfil_u, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(menu_u, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perfil_u)
                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inicio)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                            .addComponent(menu_u, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)))
                    .addComponent(amigos)))
        );

        publicaciones.setBackground(new java.awt.Color(255, 255, 255));
        publicaciones.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        info_usuario.setBackground(new java.awt.Color(255, 255, 255));

        editperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editarperfil.png"))); // NOI18N
        editperfil.setBorder(null);
        editperfil.setBorderPainted(false);
        editperfil.setContentAreaFilled(false);
        editperfil.setFocusPainted(false);
        editperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editperfilActionPerformed(evt);
            }
        });

        publicaciones_usuario.setText("Publicaciones");
        publicaciones_usuario.setBorder(null);
        publicaciones_usuario.setBorderPainted(false);
        publicaciones_usuario.setContentAreaFilled(false);
        publicaciones_usuario.setFocusPainted(false);
        publicaciones_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicaciones_usuarioActionPerformed(evt);
            }
        });

        fotos_usuario.setText("Fotos");
        fotos_usuario.setBorder(null);
        fotos_usuario.setBorderPainted(false);
        fotos_usuario.setContentAreaFilled(false);
        fotos_usuario.setFocusPainted(false);

        videos_usuario.setText("Videos");
        videos_usuario.setBorder(null);
        videos_usuario.setBorderPainted(false);
        videos_usuario.setContentAreaFilled(false);
        videos_usuario.setFocusPainted(false);

        detallesperfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        detallesperfil.setText("Detalles");

        nuevahistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        nuevahistoria.setBorder(null);
        nuevahistoria.setBorderPainted(false);
        nuevahistoria.setContentAreaFilled(false);
        nuevahistoria.setFocusPainted(false);

        añadirhistoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        añadirhistoria.setText("Nueva");
        añadirhistoria.setBorder(null);
        añadirhistoria.setBorderPainted(false);
        añadirhistoria.setContentAreaFilled(false);
        añadirhistoria.setFocusPainted(false);

        editperfilpublico.setForeground(new java.awt.Color(59, 89, 152));
        editperfilpublico.setText("Editar perfil público");
        editperfilpublico.setBorder(null);
        editperfilpublico.setBorderPainted(false);
        editperfilpublico.setContentAreaFilled(false);
        editperfilpublico.setFocusPainted(false);

        amigos_usuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        amigos_usuario.setText("Amigos");
        amigos_usuario.setBorder(null);
        amigos_usuario.setBorderPainted(false);
        amigos_usuario.setContentAreaFilled(false);
        amigos_usuario.setFocusCycleRoot(true);
        amigos_usuario.setFocusPainted(false);

        buscamigos.setForeground(new java.awt.Color(59, 89, 152));
        buscamigos.setText("Buscar amigos");
        buscamigos.setBorder(null);
        buscamigos.setBorderPainted(false);
        buscamigos.setContentAreaFilled(false);
        buscamigos.setFocusPainted(false);
        buscamigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscamigosActionPerformed(evt);
            }
        });

        veramigos.setText("Ver todos los amigos");
        veramigos.setBorder(null);
        veramigos.setBorderPainted(false);
        veramigos.setContentAreaFilled(false);
        veramigos.setFocusPainted(false);

        filtrospublicacion.setForeground(new java.awt.Color(59, 59, 152));
        filtrospublicacion.setText("Filtros");
        filtrospublicacion.setBorder(null);
        filtrospublicacion.setBorderPainted(false);
        filtrospublicacion.setContentAreaFilled(false);
        filtrospublicacion.setFocusPainted(false);

        histpublicaciones.setText("Publicaciones");

        newpost.setBackground(new java.awt.Color(255, 255, 255));
        newpost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        newpublicacion.setText("¿Qué hay en tu mente?");
        newpublicacion.setBorder(null);
        newpublicacion.setBorderPainted(false);
        newpublicacion.setContentAreaFilled(false);
        newpublicacion.setFocusPainted(false);

        javax.swing.GroupLayout newpostLayout = new javax.swing.GroupLayout(newpost);
        newpost.setLayout(newpostLayout);
        newpostLayout.setHorizontalGroup(
            newpostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newpublicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        newpostLayout.setVerticalGroup(
            newpostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newpublicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        publicacionformato.setBackground(new java.awt.Color(255, 255, 255));
        publicacionformato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        foto.setBorder(null);
        foto.setBorderPainted(false);
        foto.setContentAreaFilled(false);
        foto.setFocusPainted(false);

        nombre.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        nombre.setText("Nombre Usuario");
        nombre.setBorder(null);
        nombre.setBorderPainted(false);
        nombre.setContentAreaFilled(false);
        nombre.setFocusPainted(false);

        publicacion_compartida.setBackground(new java.awt.Color(255, 255, 255));
        publicacion_compartida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        javax.swing.GroupLayout publicacion_compartidaLayout = new javax.swing.GroupLayout(publicacion_compartida);
        publicacion_compartida.setLayout(publicacion_compartidaLayout);
        publicacion_compartidaLayout.setHorizontalGroup(
            publicacion_compartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        publicacion_compartidaLayout.setVerticalGroup(
            publicacion_compartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/like.png"))); // NOI18N
        jButton1.setText("Me gusta");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton2.setText("Comentar");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton3.setText("Compartir");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);

        javax.swing.GroupLayout publicacionformatoLayout = new javax.swing.GroupLayout(publicacionformato);
        publicacionformato.setLayout(publicacionformatoLayout);
        publicacionformatoLayout.setHorizontalGroup(
            publicacionformatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(publicacionformatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(publicacionformatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publicacion_compartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(publicacionformatoLayout.createSequentialGroup()
                        .addComponent(foto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(publicacionformatoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(67, 67, 67)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        publicacionformatoLayout.setVerticalGroup(
            publicacionformatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(publicacionformatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(publicacionformatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto)
                    .addComponent(nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(publicacion_compartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(publicacionformatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        usuario.setText("Usuario");

        fotoperfil.setText("FOTO");

        jPanel1.setText("PORTADA");

        nuevahistoria1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        nuevahistoria1.setBorder(null);
        nuevahistoria1.setBorderPainted(false);
        nuevahistoria1.setContentAreaFilled(false);
        nuevahistoria1.setFocusPainted(false);

        nuevahistoria2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        nuevahistoria2.setBorder(null);
        nuevahistoria2.setBorderPainted(false);
        nuevahistoria2.setContentAreaFilled(false);
        nuevahistoria2.setFocusPainted(false);

        javax.swing.GroupLayout info_usuarioLayout = new javax.swing.GroupLayout(info_usuario);
        info_usuario.setLayout(info_usuarioLayout);
        info_usuarioLayout.setHorizontalGroup(
            info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(info_usuarioLayout.createSequentialGroup()
                        .addGroup(info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(publicacionformato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(info_usuarioLayout.createSequentialGroup()
                                .addComponent(histpublicaciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(filtrospublicacion)
                                .addGap(10, 10, 10))
                            .addComponent(newpost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(info_usuarioLayout.createSequentialGroup()
                                .addGroup(info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(añadirhistoria)
                                    .addComponent(amigos_usuario)
                                    .addGroup(info_usuarioLayout.createSequentialGroup()
                                        .addComponent(fotoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(257, 257, 257)
                                        .addComponent(editperfil)))
                                .addGap(0, 89, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(info_usuarioLayout.createSequentialGroup()
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_usuarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(veramigos)
                        .addGap(117, 117, 117))))
            .addGroup(info_usuarioLayout.createSequentialGroup()
                .addGroup(info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(info_usuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detallesperfil)
                            .addGroup(info_usuarioLayout.createSequentialGroup()
                                .addGroup(info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(publicaciones_usuario)
                                    .addComponent(nuevahistoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(fotos_usuario)
                                .addGap(18, 18, 18)
                                .addComponent(videos_usuario))))
                    .addGroup(info_usuarioLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(info_usuarioLayout.createSequentialGroup()
                                .addComponent(nuevahistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nuevahistoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(info_usuarioLayout.createSequentialGroup()
                                .addComponent(editperfilpublico)
                                .addGap(18, 18, 18)
                                .addComponent(buscamigos))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        info_usuarioLayout.setVerticalGroup(
            info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editperfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fotoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publicaciones_usuario)
                    .addComponent(fotos_usuario)
                    .addComponent(videos_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detallesperfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuevahistoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevahistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevahistoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(añadirhistoria)
                .addGap(128, 128, 128)
                .addComponent(amigos_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editperfilpublico)
                    .addComponent(buscamigos))
                .addGap(132, 132, 132)
                .addComponent(veramigos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(info_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtrospublicacion)
                    .addComponent(histpublicaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(publicacionformato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        publicaciones.setViewportView(info_usuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(publicaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(publicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
   public void cargarPortadaUsuario(int userId) {
    final Connection conn;  // Hacer final la variable
    final PreparedStatement stmt;  // Hacer final la variable
    final ResultSet rs;  // Hacer final la variable

    try {
        // Configuración de la conexión a la base de datos
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        // Consulta SQL para obtener la imagen del usuario usando la columna 'ID_Usuario'
        String sql = "SELECT Foto_portada FROM perfil_usuario WHERE ID_Usuario = ?";
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
                        byte[] fotoPortada = rs.getBytes("Foto_portada"); // Obtener el arreglo de bytes de la imagen

                        // Si la imagen no es nula
                        if (fotoPortada != null) {
                            ImageIcon imageIcon = new ImageIcon(fotoPortada); // Convertir el arreglo de bytes en una imagen
                            Image image = imageIcon.getImage(); // Obtener la imagen

                            // Escalar la imagen (opcional)
                            Image imagenEscalada = image.getScaledInstance(349, 96, Image.SCALE_SMOOTH);

                            // Establecer la imagen escalada en el botón
                            jPanel1.setIcon(new ImageIcon(imagenEscalada));
                            jPanel1.setText(""); // Limpiar el texto del botón si existe
                        } else {
                            jPanel1.setText("Sin imagen");
                        }
                    } else {
                        // Si no se encuentra el usuario en la base de datos
                        jPanel1.setText("Usuario no encontrado");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    jPanel1.setText("Error al cargar la imagen.");
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
                jPanel1.setText("Error al cargar la imagen.");
            }
        });
    }
}

 



    
    
    private void amigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amigosActionPerformed
        this.dispose();
        FacebookFriends FF = new FacebookFriends();
        FF.setVisible(true);
    }//GEN-LAST:event_amigosActionPerformed

    private void perfil_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfil_uActionPerformed
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarPortadaUsuario(IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_perfil_uActionPerformed

    private void menu_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_uActionPerformed
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        Menuframe Mf = new Menuframe();
        Mf.actualizarNombreUsuario(IS.idUsuario);
        Mf.setVisible(true);
    }//GEN-LAST:event_menu_uActionPerformed

    private void notificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificacionesActionPerformed
        this.dispose();
        Notificaciones N = new Notificaciones();
        N.setVisible(true);
    }//GEN-LAST:event_notificacionesActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        this.dispose();
        InicioF IF = new InicioF();
        IF.setVisible(true);
    }//GEN-LAST:event_inicioActionPerformed

    private void editperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editperfilActionPerformed
        this.dispose();
        EditarImagenes EI = new EditarImagenes();
        EI.setVisible(true);
    }//GEN-LAST:event_editperfilActionPerformed

    private void buscamigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscamigosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscamigosActionPerformed

    private void publicaciones_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicaciones_usuarioActionPerformed

    }//GEN-LAST:event_publicaciones_usuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Perfil().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton amigos;
    private javax.swing.JButton amigos_usuario;
    private javax.swing.JButton añadirhistoria;
    private javax.swing.JButton buscamigos;
    private javax.swing.JLabel detallesperfil;
    private javax.swing.JButton editperfil;
    private javax.swing.JButton editperfilpublico;
    private javax.swing.JButton filtrospublicacion;
    private javax.swing.JButton foto;
    private javax.swing.JLabel fotoperfil;
    private javax.swing.JButton fotos_usuario;
    private javax.swing.JLabel histpublicaciones;
    private javax.swing.JPanel info_usuario;
    private javax.swing.JButton inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jPanel1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton menu_u;
    private javax.swing.JPanel newpost;
    private javax.swing.JButton newpublicacion;
    private javax.swing.JButton nombre;
    private javax.swing.JButton notificaciones;
    private javax.swing.JButton nuevahistoria;
    private javax.swing.JButton nuevahistoria1;
    private javax.swing.JButton nuevahistoria2;
    private javax.swing.JButton perfil_u;
    private javax.swing.JPanel publicacion_compartida;
    private javax.swing.JScrollPane publicaciones;
    private javax.swing.JButton publicaciones_usuario;
    private javax.swing.JPanel publicacionformato;
    private javax.swing.JLabel usuario;
    private javax.swing.JButton veramigos;
    private javax.swing.JButton videos_usuario;
    // End of variables declaration//GEN-END:variables
}
