// Задание 1: Написать программу, которая принимает на вход два целых числа (a и b)
// и совершает с ними следующие действия:
//- сравнивает эти два числа и возвращает результат сравнения
// путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
//- совершает с этими числами операции сложения, вычитания, деления и умножения
// и результат выводит в консоль.


import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task1 {

    private static String compareFunc(int a, int b) {
        if (a > b) {
            return ("\n a > b");
        }
        if (a < b) {
            return ("\n a < b");
        } else {
            return ("\n a = b");
        }
    }
    private static String mathFunc (int a, int b) {

        int sum = a + b;
        int subtract = a - b;
        int multipl = a * b;
        int div = a/b;
        return ("\n x+y = " + sum + "," + "\n x-y = " + subtract + "," + "\n x*y = " + multipl + "," + "\n x/y = " + div);
    }



    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.print("\n Введите целое число a: ");
        int a = parseInt(reader.nextLine());
        System.out.print("Вы ввели: " + a);

        System.out.print("\n Введите целое число b: ");
        int b = parseInt(reader.nextLine());
        System.out.print("Вы ввели: " + b);

        String result1 = Task1.compareFunc(a,b);
        System.out.print(result1);
        String result2 = Task1.mathFunc(a,b);
        System.out.print(result2);

    }




}