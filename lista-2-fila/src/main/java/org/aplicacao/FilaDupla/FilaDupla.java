package org.aplicacao.FilaDupla;

import org.aplicacao.FilaSimples.Fila;

public class FilaDupla extends Fila
{
	public FilaDupla(int tam)
	{
		super(tam);
	}
	
	public boolean insereInicio(int elemento)
	{
		int prec;
		
		if (!cheia())
		{
			/* Insere na posição precedente ao início */
			prec = (ini - 1 + tamanho) % tamanho;
			vetor[prec] = elemento;
			ini = prec; /* Atualiza índice para início */
			n++;
			return true;
		} 
		else
			return false;
	}
	
	public int removeFim()
	{
		int elemento = Integer.MIN_VALUE;
		int ult;

		if (!this.vazia())
		{
			/* Retira o último elemento */
			ult = (ini + n - 1) % tamanho;
			elemento = vetor[ult];
			n--;
		} 
		
		return elemento;
	}

	// complemento questão 5
	@Override
	public String toString() {
		String retornoString = "VALORES PREENCHIDOS: \n[";
		for (int i = 0; i < n; i++) {
			retornoString += (vetor[i]);
			retornoString += !(i + 1 == n) ? ", " : "]";
		}
		retornoString += "\nPosições vazias: " + (tamanho - n);

		return retornoString;
	}
}
