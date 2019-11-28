package juan.fernando.alberto.ivan;

/**
 * Esta clase describirá los atributos y el nombre de nuestro personaje
 *
 * @author ivan
 * @author fernando
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
     * ESTA FUNCIÓN RECOGE LAS VARIABLES: VELOCIDAD, FUERZA, INTUICION Y PERCEPCION 
     * DEVUELVE VERDADERO, EN EL CASO DE QUE SEA EQUIVALENTE A 200 PUNTOS
     * Y EN CASO CONTRARIO, DEVUELVE FALSO
     * 
     * @param velocidad indica la velocidad del jugador
     * @param fuerza indica la fuerza del jugador
     * @param intuicion indica la intuicion del jugador
     * @param percepcion indica la percepcion del jugador
     * @return
     */
    public static boolean comprobarCoherencia(Byte velocidad, Byte fuerza, Byte intuicion, Byte percepcion) {
        //Si todos los parametros son equivalentes a 200 puntos, devolverá verdadero, sino, devuelve falso
        return ((velocidad + fuerza + intuicion + percepcion == 200) ? true : false);
    }

    /**
     * ESTA FUNCIÓN RECOGE LA VELOCIDAD DE NUESTRO PERSONAJE, Y CALCULA LOS
     * METROS QUE PUEDE RECORRER, MEDIANTE UNA REGLA DE 3 PREREESCRITO: 
     * LA VELOCIDAD DEBE DE ESTAR ENTRE 0 Y 100 POSTREESCRITO
     * LA VELOCIDAD MÁXIMA VA A SER 8 METROS
     *
     * @param velocidad equivalente a la velocidad de nuestro zombie
     * @return v1, resultado de la regla de 3 calculada
     */
    public static Byte desplazamiento(Byte velocidad) {
        byte v1;
        v1 = (byte) ((velocidad * 8) / 100);
        return v1;
    }

    public static String recoger(String objeto) {
        int p1 = 0;
        if (objeto.equalsIgnoreCase("Piedras")) {
            p1 = (int) ((FuncionesFIJA.fuerza * 20) / 100);
        }
        return "Podemos utilizar un núumero total de " + p1 + " piedras";
    }
    
     /**
     * INTRODUCE UNA ACCIÓN Y DEVUELVE UNA CONSECUENCIA
     *
     * @param turno valor del iterador es el que indica el turno del juego
     * @param accion es la decision que se toma en cada turno
     * @return devuelve la consecuencia de tomar la acción
     *  
     */
        public static String accionReaccion(Byte turno, String accion) {

        if (turno == 4) {
            return "Nos hemos aliado con AJEA";
        }
        if (turno == 5) {
            return " Cabrón ";
        }
        if (turno == 6) {
            return " Que me han tirado una piedra en la cabeza ";
        }
        return "";
    }
    
     /**
     * ESTA FUNCIÓN PIDE EL NOMBRE, LA VELOCIDAD Y LA FUERZA DEL ATACANTE 
     * Y DEL ATACADO, SIMULANDO UN COMBATE ENTRE ELLOS Y REALIZA 
     * LOS CÁLCULOS REALIZADOS POR EL COMBATE DE PERSONAJES
     *
     * @param nAtacante es el nombre del personaje que ataca
     * @param nAtacado es el nombre del que es atacado
     * @param vAtacante es la velocidad del que ataca
     * @param vAtacado es la velocidad del que es atacado
     * @param fAtacante es la fuerza del que ataca
     * @param fAtacado es la fuerza del que es atacado
     * @return devuelve un string con los resultados del combate
     */
    public static String combate(String nAtacante, String nAtacado, byte vAtacante, byte vAtacado, byte fAtacante, byte fAtacado) {

        byte restaVelocidad = (byte) (vAtacante - vAtacado);
        byte restaFuerza = (byte) (Math.abs(fAtacante - fAtacado));
        
        if (restaVelocidad > 30) {
            return nAtacante + " ataca a " + nAtacado + " y le quita " + restaFuerza + " puntos de vida.";
        }
        if (restaVelocidad < 30 && restaVelocidad > 0) {
            return nAtacante + " ataca a " + nAtacado + " y le quita " + (restaFuerza / 2) + " puntos de vida.";
        }
        if (restaVelocidad <= 0 && restaVelocidad >= -30) {
            return nAtacante + " ataca a " + nAtacado + " y le quita " + (restaFuerza / 3) + " puntos de vida.";
        }
        return nAtacante + " ataca a " + nAtacado + " y le quita " + (restaFuerza * 0.8) + " puntos de vida.";
    }
}
