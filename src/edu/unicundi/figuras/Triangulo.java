package edu.unicundi.figuras;

/**
 * Clase Puntos
 *
 * @author Erika Tatiana Cortes
 * @author Julian Andres Medina
 * @version 1.0
 */
public class Triangulo extends Figura {

    //  Objeto que guarda las coordenadas (x,y) del punto 3

    private Punto punto3;

    /**
     * Constructor de la clase Triangulo
     *
     * @param punto1
     * @param punto2
     * @param punto3
     */
    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        super(punto1, punto2);
        this.punto3 = punto3;
        calcularArea();
        calcularPerimetro();
    }

    /**
     * Calcula el lado 2 del triangulo
     *
     * @return lado2
     */
    public double darLado2() {
        double lado2 = Math.pow(this.punto3.getX() - this.punto2.getX(), 2) + Math.pow(this.punto3.getY() - this.punto2.getY(), 2);
        lado2 = Math.sqrt(lado2);
        return lado2;
    }

    /**
     * Calcula el lado 3 del triangulo
     *
     * @return lado3
     */
    public double darLado3() {
        double lado3 = Math.pow(this.punto1.getX() - this.punto3.getX(), 2) + Math.pow(this.punto1.getY() - this.punto3.getY(), 2);
        lado3 = Math.sqrt(lado3);
        return lado3;
    }

    /**
     * Calcula el area del Triangulo
     */
    public void calcularArea() {
        calcularPerimetro();
        double heron = getPerimetro() / 2;
        this.area = heron * (heron - darLado1()) * (heron - darLado2()) * (heron - darLado3());
        this.area = Math.sqrt(area);
    }

    /**
     * Calcula el perimetro del triangulo
     */
    public void calcularPerimetro() {
        this.perimetro = darLado1() + darLado2() + darLado3();
    }

    /**
     * Validar que los puntos sean de un triangulo
     *
     * @return validar
     */
    public boolean validarPuntos() {
        boolean validar = false;
        double pendiente1 = (punto2.getY() - punto1.getY()) / (punto2.getX() - punto1.getX());
        double pendiente2 = (punto3.getY() - punto2.getY()) / (punto3.getX() - punto2.getX());
        double pendiente3 = (punto1.getY() - punto3.getY()) / (punto1.getX() - punto3.getX());
        if (pendiente1 != pendiente2 && pendiente1 != pendiente3 && pendiente2 != pendiente3) {
            validar = true;
        }
        return validar;
    }

    /**
     * Determina el tipo de triangulo por sus lados
     *
     * @return String
     */
    public String tipoTriangulo() {
        if ((darLado1() - darLado2() > -0.3 && darLado1() - darLado2() < 0.3)
                && (darLado1() - darLado3() > -0.3 && darLado1() - darLado3() < 0.3)
                && (darLado2() - darLado3() > -0.3 && darLado2() - darLado3() < 0.3)) {
            return "Equilatero";
        } else if (darLado1() == darLado2() || darLado1() == darLado3() || darLado2() == darLado3()) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }

    /**
     * Obtener el valor (x,y) del punto 3
     *
     * @return punto3
     */
    public Punto getPunto3() {
        return punto3;
    }

    /**
     * Cambiar el valor (x,y) del punto 3
     *
     * @param punto3
     */
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

}
