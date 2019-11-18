/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrian.javier.eduardo.alvaro;

/**
 * Aqui se definen los puntos repartidos al personaje.
 *
 * @author adrian
 * @author javier
 * @author eduardo
 * @author alvaro
 */
public class FuncionesAJEA {

    public static String nombre = "AJEA";//Nombre del personaje
    public static byte velocidad = 60;//velocidad 0-100 jugador
    public static byte fuerza = 80;//fuerza 0-100 jugador
    public static byte intuicion = 40;//intuicion 0-100 jugador
    public static byte percepcion = 20;//percepcion 0-100 jugador
/**
 * Esta funcion comprueba que el personaje tiene bien repartido los puntos
 * @param velocidad 0-100 jugador
 * @param fuerza 0-100 jugador
 * @param intuicion 0-100 jugador
 * @param percepcion 0-100 jugador
 * @return Devuelve true si es correcto o false, en funcion de sis esta bien o no repertido los puntos
 */
    public static boolean comprobarCoherencia(byte velocidad, byte fuerza, byte intuicion, byte percepcion) {

        int total = velocidad + fuerza + intuicion + percepcion;
        if (total == 200) {

            return true;
        } else {
           return false;
        }

    }
}
