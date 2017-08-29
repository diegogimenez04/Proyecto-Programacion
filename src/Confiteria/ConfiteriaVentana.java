/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Confiteria;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author user2
 */
public class ConfiteriaVentana extends JFrame implements ActionListener{
    
    Confiteria confi;
    
    JButton save;
    JButton cancel;
    JButton cuadrado;
    
    public ConfiteriaVentana(){
        setSize(400,400);
        setLocation(300,500);
        
        JPanel panel = new JPanel();
        
        this.add(panel);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
