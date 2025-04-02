package org.exercicios;

import org.pilhas.Pilha;

import java.util.Scanner;

//1) Escreva uma função para determinar se uma cadeia de caracteres (string) é da forma: x C
//y onde x e y são cadeias de caracteres compostas por letras ‘A’ e/ou ‘B’, e y é o inverso de
//x. Isto é, se x = “ABABBA”, y deve equivaler a “ABBABA”. Em cada ponto, você só poderá ler
//o próximo caractere da cadeia.

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;

        Pilha pilha = new Pilha(20);
        char c;

        System.out.println("Digite uma cadeia de carecteres do tipo xCy: ");
        s = scanner.nextLine();

        int i = 0;
        while ( i < s.length() )
        {
            c = s.charAt(i);
            pilha.push(c);
            i++;
        }

        pilha.cadeiaInversaIgual();
    }
}
