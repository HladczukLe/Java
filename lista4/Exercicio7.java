package lista4;
import javax.swing.JOptionPane;

/*  
 * Escreva um programa que receba as 3 notas de um aluno (lista de exercício, seminário e prova) e calcule a média ponderada considerando que o peso das notas é: 2,3 e 5, respectivamente. Se a média calculada for maior ou igual a 6, mostrar a média e a mensagem 'Aprovado', senão mostrar a média do aluno e a mensagem 'Reprovado'
 */

public class Exercicio7 {
    public static void main(String[] args) {
        double listaExercicio = Double.parseDouble(JOptionPane.showInputDialog("Insira a sua nota da lista de exercícios: "));
        double seminario = Double.parseDouble(JOptionPane.showInputDialog("Insira a sua nota do seminário: "));
        double prova = Double.parseDouble(JOptionPane.showInputDialog("Insira a sua nota da prova: "));
        double mediaP = (2*listaExercicio+3*seminario+5*prova)/10;

        if (mediaP>=6) {
            JOptionPane.showMessageDialog(null, "Aprovado. Sua nota final é "+mediaP, "Média final", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Reprovado. Sua nota final é "+mediaP, "Média final",JOptionPane.PLAIN_MESSAGE );

        }
    }
}
