public class Questao1 {
    public static void main(String[] args) {
        SeparateChainingHashST<Character, Integer> tabela = new SeparateChainingHashST<>(5);
        char[] chaves = {'E', 'A', 'S', 'Y', 'Q', 'U', 'T', 'I', 'O', 'N'};
        
        for (int i = 0; i < chaves.length; i++) {
            char chave = chaves[i];
            int indice = (11 * (chave - 'A' + 1)) % 5;
            tabela.put(chave, indice);
        }

        imprimirTabelaHash(tabela);
    }

    public static void printarTabelaHash(SeparateChainingHashST<Character, Integer> tabela) {
        System.out.println("Tabela Hash:");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " -> ");
            for (Character chave : tabela.keys()) {
                if ((11 * (chave - 'A' + 1)) % 5 == i) {
                    System.out.print(chave + " -> ");
                }
            }
            System.out.println("null");
        }
    }
}
