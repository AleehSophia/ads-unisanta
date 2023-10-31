/*
* Exercicio 5.4.1 - Logica de programacao.
* Crie um algoritmo que receba um número via teclado que supostamente
* deverá ser positivo, apresentando uma mensagem de confirmação na tela
* exclusivamente neste caso.
*/

import java.util.Scanner;

public class Positivo {

    public static void main(String[] args) {
        Positivo positivo = new Positivo();
        positivo.isPositivo();
    }

    public void isPositivo() {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Insira um número positivo");
        numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("Oba! O número é positivo.");
        }
    }
}