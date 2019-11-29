/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrian.javier.eduardo.alvaro;

import java.util.Random;

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
    public static byte percepcion = 20;//percepcion 0-100 jugador    EL 20
    public static byte vida = 100;//vida 0-100 jugador

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

        byte restaFuer = (byte) ((fuerzaAtacante - fuerzaAtacado) > 0 ? (fuerzaAtacante - fuerzaAtacado) : (byte) 0);

        if (restaVel > 30) {

            return nombreAtacante + " ataca a " + nombreAtacado + " y le quita: " + restaFuer + " de vida";

        }
        if (restaVel < 30 && restaVel > 0) {
            return nombreAtacante + " ataca a " + nombreAtacado + " y le quita: " + restaFuer / 2 + " de vida";

        }
        if (restaVel <= 0 && restaVel >= -30) {

            return nombreAtacado + " ataca a " + nombreAtacante + " y le quita: " + (restaFuer > 0 ? 0 : -restaFuer) / 2 + " de vida";

        }

        return nombreAtacado + " ataca a " + nombreAtacante + " y le quita: " + (restaFuer > 0 ? 0 : -restaFuer) + " de vida";

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
            if (accion.equals("intentan entrar en secretaria")) {
                return "No puedo entrar. Está cerrado";

            }
        } else if (turno == 4) {
            if (accion.equals("alianza y cogen extintores")) {
                return "Piden a luis alberto trabajar juntos y cogen extintores";

            }
        }
        return "";
    }
/**
 * Esta funcion se encarga de dar al personaje una serie de objetos provenientes de un array y dependiendo de su percepcion recibe mas o menos
 * @param percepcion La percepcion del personaje que determina la cantidad de objetos que recibe del Array items.
 * @param items Un array de tamaño cualquiera,que contiene los objetos que puede recibir el personaje
 * @return Se devuelve un String que tiene concatenado en si mismo varios(que son los objetos dentro del array items)
 */
    public static String buscar(byte percepcion, String[] items) {

        String resultado = "";
        Random aleatorio = new Random();//Es necesario una varible aleatoria para dar un objeto aleatorio al personaje
        int rand, contador;

        if (percepcion < 30) {//Para percepcion menor<30 se recibe un obeto del array

            contador = 1;
        } else if (percepcion >= 30 && percepcion <= 70) { //Para percepcion entre 30 y 70 se reciben dos objetos
            contador = 2;

        } else {//Si la percepcion es mayor a 70 se reciben tres objetos
            contador = 3;
        }

        for (int i = 0; i < contador; i++) {//Este bucle se vale de una variable random para en cada iteracion del mismo, dote al personaje de un objeto distinto.
            rand = aleatorio.nextInt(items.length);
            resultado = resultado + items[rand] + "+";
        }
        return resultado;
    }

}
