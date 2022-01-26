/*
Faça um programa que leia 20 numeros inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
 */

import java.util.Random;

public class Ex9_NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int nro = random.nextInt(100);
            numerosAleatorios[i] = nro;
        }
        System.out.print("\nNumeros aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
       }

        System.out.print("\nSucessores Numeros aleatórios : ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

        System.out.print("\nAntecessor Numeros aleatórios : ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
    }
}
