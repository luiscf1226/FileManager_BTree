/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import javax.swing.JLabel;

/**
 *
 * @author Luis Carlos Flores
 */
public class HiloTiempo {
    
    private boolean avanzar;
    private boolean vive;
    private Cajero c1;
    private Pila p1;
    private Cola p2;
    private Persona pp1;
    private JLabel labelcajero1;
    private JLabel labelcajero2;
    private JLabel labelcajero3;
    private JLabel labelcajero4;
    
    private JLabel labelcola1;

    public HiloTiempo() {
    }

    public HiloTiempo(JLabel labelcajero1, JLabel labelcajero2, JLabel labelcajero3, JLabel labelcajero4, JLabel labelcola1) {
        this.labelcajero1 = labelcajero1;
        this.labelcajero2 = labelcajero2;
        this.labelcajero3 = labelcajero3;
        this.labelcajero4 = labelcajero4;
        this.labelcola1 = labelcola1;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JLabel getLabelcajero1() {
        return labelcajero1;
    }

    public void setLabelcajero1(JLabel labelcajero1) {
        this.labelcajero1 = labelcajero1;
    }

    public JLabel getLabelcajero2() {
        return labelcajero2;
    }

    public void setLabelcajero2(JLabel labelcajero2) {
        this.labelcajero2 = labelcajero2;
    }

    public JLabel getLabelcajero3() {
        return labelcajero3;
    }

    public void setLabelcajero3(JLabel labelcajero3) {
        this.labelcajero3 = labelcajero3;
    }

    public JLabel getLabelcajero4() {
        return labelcajero4;
    }

    public void setLabelcajero4(JLabel labelcajero4) {
        this.labelcajero4 = labelcajero4;
    }

    public JLabel getLabelcola1() {
        return labelcola1;
    }

    public void setLabelcola1(JLabel labelcola1) {
        this.labelcola1 = labelcola1;
    }
    

    public void run() {
        
        while (vive) {
            if (avanzar) {
               

            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }

    }
}
