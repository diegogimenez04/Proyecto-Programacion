package proyectocinema;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ProyectoCinema extends JFrame implements ActionListener {
    
    JButton btnagreg;
    JButton btneliminar;
    JButton btncantidadtot;
    
    JTextField txtflagregar;
    
    JLabel lbltotalentradas;
    JLabel lbltotalprecio;
    
    JComboBox horarios;
    
    JTable tblentradas;
    
    public ProyectoCinema (){
        setSize(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
        
        JPanel frame = new JPanel();
        
        JFrame framebotonas = new JFrame();
        JButton botonparasiento = new JButton("Hola");
        framebotonas.setLayout(new FlowLayout());
        framebotonas.add(botonparasiento);
        
        
        framebotonas.add(frame);
        framebotonas.setVisible(true);
        
}
        @Override
        public void actionPerformed(ActionEvent ae) {
            VentanaParaAsientos asientos = new VentanaParaAsientos();
            this.setVisible(true);
        }
}
