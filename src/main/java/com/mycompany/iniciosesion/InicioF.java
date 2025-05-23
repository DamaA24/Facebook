package com.mycompany.iniciosesion;

import static com.mycompany.iniciosesion.IniciarSesion.idUsuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;



public class InicioF extends javax.swing.JFrame {

    public int idPubli1 = -1;
    public int idPubli2 = -1;
    public int offset2 = 0;
    public int offset3 = 0;
    public int autor1 = -1;
    public int autor2 = -1;
    public static int idSeleccionada;
    private byte[][] historiasContenido = new byte[3][];
    private String[] nombresUsuarios = new String[3];

    public InicioF() {
        initComponents();
        Busqueda B = new Busqueda();
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
    
    setLocationRelativeTo(null);
    
    jPanel7.setVisible(false);
    jPanel11.setVisible(false);
    cargarHistoriasRecientes();
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
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        der = new javax.swing.JButton();
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
        corazon = new javax.swing.JLabel();
        divierte = new javax.swing.JLabel();
        triste = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        Privacidad = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        user3 = new javax.swing.JTextField();
        bajo = new javax.swing.JButton();
        ima3 = new javax.swing.JLabel();
        triste3 = new javax.swing.JLabel();
        foto3 = new javax.swing.JButton();
        text3 = new javax.swing.JLabel();
        corazon3 = new javax.swing.JLabel();
        divierte3 = new javax.swing.JLabel();
        Comentar3 = new javax.swing.JButton();
        eliminar3 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        Privacidad2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(580, 580));

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
                .addGap(52, 52, 52)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setFocusPainted(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setFocusPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setFocusPainted(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plusNuevo.png"))); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/plusNuevoS.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/plusNuevoS.png"))); // NOI18N
        jButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/plusNuevoS.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        der.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        der.setText(">");
        der.setBorderPainted(false);
        der.setContentAreaFilled(false);
        der.setFocusPainted(false);
        der.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                derMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                derMouseExited(evt);
            }
        });
        der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(der)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(der)
                .addContainerGap(53, Short.MAX_VALUE))
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
                .addComponent(fotoperfil)
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
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setText("Usuario");
        user.setBorder(null);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel6.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 10, 85, -1));

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
        jPanel6.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 6, 24, 24));

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
        jPanel6.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, 44, 42));

        text.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        text.setText("Texto");
        jPanel6.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, 348, 27));
        jPanel6.add(ima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 102, 354, 68));

        arriba.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        arriba.setText("ʌ");
        arriba.setBorderPainted(false);
        arriba.setContentAreaFilled(false);
        arriba.setFocusPainted(false);
        arriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                arribaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arribaMouseExited(evt);
            }
        });
        arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaActionPerformed(evt);
            }
        });
        jPanel6.add(arriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 9, -1, -1));

        Comentar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Comentar.setText("Comentar");
        Comentar.setBorderPainted(false);
        Comentar.setContentAreaFilled(false);
        Comentar.setFocusPainted(false);
        Comentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ComentarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ComentarMouseExited(evt);
            }
        });
        Comentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComentarActionPerformed(evt);
            }
        });
        jPanel6.add(Comentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 209, -1, -1));

        corazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me encanta1.png"))); // NOI18N
        corazon.setText("1");
        jPanel6.add(corazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 210, -1, -1));

        divierte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me divierte1.png"))); // NOI18N
        divierte.setText("2");
        jPanel6.add(divierte, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 208, -1, -1));

        triste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me entristece1.png"))); // NOI18N
        triste.setText("3");
        jPanel6.add(triste, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 208, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(113, 54));

        jButton14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton14.setText("Eliminar");
        jButton14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton14.setContentAreaFilled(false);
        jButton14.setFocusPainted(false);
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton14MouseExited(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton14)
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 36, 105, 18));
        jPanel6.add(Privacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 6, 28, 24));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        user3.setText("Usuario");
        user3.setBorder(null);
        user3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user3ActionPerformed(evt);
            }
        });
        jPanel13.add(user3, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 16, 85, -1));

        bajo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bajo.setText("v");
        bajo.setBorderPainted(false);
        bajo.setContentAreaFilled(false);
        bajo.setFocusPainted(false);
        bajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bajoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bajoMouseExited(evt);
            }
        });
        bajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajoActionPerformed(evt);
            }
        });
        jPanel13.add(bajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 169, -1, -1));
        jPanel13.add(ima3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, 333, 69));

        triste3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me entristece1.png"))); // NOI18N
        triste3.setText("3");
        jPanel13.add(triste3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 168, -1, -1));

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
        jPanel13.add(foto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 44, 42));

        text3.setText("Texto");
        jPanel13.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 60, 333, 27));

        corazon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me encanta1.png"))); // NOI18N
        corazon3.setText("1");
        jPanel13.add(corazon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 170, -1, -1));

        divierte3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me divierte1.png"))); // NOI18N
        divierte3.setText("2");
        jPanel13.add(divierte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 168, -1, -1));

        Comentar3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Comentar3.setText("Comentar");
        Comentar3.setBorderPainted(false);
        Comentar3.setContentAreaFilled(false);
        Comentar3.setFocusPainted(false);
        Comentar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Comentar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Comentar3MouseExited(evt);
            }
        });
        Comentar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comentar3ActionPerformed(evt);
            }
        });
        jPanel13.add(Comentar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 169, -1, -1));

        eliminar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu2.png"))); // NOI18N
        eliminar3.setBorder(null);
        eliminar3.setBorderPainted(false);
        eliminar3.setContentAreaFilled(false);
        eliminar3.setFocusPainted(false);
        eliminar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminar3MouseClicked(evt);
            }
        });
        eliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar3ActionPerformed(evt);
            }
        });
        jPanel13.add(eliminar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 6, 24, 24));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(113, 54));

        jButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3)
        );

        jPanel13.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 36, 101, 18));
        jPanel13.add(Privacidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 6, 32, 24));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        idSeleccionada = idPubli2;
        eliminarPublicacion(idSeleccionada);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setForeground(new Color(0,0,0));// TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setForeground(new Color(51,153,255));// TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void eliminar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar3MouseClicked
        jPanel11.setVisible(!jPanel11.isVisible());   // TODO add your handling code here:
    }//GEN-LAST:event_eliminar3MouseClicked

    private void Comentar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comentar3ActionPerformed
        ComentariosInicio C = new ComentariosInicio();
        C.cargarComentarios(offset3, idPubli2);
        idSeleccionada = idPubli2;
        C.setVisible(true);
    }//GEN-LAST:event_Comentar3ActionPerformed

    private void foto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto3ActionPerformed
        this.dispose();
        if (autor2 == IniciarSesion.idUsuario) {
            Perfil P = new Perfil();
            P.actualizarNombreUsuario(autor2);
            P.cargarImagenUsuario(autor2);
            P.cargarImagenPortada(autor2, P.fotoportada);
            P.cargarDestacadasPerfil(P.offset, autor2);
            P.cargarPublicacion(P.offset, autor2);
            P.cargarReacciones();
            P.actualizarInfoPerfil(autor2);
            P.setVisible(true);
        } else {
            Perfil_Amigo P = new Perfil_Amigo();
            Busqueda B = new Busqueda();
            B.idUsuarioSeleccionado = autor2;
            P.actualizarNombreUsuario(autor2);
            P.cargarImagenUsuario(autor2);
            P.cargarImagenPortada(autor2, P.fotoportada);
            P.cargarDestacadasPerfil(P.offset, autor2);
            P.cargarPublicacion(P.offset, autor2);
            P.cargarReacciones();
            P.actualizarInfoPerfil(autor2);
            P.setVisible(true);
        }
    }//GEN-LAST:event_foto3ActionPerformed

    private void bajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajoActionPerformed
        offset2 += 1;  // Aumentar el offset para obtener la siguiente publicación
        cargarPublicaciones(offset2, idUsuario);
        Perfil P = new Perfil();
        P.cargarReacciones();
    }//GEN-LAST:event_bajoActionPerformed

    private void user3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user3ActionPerformed
        this.dispose();
        IniciarSesion IS = new IniciarSesion();
        int idSeleccionado;
        idSeleccionado = idPubli2;
        if(idSeleccionado == IS.idUsuario){
            Perfil P = new Perfil();
            P.actualizarNombreUsuario(IS.idUsuario);
            P.cargarImagenUsuario(IS.idUsuario);
            P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
            P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
            P.cargarPublicacion(P.offset, IS.idUsuario);
            P.cargarReacciones();
            P.actualizarInfoPerfil(IS.idUsuario);
            P.setVisible(true);
        }
        else{
            Perfil_Amigo P = new Perfil_Amigo();
            P.actualizarNombreUsuario(idSeleccionado);
            P.cargarImagenUsuario(idSeleccionado);
            P.cargarImagenPortada(idSeleccionado, P.fotoportada);
            P.cargarDestacadasPerfil(P.offset, idSeleccionado);
            P.cargarPublicacion(P.offset, idSeleccionado);
            P.cargarReacciones();
            P.actualizarInfoPerfil(idSeleccionado);
            P.setVisible(true);
        }
    }//GEN-LAST:event_user3ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        idSeleccionada = idPubli1;
        eliminarPublicacion(idSeleccionada);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseExited
        jButton14.setForeground(new Color(0,0,0));// TODO add your handling code here:
    }//GEN-LAST:event_jButton14MouseExited

    private void jButton14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseEntered
        jButton14.setForeground(new Color(51,153,255)); // TODO add your handling code here:
    }//GEN-LAST:event_jButton14MouseEntered

    private void ComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComentarActionPerformed
        ComentariosInicio C = new ComentariosInicio();
        C.cargarComentarios(offset3, idPubli1);
        idSeleccionada = idPubli1;
        C.setVisible(true);
    }//GEN-LAST:event_ComentarActionPerformed

    private void arribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaActionPerformed
        offset2 -= 1;  // Decrementar el offset para obtener la publicación anterior
        cargarPublicaciones(offset2, idUsuario);
        corazon.setIcon(new ImageIcon(getClass().getResource("/me encanta1.png")));
        triste.setIcon(new ImageIcon(getClass().getResource("/me entristece1.png")));
        divierte.setIcon(new ImageIcon(getClass().getResource("/me divierte1.png")));
        Comentar.setVisible(true);

        eliminar.setVisible(true);
        Perfil P = new Perfil();
        P.cargarReacciones();
    }//GEN-LAST:event_arribaActionPerformed

    private void fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoActionPerformed
       this.dispose();
        if (autor1 == IniciarSesion.idUsuario) {
            Perfil P = new Perfil();
            P.actualizarNombreUsuario(autor1);
            P.cargarImagenUsuario(autor1);
            P.cargarImagenPortada(autor1, P.fotoportada);
            P.cargarDestacadasPerfil(P.offset, autor1);
            P.cargarPublicacion(P.offset, autor1);
            P.cargarReacciones();
            P.actualizarInfoPerfil(autor1);
            P.setVisible(true);
        } else {
            Perfil_Amigo P = new Perfil_Amigo();
            Busqueda B = new Busqueda();
            B.idUsuarioSeleccionado = autor1;
            P.actualizarNombreUsuario(autor1);
            P.cargarImagenUsuario(autor1);
            P.cargarImagenPortada(autor1, P.fotoportada);
            P.cargarDestacadasPerfil(P.offset, autor1);
            P.cargarPublicacion(P.offset, autor1);
            P.cargarReacciones();
            P.actualizarInfoPerfil(autor1);
            P.setVisible(true);
        }
    }//GEN-LAST:event_fotoActionPerformed

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        jPanel7.setVisible(!jPanel7.isVisible());  // TODO add your handling code here:
    }//GEN-LAST:event_eliminarMouseClicked

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        this.dispose();
        IniciarSesion IS = new IniciarSesion();
        int idSeleccionado;
        idSeleccionado = idPubli1;
        if(idSeleccionado == IS.idUsuario){
            Perfil P = new Perfil();
            P.actualizarNombreUsuario(IS.idUsuario);
            P.cargarImagenUsuario(IS.idUsuario);
            P.cargarImagenPortada(IS.idUsuario, P.fotoportada);
            P.cargarDestacadasPerfil(P.offset, IS.idUsuario);
            P.cargarPublicacion(P.offset, IS.idUsuario);
            P.cargarReacciones();
            P.actualizarInfoPerfil(IS.idUsuario);
            P.setVisible(true);
        }
        else{
            Perfil_Amigo P = new Perfil_Amigo();
            P.actualizarNombreUsuario(idSeleccionado);
            P.cargarImagenUsuario(idSeleccionado);
            P.cargarImagenPortada(idSeleccionado, P.fotoportada);
            P.cargarDestacadasPerfil(P.offset, idSeleccionado);
            P.cargarPublicacion(P.offset, idSeleccionado);
            P.cargarReacciones();
            P.actualizarInfoPerfil(idSeleccionado);
            P.setVisible(true);
        }
    }//GEN-LAST:event_userActionPerformed

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
        P.cargarPublicacion(P.offset2, IS.idUsuario);
        P.cargarReacciones();
        P.actualizarInfoPerfil(IS.idUsuario);
        P.setVisible(true);
    }//GEN-LAST:event_fotoperfilActionPerformed

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

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.dispose();
        IniciarSesion IS = new IniciarSesion();
        Menuframe Mf = new Menuframe();
        Mf.actualizarNombreUsuario(IS.idUsuario);
        Mf.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        Notificaciones N = new Notificaciones();
        N.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        FacebookFriends FF = new FacebookFriends();
        FF.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        InicioF If = new InicioF();
        If.cargarImagenUsuario(idUsuario);
        If.cargarPublicaciones(If.offset2, idUsuario);
        If.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Busqueda B = new Busqueda();
        B.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
        SubirFotoHistoria SFH = new SubirFotoHistoria();
        SFH.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void derActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derActionPerformed
        cargarHistoriasRecientes();
    }//GEN-LAST:event_derActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void derMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_derMouseEntered
        der.setForeground(new Color(51,153,255));// TODO add your handling code here:
    }//GEN-LAST:event_derMouseEntered

    private void derMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_derMouseExited
       der.setForeground(new Color(0,0,0));// TODO add your handling code here:
    }//GEN-LAST:event_derMouseExited

    private void arribaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arribaMouseEntered
        arriba.setForeground(new Color(51,153,255));// TODO add your handling code here:
    }//GEN-LAST:event_arribaMouseEntered

    private void arribaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arribaMouseExited
        arriba.setForeground(new Color(0,0,0));// TODO add your handling code here:
    }//GEN-LAST:event_arribaMouseExited

    private void ComentarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComentarMouseEntered
        Comentar.setForeground(new Color(51,153,255));// TODO add your handling code here:
    }//GEN-LAST:event_ComentarMouseEntered

    private void ComentarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComentarMouseExited
        Comentar.setForeground(new Color(0,0,0));// TODO add your handling code here:
    }//GEN-LAST:event_ComentarMouseExited

    private void bajoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bajoMouseEntered
        bajo.setForeground(new Color(51,153,255));// TODO add your handling code here:
    }//GEN-LAST:event_bajoMouseEntered

    private void bajoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bajoMouseExited
        bajo.setForeground(new Color(0,0,0));// TODO add your handling code here:
    }//GEN-LAST:event_bajoMouseExited

    private void Comentar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Comentar3MouseEntered
        Comentar3.setForeground(new Color(51,153,255));// TODO add your handling code here:
    }//GEN-LAST:event_Comentar3MouseEntered

    private void Comentar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Comentar3MouseExited
         Comentar3.setForeground(new Color(0,0,0));// TODO add your handling code here:
    }//GEN-LAST:event_Comentar3MouseExited

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void eliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar3ActionPerformed
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
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        String query = """
                SELECT p.ID_Publicacion, p.ID_Usuario, p.Imagen, p.Texto,
                       p.Fecha_publicacion, p.Privacidad,
                       u.Nombre, u.Apellido, u.Foto_perfil
                FROM publicacion p
                JOIN perfil_usuario u ON p.ID_Usuario = u.ID_Usuario
                WHERE (
                        p.ID_Usuario = ?
                     OR p.ID_Usuario IN (
                        SELECT CASE
                                 WHEN ID_Usuario1 = ? THEN ID_Usuario2
                                 WHEN ID_Usuario2 = ? THEN ID_Usuario1
                               END
                        FROM amistad
                        WHERE (ID_Usuario1 = ? OR ID_Usuario2 = ?)
                          AND Estado = 'aceptada'
                     )
                   )
                 AND (p.Privacidad = 'amigos' OR p.Privacidad = 'público'
                      OR p.ID_Usuario = ?)
                ORDER BY RAND()
                LIMIT 2 OFFSET ?""";

        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, idUsuario);
        pst.setInt(2, idUsuario);
        pst.setInt(3, idUsuario);
        pst.setInt(4, idUsuario);
        pst.setInt(5, idUsuario);
        pst.setInt(6, idUsuario);
        pst.setInt(7, offset2);

        ResultSet rs = pst.executeQuery();

        int contador = 0;
        while (rs.next()) {
            int idPublicacion = rs.getInt("ID_Publicacion");
            int autor = rs.getInt("ID_Usuario");
            String texto = rs.getString("Texto");
            byte[] imagen = rs.getBytes("Imagen");
            String priv = rs.getString("Privacidad"); // <<— privacidad

            String nombreUsuario = rs.getString("Nombre") + " " +
                                   rs.getString("Apellido");
            byte[] fotoPerfil = rs.getBytes("Foto_perfil");

            ImageIcon iconImagen = (imagen != null)
                    ? new ImageIcon(new ImageIcon(imagen).getImage()
                                    .getScaledInstance(ima.getWidth(), ima.getHeight(),
                                                        Image.SCALE_SMOOTH))
                    : null;

            ImageIcon iconPerfil = (fotoPerfil != null)
                    ? new ImageIcon(new ImageIcon(fotoPerfil).getImage()
                                    .getScaledInstance(foto.getWidth(), foto.getHeight(),
                                                        Image.SCALE_SMOOTH))
                    : null;

            // Elige el icono según la privacidad *para esta publicación*
            ImageIcon iconPriv;
            switch (priv) {
                case "privado"  -> iconPriv = new ImageIcon("src\\main\\resources\\lock.png");
                case "amigos"   -> iconPriv = new ImageIcon("src\\main\\resources\\FriendsP.png");
                default         -> iconPriv = new ImageIcon("src\\main\\resources\\world.png"); // publico
            }

            if (contador == 0) {
                idPubli1 = idPublicacion;
                autor1 = autor;
                text.setText(texto);
                ima.setIcon(iconImagen);
                user.setText(nombreUsuario);
                foto.setIcon(iconPerfil);
                Privacidad.setIcon(iconPriv); // Asigna el icono *aquí*
                cargarReacciones(idPubli1, corazon, divierte, triste);
            } else if (contador == 1) {
                idPubli2 = idPublicacion;
                autor2 = autor;
                text3.setText(texto);
                ima3.setIcon(iconImagen);
                user3.setText(nombreUsuario);
                foto3.setIcon(iconPerfil);
                Privacidad2.setIcon(iconPriv); // Asigna el icono *aquí*
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
        JOptionPane.showMessageDialog(this,
                "Error al cargar publicaciones: " + ex.getMessage());
    }
}



    
    public void manejarReaccion(int idPublicacion, String tipoReaccion, JLabel corazon, JLabel divierte, JLabel triste) {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        // Verificar si ya hay una reacción
        String consulta = "SELECT Tipo FROM reaccion WHERE ID_Publicacion = ? AND ID_Usuario = ?";
        PreparedStatement pst = con.prepareStatement(consulta);
        pst.setInt(1, idPublicacion);
        pst.setInt(2, idUsuario);
        ResultSet rs = pst.executeQuery();

        boolean yaExiste = false;
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

        // Insertar nueva reacción
        pst = con.prepareStatement("INSERT INTO reaccion (ID_Publicacion, ID_Usuario, Tipo) VALUES (?, ?, ?)");
        pst.setInt(1, idPublicacion);
        pst.setInt(2, idUsuario);
        pst.setString(3, tipoReaccion);
        pst.executeUpdate();

        // Obtener el autor de la publicación
        int idAutor = -1;
        pst = con.prepareStatement("SELECT ID_Usuario FROM publicacion WHERE ID_Publicacion = ?");
        pst.setInt(1, idPublicacion);
        rs = pst.executeQuery();
        if (rs.next()) {
            idAutor = rs.getInt("ID_Usuario");
        }

        // Obtener el nombre del usuario que reacciona
        String nombreUsuario = "";
        pst = con.prepareStatement("SELECT Nombre FROM perfil_usuario WHERE ID_Usuario = ?");
        pst.setInt(1, idUsuario);
        rs = pst.executeQuery();
        if (rs.next()) {
            nombreUsuario = rs.getString("Nombre");
        }

        // Insertar la notificación (si no se reacciona a uno mismo)
        if (idAutor != idUsuario && idAutor != -1) {
            pst = con.prepareStatement(
                "INSERT INTO notificaciones (ID_Usuario, Mensaje, Tipo, Referencia) VALUES (?, ?, 'reaccion', ?)");
            pst.setInt(1, idAutor);
            pst.setString(2, nombreUsuario + " reaccionó a tu publicación.");
            pst.setInt(3, idPublicacion);
            pst.executeUpdate();
        }

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
    
    public void eliminarPublicacion(int idPublicacion) {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        // Verificar si el usuario actual es el autor de la publicación
        String verificarAutor = "SELECT ID_Usuario FROM publicacion WHERE ID_Publicacion = ?";
        PreparedStatement pstVerificar = con.prepareStatement(verificarAutor);
        pstVerificar.setInt(1, idPublicacion);
        ResultSet rs = pstVerificar.executeQuery();

        if (rs.next()) {
            int autor = rs.getInt("ID_Usuario");
            if (autor != idUsuario) {
                JOptionPane.showMessageDialog(this, "No puedes eliminar esta publicación porque no te pertenece.");
                con.close();
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "La publicación no fue encontrada.");
            con.close();
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar esta publicación?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            String eliminarReacciones = "DELETE FROM reaccion WHERE ID_Publicacion = ?";
            PreparedStatement pstReac = con.prepareStatement(eliminarReacciones);
            pstReac.setInt(1, idPublicacion);
            pstReac.executeUpdate();

            String eliminarComentarios = "DELETE FROM comentario WHERE ID_Publicacion = ?";
            PreparedStatement pstComent = con.prepareStatement(eliminarComentarios);
            pstComent.setInt(1, idPublicacion);
            pstComent.executeUpdate();

            String eliminarPubli = "DELETE FROM publicacion WHERE ID_Publicacion = ?";
            PreparedStatement pstEliminar = con.prepareStatement(eliminarPubli);
            pstEliminar.setInt(1, idPublicacion);
            pstEliminar.executeUpdate();

            JOptionPane.showMessageDialog(this, "Publicación eliminada correctamente.");
            cargarPublicaciones(offset2, idUsuario); // recargar publicaciones
        }

        con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al eliminar la publicación: " + ex.getMessage());
    }
}
    
    
public void cargarHistoriasRecientes() {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facebook", "AlanMijares", "1");

        String query = """
            SELECT h.ID_Usuario, h.Contenido_historia, u.Foto_perfil, u.Nombre
            FROM historia h
            JOIN perfil_usuario u ON h.ID_Usuario = u.ID_Usuario
            WHERE 
                h.Fecha >= NOW() - INTERVAL 24 HOUR AND
                (
                    h.ID_Usuario = ? OR
                    h.ID_Usuario IN (
                        SELECT CASE
                            WHEN ID_Usuario1 = ? THEN ID_Usuario2
                            WHEN ID_Usuario2 = ? THEN ID_Usuario1
                        END
                        FROM amistad
                        WHERE (ID_Usuario1 = ? OR ID_Usuario2 = ?) AND Estado = 'aceptada'
                    )
                )
            ORDER BY RAND()
            LIMIT 3
        """;

        PreparedStatement pst = con.prepareStatement(query);
        for (int i = 1; i <= 5; i++) pst.setInt(i, idUsuario);

        ResultSet rs = pst.executeQuery();

        JButton[] botones = {jButton11, jButton12, jButton13};
        JPanel[] paneles = {jPanel3, jPanel4, jPanel5};

        int i = 0;
        while (rs.next() && i < 3) {
            byte[] historiaImg = rs.getBytes("Contenido_historia");
            byte[] fotoPerfil = rs.getBytes("Foto_perfil");
            String nombre = rs.getString("Nombre");

            if (historiaImg != null && fotoPerfil != null) {
                historiasContenido[i] = historiaImg;
                nombresUsuarios[i] = nombre;

                ImageIcon icono = new ImageIcon(new ImageIcon(fotoPerfil).getImage().getScaledInstance(
                        botones[i].getWidth(), botones[i].getHeight(), Image.SCALE_SMOOTH));
                botones[i].setIcon(icono);
                botones[i].setText("");
                botones[i].setContentAreaFilled(false);
                botones[i].setBorderPainted(false);
                botones[i].setFocusPainted(false);
                paneles[i].setVisible(true);

                int index = i;
                for (ActionListener al : botones[i].getActionListeners()) {
                    botones[i].removeActionListener(al);
                }
                botones[i].addActionListener(e -> abrirHistoria(index));
                i++;
            }
        }

        for (; i < 3; i++) {
            historiasContenido[i] = null;
            nombresUsuarios[i] = null;
            paneles[i].setVisible(false);
        }

        con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al cargar historias: " + ex.getMessage());
    }
}

    public void abrirHistoria(int index) {
    if (historiasContenido[index] == null) return;

    JFrame visor = new JFrame("Historia de " + nombresUsuarios[index]);
    visor.setSize(450, 500);
    visor.setLocationRelativeTo(this);
    visor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    visor.setLayout(new BorderLayout());

    JLabel historia = new JLabel();
    ImageIcon icono = new ImageIcon(historiasContenido[index]);
    Image imagen = icono.getImage().getScaledInstance(430, 400, Image.SCALE_SMOOTH);
    historia.setIcon(new ImageIcon(imagen));
    historia.setHorizontalAlignment(JLabel.CENTER);

    visor.add(historia, BorderLayout.CENTER);

    JButton cerrar = new JButton("Cerrar");
    cerrar.addActionListener(e -> visor.dispose());

    JPanel abajo = new JPanel();
    abajo.add(cerrar);

    visor.add(abajo, BorderLayout.SOUTH);
    visor.setVisible(true);
}









    
    
    
    
    
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
    private javax.swing.JLabel Privacidad;
    private javax.swing.JLabel Privacidad2;
    private javax.swing.JButton arriba;
    private javax.swing.JButton bajo;
    private javax.swing.JLabel corazon;
    private javax.swing.JLabel corazon3;
    private javax.swing.JButton der;
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
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
