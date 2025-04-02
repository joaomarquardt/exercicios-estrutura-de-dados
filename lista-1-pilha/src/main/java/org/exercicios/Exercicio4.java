package org.exercicios;

import org.pilhas.Pilha;
import org.pilhas.PilhaGenerica;

//4) Utilizando as operações de manipulação de pilhas vistas em aula, assim como o código de
//PilhaGenerica visto, use uma pilha auxiliar e uma variável do tipo T, para desenvolver um
//procedimento que remova um dado objeto do tipo T de uma posição qualquer de uma pilha.
//Para saber se dois objetos do tipo T são iguais, você deve usar o método equals (ou
//compareTo). Note que você não pode acessar diretamente a estrutura interna da pilha
//(atributos), devendo usar apenas as operações (métodos) de manipulação.


public class Exercicio4 {
    public static void main(String[] args) {
        PilhaGenerica pilhaGenerica = new PilhaGenerica(5);
        Object texto = "Objeto String";
        Object inteiro = 14;
        Object caractere = 'c';
        Object flutuante = 5.3F;
        Pilha pilha = new Pilha(10);
        pilhaGenerica.push(texto);
        pilhaGenerica.push(inteiro);
        pilhaGenerica.push(caractere);
        pilhaGenerica.push(flutuante);
        pilhaGenerica.push(pilha);

        if (pilhaGenerica.removeObjetoNaPilha(caractere)) {
            System.out.println("Está presente e foi removido da pilha");
        } else {
            System.out.println("Não está presente");
        }

    }
}