package ru.geekbrains.lesson1.hw2;


public class HomeWork2 {

    static boolean checkBalance(int[] arr){
        int sum = 0;
        int leftSum = 0;
        for (int i : arr){
            sum += i;
        }
        if (sum % 2 != 0){
            return false;
        }
        int pos = 0;
        for (int i : arr) {
            leftSum += i;
            pos++;
            if (2 * leftSum == sum) {
                for (int j = 0; j < pos; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
                for (int j = pos; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        //Первое задание
        int[] a = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1)
                a[i] = 0;
            else a[i] = 1;
            System.out.print(a[i] + " ");
        }

        System.out.println();

        //второе задание
        int[] a2 = new int[8];
        for (int j = 0; j < a2.length; j++) {
            a2[j] = j * 3;
            System.out.print(a2[j] + " ");

        }

        System.out.println();

        //третье задание
        int[] a3 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a3.length; i++) {
            if (a3[i] < 6) {
                a3[i] *=2;
            }
            System.out.print(a3[i] + " ");
        }

        System.out.println();

        //четвертое задание

        int[][] arrayQuad = new int[9][9];
        for (int i = 0; i < arrayQuad.length; i++) {
            for (int j = 0, x = arrayQuad[i].length - 1; j < arrayQuad[i].length; j++, x--) {
                if (i == j || i == x)
                    arrayQuad[i][j] = 1;
                System.out.print(arrayQuad[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println();

        //пятое задание
        /***
         * Задать одномерный массив и найти в нем
         * минимальный и максимальный элементы (без помощи интернета)
         */
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int minElement = array[0], maxElement = array[0];
        for (int i : array) {
            minElement = Math.min(minElement,i);
            maxElement = Math.max(maxElement,i);
            
        }
        /*for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement){
                minElement = array[i];
            }
            else if (array[i] > maxElement){
                maxElement = array[i];
            }

        }
        */
        System.out.println(minElement + " " + maxElement);
        

        //шестое задание
        /***
         * Написать метод, в который передается не пустой одномерный целочисленный массив,
         * метод должен вернуть true, если в массиве есть место, в котором сумма
         * левой и правой части массива равны.
         * Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
         * checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
         * эти символы в массив не входят.
         */
        checkBalance(new int[]{1,2,3,5,1,4,4,4});







    }
}
