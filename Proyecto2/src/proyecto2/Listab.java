/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import javax.swing.BoxLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Arreaga
 */
public class Listab {
    public static Nodob inicio, fin;
    
    public Listab() {
        inicio = fin = null;
    }
    
    public static boolean listavacia() {
        return inicio == null;
    }
    
    
    public static void insertarNodob(String tarea) {
        
        Boton boton = new Boton(tarea,"");
        
        Panel2.agregarB(tarea);
        
        
       
       
        

        
        boolean repetido = true;

        
        
         
        
    

        if (!listavacia()) {

            Nodob aux = inicio;
            while (aux != null) {
                if (aux.tarea.equals(tarea)) {
                    JOptionPane.showMessageDialog(null, "Ya existe el nombre");
                    repetido = false;
                }
                
                aux = aux.siguiente;

            }
            if (repetido) {
                    fin = new Nodob(tarea, "", null, fin);
                    fin.anterior.siguiente = fin;
                                    }

        } else {
            //inicio = fin = new Nodo_C(nombre, nick, rol, telefono);
        }

    }
}
