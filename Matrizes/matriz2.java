import java.util.Random;

public class matriz2 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random valor = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = valor.nextInt(100);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < matriz.length; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            System.out.println(" ");
            System.out.println("soma da linha "+(i+1)+": "+somaLinha+" ");
            System.out.println("soma da coluna "+(i+1)+": "+somaColuna+" ");
        }
    }
}
