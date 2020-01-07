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
public class Nodo_C {

    public String nombre;
    public String nick;
    public String rol;
    public String telefono;

    public Nodo_C siguiente;
    public Nodo_C anterior;

    //primer nodo
    public Nodo_C(String nombre, String nick, String rol, String telefono) {
        this(nombre, nick, rol, telefono, null,null);
    }
    
    //nodo n-esimo
    public Nodo_C(String nombre, String nick, String rol, String telefono, Nodo_C siguiente, Nodo_C anterior) {
        this.nombre = nombre;
        this.nick = nick;
        this.rol = rol;
        this.telefono = telefono;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    
    
}

