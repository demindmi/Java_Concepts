package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> _set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            _set.add(i);
        }
        return _set;

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            Integer num = iterator.next();

            if (num > 10) {
                iterator.remove();
            }

        }
        return set;
    }

    public static void main(String[] args) {



    }
}
