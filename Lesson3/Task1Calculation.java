package Lesson3;
import java.util.Scanner;
public class Task1Calculation {
    void inputNumberAndOperation(){
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
        System.out.printf("Результат операции равен %.4f: ", calculate(a,op,b));
    }
    //метод calculate проводит вычисление в зависимости от выбранной операции
    protected double calculate(double a, String op, double b){
        double sum = 0;
        if(op.equals("+") ) //полиморфизм
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
