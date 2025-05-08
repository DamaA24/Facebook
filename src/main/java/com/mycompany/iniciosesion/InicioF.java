package com.mycompany.iniciosesion;

import static com.mycompany.iniciosesion.IniciarSesion.idUsuario;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class InicioF extends javax.swing.JFrame {

    public int idPubli1 = -1;
    public int idPubli2 = -1;
    public int offset2 = 0;
    public int offset3 = 0;
    public static int idSeleccionada;

    public InicioF() {
        initComponents();
        corazon.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
        corazon.setToolTipText(obtenerNombresPorReaccion(idPubli1, "me encanta"));
        }
    });
    divierte.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            divierte.setToolTipText(obtenerNombresPorReaccion(idPubli1, "me divierte"));
        }
    });
    triste.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            triste.setToolTipText(obtenerNombresPorReaccion(idPubli1, "me entristece"));
        }
    });
    corazon3.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
        corazon3.setToolTipText(obtenerNombresPorReaccion(idPubli2, "me encanta"));
    }
});
divierte3.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
        divierte3.setToolTipText(obtenerNombresPorReaccion(idPubli2, "me divierte"));
    }
});
triste3.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
        triste3.setToolTipText(obtenerNombresPorReaccion(idPubli2, "me entristece"));
    }
});
// Publicación 1
corazon.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
        manejarReaccion(idPubli1, "me encanta", corazon, divierte, triste);
    }
});
divierte.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
        manejarReaccion(idPubli1, "me divierte", corazon, divierte, triste);
    }
});
triste.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
        manejarReaccion(idPubli1, "me entristece", corazon, divierte, triste);
    }
});

// Publicación 2
corazon3.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
        manejarReaccion(idPubli2, "me encanta", corazon3, divierte3, triste3);
    }
});
divierte3.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
        manejarReaccion(idPubli2, "me divierte", corazon3, divierte3, triste3);
    }
});
triste3.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
        manejarReaccion(idPubli2, "me entristece", corazon3, divierte3, triste3);
    }
});


       }
        
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        fotoperfil = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        foto = new javax.swing.JButton();
        text = new javax.swing.JLabel();
        ima = new javax.swing.JLabel();
        arriba = new javax.swing.JButton();
        Comentar = new javax.swing.JButton();
        Compartir = new javax.swing.JButton();
        corazon = new javax.swing.JLabel();
        divierte = new javax.swing.JLabel();
        triste = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        user3 = new javax.swing.JTextField();
        bajo = new javax.swing.JButton();
        ima3 = new javax.swing.JLabel();
        triste3 = new javax.swing.JLabel();
        foto3 = new javax.swing.JButton();
        text3 = new javax.swing.JLabel();
        corazon3 = new javax.swing.JLabel();
        Compartir3 = new javax.swing.JButton();
        divierte3 = new javax.swing.JLabel();
        Comentar3 = new javax.swing.JButton();
        eliminar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setPreferredSize(new java.awt.Dimension(340, 750));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/F.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chatp.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchp.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plusp.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeS.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amigos.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/amigosS.png"))); // NOI18N
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/amigosS.png"))); // NOI18N
        jButton7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/amigosS.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notificaciones.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setFocusPainted(false);
        jButton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificacionS.png"))); // NOI18N
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificacionS.png"))); // NOI18N
        jButton8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/NotificacionS.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setFocusPainted(false);
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/menuS.png"))); // NOI18N
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/menuS.png"))); // NOI18N
        jButton9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/menuS.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/UserS.png"))); // NOI18N
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/UserS.png"))); // NOI18N
        jButton10.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/UserS.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setFocusPainted(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setFocusPainted(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setFocusPainted(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        fotoperfil.setText("FOTO");
        fotoperfil.setBorderPainted(false);
        fotoperfil.setContentAreaFilled(false);
        fotoperfil.setFocusPainted(false);
        fotoperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoperfilActionPerformed(evt);
            }
        });

        jButton20.setText("¿Qué estas pensando?");
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setFocusPainted(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen1.png"))); // NOI18N
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.setFocusPainted(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(fotoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fotoperfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        user.setText("Usuario");
        user.setBorder(null);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        eliminar.setBorder(null);
        eliminar.setBorderPainted(false);
        eliminar.setContentAreaFilled(false);
        eliminar.setFocusPainted(false);

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        foto.setBorder(null);
        foto.setBorderPainted(false);
        foto.setContentAreaFilled(false);
        foto.setFocusPainted(false);
        foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoActionPerformed(evt);
            }
        });

        text.setText("Texto");

        arriba.setText("^");
        arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaActionPerformed(evt);
            }
        });

        Comentar.setText("Comentar");
        Comentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComentarActionPerformed(evt);
            }
        });

        Compartir.setText("Compartir");

        corazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me encanta1.png"))); // NOI18N
        corazon.setText("1");

        divierte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me divierte1.png"))); // NOI18N
        divierte.setText("2");

        triste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me entristece1.png"))); // NOI18N
        triste.setText("3");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(arriba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                .addComponent(ima, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(corazon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divierte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(triste)
                                .addGap(26, 26, 26)
                                .addComponent(Comentar)
                                .addGap(18, 18, 18)
                                .addComponent(Compartir)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(arriba)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ima, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Comentar)
                        .addComponent(Compartir))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(divierte)
                            .addComponent(triste))
                        .addComponent(corazon, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        user3.setText("Usuario");
        user3.setBorder(null);
        user3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user3ActionPerformed(evt);
            }
        });

        bajo.setText("v");
        bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajoActionPerformed(evt);
            }
        });

        triste3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me entristece1.png"))); // NOI18N
        triste3.setText("3");

        foto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        foto3.setBorder(null);
        foto3.setBorderPainted(false);
        foto3.setContentAreaFilled(false);
        foto3.setFocusPainted(false);
        foto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto3ActionPerformed(evt);
            }
        });

        text3.setText("Texto");

        corazon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me encanta1.png"))); // NOI18N
        corazon3.setText("1");

        Compartir3.setText("Compartir");

        divierte3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me divierte1.png"))); // NOI18N
        divierte3.setText("2");

        Comentar3.setText("Comentar");
        Comentar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comentar3ActionPerformed(evt);
            }
        });

        eliminar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        eliminar3.setBorder(null);
        eliminar3.setBorderPainted(false);
        eliminar3.setContentAreaFilled(false);
        eliminar3.setFocusPainted(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(corazon3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divierte3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(triste3)
                        .addGap(26, 26, 26)
                        .addComponent(Comentar3)
                        .addGap(18, 18, 18)
                        .addComponent(Compartir3))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(text3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ima3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bajo)
                .addGap(156, 156, 156))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(eliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(user3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ima3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Comentar3)
                        .addComponent(Compartir3))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(divierte3)
                            .addComponent(triste3))
                        .addComponent(corazon3, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(11, 11, 11)
                .addComponent(bajo)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void limpiarPublicacion1() {
    text.setText("");
    ima.setIcon(null);
    user.setText("");
    foto.setIcon(null);
    // También podrías limpiar reacciones o botones si los tienes
    }

    private void limpiarPublicacion2() {
        text3.setText("");
        ima3.setIcon(null);
        user3.setText("");
        foto3.setIcon(null);
        // También podrías limpiar reacciones o botones si los tienes
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
                            Image imagenEscalada = image.getScaledInstance(59, 48, Image.SCALE_SMOOTH);

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
    
    public void cargarPublicaciones(int offset2, int idUsuario) {
    try {
        arriba.setVisible(offset2 > 0);
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        // Carga publicaciones propias y de amigos con privacidad 'amigos'
        String query = """
            SELECT p.ID_Publicacion, p.ID_Usuario, p.Imagen, p.Texto, p.Fecha_publicacion,
                   u.Nombre, u.Apellido, u.Foto_perfil
            FROM publicacion p
            JOIN perfil_usuario u ON p.ID_Usuario = u.ID_Usuario
            WHERE 
                (
                    p.ID_Usuario = ? 
                    OR p.ID_Usuario IN (
                        SELECT CASE
                            WHEN ID_Usuario1 = ? THEN ID_Usuario2
                            WHEN ID_Usuario2 = ? THEN ID_Usuario1
                        END
                        FROM amistad
                        WHERE (ID_Usuario1 = ? OR ID_Usuario2 = ?) AND Estado = 'aceptada'
                    )
                )
                AND (p.Privacidad = 'amigos' OR p.Privacidad = 'publico' OR p.ID_Usuario = ?)
            ORDER BY RAND()
            LIMIT 2 OFFSET ?""";

        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, idUsuario); // para publicaciones propias
        pst.setInt(2, idUsuario); // para obtener amigos
        pst.setInt(3, idUsuario);
        pst.setInt(4, idUsuario);
        pst.setInt(5, idUsuario);
        pst.setInt(6, idUsuario); // incluir propias aunque sean 'privado'
        pst.setInt(7, offset2); // paginación

        ResultSet rs = pst.executeQuery();

        int contador = 0;
        while (rs.next()) {
            int idPublicacion = rs.getInt("ID_Publicacion");
            int autor = rs.getInt("ID_Usuario");
            String texto = rs.getString("Texto");
            byte[] imagen = rs.getBytes("Imagen");

            String nombreUsuario = rs.getString("Nombre") + " " + rs.getString("Apellido");
            byte[] fotoPerfil = rs.getBytes("Foto_perfil");

            ImageIcon iconImagen = (imagen != null)
                    ? new ImageIcon(new ImageIcon(imagen).getImage().getScaledInstance(ima.getWidth(), ima.getHeight(), Image.SCALE_SMOOTH))
                    : null;

            ImageIcon iconPerfil = (fotoPerfil != null)
                    ? new ImageIcon(new ImageIcon(fotoPerfil).getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_SMOOTH))
                    : null;

            if (contador == 0) {
                idPubli1 = idPublicacion;
                text.setText(texto);
                ima.setIcon(iconImagen);
                user.setText(nombreUsuario);
                foto.setIcon(iconPerfil);
                cargarReacciones(idPubli1, corazon, divierte, triste);
            } else if (contador == 1) {
                idPubli2 = idPublicacion;
                text3.setText(texto);
                ima3.setIcon(iconImagen);
                user3.setText(nombreUsuario);
                foto3.setIcon(iconPerfil);
                cargarReacciones(idPubli2, corazon3, divierte3, triste3);
            }

            contador++;
        }

        if (contador == 0) {
            limpiarPublicacion1();
            limpiarPublicacion2();
            bajo.setVisible(false);
        } else if (contador == 1) {
            limpiarPublicacion2();
            bajo.setVisible(true);
        } else {
            bajo.setVisible(true);
        }

        con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al cargar publicaciones: " + ex.getMessage());
    }
}


    
    public void manejarReaccion(int idPublicacion, String tipoReaccion, JLabel corazon, JLabel divierte, JLabel triste) {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        String consulta = "SELECT Tipo FROM reaccion WHERE ID_Publicacion = ? AND ID_Usuario = ?";
        PreparedStatement pst = con.prepareStatement(consulta);
        pst.setInt(1, idPublicacion);
        pst.setInt(2, idUsuario);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            String tipoActual = rs.getString("Tipo");
            if (tipoActual.equals(tipoReaccion)) {
                JOptionPane.showMessageDialog(null, "Ya seleccionaste esta reacción.");
                con.close();
                return;
            } else {
                PreparedStatement eliminarPst = con.prepareStatement(
                        "DELETE FROM reaccion WHERE ID_Publicacion = ? AND ID_Usuario = ?");
                eliminarPst.setInt(1, idPublicacion);
                eliminarPst.setInt(2, idUsuario);
                eliminarPst.executeUpdate();
            }
        }

        pst = con.prepareStatement("INSERT INTO reaccion (ID_Publicacion, ID_Usuario, Tipo) VALUES (?, ?, ?)");
        pst.setInt(1, idPublicacion);
        pst.setInt(2, idUsuario);
        pst.setString(3, tipoReaccion);
        pst.executeUpdate();

        cargarReacciones(idPublicacion, corazon, divierte, triste);
        con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al registrar reacción: " + ex.getMessage());
        ex.printStackTrace();
    }
}

    
    public void cargarReacciones(int idPublicacion, JLabel corazon, JLabel divierte, JLabel triste) {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        String sql = "SELECT Tipo, COUNT(*) as total FROM reaccion WHERE ID_Publicacion = ? GROUP BY Tipo";
        PreparedStatement pst = con.prepareStatement(sql);
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

    public String obtenerNombresPorReaccion(int idPublicacion, String tipoReaccion) {
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


    
    
    
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        InicioF If = new InicioF();
        If.cargarImagenUsuario(idUsuario);
        If.cargarPublicaciones(If.offset2, idUsuario);
        If.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        FacebookFriends FF = new FacebookFriends();
        FF.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.cargarPublicacion(P.offset, IS.idUsuario);
        P.cargarReacciones();
        P.actualizarInfoPerfil(IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        Notificaciones N = new Notificaciones();
        N.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.dispose();
        IniciarSesion IS = new IniciarSesion();
        Menuframe Mf = new Menuframe();
        Mf.actualizarNombreUsuario(IS.idUsuario);
        Mf.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
       this.dispose();
       CrearPublicacion CP = new CrearPublicacion();
       IniciarSesion IS = new IniciarSesion();
       CP.actualizarNombreUsuario(IS.idUsuario);
       CP.cargarImagenUsuario(IS.idUsuario);
       CP.setVisible(true);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void fotoperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoperfilActionPerformed
        this.dispose();
        Perfil P = new Perfil();
        IniciarSesion IS = new IniciarSesion();
        P.actualizarNombreUsuario(IS.idUsuario);
        P.cargarImagenUsuario(IS.idUsuario);
        P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
        P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_fotoperfilActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Busqueda B = new Busqueda();
        B.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fotoActionPerformed

    
    private void arribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaActionPerformed
        offset2 -= 1;  // Decrementar el offset para obtener la publicación anterior
        corazon.setIcon(new ImageIcon(getClass().getResource("/me encanta1.png")));
        triste.setIcon(new ImageIcon(getClass().getResource("/me entristece1.png")));
        divierte.setIcon(new ImageIcon(getClass().getResource("/me divierte1.png")));
        Comentar.setVisible(true);
        Compartir.setVisible(true);
        eliminar.setVisible(true);
        Perfil P = new Perfil();
        P.cargarReacciones();
    }//GEN-LAST:event_arribaActionPerformed

    private void ComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComentarActionPerformed
        ComentariosInicio C = new ComentariosInicio();
        C.cargarComentarios(offset3, idPubli1);
        idSeleccionada = idPubli1;
        C.setVisible(true);
    }//GEN-LAST:event_ComentarActionPerformed

    private void user3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user3ActionPerformed

    private void foto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foto3ActionPerformed

    private void bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bajoActionPerformed

    private void Comentar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comentar3ActionPerformed
        ComentariosInicio C = new ComentariosInicio();
        C.cargarComentarios(offset3, idPubli2);
        idSeleccionada = idPubli2;
        C.setVisible(true);
    }//GEN-LAST:event_Comentar3ActionPerformed

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
            java.util.logging.Logger.getLogger(InicioF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comentar;
    private javax.swing.JButton Comentar3;
    private javax.swing.JButton Compartir;
    private javax.swing.JButton Compartir3;
    private javax.swing.JButton arriba;
    private javax.swing.JButton bajo;
    private javax.swing.JLabel corazon;
    private javax.swing.JLabel corazon3;
    private javax.swing.JLabel divierte;
    private javax.swing.JLabel divierte3;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminar3;
    private javax.swing.JButton foto;
    private javax.swing.JButton foto3;
    private javax.swing.JButton fotoperfil;
    private javax.swing.JLabel ima;
    private javax.swing.JLabel ima3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel text;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel triste;
    private javax.swing.JLabel triste3;
    private javax.swing.JTextField user;
    private javax.swing.JTextField user3;
    // End of variables declaration//GEN-END:variables
}
