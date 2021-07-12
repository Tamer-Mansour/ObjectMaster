package com.example.objectmaster;

public class Samurai extends Human {
    public Samurai(int strength, int stealth, int intelligence, int health) {
        super(strength, stealth, intelligence, health);
    }


    @Override
    public String toString() {
        return "Samurai{" +
                "stealth='" + stealth + '\'' +
                ", intelligence='" + intelligence + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                '}';
    }
}
