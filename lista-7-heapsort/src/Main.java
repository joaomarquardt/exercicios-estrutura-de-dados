
public class Main
{
	public static void main(String args[])
	{
		int tamanho = 6;
		int vetor[] = {Integer.MIN_VALUE, 36, 14, 28, 11, 9, 6, 12};

		System.out.println(HeapBinariaMaxima.verificaPropriedadeHeap(vetor));


		/*
		HeapBinariaMinima heap = new HeapBinariaMinima(tamanho, vetor);

		heap.imprime();

		heap.fazVazia();

		heap.insere(4);

		heap.insere(6);

		heap.insere(1);

		heap.imprime();

		System.out.println(heap.min());

		heap.removeMin();

		System.out.println(heap.min());

		heap.imprime();

		vetor = new int[]{10, 6, 3, 1, 5, 7};

		HeapBinariaMaxima heapMaxima = new HeapBinariaMaxima(tamanho, vetor);

		System.out.print("Vetor original: ");

		heapMaxima.imprimeTamanho();

		heapMaxima.heapsort();

		System.out.print("Vetor ordenado: ");

		heapMaxima.imprimeTamanho();

		*/
	}
}