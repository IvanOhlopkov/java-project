package Lesson3;
/**
 * класс Task1 позволяет провести операцию для двух чисел. сумма выводится с 4-мя знаками после запятой
 * вызывает метод из класса Task1Calculation, предварительно объявленного в конструкторе
 * @author Ivan Ohlopkov
 */
public class Task1{
    public static void main( String[] args ){
        Task1Calculation obj = new Task1Calculation();
        obj.inputNumberAndOperation();
    }
}

