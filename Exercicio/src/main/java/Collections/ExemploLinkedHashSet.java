package Collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adiciona os numeros no set
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);

        System.out.println(sequenciaNumerica);

        //Remove o número do set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        //Retorna a qtde de itens do set
        System.out.println("Qtde de itens: " + sequenciaNumerica.size());

        // Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        for(Integer nro : sequenciaNumerica){
            System.out.print(nro + " ");
        }

        System.out.println();
        sequenciaNumerica.clear();
        //Retorna se o set esta vazio ou não
        System.out.println("Esta vazio : " + sequenciaNumerica.isEmpty());
    }
}
