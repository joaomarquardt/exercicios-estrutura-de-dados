package org.aplicacao.exercicios;

import org.aplicacao.FilaSimples.Fila;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        Fila fila = new Fila(n);

        fila.representacaoBinaria();
    }
}
