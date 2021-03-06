package Lesson2;
import java.util.Arrays;
import java.util.Random;
/** класс Task4 генерирует массив случайных чисел от -10 до 10, потом меняет их местами
 * и выводит результат на консоль
 * @author Ivan Ohlopkov
 */
public class Task4 {
    public static void main(String[] args){
        System.out.print("Массив случайных чисел от -10 до 10: ");
        int[] arr1;
        arr1 = new int[20];
        int minPlus = 10;
        int maxMinus = -10;
        int b = 0;
        int c = 0;
        /*
        в цикле присваиваем каждому индексу массива arr1 случайное значение из метода rnd (передаем параметры -10,10)
        если значение в индексе больше или равно, то присваиваем минимальное положительное значение этому индексу, а также перем. b (для след.цикла)
        аналогичное сравнение и присваивание для максимального отрицательного значения в массиве
         */
        for(int a = 0; a < arr1.length; a++){
            arr1[a] = rnd(-10, 10);
            if (arr1[a] <= minPlus && arr1[a] > 0){
                minPlus = arr1[a];
                b = a;
            }
            if (arr1[a] >= maxMinus && arr1[a] < 0){
                maxMinus = arr1[a];
                c = a;
            }
            // выводим также сразу в консоль каждый элемент массива разделенные , в начале и конце []
            switch (a) {
                case 0: System.out.print("[" + arr1[a] + ", ");
                    break;
                case 19: System.out.print(arr1[a] + "] ");
                    break;
                default: System.out.print(arr1[a] + ", ");
                    break;
            }
        }
        System.out.println("");
        System.out.println("минимальное положительное: " + arr1[b] + " максимальное отрицательное: " + arr1[c]);
        /*
        присваиваем переменной d индексы массива, где нашлись минимальные положительные b
        в цикле находятся минимальные положительные значения и меняются на максимальные отрицательные c, и наоборот с использованием d
         */
        int d = arr1[b];
        int f = arr1[c];
        for(int a = 0; a < arr1.length; a++){
            if ( arr1[a] == minPlus ){
                arr1[a] = f;
            }
            else if ( arr1[a] == maxMinus ){
                arr1[a] = d;
            }
        }
        System.out.print("Поменяли местами макс и мин значения:");
        System.out.println(Arrays.toString(arr1));
    }
    //в методе rnd получаем параметры min и max, объект класса Random, где используем метод nextInt для получения случайных чисел
    private static int rnd(int min, int max){
        Random rand = new Random();
        int random = min + rand.nextInt(max - min + 1);
        return random;
    }

}