package level1.lesson3.part1;

public class IfElseExample {
    public static void main(String[] args) {
//        if (boolean) {
//            code1
//        } else {
//            code2
//        }
//        code3

//        boolean hasMoney = false;
//        boolean isOurFriend = true;
//        if (hasMoney || isOurFriend) {
//            System.out.println("Идём в ресторан");
//        } else {
//            System.out.println("Едим дома");
//        }

        // >, <, ==, !=, >=, <=
        int age = 15;
        boolean isAdult = age >= 18;
        boolean isOurFriend = true;
        if (isAdult || isOurFriend) {
            System.out.println("Идём в клуб!!))");
        } else {
            System.out.println("Идём домой");
        }

        System.out.println("Спим");
    }
}
