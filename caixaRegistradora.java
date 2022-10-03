import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * caixaRegistradora
 */
public class caixaRegistradora { 

    public static void main(String[] args) {
        float soma = 0;
        float precoProduto;

        do {
            precoProduto = Float.parseFloat(JOptionPane.showInputDialog("Insira o preço do produto ou 0 para finalizar."));
            soma += precoProduto;
        } while (precoProduto!=0.0);

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

            if (formaPGTO == JOptionPane.YES_OPTION ) { //YES_OPTION = Crédito
                Double[] options = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
                Double parcela = (Double)JOptionPane.showInputDialog(
                    null,
                    "Você pode parcelar a compra em até 10x \n Em quantas vezes gostaria de parcelar?",
                    "Parcelas", 
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options, options[0]);
                Double valorParcela = soma/parcela;
                JOptionPane.showMessageDialog(null,"O valor de cada parcela é de R$"+new DecimalFormat("0.00").format(valorParcela)); //Cada 0 no "new DecimalFormat("0.00")" indica os números que tem que aparecer na respectiva ordem da casa decimal
                Double pagamento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor para o pagamento"));
                Double troco = pagamento - valorParcela;
                if (pagamento<valorParcela) {
                    Double troco1 = troco*(-1);
                    JOptionPane.showMessageDialog(null,"Você está devendo R$"+new DecimalFormat("0.00").format(troco1));
                }
                else if (pagamento>valorParcela) {
                    JOptionPane.showMessageDialog(null,"O troco é de R$"+ new DecimalFormat("0.00").format(troco));
                }
            }
            else if (formaPGTO == JOptionPane.NO_OPTION) { //NO_OPTION = cheque
                String parcelamento [] = {"Parcela Única", "2x", "3x"};
                int vezesParcela = JOptionPane.showOptionDialog(
                null,
                "Em quantas vezes gostaria de parcelar? \nCaso escolha parcela única ganhará 5% de desconto", 
                "Pagamento",
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE,
                null,
                parcelamento, parcelamento);
                    if (vezesParcela ==JOptionPane.YES_OPTION) { //YES_OPTION = Parcela única
                        Double valorFinal = soma*0.95;
                        JOptionPane.showMessageDialog(null,"O valor final da compra é de R$"+ new DecimalFormat("0.00").format(valorFinal));

                        Double pagamento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor para o pagamento"));
                        Double troco = pagamento - valorFinal;
                        if (pagamento<valorFinal) {
                            Double troco1 = troco*(-1);
                            JOptionPane.showMessageDialog(null,"Você está devendo R$"+new DecimalFormat("0.00").format(troco1));
                        }
                        else if (pagamento>valorFinal) {
                            JOptionPane.showMessageDialog(null,"O troco é de R$"+ new DecimalFormat("0.00").format(troco));
                        }
                    }
                    else if (vezesParcela ==JOptionPane.NO_OPTION) { //NO_OPTION = 2x
                        Double valorParcela = soma/2.0;
                        JOptionPane.showMessageDialog(null,"O valor de cada parcela é de R$"+new DecimalFormat("0.00").format(valorParcela));
                        Double pagamento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor para o pagamento"));
                        Double troco = pagamento - valorParcela;
                        if (pagamento<valorParcela) {
                            Double troco1 = troco*(-1);
                            JOptionPane.showMessageDialog(null,"Você está devendo R$"+new DecimalFormat("0.00").format(troco1));
                        }
                        else if (pagamento>valorParcela) {
                            JOptionPane.showMessageDialog(null,"O troco é de R$"+ new DecimalFormat("0.00").format(troco));
                        }
                    }
                    else{ //CANCEL_OPTION = 3x
                        Double valorParcela = soma/3.0; 
                        JOptionPane.showMessageDialog(null,"O valor de cada parcela é de R$"+new DecimalFormat("0.00").format(valorParcela));
                        Double pagamento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor para o pagamento"));
                        Double troco = pagamento - valorParcela;
                        if (pagamento<valorParcela) {
                            Double troco1 = troco*(-1);
                            JOptionPane.showMessageDialog(null,"Você está devendo R$"+new DecimalFormat("0.00").format(troco1));
                        }
                        else if (pagamento>valorParcela) {
                            JOptionPane.showMessageDialog(null,"O troco é de R$"+ new DecimalFormat("0.00").format(troco));
                        }
                    } 
            }
            else{ // CANCEL_OPTION = Dinheiro
                Double valorFinal = soma*0.9;
                JOptionPane.showMessageDialog(null,"Ao pagar em dinheiro é dado um desconto de 10%\n O valor final da compra é de R$"+ new DecimalFormat("0.00").format(valorFinal));
                Double pagamento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor para o pagamento"));
                Double troco = pagamento - valorFinal;
                if (pagamento<valorFinal) {
                    Double troco1 = troco*(-1);
                    JOptionPane.showMessageDialog(null,"Você está devendo R$"+new DecimalFormat("0.00").format(troco1));
                }
                else if (pagamento>valorFinal) {
                    JOptionPane.showMessageDialog(null,"O troco é de R$"+ new DecimalFormat("0.00").format(troco));
                }
            }
    }
}
