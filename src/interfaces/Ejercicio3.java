//Crear una clase interna regular
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Interfaces y clases internas
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package interfaces;

public class Ejercicio3 {

	public static void main(String[] args) {
        ClaseExterna externa = new ClaseExterna();
        externa.usarClaseInterna();

	}

}
class ClaseExterna {
    private int datoExterno = 10;

    public class ClaseInterna {
        public void mostrarDatoExterno() {
            System.out.println("Dato externo: " + datoExterno);
        }
    }
    
    public void usarClaseInterna() {
        ClaseInterna interna = new ClaseInterna();
        interna.mostrarDatoExterno();
    }
}