public class SeparateChainingHashST<Key extends Comparable<Key>, Value> {
    private static final int CAPACIDADE_INICIAL = 3; 

    private int n
    private int m;
    private RedBlackBST<Key, Value>[] arvore;

    public SeparateChainingHashST() {
        this(CAPACIDADE_INICIAL);
    }

    public SeparateChainingHashST(int m) {
        this.m = m;
        arvore = (RedBlackBST<Key, Value>[]) new RedBlackBST[m];
        for (int i = 0; i < m; i++) {
            arvore[i] = new RedBlackBST<>();
        }
    }

    private int hash1(Key chave) {
        int k = chave.toString().charAt(0) - 'A' + 1;
        return (11 * k) % m;
    }

    private int hash2(Key chave) {
        int k = chave.toString().charAt(0) - 'A' + 1;
        return (17 * k) % m;
    }

    public void inserir(Key chave, Value valor) {
        if (chave == null) throw new IllegalArgumentException("primeiro argumento para inserir() é nulo");
        if (valor == null) {
            remover(chave);
            return;
        }

        int indice1 = hash1(chave);
        int indice2 = hash2(chave);
        int indiceAlvo = arvore[indice1].size() <= arvore[indice2].size() ? indice1 : indice2;

        arvore[indiceAlvo].put(chave, valor);
        n++;
    }

    public Value obter(Key chave) {
        int indice1 = hash1(chave);
        int indice2 = hash2(chave);

        if (arvore[indice1].contains(chave)) return arvore[indice1].get(chave);
        if (arvore[indice2].contains(chave)) return arvore[indice2].get(chave);
        return null;
    }

    public void remover(Key chave) {
        int indice1 = hash1(chave);
        int indice2 = hash2(chave);

        if (arvore[indice1].contains(chave)) {
            arvore[indice1].delete(chave);
            n--;
        }
        if (arvore[indice2].contains(chave)) {
            arvore[indice2].delete(chave);
            n--;
        }
    }

    public void imprimirTabela() {
        for (int i = 0; i < m; i++) {
            System.out.print("Árvore " + i + ": ");
            for (Key chave : arvore[i].keys()) {
                System.out.print("(" + chave + ", " + arvore[i].get(chave) + ") ");
            }
            System.out.println();
        }
    }
}
