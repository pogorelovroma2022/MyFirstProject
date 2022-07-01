package level3.lesson5.part1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
    В методе main создайте объект ArrayList с именем “список дел” с типом String. Добавьте в
    него ваши дела на день, например строки: “сделать зарядку”, “поесть”, “поехать в офис”,
    “поработать”, “поесть”, “поработать”, “приехать домой”, “обнять мужа/жену/детей”, “поесть”,
     “умыться”, “лечь спать”. В списке дел должно быть как минимум 2 раза “поесть”.
     Далее выведите все элементы на консоль, вначале через цикл for-each, затем просто передайте
      список в System.out.println().

      Посмотрите глазами в каком порядке вы добавляли дела на день и в каком порядке они выводятся.
       Также глазами посчитайте сколько раз вы добавляли “поесть” и сколько в итоге лежит такая
       строка в списке.
*/
public class Task1 {
    public static void main(String[] args) {
        List<String> todoList = new LinkedList<>();
        todoList.add("поесть");
        todoList.add("сделать зарядку");
        todoList.add("поесть");
        todoList.add("лечь спать");
        todoList.add("поесть");

        for (String deal: todoList) {
            System.out.println(deal);
        }

        System.out.println(todoList);
    }
}
