package org.exercicios;

import org.pilhas.Pilha;

//7) Em sala de aula, aprendemos a avaliar uma expressão aritmética que estivesse em
//notação pós-fixada, que não faz uso de parênteses por não possuir ambiguidade na sua
//avaliação. Neste exercício, você deve utilizar o conceito de Pilha para realizar a avaliação de
//expressões aritméticas em notação infixa, isto é, aquela que aprendemos e utilizamos ao
//longo do Ensino Fundamental e do Ensino Médio. Nesse contexto, vamos usar a seguinte
//definição recursiva: uma expressão aritmética é um número, ou um parêntese esquerdo
//seguido de uma expressão aritmética seguida por um operador seguido por outra expressão
//aritmética seguida de um parêntese direito. Por simplicidade, essa definição assume que a
//expressão está completamente parentizada, especificando precisamente quais operadores
//devem ser aplicados a quais operandos e removendo possíveis ambiguidades na avaliação.
//Por exemplo, a expressão ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) ) segue essa definição.
//Você deve então implementar um método que realize a avaliação de tais expressões
//representadas em uma String usando o conceito de Pilha. Por fim, cabe citar que o código
//que voces vão desenvolver corresponde a um exemplo simples de um interpretador: um
//programa que interpreta uma computação especificada por uma string e realiza tal
//computação para chegar ao resultado.


public class Exercicio7 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(30);
        String expressao = "(1+((2-3)*(4*5)))";
        System.out.println("O resultado da expressão é igual a: " + pilha.resultadoExpressao(expressao));
    }
}
