package level3.lesson1.part2;

public class StaticNoStaticExample {
    static int x = 10;
    int y = 11;

    static void showStatic() {
        System.out.println(StaticNoStaticExample.x);
    }

    void showNoStatic() {
        System.out.println(y);
        System.out.println(StaticNoStaticExample.x);
        StaticNoStaticExample.showStatic();
    }

    public static void main(String[] args) {
//        showStatic();
        StaticNoStaticExample.showStatic();

        StaticNoStaticExample example = new StaticNoStaticExample();
        System.out.println(example.y);
        example.showNoStatic();
    }
}
