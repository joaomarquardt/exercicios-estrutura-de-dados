package org.aplicacao;

public class Questao2 {
    public static void main(String[] args) {

        ArvBinBusca<Integer, String> arvore = ArvBinBusca.constroiArvore(new int[]{5, 8, 2, 12, 1, -4, 7, 6, 21, 14, 3});

        arvore.mostra();
    }
}