/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Arreaga
 */
public class Producto {
    int id;
    String nombre;
    
    int cantidad;
    int minimo;
    int maximo;
    int costo;
    String descripcion;
    String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Producto(int id,String nombre, int cantidad, int minimo, int maximo, int costo, String descripcion,String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.minimo = minimo;
        this.maximo = maximo;
        this.costo = costo;
        this.descripcion = descripcion;
        this.direccion = direccion;
    }
    
}
