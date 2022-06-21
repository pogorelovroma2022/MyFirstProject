package level4.lesson5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    // stream()

    // Types:
    // промежуточные: filter(), map(), sorted(), limit()
    // терминальные: forEach(), count(), collect(), anyMatch(), allMatch(), findFirst()

    // ШАБЛОН: Поток данных -> промежуточные методы -> 1 терминальный метод
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers);

//        for (Integer number : numbers) {
//            System.out.println(number);
//        }
//
//        numbers.stream()
//                .parallel()
//                .forEach((element) -> {
//                    String threadName = Thread.currentThread().getName();
//                    System.out.println(threadName + ": " + element);
//                });

//        numbers.stream()
//                .forEach(System.out::println);

//        int quantity = 0;
//        for (Integer number : numbers) {
//            quantity++;
//        }
//        System.out.println(quantity);

//        long quantity = numbers.stream()
//                .count();
//        System.out.println(quantity);

//        for (Integer number : numbers) {
//            if (number > 50) {
//                System.out.println(number);
//            }
//        }
//
//        numbers.stream()
//                .filter((number) -> number > 50)
//                .forEach((element) -> System.out.println(element));

//        numbers.stream()
//                .filter((number) -> number % 2 == 0)
//                .forEach((element) -> System.out.println(element));

//        List<Integer> evenNumbers = numbers.stream()
//                .filter((number) -> number % 2 == 0)
//                .collect(Collectors.toList());
//
//        System.out.println(evenNumbers);

//        int quantity = 0;
//        for (Integer number : numbers) {
//            if (number > 45) {
//                quantity++;
//            }
//        }
//        System.out.println(quantity);

        // stream()

        // Types:
        // промежуточные: filter(), map(), sorted(), limit()
        // терминальные: forEach(), count(), collect(), anyMatch(), allMatch(), findFirst()

        // ШАБЛОН: Поток данных -> промежуточные методы -> 1 терминальный метод
//        long quantity = numbers.stream()
//                .filter((e) -> e > 45)
//                .count();
//        System.out.println(quantity);

//        List<Integer> myList = new ArrayList<>();
//        Collections.sort(numbers);
//        for (int i = 0; i < 3; i++) {
//            Integer number = numbers.get(i);
//            myList.add(number * number);
//        }
//        System.out.println(myList);

//        List<Integer> myList = numbers.stream()
//                .map((e) -> e * e)
//                .sorted()
//                .limit(3)
//                .collect(Collectors.toList());
//        System.out.println(myList);

//        anyMatch(), allMatch(), findFirst()
//        boolean hasNumberMoreThanFifty = false;
//        for (Integer number : numbers) {
//            if (number > 50) {
//                hasNumberMoreThanFifty = true;
//                break;
//            }
//        }
//        System.out.println(hasNumberMoreThanFifty);

//        boolean hasNumberMoreThanFifty = numbers.stream()
//                .allMatch((e) -> e > 5);
//        System.out.println(hasNumberMoreThanFifty);

        Optional<Integer> firstOptional = numbers.stream()
                .filter((e) -> e > 90)
                .findFirst();
//
//        System.out.println(firstOptional);
//
//        if (firstOptional.isPresent()) {
            Integer number = firstOptional.get();
            System.out.println(number);
//        } else {
//            System.out.println("Ну ладно, нет так нет.");
//        }
    }
}
