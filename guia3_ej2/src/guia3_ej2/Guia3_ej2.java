/*
 * TCrear un programa que pida una frase y si esa frase es igual a “eureka”
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
Incorrecto. Nota: investigar la función equals() en Java.

 */
package guia3_ej2;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Guia3_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = input.next();
         
        if(palabra.equals("eureka")){
             System.out.println("Correcto");
        }else{
             System.out.println("Incorrecto");
         }
    }
    
}
