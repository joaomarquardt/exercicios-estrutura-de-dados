public class Questao2 {
    public static void main(String[] args) {
        char[] chaves = {'S', 'E', 'A', 'R', 'C', 'H', 'X', 'M', 'P', 'L'};
        int a = 1, M = chaves.length;
        while (true) {
            if (encontrarHashPerfeito(chaves, a, M)) {
                System.out.println("Valores encontrados: a = " + a + ", M = " + M);
                break;
            }
            M++;
        }
    }

    public static boolean encontrarHashPerfeito(char[] chaves, int a, int M) {
        boolean[] ocupados = new boolean[M];
        for (char chave : chaves) {
            int k = chave - 'A' + 1;
            int indice = (a * k) % M;
            if (ocupados[indice]) return false;
            ocupados[indice] = true;
        }
        return true;
    }
}
