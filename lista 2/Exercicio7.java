import javax.swing.JOptionPane;

/**
 * Exercicio7
 */
public class Exercicio7 {
    public static void main(String[] args) {
        String txtIdade = JOptionPane.showInputDialog("Qual é a sua idade?");
        int idade = Integer.parseInt(txtIdade);

        if (idade>=0 && idade<=2) {
            JOptionPane.showMessageDialog(null, "Bebê");
        }
        else if (idade <= 11) {
            JOptionPane.showMessageDialog(null, "Criança");
        }
        else if (idade <= 17) {
            JOptionPane.showMessageDialog(null, "Adolescente");            
        }
        else if (idade <= 24) {
            JOptionPane.showMessageDialog(null, "Jovem");            
        }
        else if (idade <= 59) {
            JOptionPane.showMessageDialog(null, "Adulto");            
        }
        else if (idade <= 99) {
            JOptionPane.showMessageDialog(null, "Idoso");            
        }
        else{
            JOptionPane.showMessageDialog(null, "Ancião");
        }
    }    
}