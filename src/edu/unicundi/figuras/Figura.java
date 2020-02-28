package edu.unicundi.figuras;

/**
 * Clase Puntos
 *
 * @author Erika Tatiana Cortes
 * @author Julian Andres Medina
 * @version 1.0
 */
public class Figura {

    //  Las tres figuras tienen minimo 2 puntos
    // Objeto que guarda el valor (x,y) del punto 1

    protected Punto punto1;
    //  Objeto que guarda el valor (x,y) del punto 2
    protected Punto punto2;
    //  Area de la figura
    protected double area;
    //  Perimetro de la figura
    protected double perimetro;

    /**
     * Constructor de la clase
     *
     * @param punto1
     * @param punto2
     */
    public Figura(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public double darLado1() {
        double lado1 = Math.pow(this.punto2.getX() - this.punto1.getX(), 2) + Math.pow(this.punto2.getY() - this.punto1.getY(), 2);
        lado1 = Math.sqrt(lado1);
        return lado1;
    }

    /**
     * Obtener el valor del punto 1 (x,y)
     *
     * @return punto1
     */
    public Punto getPunto1() {
        return punto1;
    }

    /**
     * Cambiar el valor del punto 1 (x,y)
     *
     * @param punto1
     */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    /**
     * Obtener el valor del punto 2 (x,y)
     *
     * @return punto2
     */
    public Punto getPunto2() {
        return punto2;
    }

    /**
     * Cambiar el valor del punto 2 (x,y)
     *
     * @param punto2
     */
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    /**
     * Obtiene el valor del Area
     *
     * @return area
     */
    public double getArea() {
        return area;
    }

    /**
     * Cambia el valor del Area
     *
     * @param area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Obtiene el valor del Perimetro
     *
     * @return perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * Cambia el valor del perimetro
     *
     * @param perimetro
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

}
