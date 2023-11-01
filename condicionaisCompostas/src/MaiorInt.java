import java.util.Scanner;

/*
* Exercicio 6.4.1 - Logica de programacao.
* Elabore um algoritmo capaz de apresentar na tela o maior de dois
* números inteiros digitados.
*/
public class MaiorInt {
    public static void main(String[] args) {
        MaiorInt maior = new MaiorInt();
        maior.maiorDeDois();
    }

    public void maiorDeDois() {

        Scanner sc = new Scanner(System.in);

        int n1, n2;
        System.out.println("Escreva o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Escreva o segundo numero: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.printf("O primeiro numero %d é maior que o segundo numero %d", n1, n2);
        }
        else {
            System.out.printf("O segundo numero %d é maior que o primeiro numero %d", n2, n1);
        }
    }
}