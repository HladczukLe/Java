package lista4;

import javax.swing.JOptionPane;

/*
 * Escreva um programa que receba do usuário um número n e outro p e calcule o arranjo n, p a p.
 */

public class Exercicio12 {
    public static void main(String[] args) {
        int objetoConjunto = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade total de objetos no conjunto")); //n
        int elementoArranjo = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de elementos por arranjo")); //p
        
        int arranjo = fatorialObjeto(objetoConjunto)/fatorialDenominador(elementoArranjo, objetoConjunto); //A = n!/(n-p)! 
        JOptionPane.showMessageDialog(null, "O valor do arranjo é: "+arranjo);
    }
    public static int fatorialObjeto(int objetoConjunto) {
        for(int i=objetoConjunto-1; i>1; i--){
            objetoConjunto *=i;
        }
        return objetoConjunto;
    }
    public static int fatorialDenominador(int elementoArranjo, int objetoConjunto) {
        int denominador = objetoConjunto-elementoArranjo;
        for(int i=denominador-1; i>1; i--){
            denominador*=i;
        }
        return denominador;
    }
}
