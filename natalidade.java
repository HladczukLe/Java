// Dado um país A, com 5.000.000 de habitantes e uma taxa de natalidade de 3% ao ano, e um país B com 7.000.000 de habitantes e uma taxa de natalidade de 2% ao ano, calcular e imprimir o tempo necessário para que a população do país A ultrapasse a população do país B

public class natalidade {
    public static void main(String[] args) {
        int paisA = 5000;
        int paisB = 7000;
        int ano = 0;

        while (paisA <= paisB) {
            paisA *= 1.03;
            paisB *= 1.02;
            ano++;
        }
        System.out.println("levarão "+ano+ " anos para que a população do país A ultrapasse a população do país B");
    }
}
