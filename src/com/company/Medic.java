package com.company;

public class Medic extends Hero{

    private static final int damage = 100;
    private static final int health = 1000;

    public Medic(int i, int i1) {
        super(health, damage);
        new Hero(health, damage) {
            @Override
            public void applySuperAbility(String medic_применил_суперспособность_health_damage) {

            }
        };
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Medic применил суперспособность Health damage");
    }
}

