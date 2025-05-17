/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.iniciosesion;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.DefaultListCellRenderer;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CrearAlbum2 extends javax.swing.JFrame {
    private CrearPublicacion anterior;
    /**
     * Creates new form CrearAlbum
     */
    public CrearAlbum2() {
        initComponents();
        setLocationRelativeTo(null);
        
                // Código para el botón "Publicar"
        btnGuardar.setEnabled(false);
        btnGuardar.setBackground(new java.awt.Color(242, 242, 242));
        btnGuardar.setForeground(new java.awt.Color(204, 204, 204));
        
        albumm.setText("Nombre del álbum");
        albumm.setForeground(new java.awt.Color(204, 204, 204)); // Gris claro por defecto
        
            // Agregar DocumentListener para cambiar el color del botón cuando se escribe
    albumm.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        @Override
        public void insertUpdate(javax.swing.event.DocumentEvent e) {
            actualizarBoton();
        }
        @Override
        public void removeUpdate(javax.swing.event.DocumentEvent e) {
            actualizarBoton();
        }
        @Override
        public void changedUpdate(javax.swing.event.DocumentEvent e) {
            actualizarBoton();
        }

        private void actualizarBoton() {
            String texto = albumm.getText().trim();
            if (!texto.isEmpty()) {
                btnGuardar.setEnabled(true);
                btnGuardar.setBackground(new java.awt.Color(24, 119, 242)); // Azul Facebook
                btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
            } else {
                btnGuardar.setEnabled(false);
                btnGuardar.setBackground(new java.awt.Color(242, 242, 242)); // Gris claro
                btnGuardar.setForeground(new java.awt.Color(204, 204, 204)); // Texto gris
            }
        }
    });
        // Revisar si el JTextArea está vacío al inicio
    if (albumm.getText().isEmpty()) {
        albumm.setText("Nombre del álbum");
        albumm.setForeground(new java.awt.Color(204, 204, 204)); // Gris claro
    }
    
            // Agregar FocusListener para borrar el texto predeterminado al hacer clic
            albumm.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (albumm.getText().equals("Nombre del álbum")) {
                    albumm.setText(""); // Borrar texto predeterminado
                    albumm.setForeground(new java.awt.Color(0, 0, 0)); // Cambiar a texto negro
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (albumm.getText().isEmpty()) {
                    albumm.setText("Nombre del álbum"); // Restaurar texto predeterminado
                    albumm.setForeground(new java.awt.Color(204, 204, 204)); // Gris claro
                }
            }
        });
        // Revisar si el JTextArea está vacío al inicio
        if (albumm.getText().isEmpty()) {
            albumm.setText("Nombre del álbum");
            albumm.setForeground(new java.awt.Color(204, 204, 204)); // Gris claro
        }
           // Personalizamos el 'renderer' para agregar los íconos junto al texto
        privv.setRenderer(new DefaultListCellRenderer() {
            @Override
            public java.awt.Component getListCellRendererComponent(javax.swing.JList<?> list, Object value, int index,
                                                                   boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                    // Verifica si el valor es un String (las opciones de texto)
                    if (value instanceof String opcion) {

                        // Asigna el ícono correspondiente según el texto
                        switch (opcion) {
                            case "Público" -> setIcon(new ImageIcon(getClass().getResource("/publico1.png")));
                            case "Amigos" -> setIcon(new ImageIcon(getClass().getResource("/amigos3.png")));
                            case "Privado" -> setIcon(new ImageIcon(getClass().getResource("/privado1.png")));
                            default -> setIcon(null);
                        }
                    }  
                    return this;
                }
            });
        privv.setBackground(new Color(255, 255, 255)); // Fondo blanco
    } 
    public CrearAlbum2(CrearPublicacion anterior) {
    this();
    this.anterior = anterior;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        albumm = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        privv = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(372, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(372, 580));

        jScrollPane1.setBorder(null);

        albumm.setColumns(20);
        albumm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        albumm.setRows(5);
        albumm.setText("Nombre del álbum");
        albumm.setBorder(null);
        jScrollPane1.setViewportView(albumm);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        privv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Público", "Amigos", "Privado" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(privv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(privv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(372, 52));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Crear álbum");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addComponent(btnGuardar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Album ventana = new Album(); // ← sin parámetros
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String nombre = albumm.getText().trim();
    String privacidad = privv.getSelectedItem().toString();
    int idUsuario = IniciarSesion.idUsuario;

    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nombre del álbum.");
        return;
    }

    try (Connection con = DriverManager.getConnection(
            "jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1")) {

        String sql = "INSERT INTO album (ID_Usuario, Nombre, Fecha_creacion, Privacidad) VALUES (?, ?, NOW(), ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idUsuario);
        ps.setString(2, nombre);
        ps.setString(3, privacidad);

        int resultado = ps.executeUpdate();
        if (resultado > 0) {
            JOptionPane.showMessageDialog(this, "Álbum creado correctamente.");
            this.dispose();
        Album seleccionar = new Album();
        seleccionar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo guardar el álbum.");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setForeground(new Color(51,153,253));// TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
       btnGuardar.setForeground(new Color(0,0,0)); // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseExited

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
            java.util.logging.Logger.getLogger(CrearAlbum2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearAlbum2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearAlbum2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearAlbum2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearAlbum2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea albumm;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> privv;
    // End of variables declaration//GEN-END:variables
}
