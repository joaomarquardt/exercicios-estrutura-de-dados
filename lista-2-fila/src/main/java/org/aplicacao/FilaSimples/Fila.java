package org.aplicacao.FilaSimples;

import org.aplicacao.FilaDupla.FilaDupla;

public class Fila
{
	/* Atributos protected para serem usados na subclasse. */
	protected int tamanho;	/* Tamanho do vetor */
	protected int[] vetor;	/* Vetor de elementos */
	protected int ini;	/* Posicao do proximo elemento a ser retirado */
	protected int n;	/* Numero de elementos na fila */
	
	public Fila(int tam)
	{
		tamanho = tam;
		vetor = new int[tamanho];
		ini = 0;
		n = 0;
	}
	
	public boolean vazia()
	{
		return (n == 0);
	}
	
	public boolean cheia()
	{
		return (n == tamanho);
	}
	
	//Retiramos o elemento do in�cio da fila
	public int remove()
	{
		int elemento = Integer.MIN_VALUE;
		
		if (!this.vazia())
		{
			elemento = vetor[ini];
			ini = (ini + 1) % tamanho;
			n--;
		} 

		return elemento;
	}
	
	//Inserimos o elemento no final da fila
	public boolean insere(int elemento)
	{
	  int fim;
	  
	  if ( !cheia() ) {
	    fim = (ini + n) % tamanho;
	    vetor[fim] = elemento;
	    n++;
	    return true;
	  } 
	  else
	    return false;
	}

	// questão 2
	public void combinaFilas(Fila f1, Fila f2) {
		while (!this.cheia() && !(f1.vazia() && f2.vazia())) {
			if (!f1.vazia()) {
				this.insere(f1.remove());
			}
			if (!this.cheia() && !f2.vazia()) {
				this.insere(f2.remove());
			}

		}
	}

	// questão 4
	public static FilaDupla transformaEmFilaDupla(Fila fila) {
		FilaDupla filaDupla = new FilaDupla(fila.tamanho);
		int numElementos = fila.n;
		for (int i = 0; i < numElementos; i++) {
			filaDupla.insere(fila.remove());
		}
		return filaDupla;
	}

	// questão 5
	public void representacaoBinaria() {
		this.insere(1);
		for (int i = 0; i < n; i++) {
			int num = this.remove();
			System.out.print(num);
			System.out.print(' ');
			this.insere(num * 10 + 0);
			this.insere(num * 10 + 1);
		}
	}

}