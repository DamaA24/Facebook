/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.iniciosesion;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Damaris
 */
public class Fotos extends javax.swing.JFrame {

    /**
     * Creates new form Fotos
     */
    public Fotos() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public int offset = 0;
    IniciarSesion IS = new IniciarSesion();
    
    public void cargarFotosPerfil(int offset, int idUsuario) {
    try {
        // Si el offset es menor que 9, no mostrar el botón "Atras"
        if (offset < 9) {
            atras.setVisible(false);  // Botón "Atras"
        } else {
            atras.setVisible(true);   // Botón "Atras"
        }

        // Conectar a la base de datos
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        // Consulta SQL para obtener las imágenes desde la tabla 'publicacion' filtradas por el 'ID_Usuario'
        String query = "SELECT ID_Publicacion, Imagen FROM publicacion WHERE ID_Usuario = ? LIMIT 9 OFFSET ?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, idUsuario);  // Ajustamos el ID del usuario en la consulta
        pst.setInt(2, offset);      // Ajustar el OFFSET según la página de publicaciones

        // Ejecutar la consulta
        ResultSet rs = pst.executeQuery();

        // Asignar las imágenes a los botones
        JButton[] botones = {foto1, foto2, foto3, foto4, foto5, foto6, foto7, foto8, foto9};
        int i = 0;

        // Limpiar las imágenes en los botones antes de asignar nuevas
        for (JButton boton : botones) {
            boton.setIcon(null);
        }

        // Coloca las imágenes en orden inverso
        // Primero, guarda todas las imágenes en una lista
        List<byte[]> imagenes = new ArrayList<>();
        List<Integer> idsPublicacion = new ArrayList<>();
        
        while (rs.next()) {
            byte[] imagenPublicacion = rs.getBytes("Imagen");
            if (imagenPublicacion != null) {
                imagenes.add(imagenPublicacion);
                idsPublicacion.add(rs.getInt("ID_Publicacion"));
            }
        }

        // Ahora, recorremos la lista de imágenes de manera inversa
        Collections.reverse(imagenes);
        Collections.reverse(idsPublicacion);

        // Asignar las imágenes a los botones en orden inverso
        for (int j = 0; j < imagenes.size() && i < botones.length; j++) {
            byte[] imagenPublicacion = imagenes.get(j);

            // Crear un ImageIcon a partir de los datos de la imagen
            if (imagenPublicacion != null) {
                ImageIcon originalImageIcon = new ImageIcon(imagenPublicacion);

                // Obtener el tamaño del JButton (en este caso, el primer botón)
                int buttonWidth = botones[i].getWidth();
                int buttonHeight = botones[i].getHeight();

                // Escalar la imagen para que se ajuste al tamaño del botón
                Image originalImage = originalImageIcon.getImage();
                Image scaledImage = originalImage.getScaledInstance(buttonWidth, buttonHeight, Image.SCALE_SMOOTH);

                // Crear un nuevo ImageIcon con la imagen escalada
                ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

                // Establecer la imagen escalada en el botón correspondiente
                botones[i].setIcon(scaledImageIcon);
            }

            // Asignar el ID de la publicación a cada botón, si se necesita usarlo más tarde
            botones[i].putClientProperty("ID_Publicacion", idsPublicacion.get(j));

            i++;
        }

        // Si no hay suficientes publicaciones (menos de 9), deshabilitar el botón "Siguiente"
        if (i < 9) {
            sig.setVisible(false);  // Botón "Siguiente" desaparece si no hay suficientes fotos
        } else {
            sig.setVisible(true);   // Mostrar el botón "Siguiente" si hay más de 9 fotos
        }

        // Si no hay suficientes publicaciones, deshabilitar los botones restantes
        while (i < botones.length) {
            botones[i].setIcon(null);  // Limpiar las imágenes restantes
            i++;
        }

        con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al cargar las publicaciones: " + ex.getMessage());
    }
}





    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        B_Publicaciones = new javax.swing.JButton();
        B_Fotos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        foto3 = new javax.swing.JButton();
        foto1 = new javax.swing.JButton();
        foto5 = new javax.swing.JButton();
        foto2 = new javax.swing.JButton();
        foto6 = new javax.swing.JButton();
        foto7 = new javax.swing.JButton();
        foto4 = new javax.swing.JButton();
        foto9 = new javax.swing.JButton();
        foto8 = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        sig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        B_Publicaciones.setText("Publicaciones");
        B_Publicaciones.setBorder(null);
        B_Publicaciones.setBorderPainted(false);
        B_Publicaciones.setContentAreaFilled(false);
        B_Publicaciones.setFocusPainted(false);
        B_Publicaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_PublicacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_PublicacionesMouseExited(evt);
            }
        });
        B_Publicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_PublicacionesActionPerformed(evt);
            }
        });

        B_Fotos.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        B_Fotos.setText("Fotos");
        B_Fotos.setBorder(null);
        B_Fotos.setBorderPainted(false);
        B_Fotos.setContentAreaFilled(false);
        B_Fotos.setFocusPainted(false);
        B_Fotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_FotosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_FotosMouseExited(evt);
            }
        });
        B_Fotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_FotosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(B_Publicaciones)
                .addGap(33, 33, 33)
                .addComponent(B_Fotos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Publicaciones)
                    .addComponent(B_Fotos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Tus fotos ");

        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Álbumes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Tus fotos ");

        foto3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        foto3.setContentAreaFilled(false);
        foto3.setFocusPainted(false);
        foto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto3ActionPerformed(evt);
            }
        });

        foto1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        foto1.setContentAreaFilled(false);
        foto1.setFocusPainted(false);
        foto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto1ActionPerformed(evt);
            }
        });

        foto5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        foto5.setContentAreaFilled(false);
        foto5.setFocusPainted(false);
        foto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto5ActionPerformed(evt);
            }
        });

        foto2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        foto2.setContentAreaFilled(false);
        foto2.setFocusPainted(false);
        foto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto2ActionPerformed(evt);
            }
        });

        foto6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        foto6.setContentAreaFilled(false);
        foto6.setFocusPainted(false);
        foto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto6ActionPerformed(evt);
            }
        });

        foto7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        foto7.setContentAreaFilled(false);
        foto7.setFocusPainted(false);
        foto7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto7ActionPerformed(evt);
            }
        });

        foto4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        foto4.setContentAreaFilled(false);
        foto4.setFocusPainted(false);
        foto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto4ActionPerformed(evt);
            }
        });

        foto9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        foto9.setContentAreaFilled(false);
        foto9.setFocusPainted(false);
        foto9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto9ActionPerformed(evt);
            }
        });

        foto8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        foto8.setContentAreaFilled(false);
        foto8.setFocusPainted(false);
        foto8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto8ActionPerformed(evt);
            }
        });

        atras.setText("^");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        sig.setText("v");
        sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foto7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foto4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(foto5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foto8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(foto9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foto6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(atras))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(sig)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(atras)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(foto5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foto4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foto6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(foto7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(foto9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(foto8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sig)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_PublicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_PublicacionesActionPerformed
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.cargarPublicacion(P.offset2, IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_B_PublicacionesActionPerformed

    private void B_FotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_FotosActionPerformed
        this.dispose();
        Fotos F = new Fotos();
        IniciarSesion IS = new IniciarSesion();
        F.cargarFotosPerfil(F.offset, IS.idUsuario);
        F.setVisible(true);
    }//GEN-LAST:event_B_FotosActionPerformed

    private void B_PublicacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_PublicacionesMouseEntered
    B_Publicaciones.setForeground(new Color(51,153,255));          // TODO add your handling code here:
    }//GEN-LAST:event_B_PublicacionesMouseEntered

    private void B_PublicacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_PublicacionesMouseExited
    B_Publicaciones.setForeground(new Color(0,0,0));          // TODO add your handling code here:
    }//GEN-LAST:event_B_PublicacionesMouseExited

    private void B_FotosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_FotosMouseEntered
    B_Fotos.setForeground(new Color(51,153,255));          // TODO add your handling code here:
    }//GEN-LAST:event_B_FotosMouseEntered

    private void B_FotosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_FotosMouseExited
    B_Fotos.setForeground(new Color(0,0,0));         // TODO add your handling code here:
    }//GEN-LAST:event_B_FotosMouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        Album A = new Album();
        A.cargarAlbumes();
        A.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void foto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foto3ActionPerformed

    private void foto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foto1ActionPerformed

    private void foto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foto5ActionPerformed

    private void foto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foto2ActionPerformed

    private void foto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foto6ActionPerformed

    private void foto7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foto7ActionPerformed

    private void foto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foto4ActionPerformed

    private void foto9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foto9ActionPerformed

    private void foto8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foto8ActionPerformed

    private void sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigActionPerformed
        offset += 9;  
        atras.setVisible(true);
        cargarFotosPerfil(offset, IS.idUsuario); 
    }//GEN-LAST:event_sigActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        offset -= 9;  
        sig.setVisible(true);
        cargarFotosPerfil(offset, IS.idUsuario);
    }//GEN-LAST:event_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(Fotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fotos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Fotos;
    private javax.swing.JButton B_Publicaciones;
    private javax.swing.JButton atras;
    private javax.swing.JButton foto1;
    private javax.swing.JButton foto2;
    private javax.swing.JButton foto3;
    private javax.swing.JButton foto4;
    private javax.swing.JButton foto5;
    private javax.swing.JButton foto6;
    private javax.swing.JButton foto7;
    private javax.swing.JButton foto8;
    private javax.swing.JButton foto9;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sig;
    // End of variables declaration//GEN-END:variables
}
