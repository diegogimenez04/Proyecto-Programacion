/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Confiteria;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author user2
 */
public class Confiteria   {

    private int precio;

    private String Tipo;

    private String Marca;

    private int pepsi = new Integer(40);
    private int coca = new Integer(50);
    private int fanta = new Integer(40);

    private int nachos = new Integer(70);
    private int pizza = new Integer(100);
    private int pochoclodulce = new Integer(60);

    public ArrayList<Integer> listacomida = new ArrayList<Integer>();
    public ArrayList<Integer> listabebida = new ArrayList<Integer>();

    public int getNachos() {
        return nachos;
    }

    public void setNachos(int nachos) {
        this.nachos = nachos;
    }

    public int getPizza() {
        return pizza;
    }

    public void setPizza(int pizza) {
        this.pizza = pizza;
    }

    public int getPochoclodulce() {
        return pochoclodulce;
    }

    public void setPochoclodulce(int pochoclodulce) {
        this.pochoclodulce = pochoclodulce;
    }

    public int getPepsi() {
        return pepsi;
    }

    public void setPepsi(int pepsi) {
        this.pepsi = pepsi;
    }

    public int getCoca() {
        return coca;
    }

    public void setCoca(int coca) {
        this.coca = coca;
    }

    public int getFanta() {
        return fanta;
    }

    public void setFanta(int fanta) {
        this.fanta = fanta;
    }

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

    public Confiteria() {

        this.listacomida.add(this.nachos);
        this.listacomida.add(this.pizza);
        this.listacomida.add(this.pochoclodulce);
        this.listabebida.add(this.pepsi);
        this.listabebida.add(this.coca);
        this.listabebida.add(this.fanta);

    }

}
