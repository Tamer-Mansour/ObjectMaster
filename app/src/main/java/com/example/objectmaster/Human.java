package com.example.objectmaster;

public class Human {
    String stealth,intelligence;
    int strength;
    static int health = 100;

    public Human(int strength, String stealth, String intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public static int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
