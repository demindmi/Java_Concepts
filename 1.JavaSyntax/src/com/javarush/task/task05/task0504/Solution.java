package com.javarush.task.task05.task0504;

public class Solution {
    public static void main(String[] args) {
        Cat alex = new Cat("Alex", 12, 25, 5);
        Cat bob  = new Cat("Bob", 6, 18, 6);
        Cat zeus = new Cat("Zeus", 4, 22, 8);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}