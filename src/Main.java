import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1 ");
        System.out.println(Arrays.toString(switchPlaces(getRandomInteger(-10, 10), getRandomInteger(-10, 10))));
        System.out.println();

        System.out.println("Задача 2");
        System.out.println(chipsParty(getRandomInteger(0, 70), getRandomBoolean()));
        System.out.println();

        System.out.println("Задача 3");
        System.out.println(great6(getRandomInteger(-10, 10), getRandomInteger(-10, 10)));
        System.out.println();

        System.out.println("Задача 4");
        System.out.println(teenSum(getRandomInteger(0, 19), getRandomInteger(0, 19)));
        System.out.println();

        System.out.println("Задача 5");
        System.out.println(has77(new int[]{8, 5, 4, 2, 7, 7, 6, 4, 9, 8, 4, 61, 4}));
        System.out.println();

        System.out.println("Задача 6");
        System.out.println(twoTwo(new int[]{8, 5, 4, 2, 2, 8, 4, 6, 4, 9, 8, 4, 61, 4}));
        System.out.println();

        System.out.println("Задача 7");
        System.out.println(Arrays.toString(arrayers()));
        System.out.println();

        System.out.println("Задача 8");
        naturalDivisors();
        System.out.println();


    }

    public static void naturalDivisors() {
        int number = inputCheckNumber();

        for(int i = 1; i <= number ; i++)
        {
            if (number%i == 0)
                System.out.print(i + " ");
        }

    }

    public static int[] arrayers() {

        int arraySize = inputCheckNumber();

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInteger(-5, 5);
        }

        int firstHalfModSum = 0;

        for (int i = 0; i < array.length / 2; i++) {
            firstHalfModSum += Math.abs(array[i]);
        }

        int secondHalfModSum = 0;

        for (int i = arraySize / 2; i < array.length; i++) {
            secondHalfModSum += Math.abs(array[i]);
        }

        if (firstHalfModSum == secondHalfModSum)
            System.out.println("Части равны");

        else if (firstHalfModSum > secondHalfModSum)
            System.out.println("Первая часть больше");
        else
            System.out.println("Вторая часть больше");

        return array;

    }

    public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 7)
                if (nums[i + 1] == 7 || nums[i + 2] == 7)
                    return true;
        }
        return false;
    }

    public static boolean twoTwo(int[] nums) {

        for (int i = 1; i < nums.length - 1; i++)
            if (nums[i] == 2 && nums[i + 1] != 2 && nums[i - 1] != 2) {
                return false;
            }

        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        return false;
    }


    public static int teenSum(int a, int b) {
        System.out.println("Числа: " + a + " " + b);
        if (13 < (a + b) && (a + b) <= 19)
            return 19;
        else
            return (a + b);
    }

    public static boolean great6(int a, int b) {

        System.out.println("Числа: " + a + " " + b);
        return Math.abs(a - b) == 6 || Math.abs(a + b) == 6 || a == 6 || b == 6;
    }

    public static boolean chipsParty(int amountOfCrisps, boolean isWeekend) {
        System.out.println("Количество чипсов: " + amountOfCrisps + ". Выходной: " + isWeekend);
        if (amountOfCrisps < 15)
            return false;
        else return isWeekend || amountOfCrisps <= 20;
    }

    public static int[] switchPlaces(int first, int second) {

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        return new int[]{first, second};
    }


    public static int getRandomInteger(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static Boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    public static int inputCheckNumber() {
        System.out.println("Введите число");
        int number;

        while (true) {
            Scanner myInput = new Scanner(System.in);
            if (!myInput.hasNextInt()) {
                System.out.println("Введите число!");
                continue;
            }

            number = myInput.nextInt();

            if (number > 0)
                break;
            else
                System.out.println("Введите положительное значение!");
        }


        return number;
    }
}

