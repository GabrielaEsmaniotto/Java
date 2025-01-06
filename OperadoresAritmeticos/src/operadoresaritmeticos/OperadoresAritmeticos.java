/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author gaesm
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é " + m);
        
        int numero = 5;
        numero++; //O ++ vai adicionar +1 ao número.
        System.out.println(numero);
        
        int numeros = 5;
        numeros--; //O -- vai diminuir -1 ao número.
        System.out.println(numeros);
        
        //PÓS-DECREMENTO e PRÉ-DECREMENTO:
        int numeero = 10;
        int valor = 4 + numeero++; //No valor vai ser somado 4+10 o decremento acontece após, ou seja, não irá aparecer no print
        //int valor = 4 + ++numeero; //O decremento acontece antes da soma, ou seja, será somado 4 + 10 -1
        System.out.println(valor);
        System.out.println(numero);
        
        
        int x = 4;
        x += 2;
        x *= 2;
        System.out.println(x);
       
        
        float v = 8.9f;
        int ar = (int) Math.floor(v);//O Math.floor vai arredondar o número para baixo, ou seja, vai ficar apenas 8
        System.out.println(ar);
        
        
        float v = 8.9f;
        int ar = (int) Math.ceil(v);//O Math.ceil vai arredondar o número para cima, ou seja, vai ficar apenas 9
        System.out.println(ar);
        
        
        float v = 8.5f;
        int ar = (int) Math.round(v);//O Math.round vai arredondar o número de acordo com a regra matemática, no caso, vai ficar 9
        System.out.println(ar);
        */
        
        double ale = Math.random();//o Math.radom vai gerar um número aleatório
        int n = (int) (5 + ale * (10-5));//Vai gerar um número aleatório entre 5 e 10
        System.out.println(n);
        
    }
    
    
}
