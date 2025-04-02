package org.aplicacao.exercicios.exercicio3;

public class FilaDeFila
{
	protected int tamanho;
	protected Fila[] vetor;
	protected int ini;
	protected int n;
	
	public FilaDeFila(int tam)
	{
		tamanho = tam;
		vetor = new Fila[tamanho];
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
	public Fila remove()
	{
		Fila elemento = null;
		
		if (!this.vazia())
		{
			elemento = vetor[ini];
			ini = (ini + 1) % tamanho;
			n--;
		} 

		return elemento;
	}
	
	//Inserimos o elemento no final da fila
	public boolean insere(Fila elemento)
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