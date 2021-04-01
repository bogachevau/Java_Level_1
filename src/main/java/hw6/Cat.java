package hw6;

public class Cat extends Animal{

    private String name;
    private final int MAX_RUN_LENGTH = 200;
    public int catCount = 0;

    public String getName() {

        return name;
    }
    public Cat(String name){
        this.name = name;
        catCount++;
    }

    public Cat(){

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run(int length) {
        if (length >= 0 && length <= MAX_RUN_LENGTH){
            System.out.println(name + " пробежал: " + length + " м.");
        } else{
            System.out.println("Введены некорректные данные\n" + "Введите число от 0 до " + MAX_RUN_LENGTH);
        }
    }

    public int getMAX_RUN_LENGTH() {
        return MAX_RUN_LENGTH;
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот не умеет плавать");
    }
}
