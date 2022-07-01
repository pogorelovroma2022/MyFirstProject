package level4.lesson3.part2;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
//        try {
//            // code
//        } catch (Exception e) {
//            // code
//            System.out.println("Произошла ошибка: " + e);
//        } finally {
//            // code
//        }

        System.out.println("Начало main");
        String[] shops = {"Ebay", "Amazon", "Ozon"};

        try {
            System.out.println(shops[10]);
            System.out.println("Середина main");
        } catch (NullPointerException e) {
            System.out.println("Произошла ошибка: " + e);
        } finally {
            System.out.println("Конец main");
        }

        // code
    }
}
