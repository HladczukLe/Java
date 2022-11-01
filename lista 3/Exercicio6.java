package lista3;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*Questao 6: Escreva um programa que receba do usuario as sete últimas cotações do dólar e, em seguida, calcule a média da cotação do dólar na ultima semana. Utilize a média aritmética (soma de todos os valores, dividida pela quantidade de valores).*/

public class Exercicio6 {
    public static void main(String[] args) {
        Float cotacaoDolar;
        float somaCotacao = 0;

        for(int i=0;i<7;i++){
            cotacaoDolar = Float.parseFloat(JOptionPane.showInputDialog("Insira a cotação do dólar: "));
            somaCotacao +=cotacaoDolar;
        }
        float mediaCotacao = somaCotacao/7.0f;
        JOptionPane.showMessageDialog(null, "A média das cotações inseridas é de: R$"+new DecimalFormat("0.00").format(mediaCotacao));
    }
}
