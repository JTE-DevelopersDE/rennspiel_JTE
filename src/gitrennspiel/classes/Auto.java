package gitrennspiel.classes;

import javax.swing.JLabel;

public class Auto {
    // ------------------------- P r o p e r t i e s 
    private int pi_geschwindigkeit;
    private double pd_tank;
    private int pi_traktion;
    private JLabel po_Car;

    // ------------------------- M e t h o d e n 
    public void setGeschwindigkeit(int ai_NewGeschwindigkeit){
        this.pi_geschwindigkeit = ai_NewGeschwindigkeit;
    }
    
    public int getGeschwindigkeit(){
        return this.pi_geschwindigkeit;
    }
    
    public void beschleunigen(int ai_locationX, int ai_locationY) {
        ai_locationY = ai_locationY + pi_geschwindigkeit;
        this.po_Car.setLocation(ai_locationX , ai_locationY);
    }
    
    public void bremsen(int ai_wettereinfluss) {
        this.pi_geschwindigkeit = this.pi_geschwindigkeit - ai_wettereinfluss;
    }

    public void setObjectTo(JLabel argo_newCar) {
        this.po_Car = argo_newCar;
    }
}