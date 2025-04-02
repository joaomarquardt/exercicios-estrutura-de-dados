package questao7;

public class ListaQuestao7
{
    /* Referência para primeiro elemento */
    protected Elo prim;
    protected int tamanho; // Questão 1

    protected class Elo
    {
        protected Inimigo dado;
        protected Elo prox;

        public Elo()
        {
            prox = null;
        }

        public Elo(Inimigo elem)
        {
            dado = elem;
            prox = null;
        }

        public Elo(Inimigo elem, Elo proxElem)
        {
            dado = elem;
            prox = proxElem;
        }
    }

    public ListaQuestao7()
    {
        prim = null;
    }

    public void inserir(Inimigo inimigo) {
        Elo elemento = new Elo();
        if (prim == null) {
            elemento.dado = inimigo;
            return;
        }

        elemento.dado = inimigo;
        elemento.prox = prim;
        prim = elemento;
        tamanho++;

    }

    public Inimigo localizar(Inimigo inimigo) {
        Elo ant = null;
        Elo elem;
        for (elem = prim; elem != null && elem.dado != inimigo; elem = elem.prox) {
            ant = elem;
        }

        if (elem == null) {
            return null;
        }

        if (elem == prim) {
            prim = elem.prox;
        } else {
            ant.prox = elem.prox;
        }

        elem = null;

        return inimigo;
    }

    public int efetuarDano(Inimigo inimigo, double dano) {
        int vida = inimigo.getVida() - dano > 0 ? (int) (inimigo.getVida() - dano) : 0;
        inimigo.setVida(vida);
        if (vida == 0) {
            localizar(inimigo);
            System.out.println("Inimigo agora está morto!");
        }

        System.out.println("Inimigo agora está com " + inimigo.getVida() + " pontos de vida!");
        return vida;

    }

}