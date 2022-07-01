package level2.lesson1.part2;

public class MethodWithReturn {
    public static void main(String[] args) {
//        System.out.println(add(10, 20));

//        int result = add(10, 20);
//
//        System.out.println(result * 5);
//
//        String myFullName = fullName("Ivan", "Ivanov");
//
//        System.out.println(myFullName);
//        System.out.println(myFullName);

        System.out.println(findMax(13, 7));
    }

    static int findMax(int x, int y) {
        return x > y ? x : y;
    }

    int findMax2(int x, int y) {
        return x > y ? x : y;
    }

    static int add(int x, int y) {
        // return
        return x + y;
    }

    static String fullName(String name, String surname) {
        return "My name is: " + name + ", my surname is: " + surname + ".";
    }
}
