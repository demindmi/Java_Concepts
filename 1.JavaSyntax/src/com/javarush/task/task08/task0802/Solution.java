package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> Plants = new HashMap<>();
        Plants.put("арбуз", "ягода");
        Plants.put("банан", "трава");
        Plants.put("вишня", "ягода");
        Plants.put("груша", "фрукт");
        Plants.put("дыня", "овощ");
        Plants.put("ежевика", "куст");
        Plants.put("жень-шень", "корень");
        Plants.put("земляника", "ягода");
        Plants.put("ирис", "цветок");
        Plants.put("картофель", "клубень");
        for (Map.Entry<String, String> pair : Plants.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " +value);
        }
    }
}
