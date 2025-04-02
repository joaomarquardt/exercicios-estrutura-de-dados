package org.exercicios;

import org.pilhas.Pilha;

import java.util.Scanner;

//5) Escreva um programa que leia uma sequência de caracteres e determine se os parênteses,
//colchetes e chaves estão balanceados. Se a sequência não possuir esses caracteres ele
//deve ser considerado balanceado. Exemplo:
//“{ab}[cde]” - Balanceado
//“{ab[cd]efg}” - Balanceado
//“[abcde{efg]}” - Não balanceado

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;

        Pilha pilha = new Pilha(20);
        char c;

        System.out.println("Digite uma sequência para verificar se está balanceada ou não:");
        s = scanner.nextLine();

        int i = 0;
        while ( i < s.length() )
        {
            c = s.charAt(i);
            pilha.push(c);
            i++;
        }
        pilha.cadeiaBalanceada();
    }
}
