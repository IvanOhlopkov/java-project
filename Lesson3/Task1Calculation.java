package Lesson3;
/**
 * класс Task1Calculation содержит методы Task1Calculation - выполняет ввод чисел и операций
 * calculate - проводит вычисление в зависимости выбранной операции
 * @author Ivan Ohlopkov
 */
import java.util.Scanner;
public class Task1Calculation {
    void inputNumberAndOperation() {
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
        System.out.printf("Результат операции равен %.4f: ", calculate(a, op, b));
    }

    //метод calculate проводит вычисление в зависимости от выбранной операции
    protected double calculate(double a, String op, double b) throws ArithmeticException {
        double sum = 0;
        if (op.equals("+"))
            sum = a + b;
        else if (op.equals("-"))
            sum = a - b;
        else if (op.equals("/")) {
            try {
                if (b == 0) throw new ArithmeticException();
                else
                    sum = a / b;
            } catch (ArithmeticException e) {
                System.out.println(e + " На ноль делить нельзя!");
                System.exit(0);
            }
        } else if (op.equals("*"))
            sum = a * b;
        else
            System.out.println("Вы ввели не правильную операцию!");
        //используем метод Math.round - округляем sum умноженной на 10000 до целого, и делим на 10000
        sum = Math.round(sum * 10000.0) / 10000.0;
        //выводим сумму в формате %.4f, чтобы вывод был в 4 знака после запятой
        return sum;
    }
}