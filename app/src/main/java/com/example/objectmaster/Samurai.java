package com.example.objectmaster;

public class Samurai extends Human {
    int health = 200;
    public Samurai(int strength, int stealth, int intelligence, int health) {
        super(strength, stealth, intelligence, health);
    }
    public void deathBlow(Human human){

        human.health =0;

    }
}
