import java.util.Scanner;

/*
* Exercicio 6.4.2 - Logica de programacao.
* Adapte o algoritmo anterior de modo a garantir que os dois números
* digitados sejam efetivamente diferentes entre si.
*/
public class NumerosDiferentes {
    public static void main(String[] args) {
        NumerosDiferentes numerosDiferentes = new NumerosDiferentes();
        numerosDiferentes.diferente();
    }

    public void diferente() {

        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite o primeiro numero");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.printf("Os numeros %d e %d são iguais. Os numeros precisam ser diferentes.", n1, n2);
        }
        else if (n1 > n2){
            System.out.printf("Os numeros %d e %d são diferentes. E o maior numero é %d", n1, n2, n1);
        }
        else {
            System.out.printf("Os numeros %d e %d são diferentes. E o maior numero é %d", n1, n2, n2);
        }
    }
}