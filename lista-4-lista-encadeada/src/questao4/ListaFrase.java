package questao4;

//4) Suponha que uma frase é representada por uma lista encadeada, sendo que cada elo
//contém uma string representando um token, isto é, um caracter de pontuação ou uma palavra.
//Escreva um algoritmo para retornar a frase inteira.

public class ListaFrase {
    private Elo prim;

    public class Elo {
        protected String token;
        protected Elo prox;

        public Elo(String token) {
            this.token = token;
            this.prox = null;
        }

        public Elo(String token, Elo prox) {
            this.token = token;
            this.prox = prox;
        }
    }

    public ListaFrase() {
        prim = null;
    }

    public void adicionaToken(String token) {
        if (prim == null) {
            prim = new Elo(token);
        } else {
            Elo atual = prim;
            while (atual.prox != null) {
                atual = atual.prox;
            }
            atual.prox = new Elo(token);
        }
    }

    public String constroiFrase() {
        String frase = "";
        Elo atual = prim;
        while (atual != null) {
            String token = atual.token;
            if (frase.length() != 0 && !ehPontuacao(token)) {
                frase += " ";
            }
            frase += token;
            atual = atual.prox;
        }

        return frase;
    }


    private boolean ehPontuacao(String token) {
        return token.equals(",") || token.equals(".") || token.equals("!") || token.equals("?");
    }


    // adicionando aqui pra ficar mais prático
    public static void main(String[] args) {
        ListaFrase listaFrase = new ListaFrase();
        listaFrase.adicionaToken("Olá");
        listaFrase.adicionaToken(",");
        listaFrase.adicionaToken("professor");
        listaFrase.adicionaToken("!");
        listaFrase.adicionaToken("Como");
        listaFrase.adicionaToken("você");
        listaFrase.adicionaToken("está");
        listaFrase.adicionaToken("?");
        System.out.println(listaFrase.constroiFrase());
    }
}
