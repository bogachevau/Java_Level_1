package hw4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HomeWork4 {

    private static final char DEFAULT = '_';
    private static final char X = 'X';
    private static final char O = 'O';
    private static int SIZE = 3;
    private static char[][] MAP = new char[SIZE][SIZE];

    private static void initMap(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DEFAULT;
                
            }
            
        }
    }
    private static void printMap(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");

            }
            System.out.println();

        }
    }

    private static void game(Scanner in){
        initMap();
        System.out.println("Добро пожаловать в игру Крестики Нолики");
        System.out.println("Для хода необходимо ввести номер стоки и номер столбца");
        int stepCounter = 0;
        while (true){
            System.out.println("Ваш ход");
            String line = in.nextLine();
            String[] args = line.split(" ");
            if (args.length != 2){
                System.out.println("Введите два числа");
            } else {
                try {
                    int x = Integer.parseInt(args[0]);
                    int y = Integer.parseInt(args[1]);
                    x--;
                    y--;
                    if (isValid(x, y)){
                        makeStep(x, y, X);
                        printMap();
                        stepCounter++;
                        if (checkVictory(X)){
                            System.out.println("Вы победили!");
                            return;
                        }
                        if (stepCounter == 9){
                            System.out.println("Ничья");
                            return;
                        }
                        System.out.println("Ход компьютера");
//                        joke();
                        movePC();
                        printMap();
                        stepCounter++;
                        if (checkVictory(O)){
                            System.out.println("Вы проиграли");
                            return;
                        }
                    } else {
                        System.out.println("Некорректный ход.\n" +
                                "Введите два числа от 1 до 3");
                    }
                } catch (Exception e){
                    System.out.println("Введите два числа");
                }

            }

        }
    }

    private static void joke() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println("Думаю о человеках");
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println("Майню биткойн");
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println("Читаю твою личку в контакте");
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println("Ворую рубль со счета");
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println("Спаси моих друзей… и Зойдберга!");

    }

    private static void movePC() {
        int x, y;
        do {
            x = (int) (Math.random() * 3);
            y = (int) (Math.random() * 3);
        } while (!isValid(x, y));
        makeStep(x, y, O);
    }

    private static boolean checkVictory(char x) {
        for (int i = 0; i < SIZE; i++) {
            boolean row = true, column = true, d1 = true, d2 = true;
            for (int j = 0; j < SIZE; j++) {
                row &= MAP[i][j] == x;
                column &= MAP[j][i] == x;
                d1 &= MAP[j][j] == x;
                d2 &= MAP[j][SIZE - j - 1] == x;
            }
            if (row || column || d1 || d2){
                return true;
            }
            
        }
        return false;
    }

    private static void makeStep(int x, int y, char sym) {
        MAP[x][y] = sym;
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && x < SIZE && y >= 0 && y < SIZE && MAP[x][y] == DEFAULT;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        game(in);
    }
}
