import javax.swing.JOptionPane;

/*Questão 9: Escreva um programa que receba três números e os apresente em ordem crescente (o menor primeiro, então o mediano e por fim o maior).
*/

public class Exercicio9 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));

        if (num1>=num2 && num1>=num3 && num2>=num3) {
            JOptionPane.showMessageDialog(null, num3 +" "+ num2+" "+num1); // * num1> num2> num3    num3<num2<num1
        } 
        else if (num1>=num2 && num1>=num3 && num3>=num2) {
            JOptionPane.showMessageDialog(null, num2 +" "+ num3+" "+num1); // * num1> num3> num2    num2<num3<num1
        } 
        else if (num2>= num1 && num2>= num3 && num1>=num3) {
            JOptionPane.showMessageDialog(null, num3 +" "+ num1+" "+num2); // * num2> num1> num3    num3<num1<num2
        }
        else if (num2>= num1 && num2>= num3 && num3>=num1) {
            JOptionPane.showMessageDialog(null, num1 +" "+ num3+" "+num2); // * num2> num3> num1    num1<num3<num2
        }
        else if (num3>= num1 && num3>= num2 && num1>=num2) {
            JOptionPane.showMessageDialog(null, num2 +" "+ num1+" "+num3); // * num3> num1> num2    num2<num1<num3
        }
        else if (num3>= num1 && num3>= num2 && num2>=num1) {
            JOptionPane.showMessageDialog(null, num1 +" "+ num2+" "+num3); // * num3> num2> num1    num1<num2<num3
        }
    }
}
