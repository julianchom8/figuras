package edu.unicundi.figuras;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Clase las opciones de seleccionar triangulo o cuadrilatero
 *
 * @author Erika Tatiana Cortes
 * @author Julian Andres Medina
 * @version 1.0
 */
public class PanelOpciones1 extends JPanel implements ActionListener {

    //  Boton para ingresar los puntos del triangulo
    private final JButton btnPuntosTriangulo;
    //  Boton para ingresar los puntos del cuadrado
    private final JButton btnPuntosCuadrado;

    //  Guarda la interfaz
    private final Interfaz interfaz;

    /**
     * Constructor
     *
     * @param interfaz
     */
    public PanelOpciones1(Interfaz interfaz) {
        this.interfaz = interfaz;
        setBackground(Color.magenta);
        setBorder(new TitledBorder("Ingresar Valores"));
        setLayout(new GridLayout(3, 3));

        btnPuntosTriangulo = new JButton("Triangulo");
        btnPuntosTriangulo.setActionCommand("triangulo");
        btnPuntosTriangulo.addActionListener(this);
        add(btnPuntosTriangulo);

        btnPuntosCuadrado = new JButton("Cuadrado");
        btnPuntosCuadrado.setActionCommand("cuadrado");
        btnPuntosCuadrado.addActionListener(this);
        add(btnPuntosCuadrado);

    }

    /**
     * Metodo que esta a la espera de un evento
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Puntos dialogoPuntos = new Puntos(interfaz);
        int tipo = 0;
        switch (e.getActionCommand()) {
            case "triangulo":
                System.out.println("Puntos Triangulo");
                tipo = 1;

                break;
            case "cuadrado":
                System.out.println("Puntos Cuadrado");
                tipo = 2;

                break;
        }
        dialogoPuntos.setTipo(tipo);
    }
}
