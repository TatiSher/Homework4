package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //task1();
       // task2();
         task3();
        // task4();
        //task5();
    }

    private static void task1() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");

        for (; i >= 1; i -= 1)
            System.out.print(" " + i + " ");
    }

    private static void task2() {
        for (int friday = 1; friday <= 31; friday++) {
            if (friday % 7 == 0)
                System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    private static void task3() {
        for (int t = 2021; t > 1800; t = t - 79) {
            System.out.println("Комета пролетала рядом с Землей за последние 200 лет в " + t);
        }
        for (int p = 2021; p < 2150; p = p + 79) {
            System.out.println("Комета пролетит над Землей в следующий раз в " + p); // не могу понять, что и как нужно поменять, чтобы исключить вывод строки "Комета пролетит над Землей в следующий раз в 2021"
        }
    }


    private static void task4() {
        int b = 1;
        for (; b <= 30; b++) {
            if (b % 3 == 0)
                System.out.println(b + ":" + " ping");
            if (b % 5 == 0)
                System.out.println(b + ":" + " pong");
            if (b % 3 == 0 && b % 5 == 0)
                System.out.println(b + ": " + "ping pong");
            System.out.println(b + ":"); // не понимаю как указать условия так, чтобы избежать повторения цифр :(
        }
    }
}