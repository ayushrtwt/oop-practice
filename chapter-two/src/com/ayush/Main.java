package com.ayush;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(19,"Ayush",10000,false);
        Human human2 = new Human(22,"Rahul",15000,true);
        System.out.println(human2.age);

        System.out.println(human2.population);
        System.out.println(human1.population);

    }
}
