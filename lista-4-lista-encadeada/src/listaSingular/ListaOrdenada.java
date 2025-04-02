package listaSingular;

public class ListaOrdenada extends Lista
{
	/* Insere elemento na lista na posição adequada, mantendo-a ordenada. */
	public void insere(int novo)
	{
		Elo p, q;
		Elo ant = null;
		
		q = new Elo(novo);
		
		for (p = prim; ((p != null) && (p.dado < novo)); p = p.prox)
			ant = p;
		
		if (ant == null)
			prim = q;
		else
			ant.prox = q;
		
		q.prox = p;
		tamanho++;
	}

	/* Remove da lista o primeiro elemento com valor igual a ?elem". Ret. true se removeu. */
	public boolean remove(int elem)
	{
		Elo p;
		Elo ant = null; /* referência para anterior */
		
		for(p = prim; ((p != null) && (p.dado < elem)); p = p.prox)
			ant = p;
		
		/* Se p é null ou p.dado != elem, então não encontrou elemento. */
		if ((p == null) || (p.dado != elem))
			return false;
		
		if (p == prim)
			prim = prim.prox; /* Remove elemento do início. */
		else
			ant.prox = p.prox;  /* Remove elemento do meio. */

		tamanho--;
		/* Remove a última referência para o elo a ser removido. Dessa forma,
		 * o Garbage Collector irá liberar essa memória. */
		p = null;
		
		return true;
	}

	// Questão 2
	public static ListaOrdenada juntaListasOrdenadas(ListaOrdenada l1, ListaOrdenada l2) {
		Elo p1 = l1.prim;
		Elo p2 = l2.prim;
		ListaOrdenada novaLista = new ListaOrdenada();

		while (p1 != null && p2 != null) {
			if (p1.dado < p2.dado) {
				novaLista.insere(p1.dado);
				p1 = p1.prox;
			} else {
				novaLista.insere(p2.dado);
				p2 = p2.prox;
			}
		}

		while (p1 != null) {
			novaLista.insere(p1.dado);
			p1 = p1.prox;
		}

		while (p2 != null) {
			novaLista.insere(p2.dado);
			p2 = p2.prox;
		}

		return novaLista;
	}

}