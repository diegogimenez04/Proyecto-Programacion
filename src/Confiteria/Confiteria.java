/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Confiteria;

/**
 *
 * @author user2
 */
public class Confiteria extends ConfiteriaVentana{
    
    int precio;
    
    String Tipo;
    
    String Marca;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
    public Confiteria(){
        
    }
    
}
