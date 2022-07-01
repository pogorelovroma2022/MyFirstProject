package level1.lesson4.part2;

public class WhileExample {
    public static void main(String[] args) {
        // for - 98%
        // while - 2%
        // do while - 0

        // 0..100
        int saturation = 100;
        do {
            System.out.println("Current saturation: " + saturation);
//            saturation = saturation + 10;
            saturation += 10;
        } while (saturation < 100);
        System.out.println("Finally: " + saturation);

        // do {
        //  code
        // } while (boolean);
    }
}
