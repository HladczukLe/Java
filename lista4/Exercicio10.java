package lista4;
import javax.swing.JOptionPane;

/*
 * Escreva um programa que receba 10 números do usuário. Depois identifique quais destes valores são maiores que o último valor.
 */
public class Exercicio10 {
    public static void main(String[] args) {
        int[] lista = new int[10];
        
        for(int i=0; i < lista.length; i++ ){
            lista[i]=Integer.parseInt(JOptionPane.showInputDialog("Insira um valor na lista: "));
        }
        System.out.println("Valores maiores que o último valor da lista: ");
        for(int i=0; i < lista.length; i++){
            if (lista[i]>lista[9]) {
                System.out.println(lista[i]);
            }
        }
    }
}
