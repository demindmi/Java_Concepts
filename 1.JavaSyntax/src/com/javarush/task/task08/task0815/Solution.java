package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String > map = new HashMap<>();
        map.put("John", "Doe");
        map.put("Andrew", "Pow");
        map.put("Town", "Row");
        map.put("Pew", "Cow");
        map.put("Carl", "Doe");
        map.put("Till", "Meow");
        map.put("Gohn", "Tow");
        map.put("John", "Zow");
        map.put("Stan", "Maoe");
        map.put("John", "Feo");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        Iterator iter = map.entrySet().iterator();

        while(iter.hasNext()){
            map.Entry entry = (map.Entry) iter.next();

        }

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
