package edu.unicundi.figuras;

/**
 * Clase Puntos
 *
 * @author Erika Tatiana Cortes
 * @author Julian Andres Medina
 * @version 1.0
 */
public final class Cuadrado extends Figura {

    //  Objeto que guarda las coordenadas (x,y) del punto 3

    private Punto punto3;
    //  Objeto que guarda las coordenadas (x,y) del punto 4
    private Punto punto4;

    /**
     * Constructor de la clase Cuadrado
     *
     * @param punto1
     * @param punto2
     * @param punto3
     * @param punto4
     */
    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2);
        this.punto3 = punto3;
        this.punto4 = punto4;
        calcularArea();
        calcularPerimetro();
    }

    /**
     * Calcula el lado 2 del cuadrado
     *
     * @return lado2
     */
    public double darLado2() {
        double lado2 = Math.pow(this.punto3.getX() - this.punto2.getX(), 2) + Math.pow(this.punto3.getY() - this.punto2.getY(), 2);
        lado2 = Math.sqrt(lado2);
        return lado2;
    }

    /**
     * Calcula el lado 3 del cuadrado
     *
     * @return lado3
     */
    public double darLado3() {
        double lado3 = Math.pow(this.punto4.getX() - this.punto3.getX(), 2) + Math.pow(this.punto4.getY() - this.punto3.getY(), 2);
        lado3 = Math.sqrt(lado3);
        return lado3;
    }

    /**
     * Calcula el lado 4 del cuadrado
     *
     * @return lado4
     */
    public double darLado4() {
        double lado4 = Math.pow(this.punto1.getX() - this.punto4.getX(), 2) + Math.pow(this.punto1.getY() - this.punto4.getY(), 2);
        lado4 = Math.sqrt(lado4);
        return lado4;
    }

    /**
     * Calcula el Area del Cuadrado
     */
    public void calcularArea() {
        this.area = darLado1() * darLado2();
    }

    /**
     * Calcula el Perimetro del cuadrado
     */
    public void calcularPerimetro() {
        this.perimetro = darLado1() + darLado2() + darLado3() + darLado4();
    }

    /**
     * Metodo que valida si los puntos son de un cuadrado
     *
     * @return validar
     */
    public boolean validarPuntos() {
        boolean validar = false;
        if (darLado1() == darLado3() && darLado2() == darLado4()) {
            double pendiente1 = (punto2.getY() - punto1.getY()) / (punto2.getX() - punto1.getX());
            double pendiente2 = (punto3.getY() - punto2.getY()) / (punto3.getX() - punto2.getX());

            if (pendiente1 != pendiente2) {
                validar = true;
            }
        }
        return validar;
    }

    /**
     * Metodo que da el tipo, cuadrado o rectangulo
     *
     * @return "Cuadrado" o "Rectangulo"
     */
    public String tipo() {
        if (darLado1() == darLado2()) {
            return "Cuadrado";
        } else {
            return "Rectangulo";
        }
    }

    /**
     * Obtiene el valor (x,y) del punto 3
     *
     * @return punto3
     */
    public Punto getPunto3() {
        return punto3;
    }

    /**
     * Cambia el valor (x,y) del punto 3
     *
     * @param punto3
     */
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    /**
     * Obtiene el valor (x,y) del punto 4
     *
     * @return punto4
     */
    public Punto getPunto4() {
        return punto4;
    }

    /**
     * Cambia el valor (x,y) del punto 4
     *
     * @param punto4
     */
    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }

}
