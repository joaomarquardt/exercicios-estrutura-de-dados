package org.aplicacao.exercicios.exercicio3;

public class FilaDePilha
{
	protected int tamanho;
	protected Pilha[] vetor;
	protected int ini;
	protected int n;
	
	public FilaDePilha(int tam)
	{
		tamanho = tam;
		vetor = new Pilha[tamanho];
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
	public Pilha remove()
	{
		Pilha elemento = null;
		
		if (!this.vazia())
		{
			elemento = vetor[ini];
			ini = (ini + 1) % tamanho;
			n--;
		} 

		return elemento;
	}
	
	//Inserimos o elemento no final da fila
	public boolean insere(Pilha elemento)
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

}