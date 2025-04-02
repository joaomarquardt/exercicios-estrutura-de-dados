package org.aplicacao;

public class Questao3 {
    public static void main(String[] args) {
        ArvBinBusca<Integer, String> arvoreBinaria1 = new ArvBinBusca<>();

        arvoreBinaria1.put(8, "Teste1");
        arvoreBinaria1.put(5, "Teste2");
        arvoreBinaria1.put(12, "Teste3");
        arvoreBinaria1.put(2, "Teste4");
        arvoreBinaria1.put(7, "Teste5");
        arvoreBinaria1.put(1, "Teste6");
        arvoreBinaria1.put(9, "Teste6");
        arvoreBinaria1.put(13, "Teste6");

        ArvBinBusca<Integer, String> arvoreBinaria2 = new ArvBinBusca<>();

        arvoreBinaria2.put(8, "Teste1");
        arvoreBinaria2.put(5, "Teste2");
        arvoreBinaria2.put(12, "Teste3");
        arvoreBinaria2.put(2, "Teste4");
        arvoreBinaria2.put(7, "Teste5");
        arvoreBinaria2.put(1, "Teste6");
        arvoreBinaria2.put(9, "Teste6");
        arvoreBinaria2.put(13, "Teste6");

        if (arvoreBinaria1.eSimilar(arvoreBinaria2)) {
            System.out.println("É similar");
        } else {
            System.out.println("Não é similar");
        }
    }
}
