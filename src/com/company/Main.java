package com.company;

public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior(250, 30);
        Magic magic = new Magic(200, 40);
        Medic medic = new Medic(150, 25);

        Hero[] superHero = {warrior, magic, medic};

        for (int i = 0; i < superHero.length; i++) {
            superHero[i].applySuperAbility("Warrior применил суперспособность CRITICAL DAMAGE");
            break;
        }
    }
}