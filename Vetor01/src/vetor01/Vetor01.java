/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author gaesm
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4};
        System.out.println("O total de casas de Nº " + n.length); //O length vai calcular o total de números que tem 
        for(int c=0; c<=n.length-1; c++) {
            System.out.println("Na posição " + c + "º temos o valor " + n[c]);
        }
    }
    
}
