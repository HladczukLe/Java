package TrunfoPokemon;

import java.util.Random;

import javax.swing.JOptionPane;

public class Luta {
    Random aleatorio = new Random();
    private Pokemons CartaJogador;
    private Pokemons CartaMaquina;
    
    public void sortearCarta(Pokemons p1, Pokemons p2) {
        String option [] = {"Sortear"};
        int sorteio = JOptionPane.showOptionDialog(null, "Clique abaixo para sortear as cartas", "Sorteio das Cartas", JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option);

        if (sorteio == JOptionPane.YES_OPTION) {
            CartaJogador = p1;
            CartaMaquina = p2;
            while (CartaJogador==CartaMaquina) {
                CartaMaquina = p2;
            }
            exibirCartaJogador();
        }
    }
    
    public void selecionarAtributo() {
        
    }
    
    public void lutar() {
        String options[] = {"Altura", "Ataque", "Ataque Especial", "Defesa", "Velocidade", "Vida"};
        String atributos = (String)JOptionPane.showInputDialog(null, "Selecione um atributo para iniciar a batalha", "Atributo", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (atributos == "Altura") {
            if (CartaJogador.getAltura()==CartaMaquina.getAltura()) {
                System.out.println("Empate");
            }
            else if (CartaJogador.getAltura()>CartaMaquina.getAltura()) {
                System.out.println("Você ganhou!");
            }
            else{
                System.out.println("Você perdeu!");
            }
        }
        else if (atributos == "Ataque") {
            if (CartaJogador.getAtaque()==CartaMaquina.getAtaque()) {
                System.out.println("Empate");
            }
            else if (CartaJogador.getAtaque()>CartaMaquina.getAtaque()) {
                System.out.println("Você ganhou!");
            }
            else{
                System.out.println("Você perdeu!");
            }
        }
        else if (atributos == "Ataque Especial") {
            if (CartaJogador.getAtaque_especial()==CartaMaquina.getAtaque_especial()) {
                System.out.println("Empate");
            }
            else if (CartaJogador.getAtaque_especial()>CartaMaquina.getAtaque_especial()) {
                System.out.println("Você ganhou!");
            }
            else{
                System.out.println("Você perdeu!");
            }
        }
        else if (atributos == "Defesa") {
            if (CartaJogador.getDefesa()==CartaMaquina.getDefesa()) {
                System.out.println("Empate");
            }
            else if (CartaJogador.getDefesa()>CartaMaquina.getDefesa()) {
                System.out.println("Você ganhou!");
            }
            else{
                System.out.println("Você perdeu!");
            }
        }
        else if (atributos == "Velocidade") {
            if (CartaJogador.getVelocidade()==CartaMaquina.getVelocidade()) {
                System.out.println("Empate");
            }
            else if (CartaJogador.getVelocidade()>CartaMaquina.getVelocidade()) {
                System.out.println("Você ganhou!");
            }
            else{
                System.out.println("Você perdeu!");
            }
        }
        else if (atributos == "Vida") {
            if (CartaJogador.getVida()==CartaMaquina.getVida()) {
                System.out.println("Empate");
            }
            else if (CartaJogador.getVida()>CartaMaquina.getVida()) {
                System.out.println("Você ganhou!");
            }
            else{
                System.out.println("Você perdeu!");
            }
        }
        System.out.println(" ");
        exibirCartaMaquina();
        
    }
    
    public void exibirCartaJogador() {
        System.out.println("=== A SUA CARTA É ===");
        CartaJogador.apresentar();
    }
    public void exibirCartaMaquina() {
        System.out.println("=== A CARTA DA MÁQUINA É ===");
        CartaMaquina.apresentar();
    }
    
}