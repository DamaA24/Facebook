/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iniciosesion;


/**
 *
 * @author User
 */
import java.awt.*;
import javax.swing.border.Border;

public class BordePunteado implements Border {

    private final Stroke stroke = new BasicStroke(
        1f,
        BasicStroke.CAP_BUTT,
        BasicStroke.JOIN_MITER,
        10f,
        new float[]{4f, 4f},
        0f
    );

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(c.getForeground()); // usa el color de texto del botón como color de borde
        g2.setStroke(stroke);
        g2.drawRect(x, y, width - 1, height - 1);
        g2.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(2, 2, 2, 2);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}

