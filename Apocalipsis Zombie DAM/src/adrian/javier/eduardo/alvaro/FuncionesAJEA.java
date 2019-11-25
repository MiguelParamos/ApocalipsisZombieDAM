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
     * (máx 200)
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
     * Hace una regla de tres para averiguar la distancia recorrida por el
     * personaje.
     *
     * @param velocidad La velocidad que tiene el personaje.
     * @return Devuelve la distancia recorrida.
     */
    public static byte desplazamiento(byte velocidad) {
        return (byte) ((velocidad * 8) / 100);

    }

    /**
     * La funcion realiza los calculos relacionados con el combate
     *
     * @param nombreAtacante el nombre del que ataca
     * @param nombreAtacado el nombre del que es atacado
     * @param velocidadAtacante la velocidad del que ataca
     * @param velocidadAtacado la velocidad del que es atacado
     * @param fuerzaAtacante la fuerza del que ataca
     * @param fuerzaAtacado la fuerza del que es atacado
     * @return devuelve un string con los resultados del combate
     */

    /**
     * La funcion realiza los calculos relacionados con el combate
     *
     * @param nombreAtacante el nombre del que ataca
     * @param nombreAtacado el nombre del que es atacado
     * @param velocidadAtacante la velocidad del que ataca
     * @param velocidadAtacado la velocidad del que es atacado
     * @param fuerzaAtacante la fuerza del que ataca
     * @param fuerzaAtacado la fuerza del que es atacado
     * @return devuelve un string con los resultados del combate
     */
    public static String combate(String nombreAtacante, String nombreAtacado, byte velocidadAtacante, byte velocidadAtacado, byte fuerzaAtacante, byte fuerzaAtacado) {

        byte restaVel = (byte) (velocidadAtacante - velocidadAtacado);

        byte restaFuer = (byte) (Math.abs(fuerzaAtacante - fuerzaAtacado));

        if (restaVel > 30) {

            return nombreAtacante + " ataca a " + nombreAtacado + " y le quita: " + restaFuer + " de vida";

        }
        if (restaVel < 30 && restaVel > 0) {
            return nombreAtacante + " ataca a " + nombreAtacado + " y le quita: " + restaFuer / 2 + " de vida";

        }
        if (restaVel <= 0 && restaVel >= -30) {

            return nombreAtacante + " ataca a " + nombreAtacado + " y le quita: " + restaFuer / 3 + " de vida";

        }

        return nombreAtacante + " ataca a " + nombreAtacado + " y le quita: " + restaFuer * 0.8 + " de vida";

    }



/**
 * Se introduce una acción y se devuelve la consecuencia del turno
 *
 * @param turno valor del iterador referido al turno de juego.
 * @param accion es la decision que se toma en cada turno.
 * @return Devuelve lo que pasa al tomar la acción.
 */
public static String accionReaccion(byte turno, String accion) {
        if (turno == 3) {
            if (accion.equalsIgnoreCase("intentan entrar en secretaria")) {
                return "No puedo entrar. Está cerrado";

            }
        }
        else if (turno == 4) {
            if (accion.equalsIgnoreCase("alianza y cogen extintores")) {
                return "Piden a luis alberto trabajar juntos y cogen extintores";

            }
        }else if (turno == 5) {
            if (accion.equalsIgnoreCase("Le pegamos con el extintor en toda la cabeza")) {
                return " recibe un extintorazo, y nos grita: hijo p**a, me ha dolio ";

            }
        }
        return "";
    }


}

