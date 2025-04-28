/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iniciosesion;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.util.*;

public class modeloLista {

    private DefaultListModel<Usuario> modeloLista;  // El modelo que almacena los usuarios

    // Constructor
    public modeloLista() {
        modeloLista = new DefaultListModel<>();
    }

    // Agregar un usuario al modelo
    public void agregarUsuario(Usuario usuario) {
        modeloLista.addElement(usuario);
    }

    // Obtener el modelo
    public DefaultListModel<Usuario> getModelo() {
        return modeloLista;
    }

    // Filtrar usuarios según el texto de búsqueda
    public void filtrarUsuarios(String filtro) {
        modeloLista.clear();  // Limpiar los elementos actuales

        // Lista de usuarios de ejemplo
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Juan Pérez"));
        usuarios.add(new Usuario("Carlos López"));
        usuarios.add(new Usuario("María González"));
        usuarios.add(new Usuario("Ana Rodríguez"));
        usuarios.add(new Usuario("Luis Fernández"));

        // Agregar usuarios que coincidan con el filtro
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().toLowerCase().contains(filtro.toLowerCase())) {
                modeloLista.addElement(usuario);  // Agregar usuario si coincide
            }
        }
    }

    void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void addElement(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

