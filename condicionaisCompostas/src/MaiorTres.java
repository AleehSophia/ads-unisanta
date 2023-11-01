import java.util.Scanner;

/*
* Exercicio 6.4.4 - Logica de programacao.
* Escreva um algoritmo capaz de exibir na tela o maior de três números
* inteiros distintos fornecidos via teclado.
*/
public class MaiorTres {
    public static void main(String[] args) {
        MaiorTres maiorTres = new MaiorTres();
        maiorTres.maiorDeTres();
    }

    public void maiorDeTres() {

        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Insira o primeiro numero:");
        n1 = sc.nextInt();
        System.out.println("Insira o segundo numero:");
        n2 = sc.nextInt();
        System.out.println("Insira o terceiro numero:");
        n3 = sc.nextInt();

        int maior = 0;
        if (n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println("Os numeros precisam ser diferentes.");
        }
        else {
            if (n1 > n2) {
                maior = n1;
            }
            else if (n2 > n1) {
                maior = n2;
            }
            if (n3 > maior) {
                maior = n3;
            }
            System.out.println("O maior numero de tres é: " + maior);
        }
       /*
       * Alternativa para o exercicio acima sem usar condicionais.
       * Math.max compara os dois numeros e retorna o maior.
       *
       * int maior = Math.max(n1, n2);
       * maior = Math.max(maior, n3);
       * System.out.println("O maior numero de tres é: " + maior);
       */
    }
}