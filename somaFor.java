import javax.swing.JOptionPane;

// Escreva um programa que receba 10 números e calcule a soma destes números.

public class somaFor {
    public static void main(String[] args) {
    int soma= 0;
        for (int i=0; i<10; i++) {
            String txtNum = JOptionPane.showInputDialog("Digite um número para somar: "); 
            int num = Integer.parseInt(txtNum);
            soma += num;
        }
        System.out.println("A soma dos números digitados é: "+ soma);
    }
}
