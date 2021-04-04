package hw7;

import java.util.Scanner;

public class TestFeed {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Василий", 10, false);
        cats[1] = new Cat("Пушистик", 12, false);
        cats[2] = new Cat("Барсик", 9, false);
        cats[3] = new Cat("Антосик", 14, false);
        cats[4] = new Cat("Рыжик", 10, false);

        Plate plate = new Plate(60);
        plate.info();
        for (Cat cat : cats) {
            if (!cat.fullness && cat.appetite < plate.food) {
                cat.eat(plate);
                cat.fullness = true;
                System.out.println("Кот " + cat.name + " покушал");
            } else {
                System.out.println("Кот " + cat.name + " голоден");
            }
        }
        plate.info();
        System.out.println("Сколько корма добавить в миску?");
        Scanner in = new Scanner(System.in);
        int action = in.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}
