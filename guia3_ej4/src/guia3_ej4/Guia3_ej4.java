/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra 
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de
Java.
 */
package guia3_ej4;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Guia3_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = input.next();
        
        String letraSola = palabra.substring(0,1);
        
        if (letraSola.equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
           
        }
    }
    
}
