package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nExercicio da Calculadora\n");
        Calculadora.soma(5,5);
        Calculadora.subtracao(10,8);
        Calculadora.multiplicacao(5,9);
        Calculadora.divisao(10,2);

        System.out.println("\nExercicio de Mensagens\n");
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(22);

        System.out.println("\nExercicio de Emprestimo\n");
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 4);


    }





}
