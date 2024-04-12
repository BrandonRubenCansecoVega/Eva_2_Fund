/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_for;

/**
 *
 * @author rubra
 */
public class EVA2_18_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //INICIO; CONDICION; INCREMENTO/DECREMENTO
        for(int i = 1; i <= 10; i++){
            //LLAVES SON OPCIONALES,USENLAS CUANDO
            //TENGAN MAS DE UNA INSTRUCCION A REPETIR
            System.out.print(i + " - ");
        }
        System.out.println("");
        for(int i = 10; i >= 1; i--){
            //LLAVES SON OPCIONALES,USENLAS CUANDO
            //TENGAN MAS DE UNA INSTRUCCION A REPETIR
            System.out.print(i + " - ");     
        }
        //IMPRIMIR TODOS LOS NUMEROS PARES ENTRE 0 Y 100 
        //0, 2 4 6 8 10 
        System.out.println("");
        for(int i = 0; i <= 100; i+=2){
            System.out.print(" - ");
        }
    }
    
}
