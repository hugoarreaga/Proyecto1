/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author Arreaga
 */
public class Nodot {
    public String nombre;
    
    public Nodot anterior, siguiente;

    public Nodot(String nombre) {
        this(nombre,null,null);
    }
    
    public Nodot(String nombre,  Nodot anterior, Nodot siguiente) {
        this.nombre = nombre;
        
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
    
}
