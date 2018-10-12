/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul3;

/**
 *
 * @author budis
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JOptionPanel {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JOptionPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(JOptionPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JOptionPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JOptionPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String a = ""; String b = ""; String c = "";
        a = JOptionPane.showInputDialog("number 1:");
        b = JOptionPane.showInputDialog("number 2:");
        c = JOptionPane.showInputDialog("number 3:");
        String msg = "your number " + a + ", "+ b + ", " + c;
        JOptionPane.showMessageDialog(null, msg);
    }
}