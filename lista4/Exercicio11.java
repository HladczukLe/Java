package lista4;

import javax.swing.JOptionPane;

/*
    * Escreva um programa que calcule o fatorial de um número. 
*/

public class Exercicio11 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para calcular seu fatorial"));
        int fatorial = 1;
        for(int i=1; i<=numero;i++){
            fatorial *= i ;
        }
        JOptionPane.showMessageDialog(null, +numero+ "! = "+fatorial);
    }
}
