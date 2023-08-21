/* Crea una interfaz llamada Figura que tenga métodos para calcular el área y el 
 * perímetro de una figura geométrica. Luego, implementa esta interfaz en clases 
 * concretas como Círculo, Triángulo y Rectángulo. Calcula el área y el perímetro 
 * de cada figura y muestra los resultados.
 * 
 */
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Interfaces y clases internas
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package interfaces;

public class Ejercicio1 {

	public static void main(String[] args) {
		Figura circulo = new Circulo(5);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        Figura triangulo = new Triangulo(4, 6);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());

        Figura rectangulo = new Rectangulo(3, 7);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

	}

}
class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
class Triangulo implements Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // No se puede calcular el perímetro solo con base y altura
        return Double.NaN;
    }
}
class Rectangulo implements Figura {
    private double ladoA;
    private double ladoB;

    public Rectangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        return ladoA * ladoB;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
}
