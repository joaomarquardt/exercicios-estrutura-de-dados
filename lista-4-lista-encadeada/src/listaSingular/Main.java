package listaSingular;

//2) Elabore um algoritmo que, dadas duas listas encadeadas ordenadas, intercale as duas
//listas de maneira ordenada, resultando em uma lista resultante também ordenada.

public class Main {
	public static void main(String[] args) {
		ListaOrdenada l1 = new ListaOrdenada();
		ListaOrdenada l2 = new ListaOrdenada();
		l1.insere(1);
		l1.insere(3);
		l1.insere(5);
		l1.insere(7);
		l2.insere(2);
		l2.insere(4);
		l2.insere(6);
		l2.insere(8);
		l2.insere(9);
		l2.insere(15);
		l2.insere(4);

		ListaOrdenada listaIntercalada = ListaOrdenada.juntaListasOrdenadas(l1, l2);
		System.out.println("Lista intercalada:");
		listaIntercalada.imprime();
	}
}
