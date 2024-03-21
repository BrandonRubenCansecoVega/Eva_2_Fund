/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_califa_eu;

import java.util.Scanner;

/**
 *
 * @author rubra
 */
public class EVA2_14_CALIFA_EU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce tu calificacion (o - 100)");
        Califa = captu.nextInt();
        if(Califa >= 90 && Califa <= 100)
            System.out.println("Sacaste: A");  
        else if (Califa >= 80 && Califa <= 89)
            System.out.println("Sacaste: B");
        else if (Califa >= 70 && Califa <= 79)
            System.out.println("Sacaste: C");
        else if (Califa >= 60 && Califa <= 69)
            System.out.println("Sacaste: D");
        else if (Califa >= 0 && Califa <= 59)
            System.out.println("Sacaste: F");
        else 
            System.out.println("Esa calificacion no existe");
    }
    
}
