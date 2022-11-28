import javax.swing.JOptionPane;

public class matriz1 {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Valor ij: "));
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println(" ");

        }
    }
}
