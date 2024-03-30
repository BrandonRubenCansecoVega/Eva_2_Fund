/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author rubra
 */
public class EVA2_10_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          double moneda;
          int adivinar;
          Scanner captu = new Scanner(System.in);
          System.out.println("Cara(0) o Cruz(1)?");
        adivinar = captu.nextInt();
        
        moneda = Math.random();
        System.out.println("El valor de moneda = ");
        
        //0.5 es la mitad del rango, > 0.5 CARA, MENOR ES CRUZ
        if(moneda > 0.5 && adivinar == 0)
            System.out.println("Adivinaste, es cara!!");
        else 
            if(moneda < 0.5 && adivinar == 1)
                System.out.println("perdiste:(");
        
        
    }
    
}
