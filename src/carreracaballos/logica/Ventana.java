/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracaballos.logica;

import javax.swing.JFrame;

/**
 *
 * @author ARANGO
 */
public class Ventana extends JFrame {

    public Ventana() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(new IconoInicio());
    }
}
