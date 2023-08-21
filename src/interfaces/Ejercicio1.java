/* Crea una interfaz llamada Figura que tenga m�todos para calcular el �rea y el 
 * per�metro de una figura geom�trica. Luego, implementa esta interfaz en clases 
 * concretas como C�rculo, Tri�ngulo y Rect�ngulo. Calcula el �rea y el per�metro 
 * de cada figura y muestra los resultados.
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

public class Ejercicio1 {

	public static void main(String[] args) {
		Figura circulo = new Circulo(5);
        System.out.println("�rea del c�rculo: " + circulo.calcularArea());
        System.out.println("Per�metro del c�rculo: " + circulo.calcularPerimetro());

        Figura triangulo = new Triangulo(4, 6);
        System.out.println("�rea del tri�ngulo: " + triangulo.calcularArea());
        System.out.println("Per�metro del tri�ngulo: " + triangulo.calcularPerimetro());

        Figura rectangulo = new Rectangulo(3, 7);
        System.out.println("�rea del rect�ngulo: " + rectangulo.calcularArea());
        System.out.println("Per�metro del rect�ngulo: " + rectangulo.calcularPerimetro());

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
        // No se puede calcular el per�metro solo con base y altura
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
