import javax.swing.JOptionPane;

/*
  Questão 4: Escreva um programa que apresente um menu para o usuário selecionar uma das quatro
    operações fundamentais (soma, subtração, multiplicação ou divisão) e após o usuário selecionar a
    operação, permita ao usuário inserir dois números e apresente o resultado da operação selecionada
    com estes números.

 */

public class Exercicio4 {
    public static void main(String[] args) {
        String[] operadores = {"Soma","Subtração","Multiplicação","Divisão"};
        int operacao = JOptionPane.showOptionDialog(null,
        "Selecione a operação que irá ser utilizada",
        null,
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        operadores, 
        operadores[0]);
        
        if (operacao == 0) {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número a ser somado: "));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número a ser somado: ")); 
            int soma = numero1+numero2;   
            JOptionPane.showMessageDialog(null, "A soma dos números é: "+soma);
        } 
        else if (operacao == 1) {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número a ser subtraído: "));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número a ser subtraído: ")); 
            int subtracao = numero1-numero2;   
            JOptionPane.showMessageDialog(null, "A subtração dos números é: "+subtracao);
        } 
        else if (operacao == 2) {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número a ser multiplicado: "));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número a ser multiplicado: ")); 
            int multiplicacao = numero1*numero2;   
            JOptionPane.showMessageDialog(null, "O produto dos números é: "+multiplicacao);
        }
        else if (operacao == 3) {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numerador da fração (número de cima): "));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dividendo da fração (número de baixo): ")); 
            int divisao = numero1/numero2;   
            JOptionPane.showMessageDialog(null, "A divisão dos números é: "+divisao);
        }
    }
}
