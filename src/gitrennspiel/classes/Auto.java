package gitrennspiel.classes;

import javax.swing.JLabel;

public class Auto {
    // ------------------------- P r o p e r t i e s 
    private int pi_geschwindigkeit;
    private double pd_tank;
    private int pi_traktion;
    private JLabel po_Car;

    // ------------------------- M e t h o d e n 
    public void beschleunigen() {
    }

    public void bremsen() {
    }

    public void setObjectTo(JLabel argo_newCar) {
        this.po_Car = argo_newCar;
    }
}