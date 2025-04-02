package com.mycompany.iniciosesion;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
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

public class Perfil extends javax.swing.JFrame {
    public int offset = 0;
    int idMedia;
    IniciarSesion IS = new IniciarSesion();
    private Image background_image;
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
        jPanel1 = new javax.swing.JPanel();
        fotoportada = new javax.swing.JPanel();
        editarfotos = new javax.swing.JButton();
        fotoperfil = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        destacada1 = new javax.swing.JButton();
        destacada3 = new javax.swing.JButton();
        destacada4 = new javax.swing.JButton();
        destacada2 = new javax.swing.JButton();
        sigdestacada = new javax.swing.JButton();
        añadirdestacada = new javax.swing.JButton();
        sigdestacada1 = new javax.swing.JButton();
        desc1 = new javax.swing.JLabel();
        desc2 = new javax.swing.JLabel();
        desc3 = new javax.swing.JLabel();
        desc4 = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        fotoportada.setBackground(new java.awt.Color(255, 255, 255));

        editarfotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editarperfil.png"))); // NOI18N
        editarfotos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editarfotos.setContentAreaFilled(false);
        editarfotos.setFocusPainted(false);
        editarfotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarfotosActionPerformed(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editarfotos)
                .addContainerGap())
            .addGroup(fotoportadaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(fotoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fotoportadaLayout.setVerticalGroup(
            fotoportadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoportadaLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(fotoportadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoportadaLayout.createSequentialGroup()
                        .addComponent(editarfotos)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fotoportadaLayout.createSequentialGroup()
                        .addComponent(fotoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        usuario.setText("Usuario");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Detalles");

        jButton1.setText("Editar detalles públicos");
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton1))
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

        sigdestacada.setText(">>");
        sigdestacada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sigdestacada.setContentAreaFilled(false);
        sigdestacada.setFocusPainted(false);
        sigdestacada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigdestacadaActionPerformed(evt);
            }
        });

        añadirdestacada.setText("Modificar Destacadas");
        añadirdestacada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        añadirdestacada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirdestacadaActionPerformed(evt);
            }
        });

        sigdestacada1.setText("<<");
        sigdestacada1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sigdestacada1.setContentAreaFilled(false);
        sigdestacada1.setFocusPainted(false);
        sigdestacada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigdestacada1ActionPerformed(evt);
            }
        });

        desc1.setText("1");

        desc2.setText("2");

        desc3.setText("3");

        desc4.setText("4");

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
                        .addComponent(sigdestacada1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(desc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(añadirdestacada)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sigdestacada, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(desc4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadirdestacada)
                    .addComponent(sigdestacada)
                    .addComponent(sigdestacada1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fotoportada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fotoportada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
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
                            } else {
                                // Si no hay imagen, mostrar mensaje
                                JOptionPane.showMessageDialog(fotoportada, "Usuario sin imagen de perfil.");
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
            i++;
        }

        con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al cargar las imágenes: " + ex.getMessage());
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
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
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

    private void editarfotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarfotosActionPerformed
        this.dispose();
        EditarImagenes EI = new EditarImagenes();
        EI.setVisible(true);
    }//GEN-LAST:event_editarfotosActionPerformed

    private void fotoperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoperfilActionPerformed
        this.dispose();
        FotoPerfil FP = new FotoPerfil();
        IniciarSesion IS = new IniciarSesion();
        FP.cargarImagenPerfil(IS.idUsuario, FP.fotoperfil);
        FP.setVisible(true);
    }//GEN-LAST:event_fotoperfilActionPerformed

    private void sigdestacadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigdestacadaActionPerformed
        offset += 4;  
        cargarDestacadasPerfil(offset, IS.idUsuario); 
    }//GEN-LAST:event_sigdestacadaActionPerformed

    private void añadirdestacadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirdestacadaActionPerformed
        this.dispose();
        ModificarDestacadas MD = new ModificarDestacadas();
        MD.setVisible(true);
    }//GEN-LAST:event_añadirdestacadaActionPerformed

    private void destacada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destacada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destacada1ActionPerformed

    private void sigdestacada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigdestacada1ActionPerformed
        offset -= 4;  
        cargarDestacadasPerfil(offset, IS.idUsuario); 
    }//GEN-LAST:event_sigdestacada1ActionPerformed

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
    private javax.swing.JButton añadirdestacada;
    private javax.swing.JLabel desc1;
    private javax.swing.JLabel desc2;
    private javax.swing.JLabel desc3;
    private javax.swing.JLabel desc4;
    private javax.swing.JButton destacada1;
    private javax.swing.JButton destacada2;
    private javax.swing.JButton destacada3;
    private javax.swing.JButton destacada4;
    private javax.swing.JButton editarfotos;
    private javax.swing.JButton fotoperfil;
    public javax.swing.JPanel fotoportada;
    private javax.swing.JButton inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel menu;
    private javax.swing.JButton menu_u;
    private javax.swing.JButton notificaciones;
    private javax.swing.JButton perfil_u;
    private javax.swing.JButton sigdestacada;
    private javax.swing.JButton sigdestacada1;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
