/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafa.kevin.salva.hugo;

/**
 *  En esta clase se define los puntos repartidos de nuestro personaje que se llama Abascal
 * @author Salva
 * @author Rafa
 * @author Hugo
 * @author Kevin
 */
public class FuncionesHSRK {
    public static String nombre = "Abascal";//Nombre del jugador 0-100
    public static byte velocidad=70;//Velocidad del jugador 0-100
    public static byte fuerza=70;//Fuerza del jugador 0-100
    public static byte intuicion=30;//Intuicion del jugador 0-100
    public static byte percepcion=30;//Percepcion del jugador 0-100
    
    public static boolean comprobarCoherencia(byte velocidad,byte fuerza,byte intuicion,byte percepcion){
        boolean comprobar = false;
        if (velocidad+fuerza+intuicion+percepcion == 200) {
            comprobar = true;
        }
        return comprobar;
    }
}
