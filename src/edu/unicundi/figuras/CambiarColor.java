package edu.unicundi.figuras;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * Clase cambiar color de la figura
 *
 * @author Erika Tatiana Cortes
 * @author Julian Andres Medina
 * @version 1.0
 */
public class CambiarColor extends JDialog implements ActionListener {

    //  Atributo Color que cambia dependiendo de los botones

    private Color colorGeneral;
    //  Guarda el tipo de llamado 1-cambiar linea, 2-cambiar fondo
    private byte tipo = 0;
    //  Boton que cambia el color a rojo
    private JButton btnRojo;
    //  Boton que cambia el color a rosado
    private JButton btnRosado;
    //  Boton que cambia el color a amarillo
    private JButton btnAmarillo;
    //  Boton que cambia el color a azul
    private JButton btnAzul;

    //  Guarda la Interfaz
    private Interfaz interfaz;

    /**
     * **
     * Constructor
     *
     * @param interfaz
     */
    public CambiarColor(Interfaz interfaz) {
        this.interfaz = interfaz;
        configuracionPanel();
        agregarBoton();
    }

    /**
     * **
     * Metodo que configura el panel
     */
    public void configuracionPanel() {
        //  Cambiar color de fondo del panel
        setBackground(Color.WHITE);
        //  Tamaño de la ventana
        setSize(300, 300);
        //  Localizacion en pantalla
        setLocationRelativeTo(null);
        //  Evitar que redimencionen la ventana
        setResizable(false);
        //  Que hacer al cerrar
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //  Configurar disposicion de botones en la ventana
        setLayout(new GridLayout(1, 2));
    }

    /**
     * **
     * Metodo que Agrega los botones al panel
     */
    public void agregarBoton() {
        btnRojo = new JButton("Rojo");
        btnRojo.setActionCommand("rojo");
        btnRojo.setForeground(Color.RED);
        btnRojo.addActionListener(this);
        add(btnRojo);
        btnRosado = new JButton("Rosado");
        btnRosado.setActionCommand("rosado");
        btnRosado.setForeground(Color.PINK);
        btnRosado.addActionListener(this);
        add(btnRosado);
        btnAmarillo = new JButton("Amarillo");
        btnAmarillo.setActionCommand("amarillo");
        btnAmarillo.setForeground(Color.YELLOW);
        btnAmarillo.addActionListener(this);
        add(btnAmarillo);
        btnAzul = new JButton("Azul");
        btnAzul.setActionCommand("azul");
        btnAzul.setForeground(Color.BLUE);
        btnAzul.addActionListener(this);
        add(btnAzul);

    }

    /**
     * **
     * Metodo que esta a la espera por si se presiona un boton y cambia el valor
     * del color general
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "rojo":
                colorGeneral = Color.RED;
                break;
            case "rosado":
                colorGeneral = Color.PINK;
                break;
            case "amarillo":
                colorGeneral = Color.YELLOW;
                break;
            case "azul":
                colorGeneral = Color.BLUE;
                break;
            
        }
        cambiarColor();
    }

    /**
     * **
     * Metodo que dependiendo el tipo de solicitud hace el cambio de color
     */
    public void cambiarColor() {
        if (tipo == 1) {

            interfaz.getPlanoCartesiano().setColorFondo(colorGeneral);
        }
        interfaz.getPlanoCartesiano().repaint();
    }

    /**
     * **
     * Metodo que Muestra la ventana y cambia el titulo dependiendo el tipo de
     * solicitud
     */
    public void mostrar() {
        setVisible(true);
        if (tipo == 1) {
            setTitle("Cambiar Color de Linea");
        } else {
            setTitle("Cambiar Color de Fondo");
        }
    }

    /**
     * **
     * Metodo que obtiene el valor del tipo de solicitud
     *
     * @return tipo
     */
    public byte getTipo() {
        return tipo;
    }

    /**
     * **
     * Metodo que modifica el valor del tipo de solicitud
     *
     * @param tipo
     */
    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }
}
