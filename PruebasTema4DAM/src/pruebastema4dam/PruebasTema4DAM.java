/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebastema4dam;

import java.util.Scanner;

/**
 *
 * @author Ccenec
 */
public class PruebasTema4DAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto="Hoy es martes, queda mucha semana";
        String[] nombres=new String[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < nombres.length-1; i++) {
            System.out.println("Dime tu nombre, persona "+i);
            nombres[i]=sc.nextLine();
        }
        System.out.println("Nombres:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i].toUpperCase());
        }
    }
    
}
