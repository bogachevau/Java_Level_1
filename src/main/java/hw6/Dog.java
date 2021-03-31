package hw6;

public class Dog extends Animal{

    public final int MAX_RUN_LENGTH = 500;
    public final int MAX_SWIM_LENGTH = 10;
    private String name;

    public Dog(String name){
        this.name = name;
    }
    public int dogCount;
    public Dog(){
        dogCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run(int lenght) {
        if (lenght >= 0 && lenght <= MAX_RUN_LENGTH){
            System.out.println(name + " пробежал: " + lenght + " м.");
        } else{
            System.out.println("Введены некорректные данные\n" + "Введите число от 0 до " + MAX_RUN_LENGTH);
        }
    }

    @Override
    public void swim(int lenght) {
        if (lenght >= 0 && lenght <= MAX_SWIM_LENGTH){
            System.out.println(name + " проплыл: " + lenght + " м.");
        } else{
            System.out.println("Введены некорректные данные\n" + "Введите число от 0 до " + MAX_SWIM_LENGTH);
        }
    }
    public int getMAX_RUN_LENGTH() {
        return MAX_RUN_LENGTH;
    }

    public int getMAX_SWIM_LENGTH() {
        return MAX_SWIM_LENGTH;
    }
}
