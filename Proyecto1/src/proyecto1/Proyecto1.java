/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Arreaga
 */
public class Proyecto1 {

    static String[][] matrizInsumo = new String[50][8];
    static int id = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        InterfazP a = new InterfazP();
        a.setVisible(true);

    }

    public static void AgregarInsumo() {

        String nombre = Reg_Insumos.jTextField1.getText();
        int cantidad = Integer.parseInt(Reg_Insumos.jTextField2.getText());
        int minimo = Integer.parseInt(Reg_Insumos.jTextField3.getText());
        int maximo = Integer.parseInt(Reg_Insumos.jTextField4.getText());
        int costo = Integer.parseInt(Reg_Insumos.jTextField3.getText());
        String descp = Reg_Insumos.jTextArea1.getText();
        String direccion = Reg_Insumos.direccion;

        Producto entrada = new Producto(id, nombre, cantidad, minimo, maximo, costo, descp, direccion);

        matrizInsumo[id][0] = id + "";
        matrizInsumo[id][1] = nombre;
        matrizInsumo[id][2] = cantidad + "";
        matrizInsumo[id][3] = minimo + "";
        matrizInsumo[id][4] = maximo + "";
        matrizInsumo[id][5] = costo + "";
        matrizInsumo[id][6] = descp;
        matrizInsumo[id][7] = direccion;

    }

    public static void matriz() {
        Proyecto1.id++;
        System.out.println("***********************************");
        for (int i = 0; i < 49; i++) {

            
                if (matrizInsumo[i][0] == null) {
                    System.out.print("");
                }else{
                    
                    System.out.println("PRODUCTO NO: " + i);
                    System.out.println("__________________________");
                    System.out.println("Id :          " + matrizInsumo[i][0]);
                    System.out.println("Nombre :      " + matrizInsumo[i][1]);
                    System.out.println("Cantidad :    " + matrizInsumo[i][2]);
                    System.out.println("Minimo :      " + matrizInsumo[i][3]);
                    System.out.println("Maximo :      " + matrizInsumo[i][4]);
                    System.out.println("Costo :       " + matrizInsumo[i][5]);
                    System.out.println("Descripcion : " + matrizInsumo[i][6]);
                    System.out.println("Direccion :   " + matrizInsumo[i][7]);
                    System.out.println("__________________________");
                }
            
        }
    }

    public static void mostrar_total() {

    }

}
