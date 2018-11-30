package com.javarush.task.task08.task0818;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> dict = new HashMap<>();
        int[] balance = {100,600, 300, 500, 550, 20, 1000, 450, 950, 80};
        String[] lastnames = {"Olaf", "Brolaf", "Kool", "Mool", "Sharp", "Smith", "Danielo", "Anto", "Betta", "Omega"};
        for(int i = 0; i < 10; i++){
            dict.put(lastnames[i],balance[i]);
        }
        return dict;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            if ((int)entry.getValue() < 500) {
                iter.remove();
            }
        }


    }

    public static void main(String[] args) {

    }
}