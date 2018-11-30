package com.javarush.task.task05.task0505;

public class Solution {
    public static void main(String[] args) {
        Cat alex = new Cat("Alex", 12, 25, 5);
        Cat bob  = new Cat("Bob", 6, 18, 6);
        Cat zeus = new Cat("Zeus", 4, 22, 8);

        System.out.println(alex.fight(bob));
        System.out.println(bob.fight(zeus));
        System.out.println(zeus.fight(alex));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
