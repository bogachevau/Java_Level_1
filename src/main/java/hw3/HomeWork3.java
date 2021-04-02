package hw3;

import java.util.Scanner;

public class HomeWork3 {
    /**
     * 1. Написать программу, которая загадывает случайное число от 0 до 9
     * и пользователю дается 3 попытки угадать это число. При каждой попытке
     * компьютер должен сообщить, больше ли указанное пользователем число,
     * чем загаданное, или меньше. После победы или проигрыша выводится запрос –
     * «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
    public static void main(String[] args) {
        int replay = 1;
        while (replay == 1) {
            System.out.println("Добро пожаловать в игру Угадай число!");
            int number = (int) (Math.random() * 9);
            for (int ctn = 3; ctn >= 0; ) {
                System.out.println("Вам нужно угадать число от 0 до 9. У Вас " + ctn + " попытки");
                Scanner in = new Scanner(System.in);
                int scannerNum = in.nextInt();
                if (scannerNum == number) {
                    System.out.println("Поздравляем, Вы выиграли!");
                    System.out.println("Загаданное число: " + number);
                    break;
                } else if (scannerNum < number) {
                    System.out.println("Указанное число больше");
                } else {
                    System.out.println("Указанное число меньше");
                }
                ctn--;
                if (ctn < 1){
                    System.out.println("Вы проиграли :(");
                    System.out.println("Загаданное число: " + number);
                    break;
                }
             }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner in = new Scanner(System.in);
            replay = in.nextInt();

        }


    }

}
