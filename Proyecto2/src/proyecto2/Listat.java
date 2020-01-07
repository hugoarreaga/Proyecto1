/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Arreaga
 */
public class Listat {
    public static Nodot inicio, fin;
    
    

    public Listat() {
        inicio = fin = null;
    }
    
    
    
    public static boolean listavacia(){
            return inicio == null;
    }

    
    public static void insertarNodo(String nombre) {

        Panel2 panel2 = new Panel2("");
        Panel panel = new Panel("");
       
        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
        boolean repetido = true;


        if (!listavacia()) {

            Nodot aux = inicio;
            while (aux != null) {
                if (aux.nombre.equals(nombre)) {
                    JOptionPane.showMessageDialog(null, "Ya existe el nick");
                    repetido = false;
                }
                
                aux = aux.siguiente;

            }
            if (repetido) {
                    fin = new Nodot(nombre,fin, null);
                    fin.anterior.siguiente = fin;
                    panel.add(nombre, panel2);
                    
                }

        } else {
            inicio = fin = new Nodot(nombre);
            TABLEROS.jTabbedPane1.addTab(nombre, panel);
            panel.add(panel2);
            
        }
        
        
        
        
        
        

    }

    ///impr
    public  static void mostrar() {
        if (!listavacia()) {
            String dato = "<=>";
            Nodot aux = inicio;
            while (aux != null) {
                dato = dato + "(" + aux.nombre + ") <=>";
                aux = aux.siguiente;
            }
            JOptionPane.showMessageDialog(null, dato,
                    "mostrando",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void insertartablero(){
        
    }
    
    
}
