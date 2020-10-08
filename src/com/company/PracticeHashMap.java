package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.System.*;

public class PracticeHashMap {

    HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    public void createMap(){

        hashMap.put("Raja", 0);
        hashMap.put("Seema", 1);
        hashMap.put("Meera", 2);
        hashMap.put("Raghav", 3);
        hashMap.put("",4);
        hashMap.put("",5);
        hashMap.put("",6);
    }

    public void displayMap(){

        for(Map.Entry<String, Integer> e: hashMap.entrySet()){
            out.println(e.getKey()+":"+ e.getValue());
        }
    }

    public void searchHashMap() {
        if (hashMap.containsKey("Seema"))
            out.println("Key is present and the value is " + hashMap.get("Seema"));
    }

    public void retrieveKeyValue() {

        Set<String> s = hashMap.keySet();
        out.println("Key -"+s.toString());

        Collection<Integer> v = hashMap.values();
        out.println("Values - "+v.toString());


    }
}

