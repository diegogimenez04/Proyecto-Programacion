package proyectocinema;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import proyectocinema.Entradas;
public class ProyectoCinema extends JFrame implements ActionListener, KeyListener {
    
    EntradaVip entradavip = new EntradaVip();
    EntradaComun entradacomun = new EntradaComun();
    
    JButton botoncomun = new JButton("Entrada Comun");
    JButton botonvip = new JButton("Entrada Vip");
    JTextField txfcantidad = new JTextField(7);
    JLabel precio = new JLabel("$");
    JTable tabla = new JTable();
    
    public ProyectoCinema (){
        //Inicializamos el proyecto con cosas basicas
        setSize(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
        setLocation(600,200);
        //Ponemos atributos a la tabla
        
        
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
            //Creamos una ventana
            VentanaParaAsientos asientos = new VentanaParaAsientos();
            asientos.setVisible(true);
            //Ponemos el precio
            if (e.getSource().equals(this.botoncomun)){
                String butacas = this.txfcantidad.getText();
                double butacascant = Double.parseDouble(butacas);
                butacascant = butacascant * entradacomun.getPreciocomun();
                precio.setText(butacascant + " $");
                this.txfcantidad.setText("");
            }else if(e.getSource().equals(this.botonvip)){
                String butacas = this.txfcantidad.getText();
                double butacascant = Double.parseDouble(butacas);
                butacascant = butacascant * entradavip.getPreciovip();
                precio.setText(butacascant + " $");
                this.txfcantidad.setText("");
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
