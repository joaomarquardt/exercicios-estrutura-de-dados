package org.aplicacao;

public class Questao6 {
    public static void main(String[] args) {
        ArvBinBusca<Integer, String> arvoreBinaria = new ArvBinBusca<>();

        arvoreBinaria.put(8, "a");
        arvoreBinaria.put(5, "a");
        arvoreBinaria.put(12, "a");
        arvoreBinaria.put(2, "a");
        arvoreBinaria.put(7, "a");
        arvoreBinaria.put(1, "a");
        arvoreBinaria.put(9, "a");
        arvoreBinaria.put(13, "a");
//        arvoreBinaria.put(-2, "a");

        if (arvoreBinaria.eBalanceada()) {
            System.out.println("A árvore é balanceada");
        } else {
            System.out.println("A árvore não é balanceada");
        }
    }
}
