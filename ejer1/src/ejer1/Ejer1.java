/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in)
        int num1;
        int num2;

        // Enter username and press Enter
        System.out.println("ingrese un numero");
        num1 = numero.nextInt();

        System.out.println("ingrese otro numero");
        num2 = numero.nextInt();

        System.out.println(num1 + num2);
    }
}
