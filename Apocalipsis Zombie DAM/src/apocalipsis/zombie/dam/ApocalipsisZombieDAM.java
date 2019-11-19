
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apocalipsis.zombie.dam;

import adrian.javier.eduardo.alvaro.FuncionesAJEA;
import juan.fernando.alberto.ivan.FuncionesFIJA;
import francisco.cristina.maria.jaime.FuncionesFCMJ;
import adrian.javier.eduardo.alvaro.FuncionesAJEA;
import antonio.javi.alvarolo.alvaroto.FuncionesAJAA;
import rafa.kevin.salva.hugo.FuncionesHSRK;

/**
 * Programa que simula el apocalipsis zombie en Cenec
 * @author Miguel Páramos
 */
public class ApocalipsisZombieDAM {

    /**
     * Función principal, donde se simula el apocalipsis
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte turno=0;
        String historia="";
        
        if(!FuncionesAJEA.comprobarCoherencia(FuncionesAJEA.velocidad, FuncionesAJEA.fuerza, FuncionesAJEA.intuicion, FuncionesAJEA.percepcion)){System.out.println(FuncionesAJEA.nombre+" es incoherente: No suma 200 puntos ");}
        if(!FuncionesAJAA.comprobarCoherencia(FuncionesAJAA.velocidad, FuncionesAJAA.fuerza, FuncionesAJAA.intuición, FuncionesAJAA.percepción)){System.out.println(FuncionesAJAA.nombre+" es incoherente: No suma 200 puntos ");}
        if(!FuncionesFCMJ.comprobarCoherencia(FuncionesFCMJ.velocidad, FuncionesFCMJ.fuerza, FuncionesFCMJ.intuicion, FuncionesFCMJ.percepcion)){System.out.println(FuncionesFCMJ.nombre+" es incoherente: No suma 200 puntos ");}
        if(!FuncionesFIJA.comprobarCoherencia(FuncionesFIJA.velocidad, FuncionesFIJA.fuerza, FuncionesFIJA.intuicion, FuncionesFIJA.percepcion)){System.out.println(FuncionesFIJA.nombre+" es incoherente: No suma 200 puntos ");}
        if(!FuncionesHSRK.comprobarCoherencia(FuncionesHSRK.velocidad, FuncionesHSRK.fuerza, FuncionesHSRK.intuicion, FuncionesHSRK.percepcion)){System.out.println(FuncionesHSRK.nombre+" es incoherente: No suma 200 puntos ");}
        
        turno++;
        historia+="Estamos todos en el aula 5 de cenec.\n Se escucha un grito desde la calle.\n-----------------------\n";
        historia+=FuncionesAJEA.nombre+": Sale corriendo para abajo. recorren "+FuncionesAJEA.desplazamiento(FuncionesAJEA.velocidad)+" metros. Estás en mitad de las escaleras\n";
        historia+=FuncionesFIJA.nombre+": Sale corriendo para abajo. recorren "+FuncionesFIJA.desplazamiento(FuncionesFIJA.velocidad)+" metros.  Estás en mitad de las escaleras\n";
        historia+=FuncionesAJAA.nombre+": Mira por la ventana. "+FuncionesAJAA.accionReaccion(turno,"mirar por la ventana",FuncionesAJAA.percepción)+"\n";
        historia+=FuncionesFCMJ.nombre+": Mira por la ventana. "+FuncionesFCMJ.accionReaccion(turno,"mirar por la ventana",FuncionesFCMJ.percepcion)+"\n";
        historia+=FuncionesHSRK.nombre+": Mira por la ventana. "+FuncionesHSRK.accionReaccion(turno,"mirar por la ventana",FuncionesHSRK.percepcion)+"\n";
        System.out.println(imprimirTurno(turno,historia));
        
        turno++;
        historia="Se escuchan muchos gritos desde la calle.\n Aitor Tilla se da cuenta de que vienen desde la derecha.";
        historia+=FuncionesAJEA.nombre+": Sigue corriendo para abajo. recorren "+FuncionesAJEA.desplazamiento(FuncionesAJEA.velocidad)+" metros. Estás a la altura de secretaría\n";
        historia+=FuncionesFIJA.nombre+": Sigue corriendo para abajo. recorren "+FuncionesFIJA.desplazamiento(FuncionesFIJA.velocidad)+" metros. Estás a la altura de secretaría\n";
        historia+=FuncionesAJAA.nombre+": "+accionReaccion(turno,"cierro la ventana")+"\n";
        historia+=FuncionesFCMJ.nombre+": "+accionReaccion(turno,"pregunto a Aitor Tilla violentamente por qué cierran la ventana")+"\n";
        historia+=FuncionesHSRK.nombre+": "+accionReaccion(turno,"preguntar que esta pasando")+"\n";
        System.out.println(imprimirTurno(turno,historia));
        
    }
    
    /**
     * función que imprime la información del turno
     * prerrequisito: Turno debe ser positivo mayor a cero
     * @param turno número de turno desde 1
     * @param historia String con la historia hasta el momento
     * @return String con el formato de impresión
     */
    public static String imprimirTurno(byte turno,String historia){
            return "|--------------------------|\n|---------Turno "+turno+"----------|\n"+historia+"\n\n";            
    
    
    } 
    
}
