package org.exercicios;

import org.pilhas.Pilha;

import java.util.Scanner;

//6) Elabore um método que retorne as letras invertidas das palavras de uma frase recebida
//por parâmetro, preservando a ordem das palavras na frase. Por exemplo “a maçã está podre”,
//deve ter como saída: “a ãçam átse erdop”. As operações básicas de uma pilha, push e pop,
//devem ser usadas.


public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;

        Pilha pilha = new Pilha(20);
        char c;

        System.out.println("Digite uma frase:");
        s = scanner.nextLine();

        pilha.letrasInvertidas(s);
    }
}
