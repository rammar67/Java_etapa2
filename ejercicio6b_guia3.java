/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_ejercicios_java.intro.p2_.estructuras.de.control;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class e6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Realizar un programa que pida dos números enteros positivos por
        teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
        una opción y el programa deberá mostrar el resultado por pantalla y
        luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
        vez de salir del programa directamente, se debe mostrar el siguiente
        mensaje de confirmación: ¿Está seguro que desea salir del programa
        (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
        contrario se vuelve a mostrar el menú*/
        
        Scanner ingresar = new Scanner(System.in);
        int opcion;
        do {
           
            System.out.println("--------------MENU---------------------");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            int numero1;
            int numero2;
            
            opcion = ingresar.nextInt();
            switch (opcion){
                case 1:
                    int suma;
                    System.out.println("ingrese un numero:");
                    numero1 = ingresar.nextInt();
                    System.out.println("ingrese un numero:");
                    numero2 = ingresar.nextInt();
                    suma = numero1+numero2;
                    System.out.println("Suma: "+ suma);
                case 2:
                    int resta;
                    System.out.println("ingrese un numero:");
                    numero1 = ingresar.nextInt();
                    System.out.println("ingrese un numero:");
                    numero2 = ingresar.nextInt();
                    resta = numero1-numero2;
                    System.out.println("Resta: "+ resta);
                case 3:
                    int multiplicacion;
                    System.out.println("ingrese un numero:");
                    numero1 = ingresar.nextInt();
                    System.out.println("ingrese un numero:");
                    numero2 = ingresar.nextInt();
                    multiplicacion = numero1*numero2;
                    System.out.println("Multiplicacion: "+multiplicacion);
                case 4:
                    double division;
                    System.out.println("ingrese un numero:");
                    numero1 = ingresar.nextInt();
                    System.out.println("ingrese un numero:");
                    numero2 = ingresar.nextInt();
                    division = numero2/numero1;
                    System.out.println("division: "+ division);
                case 5:
                    System.out.println("¿Esta seguro que desea salir del menu?");
                    System.out.println("1-si / 2-No");
                    opcion= ingresar.nextInt();
                    if(opcion==1){
                        break ;
 
                    }
                    
            }
            
           
            
        } while (opcion == 5);
        
        
        
        
        
        
    }
    
}
