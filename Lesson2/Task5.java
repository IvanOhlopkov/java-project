package Lesson2;
import java.util.Scanner;
/**класс Task5 позволяет сформировать заказ на сладости среди 3 наименований
 * если в заказе было выбрано одно из наименований, то выводятся его параметры
 * считает общий вес заказа и сумму заказа. выводит на консоль
 * @author Ivan Ohlopkov
 */
public class Task5 {
    public static void main(String[]args){
        int sumW = 0;
        int sumP = 0;
        int kolvo1 = 0;
        int kolvo2 = 0;
        int kolvo3 = 0;
        byte kalor = 0;
        int vPak = 0;
        int discount = 0;
        String name1 = null;
        String name2 = null;
        String name3 = null;
        /*
        после ввода строки, преобразовываем ее в массив. в цикле каждое значение в строке проверяется
        на одно из наименований и присвоение его параметров
         */
        System.out.println("Выберите сладости: 1-Candy (цена 10р), 2-Jellybean (цена 20р), 3-Chocolate (цена 30р)");
        Scanner inPos = new Scanner(System.in);
        String pos = inPos.next();
        String[] arr1 = pos.split("");
        for(int a=0; a < arr1.length;a++){
            String j = arr1[a];
            int weight = 0;
            int prise = 0;
            int edinica1 = 0;
            int edinica2 = 0;
            int edinica3 = 0;
            byte param1 = 0;
            int param2 = 0;
            byte param3 = 0;
            if (j.equals("1")){
                weight = 100;
                prise = 10;
                name1 = "Candy";
                edinica1 = 1;
                param1 = 20;
            }
            else if (j.equals("2")){
                weight = 200;
                prise = 20;
                name2 = "Jellybean";
                edinica2 = 1;
                param2 = 5;
            }
            else if (j.equals("3")){
                weight = 300;
                prise = 30;
                name3 = "Chocolate";
                edinica3 = 1;
                param3 = 1;
            }
            //значения суммируются с каждой итерацией
            sumW += weight;
            sumP += prise;
            kolvo1 += edinica1;
            kolvo2 += edinica2;
            kolvo3 += edinica3;
            kalor += param1;
            vPak += param2;
            discount += param3;
        }
        inPos.close();
        System.out.println("Были выбраны:");
        //выводится в консоль, если в строке было одно из наименований
        if(name1 != null) {
            System.out.println(" " + name1 + " " + kolvo1 + " шт." + " калорий всего: " + kalor);
        }
        if (name2 != null) {
            System.out.println(" " + name2 + " " + kolvo2 + " уп." + " всего в упаковках: " + vPak);
        }
        if (name3 != null) {
            System.out.println(" " + name3 + " " + kolvo3 + " шт." + " скидка за 1 шоколадку в % - " + discount);
            //сумма заказа пересчитывается в зависимости от кол-ва шоколадок в заказе
            sumP = sumP - (sumP / 100 * discount);
        }
        System.out.println("Итого вес: " + sumW + " грамм. Итого цена: " + sumP + " руб.");
    }
}