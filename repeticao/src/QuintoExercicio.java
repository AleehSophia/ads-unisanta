/*
* Exercicio 7.3.5 - Logica de programacao.
* Utilize a estrutura de controle de repetição para/fim_para de modo a
* exibir na tela todos os números pares existentes entre 400 e 800, inclusive
* estes.
*/

public class QuintoExercicio {
    public static void main(String[] args) {

        int n = 800;

        for (int i = 400; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}