/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author rubra
 */
public class EVA_2_4_VENTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int canti, sald;
        Scanner captu = new Scanner(System.in);
        System.out.println("CUANTAS PIEZAS QUIERE COMPRAR?");
        canti = captu.nextInt();
        
        if (canti >= 1000) //verdadero 
            sald = canti * 500;
        else     // Falso-opcional 
            sald = canti * 800;
        System.out.println("EL SALDO ES:" + sald);
    }
    
}
