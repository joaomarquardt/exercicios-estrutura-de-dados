package questao3;

//3) Implemente uma lista ordenada genérica (usando Generics de Java) que armazene nomes
//em ordem alfabética. Lembre-se de manter a prioridade de ordenação da lista nos métodos
//implementados. Para cada método, diga a sua complexidade.


public class ListaOrdenadaGenerica<T extends Comparable<T>> {
    protected Elo<T> prim;
    protected int tamanho;

    protected class Elo<U> {
        protected U dado;
        protected Elo<U> prox;

        public Elo(U elem) {
            dado = elem;
            prox = null;
        }

        public Elo(U elem, Elo<U> proxElem) {
            dado = elem;
            prox = proxElem;
        }
    }

    public ListaOrdenadaGenerica() {
        prim = null;
        tamanho = 0;
    }

    public void insere(T novo) {
        Elo<T> novoElo = new Elo<>(novo);
        Elo<T> atual;
        Elo<T> ant = null;

        for (atual = prim; atual != null && atual.dado.compareTo(novo) < 0; atual = atual.prox) {
            ant = atual;
        }
        if (ant == null) {
            novoElo.prox = prim;
            prim = novoElo;
        } else {
            ant.prox = novoElo;
            novoElo.prox = atual;
        }

        tamanho++;
    }

    // Complexidade: O(n), pois percorre a lista para encontrar o elemento a ser removido.
    public boolean remove(T elem) {
        Elo<T> atual = prim;
        Elo<T> ant = null;

        for (atual = prim; atual != null && atual.dado.equals(elem); atual = atual.prox) {
            ant = atual;
        }

        if (atual == null) {
            return false;
        }

        if (ant == null) {
            prim = atual.prox;
        } else {
            ant.prox = atual.prox;
        }

        tamanho--;
        return true;
    }

    // Complexidade: O(n), pois percorre a lista até encontrar o elemento ou chegar ao fim.
    public boolean busca(T elem) {
        Elo<T> atual = prim;

        while (atual != null) {
            if (atual.dado.equals(elem)) {
                return true;
            }
            atual = atual.prox;
        }

        return false;
    }

    // Complexidade: O(1).
    public int tamanho() {
        return tamanho;
    }

    // Complexidade: O(n), pois percorre todos os elementos para imprimir.
    public void imprime() {
        Elo<T> atual = prim;

        System.out.println("Elementos da lista:");

        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.prox;
        }

        System.out.println();
    }
}
