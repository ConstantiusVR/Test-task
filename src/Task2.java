
// Задание 2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
// В результате сравнения в консоль должно быть выведено одно из сообщений:
// "Строки неидентичны" или "Строки идентичны"


import java.util.Scanner;

public class Task2 {

    private static String compareFunc(String a, String b) {
        if (a.equals(b)) {
            return ("\n Строки идентичны");
        } else {
            return ("\n Строки неидентичны");
        }
    }
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.print("\n Введите строку a: ");
        String a = reader.nextLine();
        System.out.print("Вы ввели: " + a);

        System.out.print("\n Введите строку b: ");
        String b = reader.nextLine();
        System.out.print("Вы ввели: " + b);

        String result = Task2.compareFunc(a, b);
        System.out.print(result);


    }



}
