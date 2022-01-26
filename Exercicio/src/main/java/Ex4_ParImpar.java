/*
Faça um programa que peça N numeros inteiros, calcule e mostre a qtde de numeros
pares e impares.
 */

import java.util.Scanner;

public class Ex4_ParImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdenros;
        int numero = 0;
        int qtdePares = 0, qtdeImpares = 0;

        System.out.println("Quantidade de numeros: ");
        qtdenros = scan.nextInt();

        int count = 0;

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            count++;

            if(numero % 2 == 0) qtdePares++;
            else qtdeImpares++;

        } while(count < qtdenros);
        System.out.println("Numeros Pares: " + qtdePares);
        System.out.println("Numeros Impares: " + qtdeImpares);
    }
}
