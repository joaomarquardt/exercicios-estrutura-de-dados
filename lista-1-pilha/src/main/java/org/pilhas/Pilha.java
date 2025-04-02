package org.pilhas;

public class Pilha
{
    private int n;
    private char vetor[];
    private int topo;

    public Pilha()
    {
        n = 10;
        vetor = new char[n];
        topo = -1;
    }

    public Pilha(int tamanho)
    {
        n = tamanho;
        vetor = new char[tamanho];
        topo = -1;
    }

    public boolean vazia()
    {
        return topo == -1;
    }

    public boolean cheia()
    {
        return topo == n - 1;
    }

    public char pop()
    {
        char c = '\0';

        if (!this.vazia())
        {
            c = vetor[topo];

            //Decrementando o topo, o elemento é "removido"
            topo--;
        }
        else
        {
            //Impress�o para fins didáticos
            System.out.println("Pilha vazia: pop não funcionou.");
        }

        return c;
    }

    public boolean push(char elemento)
    {
        if (!this.cheia())
        {
            vetor[++topo] = elemento;
            return true;
        }
        else
        {
            //Impress�o para fins didáticos
            System.out.println("Pilha cheia: push não funcionou.\n");
            return false;
        }
    }

    public char retornaTopo()
    {
        char elemento = '\0';

        if(!this.vazia())
        {
            elemento = vetor[topo];
        }
        else
        {
            System.out.println("Pilha vazia.");
        }

        return elemento;
    }

    // questão 1
    public boolean cadeiaInversaIgual() {
        if (!this.vazia()) {
            Pilha pilhaInversa = new Pilha(this.n);
            while (this.retornaTopo() != 'C') {
                pilhaInversa.push(this.pop());
            }
            if (this.retornaTopo() == 'C') {
                this.pop();
            }
            while (pilhaInversa.topo != -1) {
                if (pilhaInversa.pop() != this.pop()) {
                    System.out.println("A cadeia inversa Y é DIFERENTE da cadeia X.");
                    return false;
                }

            }
            if (this.topo != -1 && (this.retornaTopo() == 'A' || this.retornaTopo() == 'B')) {
                System.out.println("A cadeia inversa Y é DIFERENTE da cadeia X.");
                return false;
            }
            System.out.println("A cadeia inversa Y é IGUAL a cadeia X!");
            return true;
        }
        System.out.println("Pilha vazia. Não é possível verificar se a cadeia y é inversa da cadeia X.");
        return false;
    }

    // questão 2
    public boolean listaCadeiaInversaIgual() {
        boolean listaInversa = true;
        int numCadeias = 0;
        System.out.println("OBS: A verificação é feita da direita pra esquerda.");
        while (!this.vazia()) {
            System.out.println("---- " + ++numCadeias + "ª CADEIA ----");
            listaInversa = cadeiaInversaIgual();
            if (!listaInversa) {
                System.out.println("A lista não segue o formato correto.");
                return listaInversa;
            } else if (!this.vazia() && this.retornaTopo() == 'D') {
                this.pop();
            }
        }
        System.out.println("A lista possui todas as cadeias na forma correta.");
        return listaInversa;
    }

    // questão 3 está na classe PilhasArray

    // questão 4 está na classe PilhaGenerica

    // questão 5
    public boolean cadeiaBalanceada() {
        Pilha elementos = new Pilha(vetor.length);
        for (int i = this.topo; i >= 0; i--) {
            char caractere = vetor[i];
            char topoAntigo = (elementos.vazia() ? '\0' : elementos.retornaTopo());
            if (caractere == '{' || caractere == '}' || caractere == '[' || caractere == ']'
                    || caractere == '(' || caractere == ')') {
                elementos.push(caractere);
            }
            if ((topoAntigo == '}'  && elementos.retornaTopo() == '{') ||
                    (topoAntigo == ']'  && elementos.retornaTopo() == '[') ||
                    (topoAntigo == ')'  && elementos.retornaTopo() == '(')) {
                elementos.pop();
                elementos.pop();
            }
        }
        if (!elementos.vazia()) {
            System.out.println("Não é uma cadeia balanceada.");
            return false;
        }
        System.out.println("É uma cadeia balanceada.");
        return true;
    }

    // questão 6
    public void letrasInvertidas(String frase) {
        frase = frase.strip();
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if  (c != ' ') {
                this.push(c);
            }
            if (c == ' ' || i + 1 == frase.length()) {
                while (!this.vazia()) {
                    System.out.print(this.pop());
                }
                if (c == ' ') {
                    System.out.print(c);
                }
            }
            i++;
        }
    }

    // questão 7
    public int resultadoExpressao(String expressaoInfixa) {
        Pilha pilhaAuxiliar = new Pilha(this.n);
        for (int i = 0; i < expressaoInfixa.length(); i++) {
            char caract = expressaoInfixa.charAt(i);
            if (caract == '(' || caract == '+' || caract == '-'
                    || caract == '*' || caract == '/') {
                pilhaAuxiliar.push(caract);
            } else if (caract == ')') {
                while (pilhaAuxiliar.retornaTopo() != '(') {
                    this.push(pilhaAuxiliar.pop());
                };
                pilhaAuxiliar.pop();
            } else if (caract == ' ') {
                continue;
            } else {
                this.push(caract);
            }
        }

        // tive que fazer um while para reverter a ordem da pilha
        while(!this.vazia()) {
            pilhaAuxiliar.push(this.pop());
        }

        int valor1, valor2;
        while (!pilhaAuxiliar.vazia()) {
            char caract = pilhaAuxiliar.retornaTopo();
            if (!(caract == '+' || caract == '-'
                    || caract == '*' || caract == '/')) {
                this.push(caract);
                pilhaAuxiliar.pop();
            } else {
                int resultado = 0;
                valor2 = this.pop() - '0';
                valor1 = this.pop() - '0';
                if (caract == '+') {
                    resultado = valor1 + valor2;
                } else if (caract == '-') {
                    resultado = valor1 - valor2;
                } else if (caract == '*') {
                    resultado = valor1 * valor2;
                } else if (caract == '/') {
                    resultado = valor1 / valor2;
                }
                pilhaAuxiliar.pop();
                resultado = resultado + '0';
                this.push((char) resultado);
            }
        }

        return this.retornaTopo() - '0';
    }


    // questão 8
    public void paresUnicos() {
        while (topo != 0){
            int valor = (int) this.pop();
            System.out.println("(" + (valor) + ", " + (valor - 1) + ")");
        }
    }
}
