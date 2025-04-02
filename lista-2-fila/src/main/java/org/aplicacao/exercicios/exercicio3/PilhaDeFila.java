package org.aplicacao.exercicios.exercicio3;

public class PilhaDeFila
{
    private int n;
    private Fila[] vetor;
    private int topo;

    public PilhaDeFila()
    {
        n = 10;
        vetor = new Fila[n];
        topo = -1;
    }

    public PilhaDeFila(int tamanho)
    {
        n = tamanho;
        vetor = new Fila[tamanho];
        topo = -1;
    }

    public boolean vazia()
    {
        return topo == -1;
    }

    public boolean cheia()
    {
        return topo == n - 1;
    }

    public Fila pop()
    {
        Fila fila = null;

        if (!this.vazia())
        {
            fila = vetor[topo];

            //Decrementando o topo, o elemento é "removido"
            topo--;
        }
        else
        {
            //Impress�o para fins didáticos
            System.out.println("Pilha vazia: pop não funcionou.");
        }

        return fila;
    }

    public boolean push(Fila elemento)
    {
        if (!this.cheia())
        {
            vetor[++topo] = elemento;
            return true;
        }
        else
        {
            //Impress�o para fins didáticos
            System.out.println("Pilha cheia: push não funcionou.\n");
            return false;
        }
    }

    public Fila retornaTopo()
    {
        Fila elemento = null;

        if(!this.vazia())
        {
            elemento = vetor[topo];
        }
        else
        {
            System.out.println("Pilha vazia.");
        }

        return elemento;
    }
}

