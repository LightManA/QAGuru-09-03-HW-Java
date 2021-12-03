package com.github.LightManA;

public class QAGuru09HomeWorkJava {

    public static void main(String[] args) {

        AquariumFish doris = new AquariumFish();
        AquariumFish rybus = new AquariumFish();
        AquariumFish monstrus = new AquariumFish();

        doris.nickName = "Doris";
        rybus.nickName = "Rybus";
        monstrus.nickName = "Monstrus";

        doris.family = "Characidae";
        doris.type = "Gymnocorymbus ternetzi";
        rybus.family = "Minnows and Carps";
        rybus.type = "Epalzeorhynchos bicolor (labeo)";
        monstrus.family = "Armored catfishes";
        monstrus.type = "Ancistrus dolichopterus";

        doris.size = 3.25;
        rybus.size = 12.7;
        monstrus.size = 13.99;

        doris.age = 39;
        rybus.age = 30;
        monstrus.age = 57;

        doris.coloration = "red";
        rybus.coloration = "grey";
        monstrus.coloration = "pink";

        System.out.println();

        doris.whatIsYourNameMyFish();
        doris.determineFamilyAndTypeOfFish();
        doris.determiningCurrentFishSize();
        doris.fishMatures();
        doris.changingColorOfFishAsTheyGrowUp();
        doris.fishEat();

        System.out.println();

        rybus.whatIsYourNameMyFish();
        rybus.determineFamilyAndTypeOfFish();
        rybus.determiningCurrentFishSize();
        rybus.determiningCurrentAge();
        rybus.changingColorOfFishAsTheyGrowUp();
        rybus.fishEat();

        System.out.println();

        monstrus.whatIsYourNameMyFish();
        monstrus.determineFamilyAndTypeOfFish();
        monstrus.determiningCurrentFishSize();
        monstrus.determiningCurrentAge();
        monstrus.changingColorOfFishAsTheyGrowUp();
        monstrus.bigScaryFishEats();

        System.out.println();

    }

}
