package lista4;

/**
 * Escreva um programa que liste todos os números primos de 1 a 1000
 */
public class Exercicio14 {
    public static void main(String[] args) {
        int numero=1000;
        int divisores = 0;
        for(int i = 0; i<1000; i++){
            ehPrimo(numero, divisores);
            numero--;
        }
    }
    public static void ehPrimo(int numero, int divisores) {
        for(int i=numero; i>=1;i--){
            if (numero%i==0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println(numero);
        }
        else {
        }  
    }
}