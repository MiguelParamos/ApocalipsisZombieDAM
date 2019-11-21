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
     * ESTA FUNCIÓN RECOGE LAS VARIABLES: VELOCIDAD, FUERZA, INTUICION Y
     * PERCEPCION DEVUELVE VERDADERO, EN CASO DE QUE SEA EQUIVALENTE A 200 EN
     * CASO CONTRARIO, DEVUELVE FALSO
     *
     * @param velocidad indica la velocidad del jugador
     * @param fuerza indica la fuerza del jugador
     * @param intuicion indica la intuicion del jugador
     * @param percepcion indica la percepcion del jugador
     * @return
     */
    public static boolean comprobarCoherencia(Byte velocidad, Byte fuerza, Byte intuicion, Byte percepcion) {
        //Si todos los parametros son equivalentes a 200, devolverá verdadero, en caso contrario, falso
        return ((velocidad + fuerza + intuicion + percepcion == 200) ? true : false);
    }

     /**
     * ESTA FUNCIÓN RECOGE LA VELOCIDAD DE NUESTRO PERSONAJE, Y CALCULA LOS
     * METROS QUE PUEDE RECORRER, MEDIANTE UNA REGLA DE 3 PRErequisito: La
     * velocidad debe de estar entre 0 y 100 POSTrequisito: La velocidad máxima
     * va a ser 8 metros
     *
     * @param velocidad equivalente a la velocidad de nuestro zombie
     * @return v1, resultado de la regla de 3
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
    
     public static String accionReaccion(String accion) {
      
        if (accion.equalsIgnoreCase("nos aliamos y cogemos extintor")) {
        }
        return "Nos hemos aliado con AJEA, y hemos cogido extintores";
    }


    /**
     * ESTA FUNCIÓN PIDE EL NOMBRE, LA VELOCIDAD Y LA FUERZA DEL ATACANTE Y EL
     * ATACADO, SIMULANDO UN COMBATE ENTRE ELLOS Y COMPROBANDO CUAL VENCERÍA
     *
     * @param natacado nombre de atacado
     * @param vatacado velocidad del atacado
     * @param fatacado fuerza del atacado
     * @return natacante+natacado+op. Devuelve el nombre de atacante/atacado y
     * la vida que le ha restado el uno al otro.
     */
    public static String combate(String natacado, Byte vatacado, Byte fatacado) {

        //Variable que igualaremos a restafuer para ejecutar las distintas operaciones de manera condicional
        byte op = 0;
        //Calculamos la resta de la velocidad de ambos atacantes
        byte restavel = (byte) (FuncionesFIJA.velocidad - vatacado);
        //Calculamos el valor absoluto de la resta de la fuerza de ambos atacantes
        byte restafuer = (byte) Math.abs((byte) FuncionesFIJA.fuerza - (byte) fatacado);
        //Si la resta de la velocidad de ambos atacantes equivale a X modificados restafuer
        if (restavel > 30) {
            op = restafuer;
        }
        if (restavel > 0 || restavel < 30) {
            op = (byte) (restafuer / 2);
        }
        if (restavel > -30 || restavel < 0) {
            op = (byte) (restafuer / 3);
        }
        if (restavel < -30) {
            op = (byte) (restafuer * 0.8);
        }
        //Devolvemos el resultado del combate           
        return FuncionesFIJA.nombre + " ha atacado a " + natacado + " y le ha restado " + op + " puntos de vida.";
        }
}
