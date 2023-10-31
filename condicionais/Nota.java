/*
* Exercicio 5.4.4 - Logica de programacao.
* Crie um algoritmo que receba pelo teclado uma nota de 0 a 10,
* apresentando-a na tela apenas se for válida
*/

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Nota nota = new Nota();
        nota.notaValida();
    }

    public void notaValida() {

        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Insira uma nota de 0 a 10:");
        nota = sc.nextInt();

        if (nota >= 0 && nota <= 10) {
            System.out.printf("A nota %d é válida!", nota);
        }
    }
}