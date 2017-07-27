package proyectoprogramacion;
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class VentanaInicio extends JFrame{
    
    ArrayList<String> caranchoa = new ArrayList<String>();
    
    private JComboBox product;
    DefaultTableModel modo1 = new DefaultTableModel();
    
    public class AlTocarlisto implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            //agrego.dispose();
        }
    }
    public VentanaInicio(){
        setSize(1366, 743);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel iniciar = new JPanel();
        
        //Creacion de la tabla
        JPanel tabliat = new JPanel();
        
        Object rowData[][] = { { "Nombre del producto", "Cantidad", "Tipo" }};
        
        modo1.addRow(rowData);
        
        JTable table = new JTable(modo1);
        
        tabliat.add(table);
        
        //Creacion del boton de cracion
        JButton BCrear = new JButton("Crear");
        BCrear.addActionListener(new AlTocarCrear());
        
        //Creacion del label para agregar producto
        JPanel TipoProducto = new JPanel();
        TipoProducto.setLayout(new FlowLayout());
        TipoProducto.add(new JLabel("Tipo de producto a agregar"));
        
        JPanel TipoStock = new JPanel();
        product = new JComboBox();
        TipoStock.add(product);
        
        
        JPanel PanelCrear = new JPanel();
        PanelCrear.setLayout(new FlowLayout());
        PanelCrear.add(BCrear);
        
        iniciar.add(BCrear);
        iniciar.add(TipoProducto);
        iniciar.add(TipoStock);
        iniciar.add(tabliat);
        
        this.add(iniciar);
    }
    public class AlTocarCrear implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            String NombreProd = JOptionPane.showInputDialog("Ingrese el producto", "");
            String cantprod = JOptionPane.showInputDialog("Ingrese la cantidad", "");
            String tipoprod = JOptionPane.showInputDialog("Ingrese el tipo de producto", "");
            //caranchoa.toArray(NombreProd);
            String [] datos = {NombreProd, cantprod, tipoprod};
            
            product.addItem(NombreProd);
            
            modo1.addRow(datos);
            
            
        }
        
    }
}
