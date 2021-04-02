package hw6;

public class Test {

    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик");
        barsik.run(200);
        barsik.swim(5);
        Dog sharik = new Dog("Шарик");
        sharik.run(360);
        sharik.swim(9);
        Cat antosik = new Cat("Антосик");
        antosik.run(199);
        Dog lobzik = new Dog("Лобзик");
        lobzik.run(250);
        lobzik.swim(10);
//        Animal animal = new Animal();
        System.out.println("Создано:\n"
                + " - Собак: " + lobzik.dogCount + "\n"
                + " - Котов: " + antosik.catCount + "\n"
                + " - Животных: " + lobzik.animalCount);

    }
}
