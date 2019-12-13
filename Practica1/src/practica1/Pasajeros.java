/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Arreaga
 */
public class Pasajeros {
    int maletas;
    int documentos;
    int turnos_reg;
    int id;

    public int getMaletas() {
        return maletas;
    }

    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }

    public int getDocumentos() {
        return documentos;
    }

    public void setDocumentos(int documentos) {
        this.documentos = documentos;
    }

    public int getTurnos_reg() {
        return turnos_reg;
    }

    public void setTurnos_reg(int turnos_reg) {
        this.turnos_reg = turnos_reg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Pasajeros(){
        maletas = 0;
        documentos = 0;
        turnos_reg = 0;
        id = 0;
    }
    public Pasajeros(int maletas, int documentos, int turnos_reg, int id){
        this.maletas = maletas;
        this.documentos = documentos;
        this.turnos_reg = turnos_reg;
        this.id = id;
    }
    
}
