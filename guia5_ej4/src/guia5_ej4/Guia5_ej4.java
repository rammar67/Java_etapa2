/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ej4;

/**
 *
 * @author Usuario
 */
public class Guia5_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int [4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {               
            matriz[i][j] = (int) Math.floor(Math.random()*10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {               
                System.out.print(matriz[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {               
                System.out.print(matriz[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
    
}
