package hw7;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n){
        food -= n;
    }
    public void increaseFood(int m){
        food += m;
    }
    public void info(){
        System.out.println("Всего корма: " + food);
    }
}
