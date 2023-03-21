/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ej5;

/**
 *
 * @author Usuario
 */
public class Guia5_ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = {{0,-2,4},{2,0,2},{-4,-2,0}};

        int[][] matrizA = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {               
            matriz[i][j] = -10 + (int) (Math.random() * ((10 - (-10)) + 1));;
            //Math.random()*19-9
            }
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {               
                matrizA[j][i] = matriz[i][j];
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
        boolean aux = true;        
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matrizA[i][j]){
                    aux = false;
                    break;
                }
            }
        }
        if (aux) {
            System.out.println("Su matriz es antisimetrica");
        }else{
            System.out.println("Su matriz no es antisimetrica");
        }
    }
    
}
