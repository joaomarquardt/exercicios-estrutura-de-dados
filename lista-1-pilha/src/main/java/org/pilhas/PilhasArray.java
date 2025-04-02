package org.pilhas;

public class PilhasArray {
    private char[] vetor;
    private int topoPilha1;
    private int topoPilha2;
    private int tamanho;

    public PilhasArray(int tamanho) {
        this.topoPilha1 = -1;
        this.topoPilha2 = tamanho - 1;
        this.vetor = new char[tamanho];
        this.tamanho = tamanho;
    }

    public boolean vazia(int idPilha)
    {
        if (idPilha == 1) {
            return topoPilha1 == -1;
        } else {
            return topoPilha2 == tamanho - 1;
        }

    }

    public boolean cheia()
    {
        return topoPilha1 == topoPilha2;
    }

    public char pop(int idPilha) {
        char c = '\0';
        int topo = (idPilha == 1) ? topoPilha1 : topoPilha2;

        if (!this.vazia(idPilha)) {
            c = vetor[topo];
            var aux = (idPilha == 1) ? topoPilha1-- : topoPilha2++;
        }
        else {
            System.out.println("*- PILHA VAZIA. POP NÃO FUNCIONOU");
        }
        return c;
    }

    public boolean push(int idPilha, char elemento)
    {
        if (!this.cheia()) {
            int topo = (idPilha == 1) ? ++topoPilha1 : --topoPilha2;
            vetor[topo] = elemento;
            return true;
        }
        else {
            //Impressão para fins didáticos
            System.out.println("*- PILHA CHEIA: PUSH NÃO FUNCIONOU.\n");
            return false;
        }
    }

    public char retornaTopo(int idPilha) {
        char elemento = '\0';
        int topo = (idPilha == 1) ? topoPilha1 : topoPilha2;
        if(!this.vazia(idPilha)) {
            elemento = vetor[topo];
        }
        else {
            System.out.println("*- PILHA VAZIA.");
        }

        return elemento;
    }

}
