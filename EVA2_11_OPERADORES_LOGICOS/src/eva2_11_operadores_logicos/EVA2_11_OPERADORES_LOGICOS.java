/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_operadores_logicos;

/**
 *
 * @author rubra
 */
public class EVA2_11_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean hayDinero, hayBuenClima;
        //PARA HACER LA CARNE ASADA SE NECESITA
        //HAYA DINERO Y BUEN CLIMA
        hayDinero = false;
        hayBuenClima = false;
        
        System.out.println("1.NO HAY DINERO Y NO HAY BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("LLAMA");
         hayDinero = false;
        hayBuenClima = true;
        
        System.out.println("2.NO HAY DINERO Y HAY BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("LLAMA");
          hayDinero = true;
        hayBuenClima = false;
        
        System.out.println("3.HAY DINERO Y NO HAY BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("LLAMA");
          hayDinero = true;
        hayBuenClima = true;
        
        System.out.println("4.HAY DINERO Y HAY BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("LLAMA");
    }
    
}
