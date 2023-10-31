/*
* 5.4.5. Elabore um algoritmo que receba via teclado dois nomes próprios,
* apresentando uma confirmação na tela se pelo menos um deles for
* exatamente Alexandre.
*/

import java.util.Scanner;

public class ConfirmaNome {
    public static void main(String[] args) {
        ConfirmaNome confirmaNome = new ConfirmaNome();
        confirmaNome.nomeAlexandre();
    }

    public void nomeAlexandre() {

        Scanner sc = new Scanner(System.in);

        String nome1;
        String nome2;

        System.out.println("Insira o primeiro nome:");
        nome1 = sc.nextLine();
        System.out.println("Insira o segundo nome:");
        nome2 = sc.nextLine();

        if (nome1.equals("Alexandre") || nome2.equals("Alexandre")) {
            System.out.println("Um dos nomes digitados é Alexandre.");
        }

    }
}