package com.example.objectmaster;

public class Human {
    int stealth,intelligence,strength;
    int health = 100;

    public Human(int strength, int stealth, int intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
