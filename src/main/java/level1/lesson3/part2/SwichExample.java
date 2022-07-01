package level1.lesson3.part2;

public class SwichExample {
    public static void main(String[] args) {
//        switch (проверяемая_переменная) {
//            case значение1:
//                действие1;
//                break;
//            case значениеN:
//                действиеN;
//                break;
//            default:
//                действие_по_умолчанию;
//                break;
//        }

        String day = "вт";
        switch (day) {
            case "пн":
                System.out.println("1");
                break;
            case "вт":
                System.out.println("2");
                break;
            case "ср":
                System.out.println("3");
                break;
            case "чт":
                System.out.println("4");
                break;
            case "пт":
                System.out.println("5");
                break;
            case "выходной":
                System.out.println("6й, либо 7й день недели");
                break;
        }
    }
}
