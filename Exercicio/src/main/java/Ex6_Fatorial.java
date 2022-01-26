/*
Faça um programa que calcule o fatorial de um numero interio fornecido pelo usuario.
Ex: 5! = 120 ( 5 x 4 x 3 x 2 x 1
 */

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int  multiplicacao = 1;

        for(int i = fatorial; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(fatorial + "!=" + multiplicacao);
    }
}
