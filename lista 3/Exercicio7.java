import javax.swing.JOptionPane;

/*Questao 7: Escreva um programa que receba dois números e calcule a o primeiro elevado ao segundo
(operação de exponencial). Obs.: Crie sua própria função que realiza a operacao de exponenciacao,
sem utilizar a função do Math.h */

public class Exercicio7 {
    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Insira a base da potência: "));
        int quociente = Integer.parseInt(JOptionPane.showInputDialog("Insira o quociente da potência: "));
        int resultadoPotencia=1; 

        for(int i=0; i<quociente;i++){
            resultadoPotencia *= base;
        }
        JOptionPane.showMessageDialog(null, base+"^"+quociente+" = "+resultadoPotencia);
    }
}
