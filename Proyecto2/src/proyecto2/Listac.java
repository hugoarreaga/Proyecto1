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
public class Listac {
    
    public static Nodoc inicio, fin;
    
    
    

    public Listac() {
        inicio = fin = null;
    }
    
    
    
    public static boolean listavacia(){
            return inicio == null;
    }

    
    public static void insertarNodoC(String nombre) {

        Panel2 panel2 = new Panel2(nombre);
        Panel panel = new Panel("");
       
        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
        boolean repetido = true;


        if (!listavacia()) {

            Nodoc aux = inicio;
            while (aux != null) {
                if (aux.nombre.equals(nombre)) {
                    JOptionPane.showMessageDialog(null, "Ya existe el nick");
                    repetido = false;
                }
                
                aux = aux.siguiente; 

            }
            if (repetido) {
                    fin = new Nodoc(nombre,"",fin, null); 
                    
                    fin.anterior.siguiente = fin;
                    panel.add(nombre, panel2);
                    
                }

        } else {
            inicio = fin = new Nodoc(nombre);
            TABLEROS.jTabbedPane1.addTab(nombre, panel);
            panel.add(panel2);
            
        }
        
        
        
        
        
        

    }

    ///impr
    public  static void mostrar() {
        if (!listavacia()) {
            String dato = "<=>";
            Nodoc aux = inicio;
            while (aux != null) {
                dato = dato + "(" + aux.nombre + ") <=>";
                aux = aux.siguiente;
            }
            JOptionPane.showMessageDialog(null, dato,
                    "mostrando",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void eliminar(String nombre){
        
            Nodoc aux = inicio;
            Nodoc ant = null;
            boolean repetido = true;
            do {
                if (aux.nombre.equals(nombre)) {
                    if(aux == inicio){
                        inicio = inicio.siguiente;
                    }else if(aux == fin){
                        aux.anterior.siguiente = null;
                        fin = fin.anterior;
                    }else{
                        aux.anterior.siguiente = aux.siguiente;
                        aux.siguiente.anterior = aux.anterior;
                    }

                }
                
                aux = aux.siguiente; 
                
            
            } while (aux != null && aux.nombre != nombre);
        
        
    }
    
}
