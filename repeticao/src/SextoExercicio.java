/*
* Exercicio 7.3.6 - Logica de programacao.
* Escreva um algoritmo capaz de apresentar na tela a somatória de todos
* os números existentes entre 1 e 10, inclusive estes.
*/
public class SextoExercicio {
    public static void main(String[] args) {

        int n = 1;

        for (int i = 2; i <= 10; i++) {
            n = n + i;
        }
        System.out.println(n);
    }
}