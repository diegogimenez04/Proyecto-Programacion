/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author user2
 */
public class Ejecutar {
    public static void main(String[] args){
        ConfiteriaVentana ventana = new ConfiteriaVentana();
        ProyectoCinema execute = new ProyectoCinema();
        execute.setVisible(true);
        ventana.setVisible(true);
        VentanaSalas ejecutable = new VentanaSalas ();
        ejecutable.setVisible(true);
    }
    
    
}
