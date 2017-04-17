
package clases;


public class Preguntas {
    
    String[] preguntas = {
        "¿Un ambito siempre?",
        "¿Que clase solo ejecuta?",
        "¿Cual es una forma de crear un thread?",
        "¿Que necesitas para generar persistencia?",
        "¿Que representa una tabla?"
    };
    
    String[] preg ={
    "Pregunta 1",
    "Pregunta 2",    
    "Pregunta 3",
    "Pregunta 4",
    "Pregunta 5",
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    public String getPreg(int posi){
        return preg[posi];
    }
   
    
}
