package com.example.objectmaster;

public class Wizard extends Human {
    public Wizard(int strength, String stealth, String intelligence, int health) {
        super(strength, stealth, intelligence, health);
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "stealth='" + stealth + '\'' +
                ", intelligence='" + intelligence + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                '}';
    }
}
