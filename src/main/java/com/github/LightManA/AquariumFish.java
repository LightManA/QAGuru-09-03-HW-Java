package com.github.LightManA;

public class AquariumFish {
    String nickName; // имя
    String family; // семейство, к которому относится рыба
    String type; // вид, к которому относится рыба
    String coloration = "yellow"; // окраска
    double size; // размер (длина)
    int age; // возраст, в месяцах

    public void whatIsYourNameMyFish() {
        System.out.println("My name is: " + nickName);
    }

    public void determineFamilyAndTypeOfFish() {
        System.out.println("Family: " + family);
        System.out.println("Type: " + type);
    }

    // определение текущего размера рыбы
    public void determiningCurrentFishSize() {
        System.out.println("Current size: " + size);
    }

    // каков текущий возраст рыбки
    public void determiningCurrentAge() {
        System.out.println("Current age: " + age);
    }

    // рыба взрослеет
    public void fishMatures() {
        age = age + 3;
        System.out.println("I grew up to: " + age);
    }

    // меняется окраска рыбы при ее взрослении
    public void changingColorOfFishAsTheyGrowUp() {
        System.out.println("Current coloration: " + coloration);
    }

    // рыба питается
    public void fishEat() {
        System.out.println("Am-am-am...");
    }

    // рыба хавает
    public void bigScaryFishEats() {
        System.out.println("Khyrch-khyrch-khyrch...");
    }

}
