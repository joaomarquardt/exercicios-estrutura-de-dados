package org.aplicacao;

public class Pilha
{
    private int n;
    private int vetor[];
    private int topo;
    private int contPares;

    public Pilha()
    {
        n = 10;
        vetor = new int[n];
        topo = -1;
    }

    public Pilha(int tamanho)
    {
        n = tamanho;
        vetor = new int[tamanho];
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

    public int pop()
    {
        int elemento = Integer.MIN_VALUE;

        if (!this.vazia())
        {
            elemento = vetor[topo];
            // decrementa da variável contPares se o valor 'retirado' da pilha for par
            if (elemento % 2 == 0) {
                contPares--;
            }

            topo--;
        }
        else
        {
            System.out.println("Pilha vazia: pop não funcionou.");
        }

        return elemento;
    }

    public boolean push(int elemento)
    {
        if (!this.cheia())
        {
            vetor[++topo] = elemento;
            // incrementa +1 na variável contPares se o valor adicionado na pilha for par
            if (elemento % 2 == 0) {
                contPares++;
            }
            return true;
        }
        else
        {
            System.out.println("Pilha cheia: push não funcionou.\n");
            return false;
        }
    }

    public int retornaTopo()
    {
        int elemento = Integer.MIN_VALUE;

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

    public int quantidadeNumPares() {
        return contPares;
    }

}
