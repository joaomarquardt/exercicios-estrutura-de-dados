package org.aplicacao.exercicios.exercicio3;

public class Fila {
    protected int tamanho;
    protected int[] vetor;
    protected int ini;
    protected int n;

    public Fila(int tam) {
        tamanho = tam;
        vetor = new int[tamanho];
        ini = 0;
        n = 0;
    }

    public boolean vazia() {
        return (n == 0);
    }

    public boolean cheia() {
        return (n == tamanho);
    }

    //Retiramos o elemento do in�cio da fila
    public int remove() {
        int elemento = Integer.MIN_VALUE;

        if (!this.vazia()) {
            elemento = vetor[ini];
            ini = (ini + 1) % tamanho;
            n--;
        }

        return elemento;
    }

    //Inserimos o elemento no final da fila
    public boolean insere(int elemento) {
        int fim;

        if (!cheia()) {
            fim = (ini + n) % tamanho;
            vetor[fim] = elemento;
            n++;
            return true;
        } else
            return false;
    }
}