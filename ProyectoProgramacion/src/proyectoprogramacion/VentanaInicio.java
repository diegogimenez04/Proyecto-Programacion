package proyectoprogramacion;
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class VentanaInicio extends JFrame{
    
    private JComboBox product;
    
    public class AlTocarlisto implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            //agrego.dispose();
        }
    }
    public VentanaInicio(){
        setSize(1366, 743);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        DefaultTableModel modo1 = new DefaultTableModel();
        
        JPanel iniciar = new JPanel();
        
        //Creacion de la tabla
        JPanel tabliat = new JPanel();
        
        Object rowData[][] = { { "Nombre del producto", "Cantidad", "Tipo" }, {"", "", ""}
        , {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}
        , {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}
        , {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}
        , {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}
        , {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}
        , {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}
        , {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}, {"", "", ""}};
        Object columnNames[] = { "Column One", "Column Two", "Column Three" };
        JTable table = new JTable(rowData, modo1);
        
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
        iniciar.add(table);
        
        this.add(iniciar);
    }
    public class AlTocarCrear implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            DefaultTableModel modo1 = new DefaultTableModel();
            
            String NombreProd = JOptionPane.showInputDialog("Ingrese el producto", "");
            String cantprod = JOptionPane.showInputDialog("Ingrese la cantidad", "");
            String tipoprod = JOptionPane.showInputDialog("Ingrese el tipo de producto", "");
            
            String [] datos = {cantprod, tipoprod};
            
            modo1.addColumn(NombreProd);
            modo1.addRow(datos);
            
            
        }
        
    }
}
