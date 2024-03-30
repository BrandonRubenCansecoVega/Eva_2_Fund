/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_if2;

import java.util.Scanner;

/**
 *
 * @author rubra
 */
public class EVA2_5_IF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPTURAR TEMPERATURA
        int temp;
        Scanner captu = new Scanner(System.in);
        //captura TEMPERATURA 
        System.out.println("temperatura (ºc): ");
        temp = captu.nextInt();
        //VAMOS A EVALUAR
        //SI LA TEMPERATURA ES MAYOR A 22º, SE ENCIENDE EL CLIMA 
        if(temp > 22)
            System.out.println("ENCENDER EL AIRE");
    }
    
}
