/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Arreaga
 */
public class Panel2 extends JPanel {

    
    public Panel2(String nombre) {
        TitledBorder title;
        title = BorderFactory.createTitledBorder(nombre);
        this.setBorder(title);
        this.setSize(150,400);
        this.setLayout(new GridLayout());

    }

    public void Panel(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Boton boton = new Boton("dsf", "");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                int opcion = 0;
                String elemento;
                do {
                    try{
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "1. Nueva Boton\n"+
                                "2. Eliminar esta columna\n"+
                                "3. Modificar tarea\n"+
                                "4. Salir\n","Opciones",
                                JOptionPane.INFORMATION_MESSAGE));
                        
                        switch(opcion){
                            case 1:
                                elemento = JOptionPane.showInputDialog(null,
                                "Nombre de la columna","Nueva Columna",
                                JOptionPane.INFORMATION_MESSAGE);
                                
                                Listab.insertarNodob(elemento);
                                break;
                            case 2:
                                
                        }
                    }catch(Exception e){
                        
                    }
                } while (opcion !=5);
            }
        });

    }

    public static void agregarB(String tarea) {
        JButton boton = new JButton(tarea);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.out.println("hola");
            }

        });
    }
    
}
