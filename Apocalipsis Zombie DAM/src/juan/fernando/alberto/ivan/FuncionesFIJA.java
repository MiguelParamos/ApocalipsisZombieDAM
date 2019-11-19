/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juan.fernando.alberto.ivan;

import java.util.Scanner;

/**
 * Esta clase describirá los atributos y el nombre de nuestro personaje
 *
 * @author ivan
 * @author fernando
 * @author juan
 * @author alberto
 */
public class FuncionesFIJA {

    public static String nombre = "Luis Alberto"; //Nombre del Jugador
    public static byte velocidad = 50; //Velocidad 0-100 del jugador
    public static byte fuerza = 90;  //Fuerza 0-100 del jugador
    public static byte intuicion = 30; //Intuición 0-100 del jugador
    public static byte percepcion = 30; //Percepción 0-100 del jugador

    /**
     * ESTA FUNCIÓN RECOGE LAS VARIABLES: VELOCIDAD, FUERZA, INTUICION Y PERCEPCION
     * DEVUELVE VERDADERO, EN CASO DE QUE SEA EQUIVALENTE A 200 SINO, DEVUELVE FALSO 
     * @param velocidad indica la velocidad del jugador
     * @param fuerza indica la fuerza del jugador
     * @param intuicion indica la intuicion del jugador
     * @param percepcion indica la percepcion del jugador
     * @return
     */
    public static boolean comprobarCoherencia(Byte velocidad, Byte fuerza, Byte intuicion, Byte percepcion) {
        //Si todos los parametros son equivalentes a 200, devolverá verdadero, en caso contrario, falso
        return ((velocidad + fuerza + intuicion + percepcion == 200) ? true : false);
    }
    
   /**
    * ESTA FUNCIÓN RECOGE LA VELOCIDAD DE NUESTRO PERSONAJE, Y CALCULA LOS METROS QUE PUEDE RECORRER, MEDIANTE UNA REGLA DE 3 
    * @param velocidad
    * @return v1
    */
    public static Byte desplazamiento (Byte velocidad){
       byte v1;
       v1=(byte) ((velocidad*8)/100);
      return v1;
    }
    
    
 }

