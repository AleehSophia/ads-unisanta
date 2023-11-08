/*
* Exercicio 9.2.3 - Logica de programacao.
* Adapte o algoritmo anteriormente desenvolvido de modo a armazenar, com o auxílio de uma variável
* indexada e da estrutura de controle de repetição enquanto/faça, os primeiros 20 termos da chamada
* "Sequência de Fibonacci". Ao término, sua solução deverá apresentar na tela, utilizando qualquer
* estrutura de controle de repetição à sua escolha, além dos termos propriamente ditos, a somatória
* total dos 20 termos.
*/
public class ExercicioTres {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {

        int[] fibonacci = new int[20];

        int n1, n2, temp, i;

        n1 = 0;
        n2 = 1;
        i = 0;

        while (i < 20) {
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            fibonacci[i] = n1;
            i++;
        }

        for (int j = 0; j < 20; j++) {
            System.out.print(fibonacci[j] + " ");
        }
    }
}
