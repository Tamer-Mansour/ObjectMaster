package com.example.objectmaster;

public class Human {
    String stealth,intelligence;
    int strength;
    int health = 100;

    public Human(int strength, String stealth, String intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public int attack() {
        return health -= health;
    }

}
