/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.iniciosesion;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan Mijares
 */
public class EliminarDestacada extends javax.swing.JFrame {
    IniciarSesion IS = new IniciarSesion();
    public int offset = 0;
    public int idDestacada;
    public EliminarDestacada() {
        initComponents();
        setLocationRelativeTo(null);
        cargarDestacadas(offset, IS.idUsuario);
    }

    
    public void cargarDestacadas(int offset, int idUsuario) {
    try {
        // Conectar a la base de datos
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        // Consulta SQL para obtener las imágenes desde la tabla 'media' filtradas por el 'ID_Usuario'
        String query = "SELECT ID_Destacada, Icono_destacada FROM destacadas WHERE ID_Usuario = ? LIMIT 8 OFFSET ?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, idUsuario);  // Ajustamos el ID del usuario en la consulta
        pst.setInt(2, offset);      // Ajustar el OFFSET según la página de imágenes

        // Ejecutar la consulta
        ResultSet rs = pst.executeQuery();

        // Asignar las imágenes y los ID de media a los botones
        JButton[] botones = {d1, d2, d3, d4, d5, d6, d7, d8};
        int i = 0;

        // Limpiar las imágenes en los botones antes de asignar nuevas
        for (JButton boton : botones) {
            boton.setIcon(null);
            boton.setEnabled(true);  // Asegurarse de que los botones estén habilitados
        }

        // Procesar los resultados de la consulta y asignar las imágenes a los botones
        while (rs.next() && i < botones.length) {
        idDestacada = rs.getInt("ID_Destacada");
        byte[] contenidoMedia = rs.getBytes("Icono_destacada");

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

        // Asignar el ID del medio a cada botón, si se necesita usarlo más tarde
        botones[i].putClientProperty("ID_Destacada", idDestacada);

        i++;
        }

        // Si no hay suficientes imágenes, deshabilitar los botones restantes
        while (i < botones.length) {
            botones[i].setEnabled(false);
            i++;
        }

        con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al cargar las imágenes: " + ex.getMessage());
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        destacada1 = new javax.swing.JButton();
        destacada4 = new javax.swing.JButton();
        destacada10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        d2 = new javax.swing.JButton();
        d1 = new javax.swing.JButton();
        d7 = new javax.swing.JButton();
        d5 = new javax.swing.JButton();
        d3 = new javax.swing.JButton();
        d4 = new javax.swing.JButton();
        d6 = new javax.swing.JButton();
        d8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        atras = new javax.swing.JButton();

        destacada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        destacada1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        destacada1.setContentAreaFilled(false);
        destacada1.setFocusPainted(false);

        destacada4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        destacada4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        destacada4.setContentAreaFilled(false);
        destacada4.setFocusPainted(false);

        destacada10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        destacada10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        destacada10.setContentAreaFilled(false);
        destacada10.setFocusPainted(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(372, 580));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Seleccione una foto para eliminar de destacadas");

        siguiente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        siguiente.setText(">>");
        siguiente.setBorderPainted(false);
        siguiente.setContentAreaFilled(false);
        siguiente.setFocusPainted(false);
        siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                siguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                siguienteMouseExited(evt);
            }
        });
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        d2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d2.setContentAreaFilled(false);
        d2.setFocusPainted(false);
        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });

        d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        d1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d1.setContentAreaFilled(false);
        d1.setFocusPainted(false);
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });

        d7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        d7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d7.setContentAreaFilled(false);
        d7.setFocusPainted(false);
        d7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d7ActionPerformed(evt);
            }
        });

        d5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        d5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d5.setContentAreaFilled(false);
        d5.setFocusPainted(false);
        d5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5ActionPerformed(evt);
            }
        });

        d3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        d3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d3.setContentAreaFilled(false);
        d3.setFocusPainted(false);
        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });

        d4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        d4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d4.setContentAreaFilled(false);
        d4.setFocusPainted(false);
        d4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ActionPerformed(evt);
            }
        });

        d6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        d6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d6.setContentAreaFilled(false);
        d6.setFocusPainted(false);
        d6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d6ActionPerformed(evt);
            }
        });

        d8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/añadirhistoria.png"))); // NOI18N
        d8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d8.setContentAreaFilled(false);
        d8.setFocusPainted(false);
        d8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d8ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Volver");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        atras.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        atras.setText("<<");
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);
        atras.setFocusPainted(false);
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atrasMouseExited(evt);
            }
        });
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(siguiente)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(d8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atras)
                    .addComponent(siguiente))
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        ModificarDestacadas MD = new ModificarDestacadas();
        MD.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        offset -= 8;  
        cargarDestacadas(offset, IS.idUsuario);  
    }//GEN-LAST:event_atrasActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        offset += 8;  
        cargarDestacadas(offset, IS.idUsuario);  
    }//GEN-LAST:event_siguienteActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        Object mediaIdObject = d1.getClientProperty("ID_Destacada");

        if (mediaIdObject != null) {
            idDestacada = (int) mediaIdObject;  // Convertir el valor a int

            try {
                // Conectar a la base de datos
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

                // Consulta SQL para eliminar la destacada con el ID de media
                String query = "DELETE FROM destacadas WHERE ID_Destacada = ?";
                PreparedStatement pst = con.prepareStatement(query);

                // Establecer el parámetro del ID_Media
                pst.setInt(1, idDestacada);

                // Ejecutar la consulta de eliminación
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Imagen destacada eliminada con éxito.");

                    // Opcional: Limpiar la imagen del botón si la quieres quitar de la interfaz
                    d1.setIcon(null);
                    d1.setEnabled(false); // Deshabilitar el botón para indicar que está vacío
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró la destacada con el ID especificado.");
                }

                // Cerrar la conexión
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna imagen.");
        }
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_d1ActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        Object mediaIdObject = d2.getClientProperty("ID_Destacada");

        if (mediaIdObject != null) {
            idDestacada = (int) mediaIdObject;  // Convertir el valor a int

            try {
                // Conectar a la base de datos
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

                // Consulta SQL para eliminar la destacada con el ID de media
                String query = "DELETE FROM destacadas WHERE ID_Destacada = ?";
                PreparedStatement pst = con.prepareStatement(query);

                // Establecer el parámetro del ID_Media
                pst.setInt(1, idDestacada);

                // Ejecutar la consulta de eliminación
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Imagen destacada eliminada con éxito.");

                    // Opcional: Limpiar la imagen del botón si la quieres quitar de la interfaz
                    d2.setIcon(null);
                    d2.setEnabled(false); // Deshabilitar el botón para indicar que está vacío
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró la destacada con el ID especificado.");
                }

                // Cerrar la conexión
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna imagen.");
        }
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_d2ActionPerformed

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
        Object mediaIdObject = d3.getClientProperty("ID_Destacada");

        if (mediaIdObject != null) {
            idDestacada = (int) mediaIdObject;  // Convertir el valor a int

            try {
                // Conectar a la base de datos
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

                // Consulta SQL para eliminar la destacada con el ID de media
                String query = "DELETE FROM destacadas WHERE ID_Destacada = ?";
                PreparedStatement pst = con.prepareStatement(query);

                // Establecer el parámetro del ID_Media
                pst.setInt(1, idDestacada);

                // Ejecutar la consulta de eliminación
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Imagen destacada eliminada con éxito.");

                    // Opcional: Limpiar la imagen del botón si la quieres quitar de la interfaz
                    d3.setIcon(null);
                    d3.setEnabled(false); // Deshabilitar el botón para indicar que está vacío
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró la destacada con el ID especificado.");
                }

                // Cerrar la conexión
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna imagen.");
        }
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_d3ActionPerformed

    private void d4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4ActionPerformed
Object mediaIdObject = d4.getClientProperty("ID_Destacada");

        if (mediaIdObject != null) {
            idDestacada = (int) mediaIdObject;  // Convertir el valor a int

            try {
                // Conectar a la base de datos
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

                // Consulta SQL para eliminar la destacada con el ID de media
                String query = "DELETE FROM destacadas WHERE ID_Destacada = ?";
                PreparedStatement pst = con.prepareStatement(query);

                // Establecer el parámetro del ID_Media
                pst.setInt(1, idDestacada);

                // Ejecutar la consulta de eliminación
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Imagen destacada eliminada con éxito.");

                    // Opcional: Limpiar la imagen del botón si la quieres quitar de la interfaz
                    d4.setIcon(null);
                    d4.setEnabled(false); // Deshabilitar el botón para indicar que está vacío
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró la destacada con el ID especificado.");
                }

                // Cerrar la conexión
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna imagen.");
        }
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_d4ActionPerformed

    private void d5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5ActionPerformed
Object mediaIdObject = d5.getClientProperty("ID_Destacada");

        if (mediaIdObject != null) {
            idDestacada = (int) mediaIdObject;  // Convertir el valor a int

            try {
                // Conectar a la base de datos
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

                // Consulta SQL para eliminar la destacada con el ID de media
                String query = "DELETE FROM destacadas WHERE ID_Destacada = ?";
                PreparedStatement pst = con.prepareStatement(query);

                // Establecer el parámetro del ID_Media
                pst.setInt(1, idDestacada);

                // Ejecutar la consulta de eliminación
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Imagen destacada eliminada con éxito.");

                    // Opcional: Limpiar la imagen del botón si la quieres quitar de la interfaz
                    d5.setIcon(null);
                    d5.setEnabled(false); // Deshabilitar el botón para indicar que está vacío
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró la destacada con el ID especificado.");
                }

                // Cerrar la conexión
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna imagen.");
        }
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_d5ActionPerformed

    private void d6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6ActionPerformed
Object mediaIdObject = d6.getClientProperty("ID_Destacada");

        if (mediaIdObject != null) {
            idDestacada = (int) mediaIdObject;  // Convertir el valor a int

            try {
                // Conectar a la base de datos
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

                // Consulta SQL para eliminar la destacada con el ID de media
                String query = "DELETE FROM destacadas WHERE ID_Destacada = ?";
                PreparedStatement pst = con.prepareStatement(query);

                // Establecer el parámetro del ID_Media
                pst.setInt(1, idDestacada);

                // Ejecutar la consulta de eliminación
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Imagen destacada eliminada con éxito.");

                    // Opcional: Limpiar la imagen del botón si la quieres quitar de la interfaz
                    d6.setIcon(null);
                    d6.setEnabled(false); // Deshabilitar el botón para indicar que está vacío
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró la destacada con el ID especificado.");
                }

                // Cerrar la conexión
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna imagen.");
        }
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_d6ActionPerformed

    private void d7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d7ActionPerformed
      Object mediaIdObject = d7.getClientProperty("ID_Destacada");

        if (mediaIdObject != null) {
            idDestacada = (int) mediaIdObject;  // Convertir el valor a int

            try {
                // Conectar a la base de datos
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

                // Consulta SQL para eliminar la destacada con el ID de media
                String query = "DELETE FROM destacadas WHERE ID_Destacada = ?";
                PreparedStatement pst = con.prepareStatement(query);

                // Establecer el parámetro del ID_Media
                pst.setInt(1, idDestacada);

                // Ejecutar la consulta de eliminación
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Imagen destacada eliminada con éxito.");

                    // Opcional: Limpiar la imagen del botón si la quieres quitar de la interfaz
                    d7.setIcon(null);
                    d7.setEnabled(false); // Deshabilitar el botón para indicar que está vacío
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró la destacada con el ID especificado.");
                }

                // Cerrar la conexión
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna imagen.");
        }
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_d7ActionPerformed

    private void d8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d8ActionPerformed
        Object mediaIdObject = d8.getClientProperty("ID_Destacada");

        if (mediaIdObject != null) {
            idDestacada = (int) mediaIdObject;  // Convertir el valor a int

            try {
                // Conectar a la base de datos
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

                // Consulta SQL para eliminar la destacada con el ID de media
                String query = "DELETE FROM destacadas WHERE ID_Destacada = ?";
                PreparedStatement pst = con.prepareStatement(query);

                // Establecer el parámetro del ID_Media
                pst.setInt(1, idDestacada);

                // Ejecutar la consulta de eliminación
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Imagen destacada eliminada con éxito.");

                    // Opcional: Limpiar la imagen del botón si la quieres quitar de la interfaz
                    d8.setIcon(null);
                    d8.setEnabled(false); // Deshabilitar el botón para indicar que está vacío
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró la destacada con el ID especificado.");
                }

                // Cerrar la conexión
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna imagen.");
        }
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_d8ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setForeground(new Color(51,153,253));// TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setForeground(new Color(0,0,0));// TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseExited

    private void siguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseEntered
        siguiente.setForeground(new Color(51,153,253));// TODO add your handling code here:
    }//GEN-LAST:event_siguienteMouseEntered

    private void siguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseExited
        siguiente.setForeground(new Color(0,0,0));// TODO add your handling code here:
    }//GEN-LAST:event_siguienteMouseExited

    private void atrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseEntered
        atras.setForeground(new Color(51,153,253));// TODO add your handling code here:
    }//GEN-LAST:event_atrasMouseEntered

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseExited
        atras.setForeground(new Color(0,0,0));// TODO add your handling code here:
    }//GEN-LAST:event_atrasMouseExited

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
            java.util.logging.Logger.getLogger(AñadirDestacada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirDestacada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirDestacada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirDestacada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarDestacada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton d1;
    private javax.swing.JButton d2;
    private javax.swing.JButton d3;
    private javax.swing.JButton d4;
    private javax.swing.JButton d5;
    private javax.swing.JButton d6;
    private javax.swing.JButton d7;
    private javax.swing.JButton d8;
    private javax.swing.JButton destacada1;
    private javax.swing.JButton destacada10;
    private javax.swing.JButton destacada4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
