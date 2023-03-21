/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ext_ej6;

/**
 *
 * @author Usuario
 */
public class Guia5_ext_ej6 {

    /**
     * cargo la matriz horizontalmente
     */
    public static void horizontal(String sopa[][], String palabra, int f, int c){
    for (int i=0; i<palabra.lenght(); i++){
         sopa[f][c+i]=""+palabra.charAt(i);
    }
    }
    
    // visualizo la matriz
    public satic void ver_matriz(sopa[][]){
    for (int i=0; i<sopa.length;i++){
    for (int k=0; k<sopa.length; k++){
        System.out.print(""+sopa[i][k]);
    }
        System.out.println("");
    }
    }
            
    
    public static void main(String[] args) {
        // TODO code application logic here
        int fila=20;
        int columna=20;
        String sopa[][]=new String[fila][columna];
        horizontal(sopa, palabra, 1,1)
        
                }
    
}
