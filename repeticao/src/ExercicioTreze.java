/*
* Exercicio 8.3.7 - Logica de programacao.
* Escreva um algoritmo capaz de apresentar na tela os 20 primeiros
* termos daquela que é conhecida como a “Sequência de Fibonacci” (1, 2, 3, 5,
* 8, 13, 21, 34, 55...). Utilize, a seu critério, a estrutura de controle de repetição
* enquanto/faça ou faça/enquanto para a solução dessa questão
*/
public class ExercicioTreze {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int fibonacci;

        int cont = 1;
        do {
            fibonacci = n1 + n2;
            n1 = n2;
            n2 = fibonacci;
            System.out.print(n1 + " ");
            cont++;
        } while (cont <= 20);
    }
}