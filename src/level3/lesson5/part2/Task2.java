package level3.lesson5.part2;

import java.util.*;

/*
    В методе main создайте объект HashSet с именем “список дел” с типом String. Добавьте в него
     ваши дела на день, например: “сделать зарядку”, “поесть”, “поехать в офис”, “поработать”,
      “поесть”, “поработать”, “приехать домой”, “обнять мужа/жену/детей”, “поесть”, “умыться”,
      “лечь спать”. В списке дел должно быть как минимум 2 раза “поесть”. Далее выведите все
      элементы на консоль, вначале через цикл for-each, затем просто передайте множество в
      System.out.println().

    - Также глазами посчитайте сколько раз в списке дел присутствует “поесть”.
    - Посмотрите глазами в каком порядке вы добавляли дела и в каком порядке они выводятся в
    консоль.

*/
public class Task2 {
    public static void main(String[] args) {
        Set<String> todoList = new HashSet<>();
        todoList.add("лечь спать");
        todoList.add("поесть");
        todoList.add("сделать зарядку");
        todoList.add("поесть");
        todoList.add("поесть");

        for (String deal: todoList) {
            System.out.println(deal);
        }

        System.out.println(todoList);
    }
}
