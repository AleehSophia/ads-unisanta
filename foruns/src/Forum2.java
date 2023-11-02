import java.util.Scanner;

/*
* Olá, pessoal! Como vimos em um determinado ponto da aula 6, o pseudocódigo utilizado em nosso exemplo, ainda
* que nos ajude a compreender como funcionam os desvios condicionais encadeados, não apresenta quaisquer
* mensagens de alerta ao usuário caso os dois valores digitados não sejam positivos.
* Trago então, para cá, o desafio lá lançado: como ficaria o pseudocódigo com a implementação das alterações sugeridas?
*
* algoritmo exemploDesvioEncadeado
* variáveis
* A, B, SOMA: inteiro
* início
* leia A
* se (A>0) então
* leia B
* se (B>0) então
* SOMA=A+B
* escreva “Soma dos valores:”, SOMA
* fim_se
* fim_se
* fim
*/
public class Forum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Digite dois valores:");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a < 0 || b < 0) {
            System.out.printf("Os valores digitados não são positivos. Algoritmo encerrado.");
        } else {
            soma = a + b;
            System.out.println("Soma dos valores: " + soma);
        }
    }
}