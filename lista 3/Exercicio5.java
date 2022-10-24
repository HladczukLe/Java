import java.text.DecimalFormat;

/**
 * Questão 5: Escreva um programa que escreva na tela uma tabela contendo 10 valores igualmente
    espaçados de graus fahrenheit e o seu valor convertido para graus Celsius. Utilize valores de 0
    a 300 graus fahrenheit (0, 30, 60, 90, ..., 300).
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Double celsius=0.0;
        Double fahrenheit;
        
        for (fahrenheit=0.0; fahrenheit<=300;fahrenheit+=30) {
            celsius = (fahrenheit-32)*(5.0f/9.0f);
            
            System.out.println("Celsius "+new DecimalFormat("#,##0.00°C").format(celsius)+ "\tFahrenheit: "+fahrenheit+"°F");
        }
    }
}
