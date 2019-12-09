package ht1;

import java.util.Scanner;

public class Ht1 {

    public static void main(String[] args) {
        Ejercicios();
    }   
        ////Josue Alejandro Perez Benito    201712602
        ////Hugo Alexander Arreaga Choc     201701108
        
        ////12.111..
    static void Ejercicios() {
        System.out.println("");
        System.out.println("");
        System.out.println("Escriba el numero del ejercicio que desea");
        System.out.println("1.  Dígitos y multiplicidad de un número");
        System.out.println("2.  Días de una fecha");
        System.out.println("3.  Conversiones");
        System.out.println("4.  Edad y estatura");
        System.out.println("5.  Salir");
        Scanner sc = new Scanner(System.in);
        int seleccion = sc.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Escriba un numero");
                double numero = sc.nextDouble();
                double copia = numero;
                int digitos = 0;
                while (copia >= 1) {
                    copia = copia / 10;
                    digitos++;
                }
                System.out.println("Su numero posee     " + digitos + " digitos");
                
                int decimales = 0, entero;
                entero = (int)numero;
                while(numero>entero){
                numero*=10;
                decimales++;
                entero= (int)numero;
                }
                
                
                System.out.println("Su número posee     "+decimales+"  decimales");
                Ejercicios();
                break;
            case 2:
                System.out.println("Por favor escriba el día");
                int dia = sc.nextInt();
                System.out.println("Por favor escriba el mes");
                int mes = sc.nextInt();
                System.out.println("Por favor escriba el año");
                int anyo = sc.nextInt();
                switch (mes) {
                    case 1:
                        mes = 0;
                        break;
                    case 2:
                        mes = 31;
                        break;
                    case 3:
                        mes = 31 + 28;
                        break;
                    case 4:
                        mes = 31 * 2 + 28;
                        break;
                    case 5:
                        mes = 31 * 2 + 30 + 28;
                        break;
                    case 6:
                        mes = 31 * 3 + 28 + 30;
                        break;
                    case 7:
                        mes = 31 * 3 + 28 + 30 * 2;
                        break;
                    case 8:
                        mes = 31 * 4 + 28 + 30 * 2;
                        break;
                    case 9:
                        mes = 31 * 5 + 28 + 30 * 2;
                        break;
                    case 10:
                        mes = 31 * 5 + 28 + 30 * 3;
                        break;
                    case 11:
                        mes = 31 * 6 + 28 + 30 * 3;
                        break;
                    case 12:
                        mes = 31 * 6 + 28 + 30 * 4;
                        break;
                }

                int resultado = dia + mes;
                System.out.println("El resultado es:    " + resultado);
                Ejercicios();
                break;

            case 3:
                System.out.println("Escriba la longitud en pulgadas(pulg) a convertir");
                double longitud = sc.nextDouble();
                System.out.println("Ingrese el peso en Kilogramos(Kg) a convertir");
                double peso = sc.nextDouble();
                if (longitud < 0 || peso < 0) {
                    System.out.println("Valores negativos no son admitidos");
                    break;
                } else {
                    double cen = longitud * 2.54;
                    System.out.println(longitud + "   pulgadas es equivalente a  : " + cen + " centimetros");
                    double lib = peso * 2.20;
                    System.out.println(peso + "   Kilogramos es equivalente a :  " + lib + "  libras");
                }
                Ejercicios();
                break;
            case 4:
                System.out.println("Edad Alumno1");
                int edad1 = sc.nextInt();
                System.out.println("Altura Alumno1");
                double altura1 = sc.nextDouble();

                System.out.println("Edad Alumno2");
                int edad2 = sc.nextInt();
                System.out.println("Altura Alumno2");
                double altura2 = sc.nextDouble();

                System.out.println("Edad Alumno3");
                int edad3 = sc.nextInt();
                System.out.println("Altura Alumno3");
                double altura3 = sc.nextDouble();

                System.out.println("Edad Alumno4");
                int edad4 = sc.nextInt();
                System.out.println("Altura Alumno4");
                double altura4 = sc.nextDouble();

                System.out.println("Edad Alumno5");
                int edad5 = sc.nextInt();
                System.out.println("Altura Alumno5");
                double altura5 = sc.nextDouble();

                System.out.println("Edad Alumno6");
                int edad6 = sc.nextInt();
                System.out.println("Altura Alumno6");
                double altura6 = sc.nextDouble();

                System.out.println("");
                int mediaEdad = (edad1 + edad2 + edad3 + edad4 + edad5 + edad6) / 6;
                System.out.println("La media de las edades es:  " + mediaEdad);
                double mediaAltura = (altura1 + altura2 + altura3 + altura4 + altura5 + altura6) / 6;
                System.out.println("La media de las estaturas es:   " + mediaAltura);

                if (edad1 < 18) {
                    edad1 = 0;
                } else {
                    edad1 = 1;
                }
                if (edad2 < 18) {
                    edad2 = 0;
                } else {
                    edad2 = 1;
                }
                if (edad3 < 18) {
                    edad3 = 0;
                } else {
                    edad3 = 1;
                }
                if (edad4 < 18) {
                    edad4 = 0;
                } else {
                    edad4 = 1;
                }
                if (edad5 < 18) {
                    edad5 = 0;
                } else {
                    edad5 = 1;
                }
                if (edad6 < 18) {
                    edad6 = 0;
                } else {
                    edad6 = 1;
                }
                int m18 = edad1 + edad2 + edad3 + edad4 + edad5 + edad6;
                System.out.println("La cantidad de alumnos menores de 18 año es:    " + m18);

                if (altura1 < 1.70) {
                    altura1 = 0;
                } else {
                    altura1 = 1;
                }
                if (altura2 < 1.70) {
                    altura2 = 0;
                } else {
                    altura2 = 1;
                }
                if (altura3 < 1.70) {
                    altura3 = 0;
                } else {
                    altura3 = 1;
                }
                if (altura4 < 1.70) {
                    altura4 = 0;
                } else {
                    altura4 = 1;
                }
                if (altura5 < 1.70) {
                    altura5 = 0;
                } else {
                    altura5 = 1;
                }
                if (altura6 < 1.70) {
                    altura6 = 0;
                } else {
                    altura6 = 1;
                }

                double m170 = altura1 + altura2 + altura3 + altura4 + altura5 + altura6;
                System.out.println("La cantidad de alumnos mayores de 1.70 metros son:  " + m170);
                Ejercicios();
                break;
            case 5:
                System.out.println("Ha salido del programa");
                break;
        }
    }

}
