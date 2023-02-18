package TrunfoPokemon;

public class Pokemons {
//Atributos
    String nome;
    float altura;
    int ataque;
    int ataque_especial;
    int defesa;
    int velocidade;
    int vida;
    
//Métodos públicos
    public void apresentar() {
        System.out.println("Nome: " +getNome());
        System.out.println("Mede "+getAltura()+"m");
        System.out.println("Ataque: "+getAtaque());
        System.out.println("Ataque especial: "+getAtaque_especial());
        System.out.println("Defesa: "+getDefesa());
        System.out.println("Velocidade: "+getVelocidade());
        System.out.println("Vida: "+getVida());
        System.out.println(" ");
    }

//Métodos especiais
    public Pokemons(String nome, float altura, int ataque, int ataque_especial, int defesa, int velocidade, int vida) {
        this.nome = nome;
        this.altura = altura;
        this.ataque = ataque;
        this.ataque_especial = ataque_especial;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getAtaque_especial() {
        return ataque_especial;
    }
    public void setAtaque_especial(int ataque_especial) {
        this.ataque_especial = ataque_especial;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
}
