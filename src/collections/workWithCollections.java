package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class workWithCollections {
    public static void main(String[] args) {

        /**  List interface, ex: implemented by ArrayList class*/
        var names = new ArrayList<String>(); // create a collection by using class that implement List interface
        names.add("Peter");
        names.add("Paul");
        names.add(0, "Sarah");// will shift to right the old value
        names.remove(1);
        names.set(1, "Sam"); // will replace completely the old value
        System.out.println(names);

        for(String name : names){
            System.out.println("This is " + name);
        }

        // or
        names.forEach(name -> {
            System.out.println("This is " + name);
        });

        /** Map interface, ex: implemented by HashMap class */
        var animals = new HashMap<String, Integer>();
        animals.put("dog", 1);
        animals.put("rabbit", 67);
        System.out.println("Animals map" + animals);
        System.out.println(animals.containsKey("noSuchAnimal"));
        System.out.println(animals.containsValue(67));
//        for(String animal : animals ){ так нельзя
//            ...;
//        }
        animals.forEach((k, v) -> {
            System.out.println("Key is: " + k + "Value is: " + v);
        });

        /** Set interface, ex: implemented by HashSet class */
        var my_hash_set = new HashSet<String>();
        my_hash_set.add("elem1");
        my_hash_set.add("elem2");
        my_hash_set.add("elem2");
        System.out.println("This is my hashset: " + my_hash_set);
        for (String el: my_hash_set){
            System.out.println(el);
        }
        // or
        my_hash_set.forEach(el -> {
            System.out.println("forEach:" + el);
        });

        // Set можно получить из map by using keySet() but this set will be backed by the map, so changes to the map are reflected in the set, and vice-versa.
        Set<String> keys = animals.keySet(); //  returns a Set view of the keys contained in this map
        System.out.println("Animals map before: " + animals);
        System.out.println("This is my set create from map: " + keys); // [rabbit, dog]
//        keys.add("fox"); // this Set view does not support the add or addAll operations.
        keys.remove("dog"); // but supports removal(and changes the original map)
        System.out.println("Animals map after: " + animals);

    }
}
