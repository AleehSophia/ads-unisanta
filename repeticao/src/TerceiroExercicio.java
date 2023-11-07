/*
* Exercicio 7.3.3 - Logica de programacao.
* Elabore um algoritmo capaz de exibir na tela os números ímpares
* existentes entre 1000 e 2000
*/
public class TerceiroExercicio {
    public static void main(String[] args) {

        int n = 2000;

        for (int i = 1000; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}