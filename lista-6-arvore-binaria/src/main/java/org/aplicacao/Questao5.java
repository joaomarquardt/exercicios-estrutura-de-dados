package org.aplicacao;

public class Questao5 {
    public static void main(String[] args) {
        ArvBinBusca<Integer, String> arvoreBinaria = new ArvBinBusca<>();

        arvoreBinaria.put(8, "Teste1");
        arvoreBinaria.put(5, "Teste2");
        arvoreBinaria.put(12, "Teste3");
        arvoreBinaria.put(2, "Teste4");
        arvoreBinaria.put(7, "Teste5");
        arvoreBinaria.put(1, "Teste6");
        arvoreBinaria.put(9, "Teste6");
        arvoreBinaria.put(13, "Teste6");

        // não sei como resolver pois No é classe privada e não dá pra instanciá-la aqui.
        // Pensei em adicionar um método pra buscar No mas pioraria a complexidade.

        /*
        No no = arvoreBinaria.obtemAncestralComum(7, 2);
        if (no) {
            System.out.println("O menor ancestral comum entre as chaves definidas é " + no.chave);
        } else {
            System.out.println("Não há ancestral comum.");
        }
         */
    }
}
