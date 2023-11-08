import java.util.Scanner;

/*
* Exercicio 9.2.1 - Logica de programacao.
* Elabore um algoritmo capaz de receber e armazenar, em uma variável
* indexada e utilizando a estrutura de controle de repetição para/fim_para,
* o dobro de 20 números inteiros quaisquer digitados pelo usuário,
* apresentando-os ao término das entradas.*/
public class ExercicioUm {
    public static void main(String[] args) {
        dobro();
    }

    public static void dobro() {

        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[20];
        int leitor;

        for (int i = 0; i <= 19; i++) {
            leitor = sc.nextInt();
            numeros[i] = leitor * 2;
        }

        for (int i = 0; i <= 19; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}