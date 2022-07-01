package level4.lesson5;

public class FuncInterfExample2 {
    public static void main(String[] args) {
        // (arg names) -> {
        //   code
        // };

        // (arg names) -> code;

        Checker checker1 = (number) -> number > 50;
        Checker checker2 = (number) -> number % 2 == 0;

        System.out.println(checker1.test(8));
        System.out.println(checker2.test(200));
    }
}

// Лямбда / Lambda - анонимная реализация функционального интерфейса

@FunctionalInterface
interface Checker {
    boolean test(int number);
}

//class IsMoreThanFifty implements Checker {
//    @Override
//    public boolean test(int number) {
//        return number > 50;
//    }
//}

//class IsEven implements Checker {
//    @Override
//    public boolean test(int number) {
//        return number % 2 == 0;
//    }
//}