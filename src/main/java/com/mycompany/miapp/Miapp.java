/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miapp;

import javax.swing.SwingUtilities;
import presentacion.VentanaMenu;

/**
 *
 * @author Lenovo
 */
public class Miapp {

    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaMenu menu = new VentanaMenu();
                menu.setVisible(true);
            }
        });
    }
    }

