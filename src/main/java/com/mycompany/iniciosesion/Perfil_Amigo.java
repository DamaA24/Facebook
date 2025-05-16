package com.mycompany.iniciosesion;

import static com.mycompany.iniciosesion.Busqueda.idUsuarioSeleccionado;
import static com.mycompany.iniciosesion.IniciarSesion.idUsuario;
import static com.mycompany.iniciosesion.Perfil.idPublicacion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;

public class Perfil_Amigo extends javax.swing.JFrame {
    public int offset = 0;
    public int offset3 = 0;
    int idMedia;
    IniciarSesion IS = new IniciarSesion();
    Busqueda B = new Busqueda();
    private Image background_image;
    public Perfil_Amigo() {
        initComponents();
        setLocationRelativeTo(null);
        cargarReacciones();
        actualizarBotonAmistad();
        corazon.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                manejarReaccion("me encanta");
            }
        });

        divierte.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                manejarReaccion("me divierte");
            }
        });

        triste.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                manejarReaccion("me entristece");
            }
        });
        
        corazon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                corazon.setToolTipText("<html>" + obtenerNombresPorReaccion("me encanta").replace("\n", "<br>") + "</html>");
            }
        });

        divierte.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                divierte.setToolTipText("<html>" + obtenerNombresPorReaccion("me divierte").replace("\n", "<br>") + "</html>");
            }
        });

        triste.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                triste.setToolTipText("<html>" + obtenerNombresPorReaccion("me entristece").replace("\n", "<br>") + "</html>");
            }
        });
       
        jPanel5.setVisible(false);
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
        perfil = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        fotoportada = new javax.swing.JPanel();
        fotoperfil = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        publi = new javax.swing.JButton();
        fotos = new javax.swing.JButton();
        solicitudAmistad = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        destacada1 = new javax.swing.JButton();
        destacada3 = new javax.swing.JButton();
        destacada4 = new javax.swing.JButton();
        destacada2 = new javax.swing.JButton();
        sig = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        desc1 = new javax.swing.JLabel();
        desc2 = new javax.swing.JLabel();
        desc3 = new javax.swing.JLabel();
        desc4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        foto2 = new javax.swing.JButton();
        user2 = new javax.swing.JTextField();
        arriba2 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        text2 = new javax.swing.JLabel();
        ima2 = new javax.swing.JLabel();
        corazon = new javax.swing.JLabel();
        divierte = new javax.swing.JLabel();
        triste = new javax.swing.JLabel();
        Comentar = new javax.swing.JButton();
        bajo2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        menu.setBackground(new java.awt.Color(255, 255, 255));

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
        menu_u.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/menuS.png"))); // NOI18N
        menu_u.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/menuS.png"))); // NOI18N
        menu_u.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/menuS.png"))); // NOI18N
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
        notificaciones.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificacionS.png"))); // NOI18N
        notificaciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificacionS.png"))); // NOI18N
        notificaciones.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificacionS.png"))); // NOI18N
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
        inicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/homeS.png"))); // NOI18N
        inicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/homeS.png"))); // NOI18N
        inicio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/homeS.png"))); // NOI18N
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        perfil.setBorder(null);
        perfil.setBorderPainted(false);
        perfil.setContentAreaFilled(false);
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(inicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(amigos)
                .addGap(18, 18, 18)
                .addComponent(perfil_u, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(notificaciones)
                .addGap(57, 57, 57)
                .addComponent(menu_u, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perfil)
                    .addComponent(notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perfil_u)
                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inicio)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                            .addComponent(menu_u, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)))
                    .addComponent(amigos)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        fotoportada.setBackground(new java.awt.Color(255, 255, 255));

        fotoperfil.setText("FOTO");
        fotoperfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        fotoperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoperfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fotoportadaLayout = new javax.swing.GroupLayout(fotoportada);
        fotoportada.setLayout(fotoportadaLayout);
        fotoportadaLayout.setHorizontalGroup(
            fotoportadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(fotoportadaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(fotoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fotoportadaLayout.setVerticalGroup(
            fotoportadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoportadaLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(fotoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        usuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usuario.setText("Usuario");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Detalles");

        publi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        publi.setText("Publicaciones");
        publi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        publi.setContentAreaFilled(false);
        publi.setDefaultCapable(false);
        publi.setFocusPainted(false);
        publi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                publiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                publiMouseExited(evt);
            }
        });
        publi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publiActionPerformed(evt);
            }
        });

        fotos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fotos.setText("Fotos");
        fotos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        fotos.setContentAreaFilled(false);
        fotos.setDefaultCapable(false);
        fotos.setFocusPainted(false);
        fotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fotosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fotosMouseExited(evt);
            }
        });
        fotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotosActionPerformed(evt);
            }
        });

        solicitudAmistad.setText("Amistad");
        solicitudAmistad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitudAmistadActionPerformed(evt);
            }
        });

        jLabel2.setText("Formacion_Academica");

        jLabel3.setText("Lugar_Residencia");

        jLabel4.setText("Genero");

        jLabel5.setText("F_Nacimiento");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(publi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fotos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(solicitudAmistad)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(solicitudAmistad)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(usuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(publi)
                            .addComponent(fotos))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        destacada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        destacada1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        destacada1.setContentAreaFilled(false);
        destacada1.setFocusPainted(false);
        destacada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destacada1ActionPerformed(evt);
            }
        });

        destacada3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        destacada3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        destacada3.setContentAreaFilled(false);
        destacada3.setFocusPainted(false);

        destacada4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        destacada4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        destacada4.setContentAreaFilled(false);
        destacada4.setFocusPainted(false);

        destacada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        destacada2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        destacada2.setContentAreaFilled(false);
        destacada2.setFocusPainted(false);
        destacada2.setHideActionText(true);

        sig.setText(">>");
        sig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sig.setContentAreaFilled(false);
        sig.setFocusPainted(false);
        sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigActionPerformed(evt);
            }
        });

        atras.setText("<<");
        atras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        atras.setContentAreaFilled(false);
        atras.setFocusPainted(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        desc1.setText("1");

        desc2.setText("2");

        desc3.setText("3");

        desc4.setText("4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(destacada1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(desc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(desc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destacada2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(desc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destacada3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(destacada4, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(desc4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(sig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(destacada1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destacada3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destacada4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destacada2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desc1)
                    .addComponent(desc4)
                    .addComponent(desc3)
                    .addComponent(desc2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sig)
                    .addComponent(atras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        foto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        foto2.setBorder(null);
        foto2.setBorderPainted(false);
        foto2.setContentAreaFilled(false);
        foto2.setFocusPainted(false);
        foto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto2ActionPerformed(evt);
            }
        });

        user2.setText("Usuario");
        user2.setBorder(null);
        user2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user2ActionPerformed(evt);
            }
        });

        arriba2.setText("^");
        arriba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arriba2ActionPerformed(evt);
            }
        });

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu2.png"))); // NOI18N
        eliminar.setBorder(null);
        eliminar.setBorderPainted(false);
        eliminar.setContentAreaFilled(false);
        eliminar.setFocusPainted(false);
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(113, 54));

        jButton1.setText("Guardar");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        text2.setText("Texto");

        corazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me encanta1.png"))); // NOI18N

        divierte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me divierte1.png"))); // NOI18N

        triste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me entristece1.png"))); // NOI18N

        Comentar.setText("Comentar");
        Comentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComentarActionPerformed(evt);
            }
        });

        bajo2.setText("v");
        bajo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(user2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(arriba2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ima2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(text2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(corazon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(divierte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(triste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Comentar)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bajo2)
                .addGap(160, 160, 160))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(user2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(arriba2))
                    .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ima2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(corazon)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(divierte)
                        .addComponent(triste)
                        .addComponent(Comentar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bajo2)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fotoportada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 103, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(fotoportada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jScrollPane1.setViewportView(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
   public void cargarImagenPortada(int userId, final JPanel fotoportada) {
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
                            byte[] foto = rs.getBytes("Foto_portada"); // Obtener el arreglo de bytes de la imagen

                            // Si la imagen no es nula
                            if (foto != null) {
                                // Crear un panel personalizado para dibujar la imagen
                                ImagenPanel panelImagen = new ImagenPanel(foto);

                                // Establecer el panel con la imagen en el JPanel fotoportada
                                fotoportada.setLayout(new BorderLayout()); // O new GridBagLayout()
                                fotoportada.add(panelImagen, BorderLayout.CENTER); // Añadir al centro
                                fotoportada.revalidate();  
                                fotoportada.repaint();
                            } 
                                
                            
                        } else {
                            // Si no se encuentra el usuario en la base de datos
                            JOptionPane.showMessageDialog(fotoportada, "Usuario no encontrado.");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(fotoportada, "Error al cargar la imagen.");
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
                    JOptionPane.showMessageDialog(fotoportada, "Error al cargar la imagen.");
                }
            });
        }
    }
   
   class ImagenPanel extends JPanel {
    private BufferedImage imagen;

    public ImagenPanel(byte[] imageBytes) {
        try {
            // Convertir bytes a imagen
            imagen = ImageIO.read(new ByteArrayInputStream(imageBytes));
            
            // Establecer un layout y tamaño preferido
            setLayout(new BorderLayout());
            setPreferredSize(new Dimension(359, 149)); // Tamaño que mencionaste
        } catch (IOException e) {
            e.printStackTrace();
            imagen = null;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            // Escalar la imagen para que se ajuste al panel
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
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
  
   public void cargarDestacadasPerfil(int offset, int idUsuario) {
    try {
        if(offset<4){
            atras.setVisible(false);
        }
        // Conectar a la base de datos
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        // Consulta SQL para obtener las imágenes desde la tabla 'media' filtradas por el 'ID_Usuario'
        String query = "SELECT ID_Destacada, Icono_destacada, Nombre FROM destacadas WHERE ID_Usuario = ? LIMIT 4 OFFSET ?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, idUsuario);  // Ajustamos el ID del usuario en la consulta
        pst.setInt(2, offset);      // Ajustar el OFFSET según la página de imágenes

        // Ejecutar la consulta
        ResultSet rs = pst.executeQuery();

        // Asignar las imágenes y los ID de media a los botones
        JButton[] botones = {destacada1, destacada2, destacada3, destacada4};
        JLabel[] labels = {desc1, desc2, desc3, desc4};
        int i = 0;

        // Limpiar las imágenes en los botones antes de asignar nuevas
        for (JButton boton : botones) {
            boton.setIcon(null);
            boton.setEnabled(true);  // Asegurarse de que los botones estén habilitados
        }

        for (JLabel label : labels) {
            label.setText("");  // Limpiar las descripciones
        }

        // Procesar los resultados de la consulta y asignar las imágenes a los botones
        while (rs.next() && i < botones.length) {
        int idDestacada = rs.getInt("ID_Destacada");
        byte[] contenidoMedia = rs.getBytes("Icono_destacada");
        String nombre = rs.getString("Nombre");

        // Crear un ImageIcon a partir de los datos de la imagen
        ImageIcon originalImageIcon = new ImageIcon(contenidoMedia);

        // Obtener el tamaño del botón (en este caso, el primer botón)
        int buttonWidth = botones[i].getWidth();
        int buttonHeight = botones[i].getHeight();

        // Escalar la imagen para que se ajuste al tamaño del botón
        Image originalImage = originalImageIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(buttonWidth, buttonHeight, Image.SCALE_SMOOTH);

        // Crear un nuevo ImageIcon con la imagen escalada
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

        // Establecer la imagen escalada en el botón correspondiente
        botones[i].setIcon(scaledImageIcon);

        labels[i].setText(nombre);

        // Asignar el ID del medio a cada botón, si se necesita usarlo más tarde
        botones[i].putClientProperty("ID_Destacada", idDestacada);

        i++;
        }

        // Si no hay suficientes imágenes, deshabilitar los botones restantes
        while (i < botones.length) {
           botones[i].setEnabled(false);
        labels[i].setText("");
        sig.setVisible(false);
            i++;
        }

        con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al cargar las imágenes: " + ex.getMessage());
    }
   }
   
   public void cargarPublicacion(int offset3, int idUsuarioSeleccionado) {
    try {
        
        if (offset3 < 1) {
            arriba2.setVisible(false);  // Botón "Atras" (arriba)
        } else {
            arriba2.setVisible(true);
        }
        String estadoAmistad = obtenerEstadoAmistad(IniciarSesion.idUsuario, idUsuarioSeleccionado);

        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        String query;
        PreparedStatement pst;

        if (estadoAmistad.equals("aceptada")) {
            query = "SELECT ID_Publicacion, Imagen, Texto, Fecha_publicacion FROM publicacion " +
                    "WHERE ID_Usuario = ? AND (Privacidad = 'público' OR Privacidad = 'amigos') " +
                    "ORDER BY Fecha_publicacion DESC LIMIT 1 OFFSET ?";
            pst = con.prepareStatement(query);
            pst.setInt(1, idUsuarioSeleccionado);
            pst.setInt(2, offset3);
        } else {
            query = "SELECT ID_Publicacion, Imagen, Texto, Fecha_publicacion FROM publicacion " +
                    "WHERE ID_Usuario = ? AND Privacidad = 'público' " +
                    "ORDER BY Fecha_publicacion DESC LIMIT 1 OFFSET ?";
            pst = con.prepareStatement(query);
            pst.setInt(1, idUsuarioSeleccionado);
            pst.setInt(2, offset3);
        }

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            idPublicacion = rs.getInt("ID_Publicacion");
            String textoPublicacion = rs.getString("Texto");
            byte[] imagenPublicacion = rs.getBytes("Imagen");
            text2.setText(textoPublicacion);

            if (imagenPublicacion != null) {
                ImageIcon imageIcon = new ImageIcon(imagenPublicacion);
                Image image = imageIcon.getImage();
                Image scaledImage = image.getScaledInstance(ima2.getWidth(), ima2.getHeight(), Image.SCALE_SMOOTH);
                ima2.setIcon(new ImageIcon(scaledImage));
            } else {
                ima2.setIcon(null);
            }

            String queryUsuario = "SELECT Nombre, Apellido, Foto_perfil FROM perfil_usuario WHERE ID_Usuario = ?";
            PreparedStatement pstUsuario = con.prepareStatement(queryUsuario);
            pstUsuario.setInt(1, idUsuarioSeleccionado);
            ResultSet rsUsuario = pstUsuario.executeQuery();

            if (rsUsuario.next()) {
                user2.setText(rsUsuario.getString("Nombre") + " " + rsUsuario.getString("Apellido"));
                byte[] fotoPerfil = rsUsuario.getBytes("Foto_perfil");
                if (fotoPerfil != null) {
                    ImageIcon perfilIcon = new ImageIcon(fotoPerfil);
                    Image perfilImage = perfilIcon.getImage();
                    Image scaledPerfilImage = perfilImage.getScaledInstance(foto2.getWidth(), foto2.getHeight(), Image.SCALE_SMOOTH);
                    foto2.setIcon(new ImageIcon(scaledPerfilImage));
                } else {
                    foto2.setIcon(null);
                }
            }

            bajo2.setVisible(true);
        } else {
            bajo2.setVisible(false);
            text2.setText("");
            ima2.setIcon(null);
            user2.setText("");
            foto2.setIcon(null);
            Comentar.setVisible(false);
            corazon.setVisible(false);
            divierte.setVisible(false);
            triste.setVisible(false);
        }

        con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al cargar la publicación: " + ex.getMessage());
    }
}

   
   
        public void manejarReaccion(String tipoReaccion) {
         try {
             Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

             // 1. Verificar si ya existe una reacción
             String consulta = "SELECT Tipo FROM reaccion WHERE ID_Publicacion = ? AND ID_Usuario = ?";
             PreparedStatement pst = con.prepareStatement(consulta);
             
             pst.setInt(1, idPublicacion);
             pst.setInt(2, idUsuario);
             ResultSet rs = pst.executeQuery();

             if (rs.next()) {
                 String tipoActual = rs.getString("Tipo");

                 if (tipoActual.equals(tipoReaccion)) {
                     // Ya reaccionó con el mismo tipo, no hacer nada
                     JOptionPane.showMessageDialog(null, "Ya seleccionaste esta reacción.");
                     con.close();
                     return;
                 } else {
                     // Eliminar la reacción anterior para cambiarla
                     String eliminar = "DELETE FROM reaccion WHERE ID_Publicacion = ? AND ID_Usuario = ?";
                     PreparedStatement eliminarPst = con.prepareStatement(eliminar);
                     eliminarPst.setInt(1, idPublicacion);
                     eliminarPst.setInt(2, idUsuario);
                     eliminarPst.executeUpdate();
                 }
             }

             // 2. Insertar la nueva reacción
             String insertar = "INSERT INTO reaccion (ID_Publicacion, ID_Usuario, Tipo) VALUES (?, ?, ?)";
             pst = con.prepareStatement(insertar);
             pst.setInt(1, idPublicacion);
             pst.setInt(2, idUsuario);
             pst.setString(3, tipoReaccion);
             pst.executeUpdate();

             // 3. Actualizar los contadores
             pst = con.prepareStatement("SELECT Tipo, COUNT(*) as total FROM reaccion WHERE ID_Publicacion = ? GROUP BY Tipo");
             pst.setInt(1, idPublicacion);
             rs = pst.executeQuery();

             int meEncanta = 0, meDivierte = 0, meEntristece = 0;
             while (rs.next()) {
                 String tipo = rs.getString("Tipo");
                 int total = rs.getInt("total");
                 switch (tipo) {
                     case "me encanta" -> meEncanta = total;
                     case "me divierte" -> meDivierte = total;
                     case "me entristece" -> meEntristece = total;
                 }
             }

             corazon.setText(String.valueOf(meEncanta));
             divierte.setText(String.valueOf(meDivierte));
             triste.setText(String.valueOf(meEntristece));

             con.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al registrar reacción: " + ex.getMessage());
             ex.printStackTrace();
         }
     }


        public void cargarReacciones() {
         try {
             Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

             PreparedStatement pst = con.prepareStatement("SELECT Tipo, COUNT(*) as total FROM reaccion WHERE ID_Publicacion = ? GROUP BY Tipo");
             pst.setInt(1, idPublicacion);
             ResultSet rs = pst.executeQuery();

             int meEncanta = 0, meDivierte = 0, meEntristece = 0;
             while (rs.next()) {
                 String tipo = rs.getString("Tipo");
                 int total = rs.getInt("total");
                 switch (tipo) {
                     case "me encanta" -> meEncanta = total;
                     case "me divierte" -> meDivierte = total;
                     case "me entristece" -> meEntristece = total;
                 }
             }

             corazon.setText(String.valueOf(meEncanta));
             divierte.setText(String.valueOf(meDivierte));
             triste.setText(String.valueOf(meEntristece));

             con.close();
         } catch (SQLException ex) {
             ex.printStackTrace();
         }
     }
        public String obtenerNombresPorReaccion(String tipoReaccion) {
         StringBuilder nombres = new StringBuilder();
         try {
             Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

             String sql = "SELECT u.Nombre, u.Apellido FROM reaccion r " +
                          "JOIN perfil_usuario u ON r.ID_Usuario = u.ID_Usuario " +
                          "WHERE r.ID_Publicacion = ? AND r.Tipo = ?";
             PreparedStatement pst = con.prepareStatement(sql);
             pst.setInt(1, idPublicacion);
             pst.setString(2, tipoReaccion);
             ResultSet rs = pst.executeQuery();

             while (rs.next()) {
                 nombres.append(rs.getString("Nombre")).append(" ").append(rs.getString("Apellido")).append("\n");
             }

             con.close();
         } catch (SQLException ex) {
             ex.printStackTrace();
         }

         if (nombres.length() == 0) {
             return "Nadie ha reaccionado aún.";
         }

         return nombres.toString().trim();
     }
        
        

        
        
        public String obtenerEstadoAmistad(int usuarioA, int usuarioB) {
    try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1")) {
        String sql = "SELECT Estado FROM amistad WHERE " +
                     "(ID_Usuario1 = ? AND ID_Usuario2 = ?) OR (ID_Usuario1 = ? AND ID_Usuario2 = ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, usuarioA);
        pst.setInt(2, usuarioB);
        pst.setInt(3, usuarioB);
        pst.setInt(4, usuarioA);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) return rs.getString("Estado");
        return "ninguna";
    } catch (SQLException e) {
        e.printStackTrace();
        return "error";
    }
}

    public boolean esReceptorSolicitud(int emisor, int receptor) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1")) {
            String sql = "SELECT * FROM amistad WHERE ID_Usuario1 = ? AND ID_Usuario2 = ? AND Estado = 'pendiente'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, emisor);
            pst.setInt(2, receptor);
            ResultSet rs = pst.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enviarSolicitud(int emisor, int receptor) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1")) {
            String sql = "INSERT INTO amistad (ID_Usuario1, ID_Usuario2, Estado) VALUES (?, ?, 'pendiente')";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, emisor);
            pst.setInt(2, receptor);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Solicitud enviada.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void aceptarSolicitud(int emisor, int receptor) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1")) {
            String sql = "UPDATE amistad SET Estado = 'aceptada' WHERE ID_Usuario1 = ? AND ID_Usuario2 = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, emisor);
            pst.setInt(2, receptor);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Ahora son amigos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void cancelarSolicitud(int emisor, int receptor) {
    try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1")) {
        String sql = "DELETE FROM amistad WHERE ID_Usuario1 = ? AND ID_Usuario2 = ? AND Estado = 'pendiente'";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, emisor);
        pst.setInt(2, receptor);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Solicitud cancelada.");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    
    public void actualizarBotonAmistad() {
    String estado = obtenerEstadoAmistad(IniciarSesion.idUsuario, B.idUsuarioSeleccionado);
    solicitudAmistad.setEnabled(true); // habilitar siempre por defecto

    switch (estado) {
        case "ninguna" -> {
            solicitudAmistad.setText("Agregar amigo");
            solicitudAmistad.setBackground(new Color(51, 153, 255)); // Azul
            solicitudAmistad.setForeground(Color.WHITE);
        }
        case "pendiente" -> {
            if (esReceptorSolicitud(B.idUsuarioSeleccionado, IniciarSesion.idUsuario)) {
                solicitudAmistad.setText("Aceptar solicitud");
                solicitudAmistad.setBackground(new Color(0, 200, 100)); // Verde
                solicitudAmistad.setForeground(Color.WHITE);
            } else {
                solicitudAmistad.setText("Cancelar solicitud");
                solicitudAmistad.setBackground(Color.GRAY);
                solicitudAmistad.setForeground(Color.WHITE);
            }
        }
        case "aceptada" -> {
            solicitudAmistad.setText("Eliminar amistad");
            solicitudAmistad.setBackground(Color.RED); // Rojo
            solicitudAmistad.setForeground(Color.WHITE);
        }
        default -> {
            solicitudAmistad.setText("Agregar amigo");
            solicitudAmistad.setBackground(new Color(51, 153, 255));
            solicitudAmistad.setForeground(Color.WHITE);
        }
    }

    // Si está viendo su propio perfil, ocultar el botón
    if (IniciarSesion.idUsuario == B.idUsuarioSeleccionado) {
        solicitudAmistad.setVisible(false);
    } else {
        solicitudAmistad.setVisible(true);
    }
}

    public void actualizarInfoPerfil(int userId) {
    final Connection conn;
    final PreparedStatement stmt;
    final ResultSet rs;

    try {
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        String sql = "SELECT Formacion_academica, Lugar_residencia, Genero, Fecha_nacimiento FROM perfil_usuario WHERE ID_Usuario = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, userId);
        rs = stmt.executeQuery();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    if (rs.next()) {
                        String formacion = rs.getString("Formacion_academica");
                        String residencia = rs.getString("Lugar_residencia");
                        String genero = rs.getString("Genero");
                        Date fechaNacimiento = rs.getDate("Fecha_nacimiento");

                        jLabel6.setText((formacion != null && !formacion.isEmpty()) ? formacion : "");
                        jLabel7.setText((residencia != null && !residencia.isEmpty()) ? residencia : "");
                        jLabel8.setText((genero != null && !genero.isEmpty()) ? genero : "");
                        jLabel9.setText((fechaNacimiento != null) ? fechaNacimiento.toString() : "");
                    } else {
                        jLabel6.setText("");
                        jLabel7.setText("");
                        jLabel8.setText("");
                        jLabel9.setText("");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    jLabel6.setText("");
                    jLabel7.setText("");
                    jLabel8.setText("");
                    jLabel9.setText("");
                } finally {
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
        SwingUtilities.invokeLater(() -> {
            jLabel6.setText("");
            jLabel7.setText("");
            jLabel8.setText("");
            jLabel9.setText("");
        });
    }
}
    
    
    
    public void eliminarAmistad(int usuario1, int usuario2) {
    try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1")) {
        String sql = "DELETE FROM amistad WHERE (ID_Usuario1 = ? AND ID_Usuario2 = ?) OR (ID_Usuario1 = ? AND ID_Usuario2 = ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, usuario1);
        pst.setInt(2, usuario2);
        pst.setInt(3, usuario2);
        pst.setInt(4, usuario1);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Amistad eliminada.");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    private void fotoperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoperfilActionPerformed
        this.dispose();
        FotoPerfil FP = new FotoPerfil();
        IniciarSesion IS = new IniciarSesion();
        FP.cargarImagenPerfil(IS.idUsuario, FP.fotoperfil);
        FP.setVisible(true);
    }//GEN-LAST:event_fotoperfilActionPerformed

    private void publiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publiActionPerformed
        this.dispose();
        Perfil_Amigo PA = new Perfil_Amigo();
        PA.setVisible(true);
        PA.actualizarNombreUsuario(B.idUsuarioSeleccionado);
        PA.cargarImagenUsuario(B.idUsuarioSeleccionado);
        PA.cargarImagenPortada(B.idUsuarioSeleccionado, PA.fotoportada);
        PA.cargarDestacadasPerfil(PA .offset, B.idUsuarioSeleccionado);
        PA.cargarPublicacion(PA.offset3, idUsuarioSeleccionado);
        PA.actualizarInfoPerfil(idUsuarioSeleccionado);
        PA.cargarReacciones();
        PA.actualizarBotonAmistad();
        this.setVisible(false); // Ocultar la ventana actual
    }//GEN-LAST:event_publiActionPerformed

    private void fotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotosActionPerformed
        this.dispose();
        FotosAmigo F = new FotosAmigo();
        F.setVisible(true);
    }//GEN-LAST:event_fotosActionPerformed

    private void publiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publiMouseEntered
    publi.setForeground(new Color(51,153,255));      // TODO add your handling code here:
    }//GEN-LAST:event_publiMouseEntered

    private void publiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publiMouseExited
     publi.setForeground(new Color(0,0,0));        // TODO add your handling code here:
    }//GEN-LAST:event_publiMouseExited

    private void fotosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotosMouseEntered
    fotos.setForeground(new Color(51,153,255));    // TODO add your handling code here:
    }//GEN-LAST:event_fotosMouseEntered

    private void fotosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotosMouseExited
    fotos.setForeground(new Color(0,0,0));   // TODO add your handling code here:
    }//GEN-LAST:event_fotosMouseExited

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        offset -= 4;
        sig.setVisible(true);
        cargarDestacadasPerfil(offset, B.idUsuarioSeleccionado);
    }//GEN-LAST:event_atrasActionPerformed

    private void sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigActionPerformed
        offset += 4;
        atras.setVisible(true);
        cargarDestacadasPerfil(offset, B.idUsuarioSeleccionado);
    }//GEN-LAST:event_sigActionPerformed

    private void destacada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destacada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destacada1ActionPerformed

    private void ComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComentarActionPerformed

        Comentarios C = new Comentarios();
        C.cargarComentarios(offset3, idPublicacion);
        C.setVisible(true);
    }//GEN-LAST:event_ComentarActionPerformed

    private void arriba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arriba2ActionPerformed
        offset3 -= 1;  // Decrementar el offset para obtener la publicación anterior
        cargarPublicacion(offset3, B.idUsuarioSeleccionado);
        corazon.setIcon(new ImageIcon(getClass().getResource("/me encanta1.png")));
        triste.setIcon(new ImageIcon(getClass().getResource("/me entristece1.png")));
        divierte.setIcon(new ImageIcon(getClass().getResource("/me divierte1.png")));
        Comentar.setVisible(true);
        Comentar.setVisible(true);
        corazon.setVisible(true);
        divierte.setVisible(true);
        triste.setVisible(true);
        
        eliminar.setVisible(true);
        cargarReacciones();
    }//GEN-LAST:event_arriba2ActionPerformed

    private void bajo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajo2ActionPerformed
        offset3 += 1;  // Aumentar el offset para obtener la siguiente publicación
        cargarPublicacion(offset3, B.idUsuarioSeleccionado);
        cargarReacciones();
    }//GEN-LAST:event_bajo2ActionPerformed

    private void foto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foto2ActionPerformed

    private void user2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user2ActionPerformed

    private void solicitudAmistadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitudAmistadActionPerformed
        String texto = solicitudAmistad.getText();

        switch (texto) {
        case "Agregar amigo" -> {
            enviarSolicitud(IniciarSesion.idUsuario, B.idUsuarioSeleccionado);
        }
        case "Aceptar solicitud" -> {
            int opcion = JOptionPane.showOptionDialog(this,
                    "¿Aceptar o rechazar la solicitud de amistad?",
                    "Solicitud pendiente",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{"Aceptar", "Rechazar"},
                    "Aceptar");

            if (opcion == JOptionPane.YES_OPTION) {
                aceptarSolicitud(B.idUsuarioSeleccionado, IniciarSesion.idUsuario);
            } else if (opcion == JOptionPane.NO_OPTION) {
                cancelarSolicitud(B.idUsuarioSeleccionado, IniciarSesion.idUsuario);
            }
        }
        case "Cancelar solicitud" -> {
            int confirm = JOptionPane.showConfirmDialog(this, "¿Cancelar la solicitud de amistad?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                cancelarSolicitud(IniciarSesion.idUsuario, B.idUsuarioSeleccionado);
            }
        }
        case "Eliminar amistad" -> {
            int confirm = JOptionPane.showConfirmDialog(this, "¿Eliminar a este amigo?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                eliminarAmistad(IniciarSesion.idUsuario, B.idUsuarioSeleccionado);
            }
        }
    }

    // Siempre actualizar estado del botón
    actualizarBotonAmistad();
    }//GEN-LAST:event_solicitudAmistadActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
         jPanel5.setVisible(!jPanel5.isVisible());   // TODO add your handling code here:
    }//GEN-LAST:event_eliminarMouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setForeground(new Color(51,153,255));// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
       jButton1.setForeground(new Color(0,0,0)); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.cargarPublicacion(P.offset2, IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_perfilActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        this.dispose();
        InicioF If = new InicioF();
        If.cargarImagenUsuario(idUsuario);
        If.cargarPublicaciones(If.offset2, idUsuario);
        If.setVisible(true);
    }//GEN-LAST:event_inicioActionPerformed

    private void notificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificacionesActionPerformed
        this.dispose();
        Notificaciones N = new Notificaciones();
        N.setVisible(true);
    }//GEN-LAST:event_notificacionesActionPerformed

    private void menu_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_uActionPerformed
        this.dispose();
        Perfil_Amigo P = new Perfil_Amigo();
        IniciarSesion IS = new IniciarSesion();
        Menuframe Mf = new Menuframe();
        Mf.actualizarNombreUsuario(IS.idUsuario);
        Mf.setVisible(true);
    }//GEN-LAST:event_menu_uActionPerformed

    private void perfil_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfil_uActionPerformed
        this.dispose();
        Perfil_Amigo P = new Perfil_Amigo();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_perfil_uActionPerformed

    private void amigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amigosActionPerformed
        this.dispose();
        FacebookFriends FF = new FacebookFriends();
        FF.setVisible(true);
    }//GEN-LAST:event_amigosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Perfil_Amigo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comentar;
    private javax.swing.JButton amigos;
    private javax.swing.JButton arriba2;
    private javax.swing.JButton atras;
    private javax.swing.JButton bajo2;
    private javax.swing.JLabel corazon;
    private javax.swing.JLabel desc1;
    private javax.swing.JLabel desc2;
    private javax.swing.JLabel desc3;
    private javax.swing.JLabel desc4;
    private javax.swing.JButton destacada1;
    private javax.swing.JButton destacada2;
    private javax.swing.JButton destacada3;
    private javax.swing.JButton destacada4;
    private javax.swing.JLabel divierte;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton foto2;
    private javax.swing.JButton fotoperfil;
    public javax.swing.JPanel fotoportada;
    private javax.swing.JButton fotos;
    private javax.swing.JLabel ima2;
    private javax.swing.JButton inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton menu_u;
    private javax.swing.JButton notificaciones;
    private javax.swing.JButton perfil;
    private javax.swing.JButton perfil_u;
    private javax.swing.JButton publi;
    private javax.swing.JButton sig;
    public javax.swing.JButton solicitudAmistad;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel triste;
    private javax.swing.JTextField user2;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
