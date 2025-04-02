package questao7;

//7) No desenvolvimento de um jogo, é necessário armazenar os inimigos que seu personagem
//está enfrentando na fase. Um inimigo é definido como uma instância da classe “Inimigo”, que
//possui a seguinte estrutura:
//public class Inimigo
//{
//    private int vida;
//    private double danoPorSegundo;
//    public void setVida(int vida);
//    public int getVida();
//    public void setDanoPorSegundo(double danoPorSegundo);
//    public double getDanoPorSegundo();
//}
//Por sua vez, os inimigos são armazenados em uma lista encadeada que possui os
//seguintes métodos:
//public void inserir(Inimigo inimigo);
//public Inimigo localizar(Inimigo inimigo);
//public int efetuarDano(Inimigo inimigo, double dano);
//Considere que o método efetuarDano(Inimigo inimigo, double dano)
//remove o inimigo da estrutura caso o dano sofrido reduza a vida do objeto inimigo a zero.
//Dessa maneira, implemente essa estrutura de dados para o jogo em questão.

public class Inimigo {
    private int vida;
    private double danoPorSegundo;

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setDanoPorSegundo(double danoPorSegundo) {
        this.danoPorSegundo = danoPorSegundo;
    }

    public double getDanoPorSegundo() {
        return getDanoPorSegundo();
    }

}
