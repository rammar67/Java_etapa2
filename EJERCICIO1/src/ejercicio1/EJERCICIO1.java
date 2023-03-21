/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Usuario
 */

    import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int userName;
        int userName1;

        // Enter username and press Enter
        System.out.println("n1");
        userName = myObj.nextInt();

        System.out.println("n2");
        userName1 = myObj.nextInt();

        System.out.println(userName1 + userName);
    }
}    
  
    
