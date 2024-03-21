/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_switch;

import java.util.Scanner;

/**
 *
 * @author rubra
 */
public class EVA2_16_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el numero de mes");
        mes = captu.nextInt();
        
        switch(mes){
            case 1:
                System.out.println("Enero");
                //break;//Termina el switch
            case 2:
                System.out.println("Febrero");
                //break;//Termina el switch
            case 3:
                System.out.println("Marzo");
                //break;//Termina el switch
            case 4:
                System.out.println("Abril");
                //break;//Termina el switch
            case 5:
                System.out.println("Mayo");
                //break;//Termina el switch
            case 6:
                System.out.println("Junio");
                //break;//Termina el switch
            case 7:
                System.out.println("Julio");
                //break;//Termina el switch
            case 8:
                System.out.println("Agosto");
                //break;//Termina el switch
            case 9:
                System.out.println("Septiembre");
                //break;//Termina el switch
            case 10:
                System.out.println("Octubre");
                //break;//Termina el switch
            case 11:
                System.out.println("Noviembre");
                //break;//Termina el switch
            case 12:
                System.out.println("Diciembre");
                //break;//Termina el switch
            default:
                System.out.println("No existe ese mes");
                
        }
    }
    
}
