package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.first());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo da capital parametrizada
        System.out.println(treeCapitais.lower("Florianopolis"));

        //Retorna a primeira capital acima da capital parametrizada
        System.out.println(treeCapitais.higher("Florianopolis"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.iterator();
        System.out.println("\nCapitais :");
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");

        }
        System.out.println("\nCapitais:");
        for(String capital : treeCapitais){
            System.out.print(capital + "  ");
        }
   }
}
