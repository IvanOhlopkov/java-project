package Lesson4;
/**
 * класс Task1 обрабатывает слова из файла file.txt. сортирует их в алфавитном порядке и выводит на консоль
 * подсчитывает кол-во встречаемых слов в файле и отражает их рядом
 * author Ivan Ohlopkov
 */

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        //используем интерфейс TreeMap - вызывается дерево с ключом String значением Integer
        //в TreeMap сортировка выполняется автоматически по заданному ключу
        TreeMap<String, Integer> map = new TreeMap<>();
        String fileName = "/Lesson4/file.txt";
        //получаем значение откуда было вызвано приложение, рабочий каталог пользователя (путь рабочей области для текущего проекта)
        String workDir = System.getProperty("user.dir");
        String fullFileName = workDir + "/" + fileName;

        Path path = Paths.get(fullFileName);

        Scanner scan = new Scanner(path, "windows-1251");
        /*
        выполняем while пока в потоке есть какие-то символы. присваиваем word String из Scan (Scanner "сам" смотрит в файле разденные пробелом)
        с помощью интерфейса map и метода containsKey считаем в count те же word. Если найдется такой же word, то с put добавляем ключ и значение +1 к текущим.
        Иначе возвращаем ключ, значение = 1
         */
        while (scan.hasNext()) {
            String word = scan.next();
            if (map.containsKey(word)) {
                int count = map.get(word) + 1;
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        }
        scan.close();
        //для каждого узла дерева выводим на консоль ключ-значение
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}

