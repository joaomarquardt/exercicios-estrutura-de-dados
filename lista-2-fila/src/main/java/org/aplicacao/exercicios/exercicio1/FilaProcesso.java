package org.aplicacao.exercicios.exercicio1;

// questão 1
public class FilaProcesso
{
	/* Atributos protected para serem usados na subclasse. */
	protected int tamanho;	/* Tamanho do vetor */
	protected Processo[] vetor;	/* Vetor de elementos */
	protected int ini;	/* Posicao do proximo elemento a ser retirado */
	protected int n;	/* Numero de elementos na fila */

	public FilaProcesso(int tam)
	{
		tamanho = tam;
		vetor = new Processo[tamanho];
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
	public Processo remove()
	{
		Processo elemento = new Processo();
		
		if (!this.vazia())
		{
			elemento = vetor[ini];
			ini = (ini + 1) % tamanho;
			n--;
		} 

		return elemento;
	}
	
	//Inserimos o elemento no final da fila
	public boolean insere(Processo elemento)
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

	public void imprime() {
		System.out.println("PROCESSOS EM ANDAMENTO\n-------------------------");
		for (int i = 0; i < n; i++) {
			System.out.println("----- " + (i + 1) + "° PROCESSO -----");
			System.out.println(vetor[(ini + i) % tamanho]);
		}
		System.out.println();
	}

}