package edu.unicundi.figuras;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 * Clase Puntos
 *
 * @author Erika Tatiana Cortes
 * @author Julian Andres Medina
 * @version 1.0
 */
public class Interfaz extends JFrame {

    //  Panel de opciones para ingresar los puntos

    private PanelOpciones1 panelOpciones1;
    //  Panel de botones de cambio de color
    private PanelBotones paneles;
    //  Panel que imprime la figura
    private PlanoCartesiano planoCartesiano;

    /**
     * Constructor de la clase
     */
    public Interfaz() {
        crearVentana();
        agregarPaneles();
    }

    /**
     * Metodo para crear la ventana
     */
    public void crearVentana() {
        setTitle("Figuras");
        setSize(1080, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
    }

    public void agregarPaneles() {

        panelOpciones1 = new PanelOpciones1(this);
        getContentPane().add(panelOpciones1, BorderLayout.NORTH);

        paneles = new PanelBotones(this);
        getContentPane().add(paneles, BorderLayout.SOUTH);

        planoCartesiano = new PlanoCartesiano();
        getContentPane().add(planoCartesiano, BorderLayout.CENTER);

        setVisible(true);
    }

    /**
     * 
     * Metodo que obtiene el valor del panelTriangulo
     *
     * @return panelTriangulo
     */
    public PlanoCartesiano getPlanoCartesiano() {
        return planoCartesiano;
    }

    /**
     * 
     * Metodo que cambia el valor del panelTriangulo
     *
     * @param planoCartesiano
     * @param planoCartesiano
     */
    public void setPlanoCartesiano(PlanoCartesiano planoCartesiano) {
        this.planoCartesiano = planoCartesiano;
    }

    /**
     * Obtener el valor del panel de botones
     *
     * @return panelBotones
     */
    public PanelBotones getPanelBotones() {
        return paneles;
    }

    /**
     * Cambiar el valor del panel de botones
     *
     * @param panelBotones
     */
    public void setPanelBotones(PanelBotones panelBotones) {
        this.paneles = panelBotones;
    }
}
