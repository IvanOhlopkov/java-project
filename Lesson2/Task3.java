package Lesson2;
import java.util.Scanner;
/**
 * класс Task3 позволяет вызвать на выбор калькулятор или ввод массива из слов
 * @author Ivan Ohlopkov
 * */
public class Task3 {
    public static void main(String[] args){
        Scanner choice = new Scanner(System.in);
        System.out.println("Выберите программу для выполнения. 1- калькулятор, 2-поиск максимального слова в массиве");
        byte a = choice.nextByte();
        if(a == 1)
            Task1.calculate();
        else if (a == 2)
            Task2.intext();
        else
            System.out.println("Вы ввели не верное значение выбора");
        choice.close();
    }
}