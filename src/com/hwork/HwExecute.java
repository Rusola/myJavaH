package com.hwork;

import collections.MyIntern;
//import collections.Server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class HwExecute {
    public static void main(String[] args) {
        Prime prime_obj = new Prime();
        System.out.println("**********isPrime() простое ли numbers ***********");
        for(int i = 1; i <=100; i++){
            if(prime_obj.isPrime(i)){
                System.out.print(i);
            };
        }
        System.out.println("*********getFibonacci ***************");
        prime_obj.getFibonacci(155);
        System.out.println("*********getFibonacci2 ***************");
        System.out.println(prime_obj.getFibonacci2(6));

        Palindrome myPalindrome = new Palindrome();
        System.out.println(myPalindrome.isPalindrome("mjadam"));

        // Sort & find 2nd smallest number
        MySort mySort = new MySort();
        int[] numbers = {-1, -1, 100, -1, 5, 6, 2, 1, 3};
        int result = mySort.getSmallest(numbers);
        System.out.print(result);
        System.out.println("**********");
        System.out.println(mySort.getSimpleSecond(numbers));

        // check if duplicates
        MyArray m_array = new MyArray();
        String[] arr = {"t", "b", "a", "n", "v", "t"};
       boolean is_duplicate = m_array.isDuplicate(arr);
        System.out.println("Method isDuplicate found duplicates: " + is_duplicate);

        System.out.println("***** printDuplicates *****");
        int[] arr_numbers = {3, 7, 9, 3, 8, 9, 3};
        m_array.printDuplicates(arr_numbers);

        System.out.println("***** printFrequency *****");
        String[] str_arr = {"One", "Two", "Three", "Two", "Eleven", "Three", "Three", "Eight"};
        m_array.printFrequency2(str_arr);

        System.out.println("***** array_backward *****");
        int[] array_backward = {1, 2, 3, 4, 5};
        for(int i = array_backward.length; i-- > 0;){
            System.out.print(i); // 43210
        }

        System.out.println("***** 0-9 Loop non stop *****");
//        for( int i = 0; ; i ++, i = i%10){
//            System.out.println(i);
//        }

        HwExecute obj = new HwExecute();

        HashMap serverA = new HashMap<String, String>();
        serverA.put("name", "A");
        serverA.put("powers", "3");

        HashMap serverB = new HashMap<String, String>();
        serverB.put("name", "B");
        serverB.put("powers", "1");

        HashMap serverC = new HashMap<String, String>();
        serverC.put("name", "C");
        serverC.put("powers", "2");

        var servers = new ArrayList<HashMap<String, String>>();

        servers.add(serverA);
        servers.add(serverB);
        servers.add(serverC);
        obj.getServer(servers);
        /**************************************/

        // or
        MyIntern myInternA = new MyIntern("A", 1);
        MyIntern myInternB = new MyIntern("B", 3);
        MyIntern myInternC = new MyIntern("C", 2);

        var servers2 = new ArrayList<MyIntern>();
        servers2.add(myInternA);
        servers2.add(myInternB);
        servers2.add(myInternC);

        obj.getServer2(servers2);
    }

    void getServer(ArrayList<HashMap<String, String>> servers){

        // all powers
        int powers = 0;
        for (int i=0; i< servers.size(); i++){
            HashMap<String, String> map = servers.get(i);

            // extract power
            int p = Integer.parseInt(map.get("powers"));
            powers += p;
        }

        int full_range = 100;
        double min = 0;
        double max = 0;
        for (int i=0; i< servers.size(); i++){
            HashMap<String, String> map = servers.get(i);
            // extract power again
            Double p = Double.parseDouble(map.get("powers"));
            double percent = p/powers * 100;
//            map.put("доля", Double.toString(percent));
            map.put("percent", Double.toString(percent));

            // assign a unique range to each server
            String str_min = Double.toString(min);
            map.put("min", str_min);

            max += Double.parseDouble(map.get("percent"));

            String str_max = Double.toString(max);
            map.put("max", str_max);

            min = max + 1;
        }

        System.out.println(servers);
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 99
        double random = rand.nextInt(100) + 0.0;
        servers.forEach(server  ->{
            double map_min = Double.parseDouble(server.get("min"));
            double map_max = Double.parseDouble(server.get("max"));
            if(random >= map_min & random <= map_max){
                System.out.println(server.get("name"));
            }else{
                System.out.println("not found");
            }
            System.out.println(random);
        });
    }

    // or
    void getServer2(ArrayList<MyIntern> servers2){

        // all powers
        double powers = 0;
        for(int i =0; i < servers2.size(); i ++) {
            // wow!
            double a = servers2.get(i).getPower();
            powers = powers + a;
        }

        int full_range = 100;
        double min = 0;
        double max = 0;
        for (int i=0; i< servers2.size(); i++){

            // extract power again
            MyIntern myIntern = servers2.get(i);
            Double p = myIntern.getPower();
            double percent = p/powers * 100;

            // add percent to obj
            myIntern.setPercent(percent);

            // assign a unique range: min & max to each server
            myIntern.setMin(min);
            max += myIntern.getPercent();
            myIntern.setMax(max);
            min = max + 1;
        }

        System.out.println(servers2);
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 99
        double random = rand.nextInt(100) + 0.0;
        for (int i=0; i< servers2.size(); i++){
            MyIntern server = servers2.get(i);
            double server_min = server.getMin();
            double server_max = server.getMax();;
            if(random >= server_min & random <= server_max){
                System.out.println(server.getName());
            }else{
                System.out.println("not found");
            }
            System.out.println(random);
        }
    }

}
