/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_for_2;

import java.util.Scanner;

/**
 *
 * @author rubra
 */
public class EVA2_19_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numAlum;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cuantos estudiantes tiene el grupo?");
        numAlum = captu.nextInt();
        //hay que capturar todas las calificaciones
        //
        for(int i = 1; i <= numAlum; i++){
           //i = 0
            System.out.println("Calificacion: ");
            int califa = captu.nextInt();
        }
    }
    
}
