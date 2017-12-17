import java.util.Scanner;
/**
 * класс base позволяет вызвать на выбор калькулятор или ввод массива из слов
 * @author Ivan Ohlopkov
 * */
public class
base {
    public static void main(String[] args){
        Scanner choice = new Scanner(System.in);
        System.out.println("Выберите программу для выполнения. 1- калькулятор, 2-поиск максимального слова в массиве");
        byte a = choice.nextByte();
        if(a == 1)
            calc.calculate();
        else if (a == 2)
            massiv.intext();
        else
            System.out.println("Вы ввели не верное значение выбора");
    }
}