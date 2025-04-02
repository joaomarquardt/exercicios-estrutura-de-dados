package org.aplicacao;


public class Main
{
    public static void main(String args[])
    {
        ArvBinBusca<Integer, String> arvoreBinaria = new ArvBinBusca<>();

        arvoreBinaria.put(10, "Teste1");
        arvoreBinaria.put(20, "Teste2");
        arvoreBinaria.put(5, "Teste3");
        arvoreBinaria.put(2, "Teste4");
        arvoreBinaria.put(4, "Teste5");
        arvoreBinaria.put(18, "Teste6");
        arvoreBinaria.put(22, "Teste6");

        arvoreBinaria.mostra();

        System.out.println();

        System.out.println("O tamanho da �rvore �: " + arvoreBinaria.tamanho());

        System.out.println("A altura da �rvore �: " + arvoreBinaria.altura());

        System.out.println("A menor chave da �rvore �: " + arvoreBinaria.min());

        System.out.println("A maior chave da �rvore �: " + arvoreBinaria.max());

        if(arvoreBinaria.contem(18))
            System.out.println("O n� de chave 18 est� contido na �rvore.");
        else
            System.out.println("O n� de chave 18 n�o est� contido na �rvore.");

        if(arvoreBinaria.contem(23))
            System.out.println("O n� de chave 23 est� contido na �rvore.");
        else
            System.out.println("O n� de chave 23 n�o est� contido na �rvore.");

        arvoreBinaria.deleteMax();

        System.out.println("Impress�o da �rvore ap�s remover o n� de maior chave:");

        arvoreBinaria.mostra();

        System.out.println();

        arvoreBinaria.delete(20);

        System.out.println("Impress�o da �rvore ap�s remover o n� de chave 20:");

        arvoreBinaria.mostra();
    }
}
