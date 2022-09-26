/*Escreva um programa que receba duas informações (podem ser textuais) e as apresente na ordem inversa à sua inserção 
(A que foi inserida por último apareça primeiro).*/

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");
        System.out.println("Olá "+sobrenome+ ", " +nome);
    }
    
}
