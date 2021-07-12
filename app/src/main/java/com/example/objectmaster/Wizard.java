package com.example.objectmaster;

public class Wizard extends Human {
    static int health = 50;
    static int intelligence = 8;
    public Wizard(int strength, int stealth, int intelligence, int health) {
        super(strength, stealth, intelligence, health);
    }
    public int mHealth(Human human){

        return health += health;
    }

}
