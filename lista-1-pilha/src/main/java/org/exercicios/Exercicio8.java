package org.exercicios;

import org.pilhas.Pilha;

import java.util.Scanner;

//8) Dada uma sequência de 1 a N armazenada em um array, são formadas todas as
//subsequências (subarrays) possíveis a partir da sequência original. Para todas essas
//subsequências geradas, encontre a quantidade de pares únicos (a, b), em que ‘a’ é diferente
//de ‘b’ e ‘a’ é máximo (maior número) e ‘b’ é o segundo máximo da subsequência. Por exemplo,
//em uma sequência de 1 até 5, podem ser formadas as seguintes 15 subsequências:
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        2
//        2 3
//        2 3 4
//        2 3 4 5
//        3
//        3 4
//        3 4 5
//        4
//        4 5
//        5
//Nessas 15 subsequências, existem 4 pares únicos que satisfazem aos critérios
//definidos: (2,1), (3,2), (4,3) e (5,4).

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor máximo do array:");
        int valorMax = sc.nextInt();
        Pilha pilha = new Pilha(valorMax);
        for (int i = 0; i < valorMax; i++) {
            pilha.push((char) (i + 1));
        }
        pilha.paresUnicos();

        sc.close();
    }
}
