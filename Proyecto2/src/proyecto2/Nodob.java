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
public class Nodob {
    public String tarea;
    public String comentario;
    
    public Nodob siguiente;
    public Nodob anterior;
    
    public Nodob(String tarea, String comentario) {
        this(tarea, comentario, null, null);
    }

    public Nodob(String tarea, String comentario, Nodob siguiente, Nodob anterior) {
        this.tarea = tarea;
        this.comentario = comentario;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    
    
}
