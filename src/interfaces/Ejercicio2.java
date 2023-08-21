/*Crea una interfaz llamada Motor que tenga m�todos para encender y apagar un motor. 
 * Luego, implementa esta interfaz en clases concretas como MotorGasolina y 
 * MotorElectrico. Crea una clase Vehiculo que tenga un atributo de tipo Motor y
 *  m�todos para encender y apagar el motor.
 * 
 */
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Interfaces y clases internas
*
* @author Amparo Izquierdo Ba�ez
* @mail amizba@gmail.com
*/
package interfaces;

public class Ejercicio2 {

	public static void main(String[] args) {
		MotorGasolina motorGasolina = new MotorGasolina();
        Vehiculo vehiculoGasolina = new Vehiculo(motorGasolina);
        vehiculoGasolina.encenderMotor();
        vehiculoGasolina.apagarMotor();

        MotorElectrico motorElectrico = new MotorElectrico();
        Vehiculo vehiculoElectrico = new Vehiculo(motorElectrico);
        vehiculoElectrico.encenderMotor();
        vehiculoElectrico.apagarMotor();

	}

}
class MotorGasolina implements Motor {
    @Override
    public void encender() {
        System.out.println("Motor de gasolina encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Motor de gasolina apagado");
    }
}
class MotorElectrico implements Motor {
    @Override
    public void encender() {
        System.out.println("Motor el�ctrico encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Motor el�ctrico apagado");
    }
}
class Vehiculo {
    private Motor motor;

    public Vehiculo(Motor motor) {
        this.motor = motor;
    }

    public void encenderMotor() {
        motor.encender();
    }

    public void apagarMotor() {
        motor.apagar();
    }
}