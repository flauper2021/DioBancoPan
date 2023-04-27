import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Crie um dicionário que relacione os modelos e seus respactivos consumos");
        Map <String, Double> carrosPopulares = new HashMap<>() {{
            
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
            put("Clio", 16.1);

        }};
        System.out.println(carrosPopulares);
        System.out.println(" ");

        System.out.println("Substitua o consumo do gol por 15.2 km/l.");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println(" ");

        System.out.println("Confira se o modelo Tucson está no dicionario: " + carrosPopulares.containsKey("Tucson"));
        System.out.println(" ");

        System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("Uno"));
        System.out.println(" ");

        System.out.println("Exiba o terceiro modelo adcionado: ");
        System.out.println("Como na lista 'Set', não tem como indentificar qual foi o terceiro modelo" +
        "adcionado");
        System.out.println(" ");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println(" ");

        System.out.println("Exiba os consumos: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        System.out.println(" ");

        System.out.println("Exiba o modelo mais economico:");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String,Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("É um Modelo eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
            
        }
        System.out.println(" ");

        System.out.println("Exiba o modelo menos economico:");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for(Map.Entry<String,Double> entry : entries){
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("É um modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }
        System.out.println(" ");

        System.out.println("Exiba a soma dos consumos");
        Iterator <Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma dos consumos é: " + soma);
        System.out.println(" ");

        System.out.println("Exiba a media dos consumos dos modelos: " + soma/carrosPopulares.size());
        System.out.println(" ");

        System.out.println("Remova os modelos com consumo igual a 15,6 km/l:");
        System.out.println(carrosPopulares);
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println(" ");

        System.out.println("Imprima a lista map na ordem em que foi inserida");
        Map <String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
            put("Clio", 16.1);

        }};
        System.out.println(carrosPopulares1);
        System.out.println(" ");

        System.out.println("Exiba o dicionario organizado pelo modelo: ");
        Map <String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);
        System.out.println(" ");

        System.out.println("Remova todos os itens do dicionario carrosPopulares");
        carrosPopulares.clear();
        System.out.println("O dicionario carrosPopulares foi removido?: " + carrosPopulares.isEmpty());
        System.out.println(" ");


    }

}
