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
public class ConfiteriaVentana extends JFrame implements ActionListener {

    JButton save;
    JButton cancel;
    JButton cuadrado;

    JTextField cantidadComida;
    JTextField cantidadBebida;

    JComboBox bebida;
    JComboBox comida;

    JLabel total;

    //Creamos el objeto de confiteria
    public ConfiteriaVentana() {
        //Definimos caracteristicas de la ventana

        Confiteria confiteria1 = new Confiteria();

        comida = new JComboBox();
        bebida = new JComboBox();

        comida.setModel(new DefaultComboBoxModel(confiteria1.listacomida.toArray()));
        bebida.setModel(new DefaultComboBoxModel(confiteria1.listabebida.toArray()));

        JPanel panel = new JPanel();

        this.add(panel);

        this.setSize(400, 400);
        this.setLocation(300, 500);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(save)) {
            /*
            String cantibebid = this.cantidadComida.getText();
            double cantibebi3 = Double.parseDouble(cantibebid);

            String canticomd = this.cantidadComida.getText();
            double canticomi3 = Double.parseDouble(canticomd);
             */
        }
    }

}
