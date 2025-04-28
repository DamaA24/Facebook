/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iniciosesion;

import javax.swing.Icon;

public class PrivacidadOpcion {
    private String texto;
    private Icon icono;

    public PrivacidadOpcion(String texto, Icon icono) {
        this.texto = texto;
        this.icono = icono;
    }

    public String getTexto() {
        return texto;
    }

    public Icon getIcono() {
        return icono;
    }

    @Override
    public String toString() {
        return texto; // Esto se usará si el combo necesita mostrar algo por defecto
    }
}

