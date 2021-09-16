package com.company;

public class Warrior extends Hero{
    private static final int damage = 320;
    private static final int health = 1290;

    public Warrior(int i, int i1) {
        super(health, damage);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }

}
