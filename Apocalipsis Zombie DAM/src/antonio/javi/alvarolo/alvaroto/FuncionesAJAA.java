/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antonio.javi.alvarolo.alvaroto;

/**
 *Clase que describe las cualidades de un personaje
 * @author Alvaro Torres
 * @author Javier R
 * @author Alvaro Lopez
 * @author Antonio Calvente
 */
public class FuncionesAJAA {

    public static String nombre = "Aitor Tilla";// Nombre del jugador
    public static byte velocidad =75 ;// velocidad del personaje de 0 a 100
    public static byte fuerza =25 ;// fuerza del personaje de 0 a 100
    public static byte intuición =25 ;// intuicion del personaje de 0 a 100
    public static byte percepción =75 ;// percepcion del personaje de 0 a 100
    
    /**
     * Comprobamos que la suma total de los atributos es exactamente 200, devuelve un booleano.
     * @param velocidad velocidad del personaje
     * @param fuerza fuerza del personaje
     * @param intuición intuicion del persnaje
     * @param percepción percepcion del personaje
     * @return 
     */
    public static boolean comprobarCoherencia(byte velocidad,byte fuerza, byte intuición, byte percepción){
        boolean suma= false;
        if(velocidad+fuerza+intuición+percepción==200){
            suma=true;
            
        }
        return suma;
    }

    
}
