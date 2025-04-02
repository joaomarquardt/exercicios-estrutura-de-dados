public class Questao6 {
      public static void main(String[] args) {
        SeparateChainingHashST<Character, Integer> sc = new SeparateChainingHashST<>();
        char[] chaves = {'E', 'A', 'S', 'Y', 'Q', 'U', 'T', 'I', 'O', 'N'};

        long tempoInsercaoTotal = 0;
        long tempoBuscaTotal = 0;
        long tempoRemocaoTotal = 0;
        long inicio = System.nanoTime();
        System.out.println("Inserindo chaves na tabela hash:");
        for (int i = 0; i < chaves.length; i++) {  
            sc.inserir(chaves[i], i);
        }
        long fim = System.nanoTime();
        tempoInsercaoTotal = (fim - inicio);

        sc.imprimirTabela();

        inicio = System.nanoTime();
        for (char chave : chaves) {
            sc.obter(chave);
        }
        fim = System.nanoTime();
        tempoBuscaTotal = (fim - inicio);

        inicio = System.nanoTime();
        for (char chave : chaves) {
            sc.remover(chave);
        }
        fim = System.nanoTime();
        tempoRemocaoTotal = (fim - inicio);

        System.out.println("\nTempo médio de inserção: " + (double) tempoInsercaoTotal / chaves.length + "ns");
        System.out.println("Tempo médio de busca: " + (double) tempoBuscaTotal / chaves.length + "ns");
        System.out.println("Tempo médio de remoção: " + (double) tempoRemocaoTotal / chaves.length + "ns");
    }
}