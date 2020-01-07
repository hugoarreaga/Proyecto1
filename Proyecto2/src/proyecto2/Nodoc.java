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
public class Nodoc {
    public String nombre, comentario;
    
    
    public Nodoc anterior, siguiente;

    public Nodoc(String nombre) {
        this(nombre,"",null,null);
    }
    
    
    public Nodoc(String nombre,String comentario,  Nodoc anterior, Nodoc siguiente) {
        this.nombre = nombre;
        this.comentario = comentario;
        this.anterior = anterior;
        this.siguiente = siguiente;
        
        
    }
    
}
