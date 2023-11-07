/*
* Exercicio 8.3.1 - Logica de programacao.
* Elabore um algoritmo que exiba na tela os números existentes entre 150
* e 250 (inclusive estes), mas agora fazendo uso da estrutura de controle de
* repetição faça/enquanto.
*/
public class SetimoExercicio {
    public static void main(String[] args) {

        int n = 150;

        do {
            System.out.println(n);
            n++;
        }
        while (n <= 250);
    }
}