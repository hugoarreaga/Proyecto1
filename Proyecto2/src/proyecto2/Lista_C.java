/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author Arreaga
 */
public class Lista_C {

    public static Nodo_C inicio, fin;

    public Lista_C() {
        inicio = fin = null;
    }

    ///lista vacia
    public static boolean listavacia() {
        return inicio == null;
    }

    public static void insertarNodo() {

        String nombre, nick, rol, telefono;
        boolean repetido = true;

        nombre = NColaborador.jTextField1.getText();
        nick = NColaborador.jTextField2.getText();
        rol = NColaborador.jTextField3.getText();
        telefono = NColaborador.jTextField4.getText();

        if (!listavacia()) {

            Nodo_C aux = inicio;
            while (aux != null) {
                if (aux.nick.equals(nick)) {
                    JOptionPane.showMessageDialog(null, "Ya existe el nick");
                    repetido = false;
                }

                aux = aux.siguiente;

            }
            if (repetido) {
                fin = new Nodo_C(nombre, nick, rol, telefono, null, fin);
                fin.anterior.siguiente = fin;
                NColaborador.jTextField1.setText("");
                NColaborador.jTextField2.setText("");
                NColaborador.jTextField3.setText("");
                NColaborador.jTextField4.setText("");
            }

        } else {
            inicio = fin = new Nodo_C(nombre, nick, rol, telefono);
        }

    }

    ///impr
    public static void mostrar() {
        if (!listavacia()) {
            String dato = "<=>";
            Nodo_C aux = inicio;
            while (aux != null) {
                dato = dato + "(" + aux.nick + "-"+aux.nombre+")  <=> ";
                aux = aux.siguiente;
            }
            JOptionPane.showMessageDialog(null,dato);
            
        }
    }

    public static void eliminar(String nick) {

        Nodo_C aux = inicio;
        Nodo_C ant = null;
        boolean repetido = false;
        do {
            if (aux.nick.equals(nick)) {
                if (aux == inicio) {
                    inicio = inicio.siguiente;
                } else if (aux == fin) {
                    aux.anterior.siguiente = null;
                    fin = fin.anterior;
                } else {
                    aux.anterior.siguiente = aux.siguiente;
                    aux.siguiente.anterior = aux.anterior;
                }
                repetido = true; 

            }

            aux = aux.siguiente;

        } while (aux != null && aux.nombre != nick);
        if (repetido) {
            JOptionPane.showMessageDialog(null, "se elimino");
        }

    }

    public static void modificar(String nick) {
        Nodo_C aux = inicio;
        boolean repetido = false;
        
        
        do {
            if (aux.nick.equals(nick)) {
                String nombre = JOptionPane.showInputDialog(null, "1. Modificar nombre\n", JOptionPane.INFORMATION_MESSAGE);
                String rol = JOptionPane.showInputDialog(null, "1. Modificar rol\n", JOptionPane.INFORMATION_MESSAGE);
                String telefono = JOptionPane.showInputDialog(null, "1. Modificar telefono\n", JOptionPane.INFORMATION_MESSAGE);
                aux.nombre = nombre;
                aux.rol = rol;
                aux.telefono = telefono;
                
                repetido = true;
                
            }
            

            aux = aux.siguiente;

        } while (aux != null && aux.nombre != nick);
        if (repetido =false) {
                JOptionPane.showMessageDialog(null, "no se encontro el dato");
        }

    }
    
    public static  boolean confirmar(String no){
        Nodo_C aux = inicio;
        boolean paso = false;
        do {
            if (aux.nick.equals(no)) {
                paso = true;
            }else{
                paso = false;
            }
            
        } while (aux != null);
        return paso;
    }
    

}
