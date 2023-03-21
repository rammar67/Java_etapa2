/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ej2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia5_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int num = leer.nextInt();
        int[]vector = new int[num];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.floor(Math.random()*10);
        }
        System.out.println("Ingrese el numero a buscar");
        num = leer.nextInt();
        int aux = 0;
        for (int i = 0; i < vector.length; i++) {
            if (num == vector[i]) {
                 aux++;
                 System.out.println("Su numero se encuentra en la posicion " + i);

            }
           
        }
        System.out.println("Su numero se encontro " + aux + " ves");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
        }
        System.out.println("");
    }
    
}
