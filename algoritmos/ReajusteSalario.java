/*
* Exercicio 4.4.5 - Logica de programacao.
* A partir da digitação do salário atual de um determinado colaborador e
* do respectivo porcentual de reajuste que está recebendo de seu empregador,
* escreva um algoritmo capaz de apresentar na tela qual será o seu próximo
* salário.
* */

import java.util.Scanner;

public class ReajusteSalario {

    public static void main(String[] args) {
        ReajusteSalario salario = new ReajusteSalario();
        salario.reajuste();
    }

    public void reajuste() {

        Scanner sc = new Scanner(System.in);

        double salarioAtual;
        double porcentualReajuste;
        double salarioReajuste;

        System.out.println("Insira seu salario atual:");
        salarioAtual = sc.nextDouble();
        System.out.println("Insira o reajuste em porcentagem");
        porcentualReajuste = sc.nextDouble();

        salarioReajuste = (salarioAtual * porcentualReajuste) / 100;
        salarioReajuste += salarioAtual;
        System.out.println("Seu proximo salario sera de: R$" + salarioReajuste);
    }
}