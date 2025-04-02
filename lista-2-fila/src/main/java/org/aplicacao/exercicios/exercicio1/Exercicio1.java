package org.aplicacao.exercicios.exercicio1;

//1) Sabe-se que existem partes de sistemas operacionais que cuidam da ordem em que os
//processos devem ser executados. Por exemplo, em um sistema de computação “timeshared”,
//existe a necessidade de manter um conjunto de processos em uma fila. Realize uma
//modelagem e crie classes que representam um Processo e o Sistema Operacional. Dessa
//maneira, escreva métodos para:
//a. Incluir novos processos em uma fila de processos;
//b. Retirar da fila o processo com o maior tempo de espera;
//c. Imprimir o conteúdo da fila de processos em determinado momento. Cada processo possui
//um número identificador

public class Exercicio1 {
    public static void main(String[] args) throws InterruptedException {
        SistemaOperacional so = new SistemaOperacional();
        while (!so.filaCheia()) {
            so.insereProcesso(new Processo());
            Thread.sleep(1000); // sleep implementado para ficar mais clara a diferença no tempo de espera
        }

        so.imprimeProcessosNaFila();

        while (!so.filaVazia()) {
            so.removeProcesso();
        }

        so.imprimeProcessosNaFila();

    }
}
