/*
* 7.3.4. Crie um algoritmo que apresente na tela todos os múltiplos de 5
* existentes entre 5 e 50, inclusive estes.
*/
public class QuartoExercicio {
    public static void main(String[] args) {

        int n = 50;
        for (int i = 5; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}