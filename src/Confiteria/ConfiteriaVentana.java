/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Confiteria;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author user2
 */
public class ConfiteriaVentana extends JFrame implements ActionListener{
    
    JButton save;
    JButton cancel;
    JButton cuadrado;
    
    JComboBox bebida;
    JComboBox comida;
    
    JLabel total;
    
    //Creamos el objeto de confiteria
    Confiteria confiteria = new Confiteria();
    
    public ConfiteriaVentana(){
        //Definimos caracteristicas de la ventana
        setSize(400,400);
        setLocation(300,500);
        
        bebida.setModel(new DefaultComboBoxModel(confiteria.listabebida.toArray()));
        comida.setModel(new DefaultComboBoxModel(confiteria.listacomida.toArray()));
        
        JPanel panel = new JPanel();
        
        this.add(panel);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(save)){
            
        }
    }
    
}
