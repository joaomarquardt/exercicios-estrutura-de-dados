package org.aplicacao.exercicios.exercicio1;


// questão 1
public class Processo {
    private static long numProcessos;
    private final long id;
    private String nomeProcesso;
    private final long tempoDeCriacao;

    public Processo() {
        numProcessos += 1;
        this.id = numProcessos;
        nomeProcesso = "Processo " + id;
        tempoDeCriacao = System.currentTimeMillis();
    }

    public Processo(String nomeProcesso) {
        numProcessos += 1;
        this.id = numProcessos;
        tempoDeCriacao = System.currentTimeMillis();
    }

    public long calcularTempoDeEspera() {
        return System.currentTimeMillis() - tempoDeCriacao;
    }

    @Override
    public String toString() {
        String informacoes =
                "ID: " + this.id +
                "\nNome: " + this.nomeProcesso +
                        "\nTempo de Espera: " + (this.calcularTempoDeEspera() / 1000) + " segundos";

        return informacoes;
    }
}
