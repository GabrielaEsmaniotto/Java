/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;
/**
 *
 * @author gaesm
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano você nasceu? ");
        int nasc = t.nextInt();
        int i = 2024 - nasc;
        System.out.println("Sua idade é "+i);
        if (i>=18) {
            System.out.println("MAIOR DE IDADE!");
        } else {
            System.out.println("MENOR DE DIDADE");
        }
    }
    
}
