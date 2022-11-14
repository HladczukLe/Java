package lista4;
import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;

/**
 * Exercicio6
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Random numero = new Random();
        int senha = numero.nextInt(100000);
        DecimalFormat aa = new DecimalFormat("000000");
        JOptionPane.showMessageDialog(null,"Senha aleatória: "+aa.format(senha));
    }
}