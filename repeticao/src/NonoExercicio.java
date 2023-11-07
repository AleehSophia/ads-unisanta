/*
* Exercicio 8.3.3 - Logica de programacao.
* Adapte o algoritmo correspondente do capítulo anterior de modo que
* por meio da estrutura de controle de repetição faça/enquanto sejam
* exibidos na tela os números ímpares existentes entre 1001 e 1999, inclusive estes.
*/
public class NonoExercicio {
    public static void main(String[] args) {

        int n = 1001;

        do {
            if (n % 2 != 0) {
                System.out.println(n);
            }
            n++;
        } while (n <= 1999);
    }
}