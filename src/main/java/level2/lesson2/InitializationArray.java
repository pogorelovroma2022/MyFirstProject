package level2.lesson2;

public class InitializationArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        //
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // for(type name: arrayName) {
        //
        // }
        for (int x : numbers) {
            System.out.println(x);
        }
    }
}
