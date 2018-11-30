package com.javarush.task.task05.task0502;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int ageDifference = this.age - anotherCat.age;
        if(ageDifference >= 3) { //check if age difference larger than 3 years
            return false;
        }
        else{
            if(this.weight * this.strength < anotherCat.weight * anotherCat.strength)
                return false;
            else
                return  true;
        }
    }

    public static void main(String[] args) {

    }
}
