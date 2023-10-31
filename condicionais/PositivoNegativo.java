import java.util.Scanner;

/*
* Exercicio 5.4.3 - Logica de programacao.
* Adapte a solução anterior de modo que os números sejam exibidos na
* tela apenas se o primeiro for positivo, e o segundo, negativo.
*/
public class PositivoNegativo {

    public static void main(String[] args) {
        PositivoNegativo positivoNegativo = new PositivoNegativo();
        positivoNegativo.positivoOuNegativo();
    }

    public void positivoOuNegativo() {

        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Insira o primeiro número positivo");
        n1 = sc.nextInt();
        System.out.println("Insira o segundo número negativo");
        n2 = sc.nextInt();

        if (n1 >= 0 && n2 < 0) {
            System.out.println("O primeiro número é positivo e o segundo número negativo");
            System.out.println(n1 + " e " + n2);
        }
    }
}