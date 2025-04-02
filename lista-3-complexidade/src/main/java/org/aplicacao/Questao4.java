package org.aplicacao;

//4) Implemente um método com a melhor complexidade possível para conseguir a quantidade
//de inteiros pares de uma pilha. Use a classe Pilha aprendida em sala de aula que possui os
//métodos pop e push padrões, além de atributos padrões. Você possui liberdade para criar
//novos métodos e/ou atributos e alterar os métodos pop e push já existentes.

// para resolver a questão, adicionei um atributo a mais na classe Pilha que contabiliza o número de pares na pilha.
// Quando é feito o push de um elemento par, é incrementado 1 na variável contPares.
// Quando é feito o pop de um elemento par, é decrementado 1 na variável contPares.
// Por fim, criei um método que retorna o valor da variável contPares.


public class Questao4 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(25);
        for (int i = 0; i < 25; i++) {
            pilha.push(i);
        }
        System.out.println(pilha.quantidadeNumPares());
    }
}