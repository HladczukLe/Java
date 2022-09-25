//Escreva um programa que receba uma temperatura em graus Fahrenheit e a converta para graus Celsius

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        String fahrenheit = JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit:");
        Float tempFahrenheit = Float.parseFloat(fahrenheit);
        Float tempCelsius = (tempFahrenheit-32)*(5.0f/9.0f);

        JOptionPane.showMessageDialog(null, "A conversão da temperatura digitada é " +tempCelsius+ "°C");
    }
}
