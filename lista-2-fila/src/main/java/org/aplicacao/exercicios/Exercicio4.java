package org.aplicacao.exercicios;

import org.aplicacao.FilaDupla.FilaDupla;
import org.aplicacao.FilaSimples.Fila;

//4) Implemente um método estático na classe Fila, a qual implementa uma fila circular.
//Esse método deve receber uma fila circular e retornar uma fila circular dupla.


public class Exercicio4 {
    public static void main(String[] args) {
        Fila fila = new Fila(15);
        for (int i = 0; i < 10; i+=1) {
            fila.insere(i);
        }
        FilaDupla filaDupla = Fila.transformaEmFilaDupla(fila);

        System.out.println(filaDupla.toString());
    }
}
