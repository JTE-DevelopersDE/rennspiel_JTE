
package gitrennspiel;

import gitrennspiel.classes.*;
import javax.swing.*;

/**
 * @author schwjo2, johati, cirkei
 */
public class GitRennspiel {
    
    public static void main(String[] args) {
        Spielfeld lo_Spielfeld = new Spielfeld();
        
        JFrame MainWindow = new JFrame();
        MainWindow.add(lo_Spielfeld);
              
        MainWindow.setSize(lo_Spielfeld.getPreferredSize().width , lo_Spielfeld.getPreferredSize().height);
              
        MainWindow.setVisible(true);
    }
    
}
