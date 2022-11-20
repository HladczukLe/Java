package lista4;

import javax.swing.JOptionPane;

/**
 *  Escreva um programa que receba do usuário um número n e outro p e calcule a combinação n, p a p.
 */
public class Exercicio13 {
    public static void main(String[] args) {
        int objeto = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade total de objetos no conjunto")); //n
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de elementos: ")); //p

        int combinacao = fatorialObjeto(objeto)/(fatorialElementos(elementos)*fatorialDenominador(elementos, objeto)); //C = n!/(p!(n-p))!
        JOptionPane.showMessageDialog(null, "O valor da combinação é: "+combinacao);
        
    }
    public static int fatorialObjeto(int objeto) { //n!
        for(int i=objeto-1; i>1; i--){
            objeto *=i;
        }
        return objeto;
    }
    public static int fatorialElementos(int elementos) { //p!
        for(int i=elementos-1; i>1; i--){
            elementos *=i;
        }
        return elementos;
    }
    public static int fatorialDenominador(int elementos, int objeto) { //(n-p)!
        int denominador = objeto-elementos;

        for(int i=denominador-1; i>1; i--){
            denominador*=i;
        }
        return denominador;
    }      
}