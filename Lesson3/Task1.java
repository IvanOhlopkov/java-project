package Lesson3;
import java.util.Scanner;
/**
 * класс Task1 позволяет провести операцию для двух чисел. сумма выводится с 4-мя знаками после запятой
 * @author Ivan Ohlopkov
 * */
public class Task1 {
    public static void main( String[] args ){
       /*создаем объект класса Scanner,
        объявляем переменные а,b,sum с типом double и присваиваем метод nextDouble для считывания ввода
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите операцию: +,-,/,*");
        String op = scanner.next();
        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();
        scanner.close();
    Calc calc = new Calc();
    System.out.printf("Результат операции равен %.4f: ", calc.calculation(a,op,b));
    }
}
class Calc{
    public double calculation(double a, String op, double b){
        double sum = 0;
        if(op.equals("+") )
            sum = a + b;
        else if(op.equals("-"))
            sum = a - b;
        else if (op.equals("/"))
            sum = a / b;
        else if (op.equals("*"))
            sum = a * b;
        else
            System.out.println("Вы ввели не правильную операцию!");
        //используем метод Math.round - округляем sum умноженной на 10000 до целого, и делим на 10000
        sum = Math.round(sum * 10000.0) / 10000.0;
        //выводим сумму в формате %.4f, чтобы вывод был в 4 знака после запятой
        return sum;
    }
}
