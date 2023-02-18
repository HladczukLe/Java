package TrunfoPokemon;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int p1 = aleatorio.nextInt(5);
        int p2 = aleatorio.nextInt(5);

        Pokemons p[] = new Pokemons[5];
        p[0]= new Pokemons("Bulbasauro", 0.7f, 3, 4, 3, 3, 3);
        p[1]= new Pokemons("Squirtle", 0.5f, 3, 3, 4, 3, 3);
        p[2]= new Pokemons("Caterpie", 0.3f, 2, 2, 3, 3, 3);
        p[3]= new Pokemons("Nidorina", 0.8f, 4, 4, 4, 4, 5);
        p[4]= new Pokemons("Beedrill", 1, 6, 3, 3, 5, 4);

        Luta trunfo = new Luta();
        trunfo.sortearCarta(p[p1], p[p2]);
        trunfo.lutar();

    }
}
