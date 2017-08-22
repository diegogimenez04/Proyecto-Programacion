package proyectocinema;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class ProyectoCinema extends JFrame implements ActionListener, KeyListener {
    
    Entradas entrada = new Entradas();
    
    JButton botonparasiento = new JButton("Agregar");
    JButton botonparasacar = new JButton("Eliminar");
    JTextField txfcantidad = new JTextField(5);
    JLabel precio = new JLabel("$");
    JTable tabla = new JTable();
    
    public ProyectoCinema (){
        //Inicializamos el proyecto con cosas basicas
        setSize(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
        
        //Ponemos atributos a la tabla
        
        
        
        //Seteamos el panel
        JPanel framex = new JPanel();
        framex.setLayout(new FlowLayout());
        
        //Le damos funciones a los objetos
        botonparasiento.addActionListener(this);
        txfcantidad.addKeyListener(this);
        
        
        //Añadimos a los objetos
        framex.add(botonparasiento);
        framex.add(botonparasacar);
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
            String butacas = this.txfcantidad.getText();
            double butacascant = Double.parseDouble(butacas);
            butacascant = butacascant * entrada.getPrecio();
            precio.setText(butacascant + " $");
            //Colocamos las entradas en la tabla
            
        }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        txfcantidad.setText("");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
}
