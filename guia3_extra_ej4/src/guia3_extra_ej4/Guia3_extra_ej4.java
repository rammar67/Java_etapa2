/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se 
   muestre su equivalente en romano.
 */
package guia3_extra_ej4;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Guia3_extra_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num; 
       String opc="";
       //do{
       System.out.println("Ingrese un numero");
       num = input.nextInt();
       //}while(num<0) && (num>10);
       
        switch(num){
            case 1:
                    opc="I";
                    System.out.println(opc);
                            break;
            case 2:
                    opc="II";
                    System.out.println(opc);        
                    break;
            case 3:
                    opc="III";
                    System.out.println(opc);
                            break;
            case 4:
                    opc="IV";
                    System.out.println(opc);        
                            break;
            case 5:
                    opc="V";
                    System.out.println(opc);        
                            break;   
            case 6:
                    opc="VI";
                    System.out.println(opc);        
                            break; 
            case 7:
                    opc="VII";
                    System.out.println(opc);        
                            break;  
            case 8:
                    opc="VIII";
                    System.out.println(opc);        
                            break;  
            case 9:
                    opc="IX";
                    System.out.println(opc);  
                            break;
            case 10:
                    opc="X";
                    System.out.println(opc);        
                            break;               
                                    
       }
    }
    
}
