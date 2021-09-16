package com.company;

public abstract class Hero implements applySuperAbility{
    private int Damage;
    private String hp;

    public Hero(int health, int damage) {
    }


    public void applySuperAbility(int health, int damage) {
    }

    public abstract void applySuperAbility(String medic_применил_суперспособность_health_damage);

}