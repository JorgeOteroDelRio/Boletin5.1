/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Boletin5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        JOptionPane.showMessageDialog(null,"La velocidad actual es " + coche1.getVelocidade() + " km/h");
        String respuesta = JOptionPane.showInputDialog("Introduzca la velocidad que quiere aumentar:");
        coche1.acelerar(Integer.parseInt(respuesta));
        JOptionPane.showMessageDialog(null, "Ahora la velocidad actual es " + coche1.getVelocidade() + " km/h");
        String respuesta2 = JOptionPane.showInputDialog("Introduzca la velocidad que quiere reducir:");
        coche1.frenar(Integer.parseInt(respuesta2));
        JOptionPane.showMessageDialog(null, "Ahora la velocidad actual es " + coche1.getVelocidade() + " km/h");
        
    }
    
}
