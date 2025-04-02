public class Questao4 {
    public static void main(String[] args) {
        SeparateChainingHashST<Character, Integer> sc = new SeparateChainingHashST<>();
        char[] chaves = {'E', 'A', 'S', 'Y', 'Q', 'U', 'T', 'I', 'O', 'N'};
        for (int i = 0; i < chaves.length; i++) {
            sc.inserir(chaves[i], i);
        }

        sc.imprimirTabela();

        int totalComparacoes = 0;
        for (char chave : chaves) {
            int indice1 = sc.hash1(chave);
            int indice2 = sc.hash2(chave);
            int tamanhoLista1 = sc.getTamanhoLista(indice1);
            int tamanhoLista2 = sc.getTamanhoLista(indice2);
            totalComparacoes += Math.min(tamanhoLista1, tamanhoLista2);
        }

        double mediaComparacoes = (double) totalComparacoes / chaves.length;
        System.out.printf("\nMédia de comparações bem-sucedidas: %.2f\n", mediaComparacoes);
    }
}