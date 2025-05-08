/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.iniciosesion;

import static com.mycompany.iniciosesion.IniciarSesion.idUsuario;
import static com.mycompany.iniciosesion.Perfil.idPublicacion;
import static com.mycompany.iniciosesion.Perfil.offset3;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Damaris
 */
public class ComentariosInicio extends javax.swing.JFrame {

    
    InicioF IF = new InicioF();
    public ComentariosInicio() {
        initComponents();
        Comentarioo.setText("Comentar...");
        Comentarioo.setForeground(new java.awt.Color(204, 204, 204)); // Gris claro por defecto
    
            // Agregar FocusListener para borrar el texto predeterminado al hacer clic
        Comentarioo.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (Comentarioo.getText().equals("Comentar...")) {
                    Comentarioo.setText(""); // Borrar texto predeterminado
                    Comentarioo.setForeground(new java.awt.Color(0, 0, 0)); // Cambiar a texto negro
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (Comentarioo.getText().isEmpty()) {
                    Comentarioo.setText("Comentar..."); // Restaurar texto predeterminado
                    Comentarioo.setForeground(new java.awt.Color(204, 204, 204)); // Gris claro
                }
            }
        });
        // Revisar si el JTextArea está vacío al inicio
        if (Comentarioo.getText().isEmpty()) {
            Comentarioo.setText("Comentar...");
            Comentarioo.setForeground(new java.awt.Color(204, 204, 204)); // Gris claro
        }
    }
    
    Perfil P = new Perfil();
    
    public void cargarComentarios(int offset, int idPublicacion) {
    try {
        // Conectar a la base de datos
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        // Consulta SQL para obtener hasta 3 comentarios con información de usuario
        String query = "SELECT c.Contenido, c.Imagen, c.Fecha_comentario, u.Nombre, u.Apellido, u.Foto_perfil " +
                       "FROM comentario c " +
                       "JOIN perfil_usuario u ON c.ID_Usuario = u.ID_Usuario " +
                       "WHERE c.ID_Publicacion = ? " +
                       "ORDER BY c.Fecha_comentario ASC " +
                       "LIMIT 3 OFFSET ?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, idPublicacion);
        pst.setInt(2, offset);

        ResultSet rs = pst.executeQuery();

        // LIMPIAR COMENTARIOS ANTERIORES
        txt1.setText(""); ima1.setIcon(null); user1.setText(""); foto1.setIcon(null);
        txt2.setText(""); ima2.setIcon(null); user2.setText(""); foto2.setIcon(null);
        txt3.setText(""); ima3.setIcon(null); user3.setText(""); foto3.setIcon(null);

        int index = 0;
        while (rs.next()) {
            String contenido = rs.getString("Contenido");
            byte[] imagenComentario = rs.getBytes("Imagen");
            String nombreUsuario = rs.getString("Nombre") + " " + rs.getString("Apellido");
            byte[] fotoPerfil = rs.getBytes("Foto_perfil");

            if (index == 0) {
                txt1.setText(contenido);
                user1.setText(nombreUsuario);
                if (imagenComentario != null) {
                    ImageIcon icon = new ImageIcon(imagenComentario);
                    Image img = icon.getImage().getScaledInstance(ima1.getWidth(), ima1.getHeight(), Image.SCALE_SMOOTH);
                    ima1.setIcon(new ImageIcon(img));
                } else {
                    ima1.setIcon(null);
                }

                if (fotoPerfil != null) {
                    ImageIcon icon = new ImageIcon(fotoPerfil);
                    Image img = icon.getImage().getScaledInstance(foto1.getWidth(), foto1.getHeight(), Image.SCALE_SMOOTH);
                    foto1.setIcon(new ImageIcon(img));
                } else {
                    foto1.setIcon(null);
                }
            } else if (index == 1) {
                txt2.setText(contenido);
                user2.setText(nombreUsuario);
                if (imagenComentario != null) {
                    ImageIcon icon = new ImageIcon(imagenComentario);
                    Image img = icon.getImage().getScaledInstance(ima2.getWidth(), ima2.getHeight(), Image.SCALE_SMOOTH);
                    ima2.setIcon(new ImageIcon(img));
                } else {
                    ima2.setIcon(null);
                }

                if (fotoPerfil != null) {
                    ImageIcon icon = new ImageIcon(fotoPerfil);
                    Image img = icon.getImage().getScaledInstance(foto2.getWidth(), foto2.getHeight(), Image.SCALE_SMOOTH);
                    foto2.setIcon(new ImageIcon(img));
                } else {
                    foto2.setIcon(null);
                }
            } else if (index == 2) {
                txt3.setText(contenido);
                user3.setText(nombreUsuario);
                if (imagenComentario != null) {
                    ImageIcon icon = new ImageIcon(imagenComentario);
                    Image img = icon.getImage().getScaledInstance(ima3.getWidth(), ima3.getHeight(), Image.SCALE_SMOOTH);
                    ima3.setIcon(new ImageIcon(img));
                } else {
                    ima3.setIcon(null);
                }

                if (fotoPerfil != null) {
                    ImageIcon icon = new ImageIcon(fotoPerfil);
                    Image img = icon.getImage().getScaledInstance(foto3.getWidth(), foto3.getHeight(), Image.SCALE_SMOOTH);
                    foto3.setIcon(new ImageIcon(img));
                } else {
                    foto3.setIcon(null);
                }
            }

            index++;
        }

        // Mostrar u ocultar botones de navegación si existen
        if (bajo != null) {
            bajo.setVisible(index == 3);
        }
        if (arriba != null) {
            arriba.setVisible(offset > 0);
        }

        con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al cargar los comentarios: " + ex.getMessage());
    }
}

    





    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        foto1 = new javax.swing.JButton();
        user1 = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        ima1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        foto2 = new javax.swing.JButton();
        user2 = new javax.swing.JButton();
        ima2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        foto3 = new javax.swing.JButton();
        user3 = new javax.swing.JButton();
        txt3 = new javax.swing.JLabel();
        ima3 = new javax.swing.JLabel();
        bajo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Comentarioo = new javax.swing.JTextArea();
        ima = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        arriba = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        foto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        foto1.setBorder(null);
        foto1.setBorderPainted(false);
        foto1.setContentAreaFilled(false);
        foto1.setFocusPainted(false);

        user1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        user1.setText("Nombre Usuario");
        user1.setBorder(null);
        user1.setBorderPainted(false);
        user1.setContentAreaFilled(false);
        user1.setFocusPainted(false);
        user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(user1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(ima1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(user1)
                        .addGap(18, 18, 18)))
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ima1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(303, 125));

        foto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        foto2.setBorder(null);
        foto2.setBorderPainted(false);
        foto2.setContentAreaFilled(false);
        foto2.setFocusPainted(false);

        user2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        user2.setText("Nombre Usuario");
        user2.setBorder(null);
        user2.setBorderPainted(false);
        user2.setContentAreaFilled(false);
        user2.setFocusPainted(false);
        user2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(ima2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(user2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ima2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(303, 125));

        foto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        foto3.setBorder(null);
        foto3.setBorderPainted(false);
        foto3.setContentAreaFilled(false);
        foto3.setFocusPainted(false);

        user3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        user3.setText("Nombre Usuario");
        user3.setBorder(null);
        user3.setBorderPainted(false);
        user3.setContentAreaFilled(false);
        user3.setFocusPainted(false);
        user3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user3)
                        .addContainerGap(173, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(ima3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(user3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ima3, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
        );

        bajo.setText("Abajo");
        bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                .addGap(0, 71, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(bajo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bajo)
                .addContainerGap(664, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enviar.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FV.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setFocusPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        Comentarioo.setColumns(20);
        Comentarioo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Comentarioo.setRows(5);
        Comentarioo.setText("Comentar...");
        jScrollPane2.setViewportView(Comentarioo);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(ima, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9)
                            .addComponent(jButton7))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(ima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        arriba.setText("Arriba");
        arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(arriba)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arriba)
                    .addComponent(jButton1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user1ActionPerformed

    private void user2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user2ActionPerformed

    private void user3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String texto = Comentarioo.getText();
        java.sql.Timestamp fechaSubida = new java.sql.Timestamp(System.currentTimeMillis());  // Cambiado a Timestamp
        

        // Validar que se haya escrito algo
        if (texto.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Escribe algo para comentar.");
        return;
        }

            // Obtener la imagen del JLabel
            Icon icon = ima.getIcon();
            byte[] foto = null;

            if (icon != null && icon instanceof ImageIcon) {
                ImageIcon icono = (ImageIcon) icon;
                Image image = icono.getImage();
                BufferedImage bufferedImage = new BufferedImage(
                    image.getWidth(null),
                    image.getHeight(null),
                    BufferedImage.TYPE_INT_ARGB
                );

                Graphics2D g2d = bufferedImage.createGraphics();
                g2d.drawImage(image, 0, 0, null);
                g2d.dispose();

                // Convertir imagen a byte[]
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                try {
                    ImageIO.write(bufferedImage, "png", baos);
                    baos.flush();
                    foto = baos.toByteArray();
                    baos.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error al convertir la imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Obtener el ID del usuario (ajústalo si es una clase estática)
            int idUsuario = IniciarSesion.idUsuario;
            int idComentario = InicioF.idSeleccionada;

            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

                String queryInsertar = "INSERT INTO comentario (ID_Usuario, ID_Publicacion, contenido, Imagen, Fecha_comentario) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement stInsertar = con.prepareStatement(queryInsertar);

                stInsertar.setInt(1, idUsuario);
                stInsertar.setInt(2, idComentario);
                stInsertar.setString(3, texto);
                if (foto != null) {
                    stInsertar.setBytes(4, foto);
                } else {
                    stInsertar.setNull(4, java.sql.Types.BLOB);
                }
                stInsertar.setTimestamp(5, fechaSubida);  // Usamos setTimestamp para insertar la fecha y hora

                int filasAfectadas = stInsertar.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, "Comentario subido correctamente.");
                } else {
                    JOptionPane.showMessageDialog(this, "Hubo un error al subir el comentario.");
                }

                stInsertar.close();
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error en la base de datos: " + ex.getMessage());
            }
            
            
            cargarComentarios(IF.offset3, IF.idSeleccionada);
            
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        // Filtrar para solo mostrar archivos de imagen
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de imagen", "jpg", "png", "gif");
        fileChooser.setFileFilter(filtro);

        // Abrir el cuadro de diálogo para seleccionar el archivo
        int resultado = fileChooser.showOpenDialog(this);

        // Verificar si el usuario seleccionó un archivo
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();

            // Limpiar texto previo
            ima.setText("");

            // Crear ImageIcon y obtener la imagen original
            ImageIcon imagenIcono = new ImageIcon(archivoSeleccionado.getAbsolutePath());
            Image imagen = imagenIcono.getImage();

            // Obtener tamaño actual del JLabel
            int ancho = ima.getWidth();
            int alto  = ima.getHeight();
            // Si todavía no está visible o mide 0, usa el tamaño preferido
            if (ancho <= 0 || alto <= 0) {
                Dimension d = ima.getPreferredSize();
                ancho = d.width;
                alto  = d.height;
            }

            // Escalar la imagen al tamaño del JLabel
            Image imagenEscalada = imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
            ima.setIcon(new ImageIcon(imagenEscalada));

            // Si lo necesitas, fuerza el re-layout
            ima.revalidate();
            ima.repaint();
}
    }//GEN-LAST:event_jButton9ActionPerformed

    private void arribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaActionPerformed
        offset3 -= 3;
        InicioF IF = new InicioF();
        cargarComentarios(offset3, IF.idSeleccionada);
    }//GEN-LAST:event_arribaActionPerformed

    private void bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajoActionPerformed
       offset3 += 3;
       InicioF IF = new InicioF();
       cargarComentarios(offset3, IF.idSeleccionada);
    }//GEN-LAST:event_bajoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ComentariosInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComentariosInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComentariosInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComentariosInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComentariosInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Comentarioo;
    private javax.swing.JButton arriba;
    private javax.swing.JButton bajo;
    private javax.swing.JButton foto1;
    private javax.swing.JButton foto2;
    private javax.swing.JButton foto3;
    private javax.swing.JLabel ima;
    private javax.swing.JLabel ima1;
    private javax.swing.JLabel ima2;
    private javax.swing.JLabel ima3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JButton user1;
    private javax.swing.JButton user2;
    private javax.swing.JButton user3;
    // End of variables declaration//GEN-END:variables
}
