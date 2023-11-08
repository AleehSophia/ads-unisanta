import java.util.Scanner;

/*
* Exercicio 9.2.2 - Logica de programacao.
* Crie um algoritmo que receba via teclado e armazene, com o auxílio de uma variável indexada,
* 30 números inteiros positivos digitados pelo usuário. Concluídas as entradas, sua solução
* deverá apresentá-los em ordem inversa - isto é, do último para o primeiro número fornecido.
* Importante: você deverá utilizar, obrigatoriamente, a estrutura de controle de repetição
* faça/enquanto para atender a pelo menos uma das necessidades apresentadas neste enunciado.
*/
public class ExercicioDois {
    public static void main(String[] args) {
        inverso();
    }

    public static void inverso() {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[30];

        int leitor, i;

        leitor = 0;
        i = 0;

        do {
            leitor = sc.nextInt();
            if (leitor >= 0) {
                numeros[i] = leitor;
                i++;
            }
        } while (i <= 29);

        for (int j = 29; j >= 0; j--) {
            System.out.print(numeros[j] + " ");
        }
    }
}