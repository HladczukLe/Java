package IFB.Módulo2.LDP2;


import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * caixaRegistradora
 */
public class caixaRegistradora { 

    public static void main(String[] args) {
        String txtContador = JOptionPane.showInputDialog("Quantos produtos vão ser passados?");
        int contador = Integer.parseInt(txtContador);
        float soma = 0;

        for(int i = 0; i < contador; i++) {
            String txtPrecoProduto = JOptionPane.showInputDialog("Insira o preço do produto");
            float precoProduto = Float.parseFloat(txtPrecoProduto);
            soma += precoProduto; 
        }
        JOptionPane.showMessageDialog(null,"O valor total da compra é de R$"+new DecimalFormat("0.00").format(soma));

        String option [] = {"Crédito", "Cheque", "Dinheiro"}; //lista de valores para o JOptionPane.YES_NO_CANCEL_OPTION
        int formaPGTO = JOptionPane.showOptionDialog(
            null, //Componente
            "Qual será a forma de pagamento?", //Mensagem
            "Pagamento", //Título
            JOptionPane.YES_NO_CANCEL_OPTION, //n° de opções e o valor delas
            JOptionPane.QUESTION_MESSAGE, //indicação do pq da mensagem, nesse caso é uma pergunta
            null,
            option, option); //lista option

            if (formaPGTO == JOptionPane.YES_OPTION ) {
                String txtParcela = JOptionPane.showInputDialog("Você pode parcelar a compra em até 10x \n Em quantas vezes gostaria de parcelar?");
                Double parcela = Double.parseDouble(txtParcela);
                Double valorParcela = soma/parcela;
                JOptionPane.showMessageDialog(null,"O valor de cada parcela é de R$"+new DecimalFormat("0.00").format(valorParcela)); //Cada 0 no "new DecimalFormat("0.00")" indica os números que tem que aparecer na respectiva ordem da casa decimal
                String txtPagamento = JOptionPane.showInputDialog("Insira o valor para o pagamento");
                Double pagamento = Double.parseDouble(txtPagamento);
                Double troco = pagamento - valorParcela;
                JOptionPane.showMessageDialog(null,"O troco é de R$"+ new DecimalFormat("0.00").format(troco));
            }
            else if (formaPGTO == JOptionPane.NO_OPTION) {
                String parcelamento [] = {"Parcela Única", "2x", "3x"};
                int vezesParcela = JOptionPane.showOptionDialog(
                null,
                "Em quantas vezes gostaria de parcelar? \nCaso escolha parcela única ganhará 5% de desconto", 
                "Pagamento",
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE,
                null,
                parcelamento, parcelamento);
                    if (vezesParcela ==JOptionPane.YES_OPTION) {
                        Double valorFinal = soma*0.95;
                        JOptionPane.showMessageDialog(null,"O valor final da compra é de R$"+ new DecimalFormat("0.00").format(valorFinal));

                        String txtPagamento = JOptionPane.showInputDialog("Insira o valor para o pagamento");
                        Double pagamento = Double.parseDouble(txtPagamento);
                        Double troco = pagamento - valorFinal;
                        JOptionPane.showMessageDialog(null,"O troco é de R$"+ new DecimalFormat("0.00").format(troco));
                    }
                    else if (vezesParcela ==JOptionPane.NO_OPTION) {
                        Double valorParcela = soma/2.0;
                        JOptionPane.showMessageDialog(null,"O valor de cada parcela é de R$"+new DecimalFormat("0.00").format(valorParcela));
                        String txtPagamento = JOptionPane.showInputDialog("Insira o valor para o pagamento");
                        Double pagamento = Double.parseDouble(txtPagamento);
                        Double troco = pagamento - valorParcela;
                        JOptionPane.showMessageDialog(null,"O troco é de R$"+ new DecimalFormat("0.00").format(troco));
                    }
                    else{
                        Double valorParcela = soma/3.0;
                        JOptionPane.showMessageDialog(null,"O valor de cada parcela é de R$"+new DecimalFormat("0.00").format(valorParcela));
                        String txtPagamento = JOptionPane.showInputDialog("Insira o valor para o pagamento");
                        Double pagamento = Double.parseDouble(txtPagamento);
                        Double troco = pagamento - valorParcela;
                        JOptionPane.showMessageDialog(null,"O troco é de R$"+ new DecimalFormat("0.00").format(troco));
                    } 
            }
            else{
                Double valorFinal = soma*0.9;
                JOptionPane.showMessageDialog(null,"Ao pagar em dinheiro é dado um desconto de 10%\n O valor final da compra é de R$"+ new DecimalFormat("0.00").format(valorFinal));
                String txtPagamento = JOptionPane.showInputDialog("Insira o valor para o pagamento");
                Double pagamento = Double.parseDouble(txtPagamento);
                Double troco = pagamento - valorFinal;
                JOptionPane.showMessageDialog(null,"O troco é de R$"+ new DecimalFormat("0.00").format(troco));
            }
    }
}