// Задание 3: Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
// Необходимо написать программу, которая выведет в консоль все чётные числа.

public class Task3 {
    public static void main(String[] args) {

        int[] myArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int even = 0;
        for (int i : myArray) {
            if (i % 2 == 0) {
                even = i;
                System.out.println(even);
            }

        }
    }
}