package com.example.objectmaster;

public class Samurai extends Human {
    int numberOsSamurai;
    int health = 200;
    public Samurai(int strength, int stealth, int intelligence, int health) {
        super(strength, stealth, intelligence, health);
    }
    public void deathBlow(Human human){

        human.health =0;

    }
    public void meditate(){
        health = health/2;
    }
    public int howMany(){
        return numberOsSamurai;
    }
}
