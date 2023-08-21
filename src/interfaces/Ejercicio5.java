//Crear una clase local
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Interfaces y clases internas
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package interfaces;

public class Ejercicio5 {

	public static void main(String[] args) {
        ClaseExterna3 externa = new ClaseExterna3();
        externa.usarClaseLocal();

	}

}
class ClaseExterna3 {
    private int datoExterno = 10;

    public void usarClaseLocal() {
        class ClaseLocal {
            public void mostrarDatoExterno() {
                System.out.println("Dato externo: " + datoExterno);
            }
        }
        
        ClaseLocal local = new ClaseLocal();
        local.mostrarDatoExterno();
    }
}