package org.exercicios;

import org.pilhas.PilhasArray;

import java.util.Scanner;

//3) Desenvolva um método para manter duas pilhas dentro de um único vetor (array) de modo
//que nenhuma das pilhas incorra em estouro até que toda a memória seja usada, e toda uma
//pilha nunca seja deslocada para outro local dentro do vetor.


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho máximo do array:");
        int valorMax = sc.nextInt();
        PilhasArray pilha = new PilhasArray(valorMax);
        // Código abaixo criado para facilitar o teste de funcionamento do Exercicio 3,
        // não necessariamente vital para o funcionamento do programa.
        while (true) {
            int escolhaPilha;
                    System.out.println("--------- ESCOLHA A PILHA A SER MODIFICADA ------------" + '\n' +
                    "1 - PILHA DA ESQUERDA" + '\n' +
                    "2 - PILHA DA DIREITA" + '\n' +
                    "0 - SAIR");
            escolhaPilha = sc.nextInt();
            if (escolhaPilha == 1 || escolhaPilha == 2) {
                while (true) {
                    int escolhaMetodo;
                    System.out.println("--------- ESCOLHA O METÓDO A SER ACIONADO NA PILHA " + escolhaPilha + " ------------" + '\n' +
                            "1 - ADICIONAR VALOR" + '\n' +
                            "2 - REMOVER VALOR" + '\n' +
                            "0 - SAIR");
                    escolhaMetodo = sc.nextInt();
                    if (escolhaMetodo == 1) {
                        System.out.println("QUAL VALOR DESEJA ADICIONAR?");
                        char valor = (char) sc.nextInt();
                        pilha.push(escolhaPilha, valor);
                    } else if (escolhaMetodo == 2) {
                        pilha.pop(escolhaPilha);
                    } else {
                        break;
                    }
                }

            } else {
                break;
            }
        }

        sc.close();
    }
}
