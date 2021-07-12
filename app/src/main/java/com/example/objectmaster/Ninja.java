package com.example.objectmaster;

public class Ninja extends Human {
    public Ninja(int strength, String stealth, String intelligence, int health) {
        super(strength, stealth, intelligence, health);
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "stealth='" + stealth + '\'' +
                ", intelligence='" + intelligence + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                '}';
    }
}
