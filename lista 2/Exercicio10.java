package Lista2;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(final String[] args) {
    int soma= 0;
        for (int i=0; i<10; i++) {
            String txtNum = JOptionPane.showInputDialog("Digite um número para somar: "); 
            int num = Integer.parseInt(txtNum);
            soma += num;
        }
        System.out.println("A soma dos números digitados é: "+ soma);
    }
}
