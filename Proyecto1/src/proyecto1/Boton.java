/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Arreaga
 */
public class Boton extends JButton{
    Integer id;
    
    public Boton(String nombre, String dato){
        super(nombre);
        addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evt){
                    ejecutarDato(evt, dato);
                }
            });
    }
    
    public void ejecutarDato(ActionEvent evt, String dato){
        
    }
    
}
