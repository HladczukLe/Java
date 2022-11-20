package lista4;

/*Escreva um programa que apresente os 50 primeiros números da série de Fibonacci. A
série de Fibonacci é uma série em que o valor de um elemento é dado pela soma dos dois elementos
logo anteriores. Os dois primeiros termos da série de Fibonacci são iguais a 1. 

    1 1 2 3 5 8 13 ...


 */

public class Exercicio15 {
    public static void main(String[] args) {
        sequenciaFibonacci();
    }
    public static void sequenciaFibonacci() {
        int[] Fn=new int[50];
        int n=1;
        System.out.println("Sequência de Fibonacci: ");

        for(int i=1; i<=50;i++){
            Fn[i] += (n-Fn[i-1]);
            n+=Fn[i];
            System.out.println(Fn[i]);
        }
    }
}
