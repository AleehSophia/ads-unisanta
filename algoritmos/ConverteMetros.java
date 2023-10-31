/*
* Exercicio 4.4.1 - Lógica de programacao
*
* Elabore um algoritmo onde, a partir de um determinado valor em centímetros fornecido pelo teclado, seja exibido
* na tela o valor equivalente em metros.
* */

import java.util.Scanner;

public class ConverteMetros {

    public static void main(String[] args) {

        ConverteMetros conversor = new ConverteMetros();
        conversor.conversorMetros();
    }

    public void conversorMetros() {

        Scanner sc = new Scanner(System.in);

        double centimentros;
        System.out.println("Insira quantos centimetros");
        centimentros = sc.nextDouble();
        double metros = centimentros / 100;
        System.out.println(centimentros + " cm = " + metros + " metros");
    }
}