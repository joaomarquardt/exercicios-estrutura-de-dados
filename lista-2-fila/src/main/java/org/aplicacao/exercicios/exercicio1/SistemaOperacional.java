package org.aplicacao.exercicios.exercicio1;

// questão 1
public class SistemaOperacional {
    private FilaProcesso filaProcessos;

    public SistemaOperacional() {
        filaProcessos = new FilaProcesso(10);
    }

    public boolean insereProcesso(Processo processo) {
        return filaProcessos.insere(processo);
    }

    public Processo removeProcesso() {
        return filaProcessos.remove();
    }

    public void imprimeProcessosNaFila() {
        filaProcessos.imprime();
    }

    public boolean filaCheia() {
        return filaProcessos.cheia();
    }

    public boolean filaVazia() {
        return filaProcessos.vazia();
    }
}
