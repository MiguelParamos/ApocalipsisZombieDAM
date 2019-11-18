/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package francisco.cristina.maria.jaime;

/**
 * Esta clase define los atributos de los personajes
 *
 * @author Jaime
 * @author Cristina
 * @author María
 * @author Francisco
 */
public class FuncionesFCMJ {

    public static String nombre = "Heusequio";//nombre del jugador
    public static byte fuerza = 60;//Fuerza 0-100 del jugador
    public static byte velocidad = 70;//Velocidad 0-100 del jugador
    public static byte percepcion = 40;//Percepción 0-100 del jugador
    public static byte intuicion = 30;//Intuicción 0-100 del jugador

    /**
     * Función que comprueba si la suma total de los atributos es 200.
     * @param velocidad
     * @param fuerza
     * @param intuicion
     * @param percepcion
     * @return  Devuelve true en caso de que la suma sea 200 y false si no lo es.
     */
    public static boolean comprobarCoherencia(byte velocidad, byte fuerza, byte intuicion, byte percepcion) {
        if ((velocidad + fuerza + intuicion + percepcion) == 200) {
            return true;
        }
        return false;
    }

}
