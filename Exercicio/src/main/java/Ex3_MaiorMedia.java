import java.util.Scanner;
/*
Faça um programa que leia 5 números e informe o maior numero
e a média desse números.
 */
public class Ex3_MaiorMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;


        do{
           System.out.println("Numero: ");
           numero = scan.nextInt();
           soma = soma + numero;


           if(numero > maior) maior = numero;

           count++;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));
    }
}
