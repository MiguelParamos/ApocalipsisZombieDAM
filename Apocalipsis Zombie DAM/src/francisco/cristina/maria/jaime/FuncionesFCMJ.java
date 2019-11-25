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
    public static byte vida = 100; //Salud 0-100 del jugador

    /**
     * Función que comprueba si la suma total de los atributos es 200.
     *
     * @param velocidad esta es la velocidad del personaje entre 0 y 100.
     * @param fuerza esta es la fuerza del personaje entre 0 y 100.
     * @param intuicion esta es la intuicion del personaje entre 0 y 100.
     * @param percepcion esta es la percepcion del personaje entre 0 y 100.
     * @return Devuelve true en caso de que la suma sea 200 y false si no lo es.
     */
    public static boolean comprobarCoherencia(byte velocidad, byte fuerza, byte intuicion, byte percepcion) {
        if ((velocidad + fuerza + intuicion + percepcion) == 200) {
            return true;
        }
        return false;
    }

    /**
     * Función que recoge las acciones del turno 1, si te asomas a la ventana.
     *
     * @param turno Turno en el que te encuentras
     * @param accion Acción que realizas
     * @param percepcion Percepcion de tu peronaje de 0 a 100
     * @return De vuelve un String en función de tu percepción.
     */
    public static String accionReaccion(byte turno, String accion, byte percepcion) {
        if (turno == 1) {
            if (accion.equals("mirar por la ventana")) {
                if (percepcion < 50) {
                    return "no veo nada raro";
                } else if (percepcion >= 50 && percepcion < 80) {
                    return "veo alboroto en general";
                } else {
                    return "veo gente corriendo en la plaza de la derecha";
                }
            }
        }

        return "";
    }

    public static String accionReaccion(byte turno, String accion) {
        if (turno == 2) {
            if (accion.equals("pregunto a Aitor Tilla violentamente por qué cierran la ventana")) {
                return "no nos responde";
            }
        } else if (turno == 3) {
            if (accion.equals("amenazar a Aitor Tilla")) {
                return "aceptan la proposicion";
            }
        }else if (turno==5){
            if (accion.equals("Heusequio oye un ruido muy fuerte abajo. Aitor Tilla también lo oye.")){
                return "esperan a Aitor Tilla y a Abascal y cogen el extintor";
            }
       
    }
        return "";
}
}
