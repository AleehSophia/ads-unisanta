import java.util.Scanner;

/*
* Exercicio 6.4.5 - Logica de programacao.
* Escreva um algoritmo que, após receber pelo teclado uma média válida
* de um(a) estudante, atribua-lhe e apresente na tela o respectivo conceito de
* acordo com a tabela abaixo. Tenha em mente que o usuário, respeitando o
* sistema de notas da instituição, somente digitará valores de médias que
* evoluam de 0.5 em 0.5 (como 4.5, 5, 5.5, 6, etc.), o que justifica os valores
* presentes na tabela abaixo.
*
*   Média             Conceito
* 9,0 ou mais             A
* 7,0 a 8,5               B
* 6,0 a 6,5               C
* 4.0 a 5,5               D
* 3.5 ou menos            E
*/
public class MediaConceito {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media;
        char conceito;
        System.out.println("Insira sua media válida");
        media = sc.nextDouble();

        if (media >= 0 && media <= 10) {
            if (media >= 9.0) {
                conceito = 'A';
            } else if (media >= 7) {
                conceito = 'B';
            } else if (media >= 6) {
                conceito = 'C';
            } else if (media >= 4) {
                conceito = 'D';
            } else {
                conceito = 'E';
            }
            System.out.println("Conceito: " + conceito);
        } else {
            System.out.println("Média inválida.");
        }
    }
}