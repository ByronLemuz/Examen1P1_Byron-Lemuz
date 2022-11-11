/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1.byronlemuz;

import java.util.Scanner;

/**
 *
 * @author lesly
 */
public class Examen1P1Byronlemuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner lea = new Scanner(System.in);{
        
        boolean menu = true;

        while (menu == true) {//Byron Lemuz
            System.out.println("****Menu****");
            System.out.println("1) Ejercicio 1");
            System.out.println("2) Ejercicio 2");
            System.out.println("3) Ejercicio 3");
            System.out.println("4) Salir");
            System.out.println("-------------------------");
            System.out.print("ingrese la opcion que desee: ");
            int opcion = lea.nextInt();

            switch (opcion) {//Byron Lemuz

                case 1: {
                    System.out.println("Ingrese una cadena: ");
                    String conjunto1 = lea.nextLine();
                    System.out.println("Cadena cifrada: ");
                    String conjunto2 = lea.nextLine();
                    ejercicio1(conjunto1, conjunto2);
                    
                    
                break;
                }

                
                case 2: {

                }
                break;
                case 3: {

                }
                break;
                case 4: {
                    menu = false;
                }
                default:
                    System.out.println("La opcion que ingreso no es valida");

            }

        }
    }
    }
    public static void ejercicio1(String conjunto1, String conjunto2) {
        
        int contador = 0;
        
        boolean opc;
        while (opc=true) {
             System.out.println("Ingrese el conjunto A:");
        }
  
        if (conjunto1.length() > conjunto2.length()) {

            for (int i = 0; i < conjunto2.length(); i++) {
                for (int j = 0; j < conjunto1.length(); j++) {
                    if (conjunto2.charAt(i) == conjunto2.charAt(j)) {
                        contador++;
                    }
                }

            }
            if (contador >= conjunto2.length()) {
                System.out.println("Ambos conjuntos son iguales");
            } else {
                System.out.println("No son iguales");
            }
        } else if (conjunto2.length() > conjunto1.length()) {

            for (int i = 0; i < conjunto1.length(); i++) {
                for (int j = 0; j < conjunto2.length(); j++) {
                    if (conjunto1.charAt(i) == conjunto2.charAt(j)) {
                        contador++;
                    }
                }

            }
            if (contador >= conjunto1.length()) {
                System.out.println("Ambos conjuntos son iguales");
            } else {

                System.out.println("No son iguales");
                
            }
        }
    }
public static void ejercicio2(){


        System.out.print("Ingrese un numero : ");
        int largo = lea.nextInt();
        System.out.print("Ingrese una caracter1: ");
        char palabra = (char) lea.nextline();
        int num = (int) palabra;
        System.out.println("-------------------------");
        int n = 0;
        if(n >= 0 && n<=50) {
            //Linea superior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
           
            //centro de la forma
            for(int i = 0; i < n*2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           
            //Linea inferior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
}

}}}
