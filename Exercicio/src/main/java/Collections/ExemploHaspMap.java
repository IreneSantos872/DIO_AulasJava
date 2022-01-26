package Collections;

import java.security.Key;
import java.util.*;

public class ExemploHaspMap {

    public static void main(String[] args) {
        Map<String, Integer> campeaosMundialFifa = new HashMap<>();

        campeaosMundialFifa.put("Brasil", 5);
        campeaosMundialFifa.put("Alemanha", 4);
        campeaosMundialFifa.put("Italia", 4);
        campeaosMundialFifa.put("Uruguai", 2);
        campeaosMundialFifa.put("Argentina", 2);
        campeaosMundialFifa.put("França", 2);
        campeaosMundialFifa.put("Inglaterra", 1);
        campeaosMundialFifa.put("Espanha", 1);

        System.out.println(campeaosMundialFifa);

        //Atualiza o valor chave para o Brasil
        campeaosMundialFifa.put("Brasil", 6);

        System.out.println(campeaosMundialFifa);

        //Retorna a Argentia
        System.out.println(campeaosMundialFifa.get("Argentina"));

        //Retorna se existe ou não a França
        System.out.println(campeaosMundialFifa.containsKey("França"));

        //Retorna se existe um campeão 6
        System.out.println(campeaosMundialFifa.containsValue(6));

        //Navega nos registros do mapa
        for (String key: campeaosMundialFifa.keySet()) {
            System.out.println(key + "--" + campeaosMundialFifa.get(key));
        }

        //Verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeaosMundialFifa.size());
        campeaosMundialFifa.clear();

        System.out.println(campeaosMundialFifa);
    }
}
