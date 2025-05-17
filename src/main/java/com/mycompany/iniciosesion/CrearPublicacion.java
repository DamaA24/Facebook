/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.iniciosesion;

import static com.mycompany.iniciosesion.IniciarSesion.idUsuario;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.AbstractBorder;
import javax.swing.filechooser.FileNameExtensionFilter;




public class CrearPublicacion extends javax.swing.JFrame {
    private int idAlbumSeleccionado = -1;
    private HashMap<String, Integer> mapaNombreIdAmigo = new HashMap<>();
    public CrearPublicacion() {
    initComponents();
    setLocationRelativeTo(null);
    actualizarNombreUsuario(IniciarSesion.idUsuario);
    cargarImagenUsuario(IniciarSesion.idUsuario);

    // Código para el botón "Publicar"
    btnPublicar.setEnabled(false);
    btnPublicar.setBackground(new java.awt.Color(242, 242, 242));
    btnPublicar.setForeground(new java.awt.Color(204, 204, 204));
    
    // Establecer texto predeterminado y color gris claro por defecto
    textoo.setText("¿Qué estás pensando?");
    textoo.setForeground(new java.awt.Color(204, 204, 204)); // Gris claro por defecto

    // Agregar DocumentListener para cambiar el color del botón cuando se escribe
    textoo.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
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
            String texto = textoo.getText().trim();
            if (!texto.isEmpty()) {
                btnPublicar.setEnabled(true);
                btnPublicar.setBackground(new java.awt.Color(24, 119, 242)); // Azul Facebook
                btnPublicar.setForeground(new java.awt.Color(255, 255, 255));
            } else {
                btnPublicar.setEnabled(false);
                btnPublicar.setBackground(new java.awt.Color(242, 242, 242)); // Gris claro
                btnPublicar.setForeground(new java.awt.Color(204, 204, 204)); // Texto gris
            }
        }
    });

    // Agregar FocusListener para borrar el texto predeterminado al hacer clic
    textoo.addFocusListener(new java.awt.event.FocusListener() {
        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (textoo.getText().equals("¿Qué estás pensando?")) {
                textoo.setText(""); // Borrar texto predeterminado
                textoo.setForeground(new java.awt.Color(0, 0, 0)); // Cambiar a texto negro
            }
        }
        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (textoo.getText().isEmpty()) {
                textoo.setText("¿Qué estás pensando?"); // Restaurar texto predeterminado
                textoo.setForeground(new java.awt.Color(204, 204, 204)); // Gris claro
            }
        }
    });
    // Revisar si el JTextArea está vacío al inicio
    if (textoo.getText().isEmpty()) {
        textoo.setText("¿Qué estás pensando?");
        textoo.setForeground(new java.awt.Color(204, 204, 204)); // Gris claro
    }
   // Personalizamos el 'renderer' para agregar los íconos junto al texto
    priv.setRenderer(new DefaultListCellRenderer() {
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
    priv.setBackground(new Color(255, 255, 255)); // Fondo blanco
    btnÁlbum.setBackground(new java.awt.Color(255, 255, 255)); // Azul Facebook
    priv.setBorder(new RoundBorder(30)); // Borde redondeado
    
    
    priv.setForeground(new Color(0, 0, 0));           // Color del texto
    priv.setOpaque(true);
   

    }
    
    public javax.swing.JTextArea getTextoo() {
        return textoo;
    }

    public javax.swing.JLabel getImag() {
        return imag;
    }

    public javax.swing.JComboBox<String> getPrivacidadCombo() {
        return priv;
    }

    CrearPublicacion(String texto, ImageIcon imagenActual, String nombreAlbum, int idAlbum, String privacidad) {
        this(); // llama al constructor principal

        // Restaurar texto
        textoo.setText(texto);
        textoo.setForeground(new java.awt.Color(0, 0, 0));

        // Restaurar imagen
        if (imagenActual != null) {
            Image imagen = imagenActual.getImage().getScaledInstance(120, 125, Image.SCALE_SMOOTH);
            imag.setIcon(new ImageIcon(imagen));
            imag.setText("");
        }

        // Restaurar privacidad
        priv.setSelectedItem(privacidad);

        // Restaurar álbum
        actualizarNombreAlbum(nombreAlbum, idAlbum);
    }

    public void actualizarNombreAlbum(String nombreAlbum, int idAlbum) {
        NombreAlbum.setText(nombreAlbum); // Asegúrate de que este JLabel exista
        this.idAlbumSeleccionado = idAlbum;
    }
   
    public class RoundBorder extends AbstractBorder {
        private final int radius;

        // Constructor que acepta solo el radio para redondear las esquinas
        public RoundBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            // Dibujar un borde invisible pero con forma redondeada
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // Suavizar bordes
            g2d.setColor(new Color(0, 0, 0));  // Hacer el borde completamente transparente
            g2d.draw(new RoundRectangle2D.Double(x, y, width - 1, height - 1, radius, radius)); // Dibujar borde redondeado
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(0, 0, 0, 0); // Establecer margen entre borde y contenido
        }
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
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPublicar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        fotoperfil = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        priv = new javax.swing.JComboBox<>();
        btnÁlbum = new javax.swing.JButton();
        NombreAlbum = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoo = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        imag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(405, 420));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(229, 229, 229));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equi2.png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Crear publicación");

        btnPublicar.setBackground(new java.awt.Color(242, 242, 242));
        btnPublicar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPublicar.setForeground(new java.awt.Color(204, 204, 204));
        btnPublicar.setText("Publicar");
        btnPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrar)
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(btnPublicar)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btnPublicar))
                    .addComponent(btnCerrar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        fotoperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N

        usuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        usuario.setText("Nombre usuario");

        priv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        priv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Público", "Amigos", "Privado" }));
        priv.setBorder(null);
        priv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        priv.setFocusCycleRoot(true);
        priv.setFocusable(false);
        priv.setKeySelectionManager(null);
        priv.setRenderer(null);
        priv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privActionPerformed(evt);
            }
        });

        btnÁlbum.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnÁlbum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mas1.JPG"))); // NOI18N
        btnÁlbum.setText("Álbum");
        btnÁlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÁlbumActionPerformed(evt);
            }
        });

        NombreAlbum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NombreAlbum.setText("Álbum seleccionado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(priv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreAlbum)
                            .addComponent(btnÁlbum))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fotoperfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(usuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnÁlbum))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreAlbum)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setHorizontalScrollBar(null);

        textoo.setColumns(20);
        textoo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoo.setForeground(new java.awt.Color(204, 204, 204));
        textoo.setRows(5);
        textoo.setText("¿Qué estás pensando?");
        textoo.setBorder(null);
        textoo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(textoo);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FV.png"))); // NOI18N
        jButton3.setText("Foto/video");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(imag, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imag, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
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
                            Image imagenEscalada = image.getScaledInstance(48, 45, Image.SCALE_SMOOTH);

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
    
    

    
    
    private void btnPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarActionPerformed
    // Obtener el texto, la fecha y la privacidad
String texto = textoo.getText();
java.sql.Timestamp fechaSubida = new java.sql.Timestamp(System.currentTimeMillis());  // Cambiado a Timestamp
String privacidad = (String) priv.getSelectedItem();

// Validar que se haya escrito algo
if (texto.trim().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Escribe algo para publicar.");
    return;
}

// Obtener la imagen del JLabel
Icon icon = imag.getIcon();
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


try {
    Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

    String queryInsertar = "INSERT INTO publicacion (ID_Usuario, Texto, Imagen, Fecha_publicacion, Privacidad) VALUES (?, ?, ?, ?, ?)";
    PreparedStatement stInsertar = con.prepareStatement(queryInsertar);


    stInsertar.setInt(1, idUsuario);
    stInsertar.setString(2, texto);
    if (foto != null) {
        stInsertar.setBytes(3, foto);
    } else {
        stInsertar.setNull(3, java.sql.Types.BLOB);
    }
    stInsertar.setTimestamp(4, fechaSubida);  // Usamos setTimestamp para insertar la fecha y hora
    stInsertar.setString(5, privacidad);

    int filasAfectadas = stInsertar.executeUpdate();
    
    
    if (foto != null && idAlbumSeleccionado != -1) {
        String sqlMedia = "INSERT INTO media (ID_Usuario, ID_Album, Tipo, Contenido_media, Fecha, Descripcion) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement psMedia = con.prepareStatement(sqlMedia);

        psMedia.setInt(1, idUsuario);
        psMedia.setInt(2, idAlbumSeleccionado);
        psMedia.setString(3, "imagen");
        psMedia.setBytes(4, foto);
        psMedia.setTimestamp(5, fechaSubida);
        psMedia.setString(6, ""); // Descripción vacía por ahora
        psMedia.executeUpdate();
        psMedia.close();
    }


    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Publicación subida correctamente.");
        this.dispose();  // Cierra la ventana actual
        InicioF inicio = new InicioF();  // Abre la ventana de inicio
        inicio.cargarImagenUsuario(IniciarSesion.idUsuario); // Si necesitas que cargue datos
        inicio.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this, "Hubo un error al subir la publicación.");
    }

    stInsertar.close();
    con.close();
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Error en la base de datos: " + ex.getMessage());
}

    }//GEN-LAST:event_btnPublicarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
        InicioF IF = new InicioF();
        IF.cargarImagenUsuario(idUsuario);
        IF.setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        
        // Filtrar para solo mostrar archivos de imagen
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de imagen", "jpg", "png", "gif");
        fileChooser.setFileFilter(filtro);
        
        // Abrir el cuadro de diálogo para seleccionar el archivo
        int resultado = fileChooser.showOpenDialog(this);
        
        // Verificar si el usuario seleccionó un archivo
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            
            // Mostrar el nombre del archivo seleccionado en el JLabel
            imag.setText("");

            // Crear un ImageIcon con la imagen seleccionada
            ImageIcon imagenIcono = new ImageIcon(archivoSeleccionado.getAbsolutePath());
            Image imagen = imagenIcono.getImage(); // Obtener la imagen
            Image imagenEscalada = imagen.getScaledInstance(120, 125, Image.SCALE_SMOOTH); // Escalar la imagen
            imag.setIcon(new ImageIcon(imagenEscalada)); // Establecer la imagen escalada en el JLabel
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void privActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_privActionPerformed

    private void btnÁlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÁlbumActionPerformed
        SeleccionarAlbum ventana = new SeleccionarAlbum(this); // ← sin parámetros
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnÁlbumActionPerformed

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
            java.util.logging.Logger.getLogger(CrearPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPublicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPublicacion().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NombreAlbum;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnPublicar;
    private javax.swing.JButton btnÁlbum;
    private javax.swing.JLabel fotoperfil;
    private javax.swing.JLabel imag;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> priv;
    private javax.swing.JTextArea textoo;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

}
