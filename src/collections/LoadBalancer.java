package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class LoadBalancer {
    private Map<Character, Integer> map; // свою внутреннюю map(нам подходит переменная даже типа интерфейс)
    private Set<Character> chars; // Из map можно вытащить имена ключей методом keySet а он вернет set, поэтому готовим для этого переменную
    private int max = 0; // хорошая практика установить значение

    // constructor
    public LoadBalancer(HashMap<Character, Integer> servers) {
        map = servers; //просто перекладываем
        chars = map.keySet();  // отдни буквы тут будут
    }

    public void convertValueToRange(){
        for(Character myChar : chars){
            max = max + map.get(myChar);
            map.put(myChar, max);
            System.out.println("Max is: " + max);
        }
    }

    public char getServer() {
        Random rand = new Random();
        int random = rand.nextInt(max) + 1; // нам надо от 1
        Character server = null; //обязательно надо занулить?
        for (Character myChar : chars){
            if(random <= map.get(myChar)){
                server = myChar;
                System.out.printf("Random was:%d, server was:%c", random, server);
                break;
            }
        }
        return server;
    }
}
