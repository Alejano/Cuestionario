
package clases;

import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
      "Pertenece a un objeto","Clase aplicacion","Implementando la interfas runnable",
      "Una base de datos","ArrayList<Usuario>"
    };
    
    String[] radioR = {
"Pertenece a un objeto,Pertenece a un atributo,Pertenece a una clase,Pertenece a un metodo",
"Clase modelo,Clase aplicacion,Clase entidad,Clase objeto",
"Creando una excepcion thread,Creando una clase thread,Creando un objeto thread,Implementando la interfas runnable",
"Una libreria de netbeans,Una base de datos,Tener un arreglo de tablas,Crear un package sql",
"Usuario,UsuarioArrayList<>,ArrayList<Usuario>,ArrayList<>",
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
