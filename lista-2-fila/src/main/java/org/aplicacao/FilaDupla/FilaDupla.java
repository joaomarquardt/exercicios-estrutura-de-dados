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
			/* Insere na posi��o precedente ao in�cio */
			prec = (ini - 1 + tamanho) % tamanho;
			vetor[prec] = elemento;
			ini = prec; /* Atualiza �ndice para in�cio */
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
			/* Retira o �ltimo elemento */
			ult = (ini + n - 1) % tamanho;
			elemento = vetor[ult];
			n--;
		} 
		
		return elemento;
	}

	// complemento quest�o 5
	@Override
	public String toString() {
		String retornoString = "VALORES PREENCHIDOS: \n[";
		for (int i = 0; i < n; i++) {
			retornoString += (vetor[i]);
			retornoString += !(i + 1 == n) ? ", " : "]";
		}
		retornoString += "\nPosi��es vazias: " + (tamanho - n);

		return retornoString;
	}
}
