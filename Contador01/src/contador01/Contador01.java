/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author gaesm
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*  int cc = 1;
        while(cc<=4) {
            System.out.println("Cambalhota " + cc);
            cc++;
    */
                  
        int cc = 0;
        while(cc<=10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue; //O continue não vai deixar imprimir o 5 e o 7 na tela
            }
            if (cc == 7) {
                break; //O break vai fazer parar de rodar o sistema, vai ir so até o 7
            }
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
