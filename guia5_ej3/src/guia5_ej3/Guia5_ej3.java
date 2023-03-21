/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ej3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia5_ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int num = leer.nextInt();
        int[]vector = new int[num];
        int c1,c2,c3,c4,c5;
        c1 = 0;c2 = 0;c3 = 0;c4 = 0;c5 = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.floor(Math.random()*10000);
        }
        for (int i = 0; i < vector.length; i++) {
            
            String x = String.valueOf(String.valueOf(vector[i]).length());
            switch (x) {
                case "1":
                    c1++;
                    break;
                case "2":
                    c2++;
                    break;
                case "3":
                    c3++;
                    break;
                case "4":
                    c4++;
                    break;
                case "5":
                    c5++;
                    break;
               
            }
        }
        System.out.println("");
        if (c1 > 0) {
            System.out.println("Se contabilizaron " + c1 + " números de 1 digito");
        }
        if (c2 > 0) {
            System.out.println("Se contabilizaron " + c2 + " números de 2 digito");
        }
        if (c3 > 0) {
            System.out.println("Se contabilizaron " + c3 + " números de 3 digito");
        }
        if (c4 > 0) {
            System.out.println("Se contabilizaron " + c4 + " números de 4 digito");
        }
        if (c5 > 0) {
            System.out.println("Se contabilizaron " + c5 + " números de 5 digito");
        }
        
        
     
//        for (int i = 0; i < vector.length; i++) {
//            if (vector[i] > 1 && vector[i] < 10) {
//                
//            }else if(true){
//                
//            }
//        }
    }
    
}
