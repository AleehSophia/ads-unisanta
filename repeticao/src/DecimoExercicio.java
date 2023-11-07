/*
* Exercicio 8.3.4 - Logica de programacao.
* Fazendo agora uso da estrutura enquanto/faça, apresente na tela
* todos os múltiplos de 5 existentes entre 5 e 50, inclusive estes.
*/
public class DecimoExercicio {
    public static void main(String[] args) {

        int n = 5;

        while (n <= 50) {
            if (n % 5 == 0) {
                System.out.println(n);
            }
            n++;
        }
    }
}