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
 * @author ivang
 * @author fparra
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
     * A FUNCIÓN RECOGE LAS VARIABLES VELOCIDAD, FUERZA, INTUICION Y PERCEPCION,
     * Y DEVUELVE VERDADERO EN CASO DE QUE SEA EQUIVALENTE A 200, EN CASO
     * CONTRARIO, DEVUELVE FALSO
     *
     * @param velocidad
     * @param fuerza
     * @param intuicion
     * @param percepcion
     * @return
     */
    public static boolean sumar200(Byte velocidad, Byte fuerza, Byte intuicion, Byte percepcion) {
        //SI TODOS LOS PARAMETROS SON IGUALES A 200, LA FUNCIÓN DEVOLVERÁ TRUE
        return (velocidad + fuerza + intuicion + percepcion == 200 ? true : false); 

    }
}
