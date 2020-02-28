
package edu.unicundi.figuras;

/**
 * Clase Puntos
 *
 * @author Erika Tatiana Cortes
 * @author Julian Andres Medina
 * @version 1.0
 */
public class Punto {
    //  Coordenada X de un punto
    private double x;
    //  Coordenada Y de un punto
    private double y;
    
    /**
     * Constructor de la clase punto
     * @param x
     * @param y 
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Obtener el valor de X
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * Cambiar el valor de X
     * @param x 
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Obtener el valor de Y
     * @return y
     */
    public double getY() {
        return y;
    }

    /**
     * Cambiar el valor de Y
     * @param y 
     */
    public void setY(double y) {
        this.y = y;
    }
    
}
