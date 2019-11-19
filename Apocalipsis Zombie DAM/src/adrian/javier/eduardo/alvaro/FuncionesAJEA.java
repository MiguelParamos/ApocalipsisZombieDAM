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
     * Esta funcion comprueba que el personaje tiene bien repartido los puntos (máx 200)
     *
     * @param velocidad 0-100 jugador
     * @param fuerza 0-100 jugador
     * @param intuicion 0-100 jugador
     * @param percepcion 0-100 jugador
     * @return Devuelve true si es correcto o false, en funcion de si esta bien
     * o no repertido los puntos
     */
    public static boolean comprobarCoherencia(byte velocidad, byte fuerza, byte intuicion, byte percepcion) {

        return (velocidad + fuerza + intuicion + percepcion == 200);

    }
    /**
     * Hace una regla de tres para averiguar la distancia recorrida por  el personaje.
     * @param velocidad La velocidad que tiene el personaje.
     * @return Devuelve la distancia recorrida.
     */
    public static byte desplazamiento(byte velocidad) {
    return (byte)((velocidad*8)/100);
 
    }
    
    public static String accionReaccion(byte turno, String accion) {
        if (turno == 3) {
            if (accion.equals("intentan entrar en secretaria")) {
                    return "No puedo entrar. Está cerrado";
             
        }
        }

