package lista4;
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * Questão 9: Escreva um programa que receba 10 números e armazene-os em um array. Depois calcule qual o maior e qual o menor destes valores.

 */

public class Exercicio9 {
    public static void main(String[] args) {
        int[] lista = new int[10];
        
        for(int i=0; i < lista.length; i++ ){
            lista[i]=Integer.parseInt(JOptionPane.showInputDialog("Insira um valor na lista: "));
        }
        Arrays.sort(lista); //deixa a array em ordem crescente
        int maiorValor = lista[9];
        int menorValor = lista[0];

        System.out.println("Maior valor de lista: "+maiorValor);
        System.out.println("Menor valor de lista: "+menorValor);
    }
}
