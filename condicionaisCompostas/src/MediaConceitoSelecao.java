/*
* Exercicio 6.4.6 - Logica de programacao.
* RESOLUÇÃO ATRAVÉS DE SELEÇÃO DE CASOS - SWITCH/CASE
* Caso não o tenha feito desta forma, adapte o núcleo de decisões do
* problema anterior (6.4.5) de modo a resolvê-lo através de seleção de casos. Caso
* assim o já tenha solucionado, faça-o agora através de estruturas de decisão
* encadeadas.
*
* ATENCAO: DOUBLE NAO FUNCIONA EM CASO DE SWITCH/CASE, TESTAR APENAS COM NUMEROS INTEIROS.
*/

import java.util.Scanner;

public class MediaConceitoSelecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int media;
        char conceito;
        System.out.println("Insira sua media válida");
        media = sc.nextInt();

        switch (media) {
            case 9: case 10:
                conceito = 'A';
                System.out.println("Conceito: " + conceito);
                break;
            case 7: case 8:
                conceito = 'B';
                System.out.println("Conceito: " + conceito);
                break;
            case 6:
                conceito = 'C';
                System.out.println("Conceito: " + conceito);
                break;
            case 4: case 5:
                conceito = 'D';
                System.out.println("Conceito: " + conceito);
                break;
            case 0: case 1: case 2: case 3:
                conceito = 'E';
                System.out.println("Conceito: " + conceito);
                break;
            default:
                System.out.println("Nota inválida!");
                break;
        }
    }
}