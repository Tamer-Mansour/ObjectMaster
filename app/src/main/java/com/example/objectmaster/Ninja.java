package com.example.objectmaster;

public class Ninja extends Human {
    int stealth = 10;
    public Ninja(int strength, int stealth, int intelligence, int health) {
        super(strength, stealth, intelligence, health);
    }

    public void steal(Human human ){
        human.health = health -10;
    }
    public void runAway(){
        health -= 10;
    }


}
