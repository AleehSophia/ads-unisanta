/*
* Exercicio 8.3.6 - Logica de programacao.
* Escreva, agora por meio da estrutura de controle de repetição
* enquanto/faça, um algoritmo capaz de apresentar na tela a somatória de
* todos os números existentes entre 1 e 10, inclusive estes.
*/
public class ExercicioDoze {
    public static void main(String[] args) {

        int n = 1;

        int soma = 0;
        while (n <= 10) {
            soma = soma + n;
            n++;
        }
        System.out.println(soma);
    }
}