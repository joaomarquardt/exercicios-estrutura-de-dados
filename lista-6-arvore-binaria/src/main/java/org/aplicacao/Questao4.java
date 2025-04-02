package org.aplicacao;

public class Questao4 {
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

        boolean removeu = arvoreBinaria.removeForaIntervalo(0, 10);
        if (removeu) {
            System.out.println("Foi removido ao menos um nó que não estava contido no intervalo mínimo e máximo");
        } else {
            System.out.println("Nenhum nó foi removido");
        }
    }
}
