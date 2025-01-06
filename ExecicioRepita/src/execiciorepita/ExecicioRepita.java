/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execiciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author gaesm
 */
public class ExecicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas-Vindas!", JOptionPane.ERROR_MESSAGE);
        
        
        //int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        //JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);
        
        
        int n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
        } while(n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr>" + 
                "<br>Somatório vale " + s + "</html>");
    }
    
}
