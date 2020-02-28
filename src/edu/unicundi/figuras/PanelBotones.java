
package edu.unicundi.figuras;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase de panel de los botones color fondo y etiquetas
 *
 * @author Erika Tatiana Cortes
 * @author Julian Andres Medina
 * @version 1.0
 */
public class PanelBotones extends JPanel implements ActionListener{
    //  Boton para cambiar el color de fondo
    private JButton btnColorFondo;
    //  Etiqueta que imprime el area
    private JLabel etiquetaArea;
    //  Etiqueta que imprime el perimetro
    private JLabel etiquetaPerimetro;
    //  Etiqueta que imprime la altura
    private JLabel etiquetaAltura;
    //  Guarda la interfaz
    private Interfaz interfaz;
    
    
    /**
     * Constructor
     * @param interfaz 
     */
    public PanelBotones(Interfaz interfaz) {
        //  Configuracion de panel
        this.interfaz = interfaz;
        setLayout(new GridLayout(1, 0));
        setBackground(Color.magenta);
        
        agregarBoton();
        agregarEtiqueta();
    }
    
    /**
     * Metodo que agrega los botones al panel
     */
    public void agregarBoton(){
        btnColorFondo = new JButton("Cambiar Fondo");
        btnColorFondo.setPreferredSize(new Dimension(20,30));
        btnColorFondo.setMaximumSize(new Dimension(20,20));
        btnColorFondo.setActionCommand("COLOR_FONDO");
        btnColorFondo.addActionListener(this);
        add(btnColorFondo);
    }
    
    /**
     * Metodo que agrega las etiquetas al panel
     */
    public void agregarEtiqueta(){
        etiquetaArea = new JLabel("Area: ");
        etiquetaArea.setForeground(Color.BLACK);
        add(etiquetaArea);
        
        etiquetaPerimetro = new JLabel("Perimetro: ");
        etiquetaPerimetro.setForeground(Color.BLACK);
        add(etiquetaPerimetro);

        etiquetaAltura = new JLabel("");
        add(etiquetaAltura);
    }
    
    /**
     * Metodo que esta a la espera del boton presionado
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
       CambiarColor dialogoCambiarColor = new CambiarColor(interfaz);
        switch (e.getActionCommand()) {
            
            case "COLOR_FONDO":
                System.out.println("Imprimio boton color fondo");
               dialogoCambiarColor.setTipo((byte)1);
                break;
        }
        dialogoCambiarColor.mostrar();
        
    }

    /**
     * Obtiene el valor de la etiqueta de area
     * @return 
     */
    public JLabel getEtiquetaArea() {
        return etiquetaArea;
    }

    /**
     * Cambia el valor de la etiqueta de area
     * @param etiquetaArea 
     */
    public void setEtiquetaArea(JLabel etiquetaArea) {
        this.etiquetaArea = etiquetaArea;
    }

    /**
     * Obtener el valor de la etiqueta de perimetro
     * @return 
     */
    public JLabel getEtiquetaPerimetro() {
        return etiquetaPerimetro;
    }

    /**
     * Cambia el valor de la etiqueta de perimetro
     * @param etiquetaPerimetro 
     */
    public void setEtiquetaPerimetro(JLabel etiquetaPerimetro) {
        this.etiquetaPerimetro = etiquetaPerimetro;
    }

    /**
     * Obtener el valor de la etiqueta de dato especifico
     * @return 
     */
    public JLabel getEtiquetaAltura() {
        return etiquetaAltura;
    }

    /**
     * Cambia el valor de la etiqueta de dato especifico
     * @param etiquetaAltura 
     */
    public void setEtiquetaAltura(JLabel etiquetaAltura) {
        this.etiquetaAltura = etiquetaAltura;
    }
    
}
