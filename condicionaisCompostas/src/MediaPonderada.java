import java.util.Scanner;

/*
* Exercicio 6.4.3 - Logica de programacao.
* Aperfeiçoe a solução do exercício 4.4.3 de modo que, se a média do(a)
* estudante for pelo menos 7 (sete), seja apresentada uma mensagem indicando
* sua aprovação. Caso esta pontuação não tenha sido atingida, apresente na tela
* a mensagem "Estudante de exame".
*
* (Exercicio 4.4.3 se encontra no diretorio de algoritmos com o nome "MediaPonderada").
*/
public class MediaPonderada {
    public static void main(String[] args) {

        MediaPonderada mediaPonderada = new MediaPonderada();
        mediaPonderada.media();
    }

    public double calculaMedia() {

        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        double media;

        System.out.println("Insira sua primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Insira sua segunda nota: ");
        nota2 = sc.nextDouble();

        nota1 *= 1;
        nota2 *= 2;

        media = (nota1 + nota2) / 3;
        return media;
    }

    public void media() {

        double media = calculaMedia();

        if (media >= 7.0) {
            System.out.printf("Sua media é de %.3s. Estudante aprovado.", media);
        }
        else {
            System.out.printf("Sua media é de %.3s. Estudante de exame.", media);
        }
    }
}