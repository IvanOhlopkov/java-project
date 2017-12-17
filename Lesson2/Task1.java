import java.util.Scanner;
/**
 * класс calc позволяет сложить два числа. сумма выводится с 4-мя знаками после запятой
 * @author Ivan Ohlopkov
 * */
public class calc {
    public static void calculate(){
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
        double sum = 0;
        scanner.close();
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
        //выводим сумму сложения в формате %.4f, чтобы вывод был в 4 знака после запятой
        System.out.printf("Результат операции равен %.4f: ", sum);
    }
}