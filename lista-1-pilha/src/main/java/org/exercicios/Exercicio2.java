package org.exercicios;

import org.pilhas.Pilha;

import java.util.Scanner;

//2) Escreva uma função para determinar se uma cadeia de caracteres (string) é da forma: a D
//b D c D ... D z onde cada cadeia de caracteres, a, b, ..., z, é da forma do exercício descrito
//acima. Portanto, uma cadeia de caracteres estará no formato correto se consistir em qualquer
//número de cadeias deste tipo ( x C y ), separadas pelo caractere ‘D’. Em cada ponto, você só
//poderá ler o próximo caractere da cadeia (é mandatório o uso de pilha).

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;

        Pilha pilha = new Pilha(30);
        char c;

        System.out.println("Digite uma cadeia de caracteres do tipo xCyDxCy: ");
        s = scanner.nextLine();

        int i = 0;
        while ( i < s.length() )
        {
            c = s.charAt(i);
            pilha.push(c);
            i++;
        }

        pilha.listaCadeiaInversaIgual();
    }
}