package level4.lesson3.part2;

import java.io.FileNotFoundException;

public class RuntimeExceptionExample {
    public static void main(String[] args) {
//        invokeMethodWithUncheckedException();
//        invokeMethodWithCheckedException();
//        invokeMethodWithCheckedException2();
    }

    private static void invokeMethodWithUncheckedException() {
        throw new ArithmeticException();
    }

    private static void invokeMethodWithCheckedException() throws FileNotFoundException {
        throw new FileNotFoundException();
        // throws
    }

    private static void invokeMethodWithCheckedException2() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка: " + e);
        }
    }
}
