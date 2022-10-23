import javax.swing.JOptionPane;

/**
 * Questão 3: Escreva um programa que peça números ao usuário até que o usuário insira o número 0. o programa deve, então, apresentar a soma de todos os números inseridos antes do 0.
 */
public class Exercicio3 {
    public static void main(String[] args) {
        int numero;
        int soma = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para somar ou 0 para parar"));
            soma += numero;
        } while (numero!=0);
        JOptionPane.showMessageDialog(null, "A soma dos números é: " +soma);
    }
}