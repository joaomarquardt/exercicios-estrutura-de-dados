package questao5;

//5) Suponha agora uma derivação do exercício anterior, em que se deseje reverter uma frase
//usando listas encadeadas. Além de inverter a ordem da frase em si, também se deseja
//inverter a ordem das letras de cada palavra individualmente. Implemente então um método
//para realizar essa tarefa. Note que cada letra de cada palavra deve estar armazenada em um
//objeto Elo da lista. Tem-se liberdade para pensar na melhor forma de modelar tal problema.


public class ListaFrase {
    private EloPalavra prim;

    protected class ListaPalavra {
        private EloLetra primLetra;

        protected class EloLetra {
            protected char letra;
            protected EloLetra prox;

            public EloLetra(char letra) {
                this.letra = letra;
                this.prox = null;
            }
        }

        public ListaPalavra() {
            primLetra = null;
        }

        public void adicionaLetra(char letra) {
            if (primLetra == null) {
                primLetra = new EloLetra(letra);
            } else {
                EloLetra atual = primLetra;
                while (atual.prox != null) {
                    atual = atual.prox;
                }
                atual.prox = new EloLetra(letra);
            }
        }

        public void invertePalavra() {
            EloLetra anterior = null;
            EloLetra atual = primLetra;
            while (atual != null) {
                EloLetra prox = atual.prox;
                atual.prox = anterior;
                anterior = atual;
                atual = prox;
            }
            primLetra = anterior;
        }

        public String toString() {
            String palavra = "";
            EloLetra atual = primLetra;
            while (atual != null) {
                palavra += atual.letra;
                atual = atual.prox;
            }
            return palavra;
        }
    }

    protected class EloPalavra {
        protected ListaPalavra palavra;
        protected EloPalavra prox;

        public EloPalavra(ListaPalavra palavra) {
            this.palavra = palavra;
            this.prox = null;
        }
    }

    public ListaFrase() {
        prim = null;
    }

    public void adicionaPalavra(ListaPalavra novaPalavra) {
        if (prim == null) {
            prim = new EloPalavra(novaPalavra);
        } else {
            EloPalavra atual = prim;
            while (atual.prox != null) {
                atual = atual.prox;
            }
            atual.prox = new EloPalavra(novaPalavra);
        }
    }

    public void inverteFrase() {
        EloPalavra atual = prim;
        while (atual != null) {
            atual.palavra.invertePalavra();
            atual = atual.prox;
        }

        EloPalavra anterior = null;
        atual = prim;
        while (atual != null) {
            EloPalavra prox = atual.prox;
            atual.prox = anterior;
            anterior = atual;
            atual = prox;
        }
        prim = anterior;
    }

    public String constroiFrase() {
        String frase = "";
        EloPalavra atual = prim;
        while (atual != null) {
            frase += atual.palavra.toString();
            if (atual.prox != null) {
                frase += " ";
            }
            atual = atual.prox;
        }
        return frase;
    }


    public static void main(String[] args) {
        ListaFrase frase = new ListaFrase();
        ListaPalavra palavra1 = new ListaFrase().new ListaPalavra();
        palavra1.adicionaLetra('O');
        palavra1.adicionaLetra('l');
        palavra1.adicionaLetra('a');
        frase.adicionaPalavra(palavra1);

        ListaPalavra palavra2 = new ListaFrase().new ListaPalavra();
        palavra2.adicionaLetra('m');
        palavra2.adicionaLetra('u');
        palavra2.adicionaLetra('n');
        palavra2.adicionaLetra('d');
        palavra2.adicionaLetra('o');
        frase.adicionaPalavra(palavra2);

        System.out.println("Frase original: " + frase.constroiFrase());
        frase.inverteFrase();
        System.out.println("Frase invertida: " + frase.constroiFrase());
        palavra2.invertePalavra();
        System.out.println("Frase invertida com 2ª palavra invertida: " + frase.constroiFrase());
    }
}
