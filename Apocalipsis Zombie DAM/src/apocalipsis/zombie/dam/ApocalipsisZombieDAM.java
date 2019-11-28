
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
        
        //TURNO 1
        turno++;
        historia+="Estamos todos en el aula 5 de cenec.\n Se escucha un grito desde la calle.\n-----------------------\n";
        historia+=FuncionesAJEA.nombre+": Sale corriendo para abajo. recorren "+FuncionesAJEA.desplazamiento(FuncionesAJEA.velocidad)+" metros. Estás en mitad de las escaleras\n";
        historia+=FuncionesFIJA.nombre+": Sale corriendo para abajo. recorren "+FuncionesFIJA.desplazamiento(FuncionesFIJA.velocidad)+" metros.  Estás en mitad de las escaleras\n";
        historia+=FuncionesAJAA.nombre+": Mira por la ventana. "+FuncionesAJAA.accionReaccion(turno,"mirar por la ventana",FuncionesAJAA.percepción)+"\n";
        historia+=FuncionesFCMJ.nombre+": Mira por la ventana. "+FuncionesFCMJ.accionReaccion(turno,"mirar por la ventana",FuncionesFCMJ.percepcion)+"\n";
        historia+=FuncionesHSRK.nombre+": Mira por la ventana. "+FuncionesHSRK.accionReaccion(turno,"mirar por la ventana",FuncionesHSRK.percepcion)+"\n";
        System.out.println(imprimirTurno(turno,historia));
        
        //TURNO 2
        turno++;
        historia="Se escuchan muchos gritos desde la calle.\n Aitor Tilla se da cuenta de que vienen desde la derecha.\n-----------------------\n";
        historia+=FuncionesAJEA.nombre+": Sigue corriendo para abajo. recorren "+FuncionesAJEA.desplazamiento(FuncionesAJEA.velocidad)+" metros. Estás a la altura de secretaría\n";
        historia+=FuncionesFIJA.nombre+": Sigue corriendo para abajo. recorren "+FuncionesFIJA.desplazamiento(FuncionesFIJA.velocidad)+" metros. Estás a la altura de secretaría\n";
        historia+=FuncionesAJAA.nombre+": Cierra la ventana. "+FuncionesAJAA.accionReaccion(turno,"cierro la ventana")+"\n";
        historia+=FuncionesFCMJ.nombre+": Pregunta a aitor, por qué puñetas ha cerrado la ventana. "+FuncionesFCMJ.accionReaccion(turno,"pregunto a Aitor Tilla violentamente por qué cierran la ventana")+"\n";
        historia+=FuncionesHSRK.nombre+": Pregunta qué está pasando. "+FuncionesHSRK.accionReaccion(turno,"preguntar que esta pasando")+"\n";
        System.out.println(imprimirTurno(turno,historia));
        
        
        //TURNO 3
        turno++; 
        historia="AJEA y Luis alberto ven a Natalia salir corriendo para arriba.\n Ven mucho alboroto en la calle. \n Los que están en el aula 5, ven como Natalia entra y les dice \n que todo el mundo fuera, que pasa algo malo en la calle, \n parece que hay un loco suelto.\n-----------------------\n";
        historia+=FuncionesFCMJ.nombre+": Amenazan a Aitor Tilla para que colabore con ellos. "+FuncionesFCMJ.accionReaccion(turno,"amenazar a Aitor Tilla")+"\n";
        historia+=FuncionesHSRK.nombre+": Amenazan a Aitor Tilla para que colabore con ellos. "+FuncionesHSRK.accionReaccion(turno,"amenazar a Aitor Tilla")+"\n";
        historia+=FuncionesAJEA.nombre+": Intenta meterse en secretaría. "+FuncionesAJEA.accionReaccion(turno,"intentan entrar en secretaria")+"\n";
        historia+=FuncionesFIJA.nombre+": Cogen piedras de secretaría. "+FuncionesFIJA.recoger("piedras")+"\n";
        historia+=FuncionesAJAA.nombre+": Reciben amenazas para unise a grupo. "+FuncionesAJAA.accionReaccion(turno,"me amenazan para unirme")+"\n";
        System.out.println(imprimirTurno(turno,historia));
        
        //TURNO 4
         turno++; 
        historia=mensajeTexto(FuncionesFCMJ.nombre, FuncionesFCMJ.percepcion, FuncionesFCMJ.intuicion);
        historia+=mensajeTexto(FuncionesHSRK.nombre, FuncionesHSRK.percepcion, FuncionesHSRK.intuicion);
        historia+=mensajeTexto(FuncionesAJEA.nombre, FuncionesAJEA.percepcion, FuncionesAJEA.intuicion);
        historia+=mensajeTexto(FuncionesFIJA.nombre, FuncionesFIJA.percepcion, FuncionesFIJA.intuicion);
        historia+=mensajeTexto(FuncionesAJAA.nombre, FuncionesAJAA.percepción, FuncionesAJAA.intuición);
        System.out.println(imprimirTurno(turno,historia));
        
        //TURNO 4
        historia="Aitor Tilla nota que le vibra el teléfono\n-----------------------\n";
        historia+=FuncionesFCMJ.nombre+": Sale corriendo. recorre "+FuncionesFIJA.desplazamiento(FuncionesFCMJ.velocidad)+" metros.  Están en la puerta del aula\n";
        historia+=FuncionesHSRK.nombre+": está confuso. Pregunta a Aitor Tilla qué mira en su teléfono. "+FuncionesHSRK.accionReaccion(turno,"preguntar telefono")+"\n";
        historia+=FuncionesAJEA.nombre+": Piden a Luis alberto trabajar juntos y cogen extintores."+FuncionesAJEA.accionReaccion(turno,"alianza y cogen extintores")+"\n";
        historia+=FuncionesFIJA.nombre+": Piden a AJEA trabajar juntos y cogen extintores."+FuncionesFIJA.accionReaccion(turno,"alianza y cogen extintores")+"\n";
        historia+=FuncionesAJAA.nombre+":Avisais a vuestro grupo de que algo viene por la derecha. Consultais el tlf. "+FuncionesAJAA.accionReaccion(turno,"vibra el teléfono")+"\n";
        System.out.println(imprimirTurno(turno,historia));

        
        //Turno 5
        turno++;
        historia="Luis Alberto y AJEA ven como de repente las hojas de la puerta exterior de cenec,\n"
                + "se abren de golpe, y entran dos tìpos con pinta rara. \n"
                + "Heusequio oye un ruido muy fuerte abajo. Aitor Tilla también lo oye.\n-----------------------\n";
        historia+=FuncionesFCMJ.nombre+": cogen extintor y esperan a los que están en el aula. "+FuncionesFCMJ.accionReaccion(turno,"Heusequio oye un ruido muy fuerte abajo. Aitor Tilla también lo oye.")+"\n";
        historia+=FuncionesHSRK.nombre+": intentan quitar el teléfono a Aitor Tilla. "+FuncionesHSRK.robarObjeto(FuncionesAJAA.nombre,FuncionesHSRK.velocidad, FuncionesAJAA.velocidad, FuncionesHSRK.fuerza, FuncionesAJAA.fuerza)+"\n";
        historia+=FuncionesAJEA.nombre+": Le arrean con el extintor al que acaba de entrar. "+FuncionesAJEA.accionReaccion(turno,"Le pegamos con el extintor en toda la cabeza")+"\n";
        historia+=FuncionesFIJA.nombre+": Le dan una pedrada al otro que entró."+FuncionesFIJA.accionReaccion(turno,"alianza y cogen extintores")+"\n";
        historia+=FuncionesAJAA.nombre+":Se asusta del ruido, y buscan otra salida. "+FuncionesAJAA.accionReaccion(turno,"Oigo un fuerte ruido abajo")+" Sabes que todos los balcones están cerrados, y la única salida es la puerta principal.\n";
        
        System.out.println(imprimirTurno(turno,historia));
    
        //TURNO 6
        turno++;
        historia="La situación sigue siendo confusa para todos.";
        historia+=FuncionesFCMJ.nombre+": Ven corriendo a Abascal y Aitor Tilla hacia ellos. Les cortan el paso. "+FuncionesFCMJ.accionReaccion(turno,"corto el paso a los que vienen")+"\n"; //Respuesta: Veo venir a los dos y les corto el paso
        historia+=FuncionesHSRK.nombre+": Salen corriendo detrás de Aitor Tilla. "+FuncionesFIJA.desplazamiento(FuncionesHSRK.velocidad)+" metros hasta las útlimas filas del aula.\n";
        historia+=FuncionesAJEA.nombre+": Salen corriendo hacia calle comedias. "+FuncionesFIJA.desplazamiento(FuncionesAJEA.velocidad)+" metros hasta la puerta del ONeill bar.\n";
        historia+=FuncionesFIJA.nombre+": Le preguntan al herido qué pasa."+FuncionesFIJA.accionReaccion(turno,"preguntan que pasa")+"\n"; //Respuesta: "El de la pedrada responde: "Que me has dado una pedrada"
        historia+=FuncionesAJAA.nombre+":Pasan de todo y salen corriendo para abajo. Recorren "+FuncionesFIJA.desplazamiento(FuncionesAJAA.velocidad)+" metros hasta el final del aula.\n";
        
        System.out.println(imprimirTurno(turno,historia));
        
        //TURNO 7
        turno++;
        historia="Luis Alberto ve entrar por la puerta, lo que parece un zombie, detrás del ruido. Heusequio y Abascal oyen mucho ruido abajo. Aitor Tilla distingue golpes e insultos.";
        
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
    
    /**
     * Función que determina si en el turno 4 se recibe el mensaje de texto
     * @param nombre nombre de quien puede recibir el mensaje
     * @param percepcion percepción 0-100 del personaje
     * @param intuicion intuición 0-100 del personaje
     * @return String que indica si se recibe el mensaje, o cadena vacía.
     */
    public static String mensajeTexto(String nombre,byte percepcion,byte intuicion){
        if(percepcion>=50||intuicion>=80){
            return nombre+" nota el teléfono vibrar.\n";
        }
        return "";
    }
    
}
