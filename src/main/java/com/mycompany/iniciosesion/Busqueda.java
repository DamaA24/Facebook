package com.mycompany.iniciosesion;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Busqueda extends javax.swing.JFrame {

    // Variable para almacenar el ID_Usuario seleccionado
    public static int idUsuarioSeleccionado;

    DefaultListModel<String> modeloLista = new DefaultListModel<>();

    public Busqueda() {
        initComponents();
        listaAmigos.setModel(modeloLista);
        txtBuscar.setBackground(new Color(240, 240, 240)); // Gris claro

        // Placeholder behavior
        txtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (txtBuscar.getText().equals("Buscar en Facebook")) {
                    txtBuscar.setText("");
                    txtBuscar.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (txtBuscar.getText().isEmpty()) {
                    txtBuscar.setText("Buscar en Facebook");
                    txtBuscar.setForeground(new Color(204, 204, 204));
                }
            }
        });

        // Añadir un listener a la lista para capturar la selección de un amigo
        listaAmigos.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {  // Verifica que la selección ha sido realizada
                String nombreSeleccionado = listaAmigos.getSelectedValue();
                if (nombreSeleccionado != null) {
                    buscarIDUsuario(nombreSeleccionado);
                }
            }
        });
    }

    // Método para buscar amigos en la base de datos
    private ArrayList<String> buscarAmigos(String filtro) {
        ArrayList<String> amigos = new ArrayList<>();
        String url = "jdbc:mysql://127.0.0.1:3306/facebook";  // Cambia la URL si es necesario
        String usuario = "AlanMijares"; // Tu usuario de MySQL
        String contraseña = "1"; // Tu contraseña de MySQL

        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Establece la conexión
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Prepara la consulta SQL
            String sql = "SELECT CONCAT(Nombre, ' ', Apellido) AS nombre_completo FROM perfil_usuario WHERE LOWER(Nombre) LIKE ? OR LOWER(Apellido) LIKE ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, "%" + filtro + "%");
            ps.setString(2, "%" + filtro + "%");

            // Ejecuta la consulta
            rs = ps.executeQuery();

            // Recupera los resultados
            while (rs.next()) {
                amigos.add(rs.getString("nombre_completo"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conexion != null) conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return amigos;
    }

    // Método para buscar el ID_Usuario del amigo seleccionado
    private void buscarIDUsuario(String nombreSeleccionado) {
        String url = "jdbc:mysql://127.0.0.1:3306/facebook";  // Cambia la URL si es necesario
        String usuario = "AlanMijares"; // Tu usuario de MySQL
        String contraseña = "1"; // Tu contraseña de MySQL

        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Establece la conexión
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Prepara la consulta SQL para obtener el ID_Usuario
            String sql = "SELECT ID_Usuario FROM perfil_usuario WHERE CONCAT(Nombre, ' ', Apellido) = ?";
            ps = conexion.prepareStatement(sql);
            ps.setString(1, nombreSeleccionado);

            // Ejecuta la consulta
            rs = ps.executeQuery();

            if (rs.next()) {
                // Almacena el ID_Usuario en la variable pública
                idUsuarioSeleccionado = rs.getInt("ID_Usuario");

                // Mostrar mensaje para verificar que el ID se ha obtenido
                System.out.println("ID_Usuario seleccionado: " + idUsuarioSeleccionado);

                // Abrir el frame Fotos pasando el ID_Usuario
                abrirFotos();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el usuario seleccionado.");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conexion != null) conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Método para abrir el frame Fotos
    private void abrirFotos() {
        this.dispose();
        Perfil_Amigo PA = new Perfil_Amigo();
        PA.setVisible(true);
        PA.actualizarNombreUsuario(idUsuarioSeleccionado);
        PA.cargarImagenUsuario(idUsuarioSeleccionado);
        PA.cargarImagenPortada(idUsuarioSeleccionado, PA.fotoportada);
        PA.cargarDestacadasPerfil(PA .offset, idUsuarioSeleccionado);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAmigos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscar.setText("Buscar en Facebook");
        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        listaAmigos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Juan Perez", "Carlos Lopez", "Maria Diaz", "Fernando Sandoval", "Heidi Garcia" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaAmigos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String filtro = txtBuscar.getText().toLowerCase();
        modeloLista.clear();

        if (filtro.trim().isEmpty()) {
            return;
        }

        // Realiza la búsqueda en la base de datos
        ArrayList<String> amigos = buscarAmigos(filtro);

        // Agrega los resultados a la lista
        for (String nombre : amigos) {
            modeloLista.addElement(nombre);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Busqueda().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaAmigos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
