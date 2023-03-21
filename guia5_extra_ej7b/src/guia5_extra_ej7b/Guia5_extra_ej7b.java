/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_extra_ej7b;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia5_extra_ej7b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingree el numero de la secuencia de fibonaccin.");
        int n = leer.nextInt();
        int[] vector = new int[n];
        llenarvector(vector, n);
        mostrarVector(vector);
       

    }

    public static int Fibonacci(int n) {
       

        if (n <= 1 || n==0) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);

        }

    }

    public static void mostrarVector(int[] vector) {
        String aux1 = "";
        for (int elemento : vector) {
            aux1 += "[" + elemento + "]";
        }
        System.out.println(aux1);
    }

    public static void llenarvector(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = Fibonacci(i);
        }
    }
    
}
