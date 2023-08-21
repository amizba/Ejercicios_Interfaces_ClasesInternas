//Crear una clase interna estática
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Interfaces y clases internas
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package interfaces;

public class Ejercicio4 {

	public static void main(String[] args) {
		ClaseExterna2.usarClaseInterna();

	}

}
class ClaseExterna2 {
    private static int datoExterno = 10;

    public static class ClaseInterna {
        public void mostrarDatoExterno() {
            System.out.println("Dato externo: " + datoExterno);
        }
    }
    
    public static void usarClaseInterna() {
        ClaseInterna interna = new ClaseInterna();
        interna.mostrarDatoExterno();
    }
}
