/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comprame.dac;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Rafae
 */
public class Producto {
    String nombre;
    String unidades;
    //int precio;

    public Producto(String nombre, String unidades) {
        this.nombre = nombre;
        this.unidades = unidades;
    }

    public String getProducto() {
        return nombre;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setProducto(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Producto{" + "producto=" + nombre + ", unidades=" + unidades + '}';
    }
    
    
    
    
}
