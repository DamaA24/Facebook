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
import javax.swing.SwingUtilities;

/**
 *
 * @author Damaris
 */
public class FotosAlbum extends javax.swing.JFrame {

    /**
     * Creates new form Fotos
     */
    public FotosAlbum() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public int offset = 0;
    IniciarSesion IS = new IniciarSesion();
    
    public void cargarFotosAlbum(int offset, int idAlbum) {
    try {
        // Mostrar u ocultar el botón "Atras" según el offset
        atras.setVisible(offset >= 9);

        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        String query = """
            SELECT ID_Media, Contenido_media 
            FROM media 
            WHERE ID_Album = ? AND Tipo = 'imagen' 
            ORDER BY Fecha DESC 
            LIMIT 9 OFFSET ?""";

        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, idAlbum);
        pst.setInt(2, offset);
        ResultSet rs = pst.executeQuery();

        JButton[] botones = {foto1, foto2, foto3, foto4, foto5, foto6, foto7, foto8, foto9};
        int i = 0;

        for (JButton boton : botones) {
            boton.setIcon(null); // limpiar antes
        }

        List<byte[]> imagenes = new ArrayList<>();
        List<Integer> idsMedia = new ArrayList<>();

        while (rs.next()) {
            byte[] img = rs.getBytes("Contenido_media");
            int idMedia = rs.getInt("ID_Media");

            if (img != null) {
                imagenes.add(img);
                idsMedia.add(idMedia);
            }
        }

        for (int j = 0; j < imagenes.size() && i < botones.length; j++) {
            byte[] img = imagenes.get(j);

            ImageIcon iconoOriginal = new ImageIcon(img);
            int w = botones[i].getWidth(), h = botones[i].getHeight();
            Image imgEscalada = iconoOriginal.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
            botones[i].setIcon(new ImageIcon(imgEscalada));
            botones[i].putClientProperty("ID_Media", idsMedia.get(j));

            i++;
        }

        sig.setVisible(i == 9); // mostrar "siguiente" solo si hay 9 fotos

        // Desactivar los botones restantes
        while (i < botones.length) {
            botones[i].setIcon(null);
            i++;
        }

        con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al cargar fotos del álbum: " + ex.getMessage());
    }
}
    
    public void actualizarNombreUsuario(int idAlbum) {
    final Connection conn;  // Hacer final la variable
    final PreparedStatement stmt;  // Hacer final la variable
    final ResultSet rs;  // Hacer final la variable

    try {
        // Configuración de la conexión a la base de datos
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        // Consulta SQL para obtener el nombre del usuario usando la columna 'ID_Usuario'
        String sql = "SELECT Nombre FROM album WHERE ID_Album = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, idAlbum); // Establecer el ID del usuario en la consulta

        // Ejecutar la consulta
        rs = stmt.executeQuery();

        // Usar invokeLater para asegurar que el código se ejecute en el hilo de la interfaz gráfica
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    if (rs.next()) {  // Usar rs dentro del Runnable
                        String nombre = rs.getString("Nombre");
                        // Obtener el nombre del usuario
                        usuario.setText(nombre); // Establecer el nombre en el JLabel
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





    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        B_Publicaciones = new javax.swing.JButton();
        B_Fotos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        usuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usuario.setText("Tus fotos ");

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
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(foto6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(sig))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atras)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(usuario)
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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        cargarFotosAlbum(offset, 1); 
    }//GEN-LAST:event_sigActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        offset -= 9;  
        sig.setVisible(true);
        cargarFotosAlbum(offset, 1);
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
            java.util.logging.Logger.getLogger(FotosAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FotosAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FotosAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FotosAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FotosAlbum().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sig;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
