package lista4;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * Questão 8: Implemente o jogo: Adivinhe o número. As regras do jogo são as seguintes: O computador escolhe um número aleatório inteiro entre 0 e 100. O jogador deve sugerir um número, se ele acertar, o computador avisa que ele acertou e mostra quantas tentativas foram feitas; caso ele não acerte o número, o computador deve dizer se o número aleatório é maior ou menor que o número sugerido e permitir que o usuário faça novas sugestões.
 */

public class Exercicio8 {
    public static void main(String[] args) {
        Random numero = new Random(); 
        int numeroSecreto = numero.nextInt(100);

        int chute = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o número entre 0 e 100"));
        int chances = 5;

        do {
            if (chute > 100 || chute<0) {
            JOptionPane.showMessageDialog(null, "Insira um número entre 0 e 100!");
            chute = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o número entre 0 e 100"));
        }
            else if (chute > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Você errou! O número secreto é menor que o número chutado. Você ainda tem "+chances+" chances!");
                chances--;
                chute = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o número entre 0 e 100"));
            }
            else if (chute < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Você errou! O número secreto é maior que o número chutado. Você ainda tem "+chances+" chances!");
                chances--;
                chute = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o número entre 0 e 100"));
            }
            if (chute == numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Parabéns você acertou!");
                chances = -1;
            }
        } while (chances>0);
        
        if (chances == 0) {
            JOptionPane.showMessageDialog(null, "Suas chances acabaram! O número secreto era "+numeroSecreto);
        }
    }
}
