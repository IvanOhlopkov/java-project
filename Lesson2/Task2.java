package Lesson2;
import java.util.Scanner;
/**
 * класс Task2 позволяет указать длину массива из слов и сами слова
 * выводит в консоль слово с максимальной длиной
 * @author Ivan Ohlopkov
 */
public class Task2 {
    public static void intext() {
        //объявляем массив слов arr1, длину массива i
        String[] arr1;
        System.out.println("Введите длину массива:");
        Scanner sc1 = new Scanner(System.in);
        int i = sc1.nextInt();
        System.out.println("Кол-во слов в массиве должно быть: " + i + ". Введите пожалуйста это кол-во слов");
        arr1 = new String[i];
        //просим ввести слово, сканируем его и записываем в массив
        for(int c = 0; c < arr1.length; c++){
            System.out.println("Введите слово в массиве с индексом " + c + ": ");
            String word = sc1.next();
            arr1[c] = word;
        }
        sc1.close();
        /*объявляем второй массив arr2 для поиска максимальной длины,
        b для записи индекса этого максимального слова в массиве arr1 при выполнении условия
        с для случая если несколь или все слова равны
         */
        int[] arr2;
        arr2 = new int[i];
        int max = arr2[0];
        int b = 0;
        int c = 0;
        for(int a = 0; a < arr1.length; a++) {
            arr2[a] = arr1[a].length();
            if (max < arr2[a]){
                max = arr2[a];
                b = a;
            } else if (max == arr2[a]){
                c = 1;
            }
        }
        //используем switch чтобы в любом из случаев получить вывод
        switch (c) {
            case 1: System.out.println("Несколько слов, или все слова с равной длиной");
                break;
            case 0: System.out.println("Максимальное слово это - " + arr1[b] + ". Длина слова составляет: " + max + " букв.");
                break;
        }
    }
}