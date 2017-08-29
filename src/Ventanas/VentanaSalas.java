package Ventanas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class VentanaSalas extends JFrame {
    
    // Creamos los JLabel y JCheckbox
    private JLabel label1, label2;
    private JCheckBox check1, check2, check3, check4, check5, check6, check7, check8, check9, check10, check11, check12 ;
        
    public VentanaSalas(){
        
        // Tamaño y titulo de ventana
        super("Sala de Cine");
        setSize(550, 380);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Definimos el Panel, los labels y los CheckBox
        JPanel pan = new JPanel();
        setLayout(null);
        label1 = new JLabel("Pantalla");
        add(label1);
        label1.setBounds(180,150,300,300);
        label2 = new JLabel ("Entrada");
        add(label2);
        label2.setBounds(450,20,100,100);
        check1 = new JCheckBox("Butaca 1");
        add(check1);
        check1.setBounds(10,70,100,60);
        check2 = new JCheckBox("Butaca 2");
        add(check2);
        check2.setBounds(10,120,100,60);
        check3 = new JCheckBox("Butaca 3");
        add(check3);
        check3.setBounds(10,170,100,60);
        check4 = new JCheckBox("Butaca 4");
        add(check4);
        check4.setBounds(110,70,100,60);
        check5 = new JCheckBox("Butaca 5");
        add(check5);
        check5.setBounds(110,120,100,60);
        check6 = new JCheckBox("Butaca 6");
        add(check6);
        check6.setBounds(110,170,100,60);
        check7 = new JCheckBox("Butaca 7");
        add(check7);
        check7.setBounds(210,70,100,60);
        check8 = new JCheckBox("Butaca 8");
        add(check8);
        check8.setBounds(210,120,100,60);
        check9 = new JCheckBox("Butaca 9");
        add(check9);
        check9.setBounds(210,170,100,60);
        check10 = new JCheckBox("Butaca 10");
        add(check10);
        check10.setBounds(310,70,100,60);
        check11 = new JCheckBox("Butaca 11");
        add(check11);
        check11.setBounds(310,120,100,60);
        check12 = new JCheckBox("Butaca 12");
        add(check12);
        check12.setBounds(310,170,100,60);
        
    }
}    