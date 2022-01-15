package one.digitalinnovation.basecamp;

public class Calculadora {

    public static void soma(double nro1, double nro2) {

        double resultado = nro1 + nro2;

        System.out.println("A soma de: " + nro1 + " + " + nro2 + " = "  + resultado);

    }

    public static void subtracao(double nro1, double nro2) {

        double resultado = nro1 - nro2;

        System.out.println("A subtração de: " + nro1 + " - " + nro2 + " = "  + resultado);

    }

    public static void multiplicacao(double nro1, double nro2) {

        double resultado = nro1 * nro2;

        System.out.println("A multiplicação de: " + nro1 + " * " + nro2 + " = "  + resultado);

    }

    public static void divisao(double nro1, double nro2) {

        double resultado = nro1 / nro2;

        System.out.println("A divisao de: " + nro1 + " / " + nro2 + " = "  + resultado);

    }

}
