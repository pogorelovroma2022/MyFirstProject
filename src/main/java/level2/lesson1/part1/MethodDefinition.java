package level2.lesson1.part1;

public class MethodDefinition {
    public static void main(String[] args) {
        // Goal:
        // - group logic in 1 action
        // - DRY
//        sayHello();
//        System.out.println("============");
//        sayHello();
        // [modifiers] type name([args]) {
        //
        // }

        // type name() {
        //
        // }
        sayHello10Times();
    }

    static void sayHello() {
        System.out.print("Hello. ");
        System.out.println("I'm Victoria. I'm a Java developer. ");
    }

    static void sayHello10Times() {
        for (int i = 0; i < 10; i++) {
            sayHello();
        }
    }
}
