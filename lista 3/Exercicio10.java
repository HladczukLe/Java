import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        int primo=0;
        int numero = Integer.parseInt(JOptionPane.showInputDialog(("Digite um número para verificar se é primo ou não: ")));

        for (int i = numero; i>=1; i--) {
            if (numero%i==0) {
                primo++;
            }
        }

        if (numero == 2) {
            JOptionPane.showMessageDialog(null, numero+" é primo");
        }
        else if (primo > 2) {
            JOptionPane.showMessageDialog(null, numero+" não é primo");
        }
        else{
            JOptionPane.showMessageDialog(null, numero+" é primo");
        }
    }
}
