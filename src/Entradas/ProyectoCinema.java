package Entradas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import Entradas.Entradas;
import Ventanas.VentanaSalas;
public class ProyectoCinema extends JFrame implements ActionListener, KeyListener {
    
    Entradas entrada = new Entradas();
    
    JButton botoncomun = new JButton("Entrada Comun");
    JButton botonvip = new JButton("Entrada Vip");
    JTextField txfcantidad = new JTextField(7);
    JLabel precio = new JLabel("$");
    JTable tabla = new JTable();
    
    public ProyectoCinema (){
        //Inicializamos el proyecto con cosas basicas
        setSize(200, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
        setLocation(600,200);
        //Seteamos el color de fondo
        
        //Seteamos el panel
        JPanel framex = new JPanel();
        framex.setLayout(new FlowLayout());
        
        //Le damos funciones a los objetos
        botoncomun.addActionListener(this);
        botonvip.addActionListener(this);
        txfcantidad.addKeyListener(this);
        
        
        //Añadimos a los objetos
        framex.add(botoncomun);
        framex.add(botonvip);
        framex.add(txfcantidad);
        framex.add(precio);
        
        //Añadimos el frame a la ventana
        this.add(framex);
        
}
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            //Ponemos el precio
            try{
                if (e.getSource().equals(this.botoncomun)){
                    String butacas = this.txfcantidad.getText();
                    double butacascant = Double.parseDouble(butacas);
                    butacascant = butacascant * entrada.getPreciocomun();
                    precio.setText(butacascant + " $");
                    this.txfcantidad.setText("");
                    //Creamos una ventana
                    VentanaSalas asientos = new VentanaSalas();
                    asientos.setVisible(true);
                }else if(e.getSource().equals(this.botonvip)){
                    String butacas = this.txfcantidad.getText();
                    double butacascant = Double.parseDouble(butacas);
                    butacascant = butacascant * entrada.getPreciovip();
                    precio.setText(butacascant + " $");
                    this.txfcantidad.setText("");
                    VentanaSalas asientos = new VentanaSalas();
                    asientos.setVisible(true);
                }
            }catch(NumberFormatException snum){
                JOptionPane.showMessageDialog(this, "Debes ingresar un numero por lo menos");
            }
            //Colocamos las entradas en la tabla
            
        }
        
        
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
}
