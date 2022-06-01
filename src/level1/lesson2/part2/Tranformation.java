package level1.lesson2.part2;

public class Tranformation {
    public static void main(String[] args) {
        byte age = 21; // -128..127
        short x = age; // -32k..32k

        short thousand = 1_000;
        byte y = (byte) thousand;
        System.out.println(y);
    }
}
