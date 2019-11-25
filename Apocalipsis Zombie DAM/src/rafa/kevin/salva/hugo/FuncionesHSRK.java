/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafa.kevin.salva.hugo;

/**
 * En esta clase se define los puntos repartidos de nuestro personaje que se
 * llama Abascal
 *
 * @author Salva
 * @author Rafa
 * @author Hugo
 * @author Kevin
 */
public class FuncionesHSRK {

    public static String nombre = "Abascal";//Nombre del jugador 0-100
    public static byte velocidad = 70;//Velocidad del jugador 0-100
    public static byte fuerza = 70;//Fuerza del jugador 0-100
    public static byte intuicion = 30;//Intuicion del jugador 0-100
    public static byte percepcion = 30;//Percepcion del jugador 0-100
    public static byte vida = 100; // Vida del jugador 0-100

    /**
     * Esta función comprueba si la suma de los cuatro parámetros es igual a 200
     * y devuelve un boolean al respecto.
     *
     * @param velocidad es la velocidad que tiene el personaje de 0-100
     * @param fuerza es la fuerza que tiene el personaje de 0-100
     * @param intuicion es la intuicion que tiene el personaje de 0-100
     * @param percepcion es la percepcion que tiene el personaje de 0-100
     * @param vida es la vida del personaje de 0-100
     * @return Devuelve un boolean verdadero si suman 200, falso si no.
     */
    public static boolean comprobarCoherencia(byte velocidad, byte fuerza, byte intuicion, byte percepcion) {
        return velocidad + fuerza + intuicion + percepcion == 200;
    }

   /** En esta funcion vemos la acción que se va a realizar. Dependiendo de la percepcion del personaje veremos una 
    * cosa u otra.
    * 
    * @param turno El numero de turno.
    * @param accion Lo que el personaje va a hacer. En este caso mirar por la ventana.
     * @param percepcion Dependiendo de la percepción de los personajes sucede una cosa u otra.
    * @return Devuelve lo que sucede dependiendo de la percepción.
    */
    public static String accionReaccion(byte turno, String accion, byte percepcion) {
        if (turno == 1) {
            if (accion.equals("mirar por la ventana")) {
                if (percepcion < 50) {
                    return ("No veo nada");

                } else if (percepcion >= 50 && percepcion < 80) {
                    return ("Veo alboroto en general");

                } else{
                    return ("Veo gente corriendo en la plaza de la derecha");
                }
            }
        }
        return null;  

    }
    public static String accionReaccion (byte turno, String accion){
        if (turno ==2) {
            if (accion.equals ("preguntar que esta pasando")){
                return "nadie dice nada";
            }
        }else if (turno == 3){
            if (accion.equals ("amenazar a Aitor Tilla")){
                return "Aceptamos la coalición";
            }
        }else if (turno == 4){
            if (accion.equals ("preguntar telefono")){
                return "Le preguntamos a Aitor Tilla que hay en su teléfono.";
            }
        }
        
        return null;
           
    }
    /**
     * Esta función valora la posibilidad de robarle el teléfono a uno de los personajes, comparando con la velocidad y la fuerza de ambos.
     * 
     * @param turno turno en el que se realiza la accion
     * @param nombre_Atracar personaje al que atacamos
     * @param mi_vel mi velocidad
     * @param su_vel su velocidad
     * @param mi_fuerza mi fuerza
     * @param su_fuerza su fuerza
     * @return 
     */
    public static String robarObjeto(String nombre_Atracar, byte mi_vel, byte su_vel, byte mi_fuerza, byte su_fuerza){
        if(mi_vel >= su_vel && mi_fuerza >= su_fuerza){
            return "Le quito el objeto a Aitor Torilla";
        } else {
            return "No logro quitárselo. Me pregunta ¿Qué estás haciendo?";
        }
    }
}
