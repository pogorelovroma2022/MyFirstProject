package level2.lesson5;


/*
    Написать 3 метода, которые подсчитывают количество всех точек,
    запятых и восклицательных знаков в строке.
*/

public class Task4 {
    public static void main(String[] args) {
        String string = "! .. a!bc, ab!!c ,,., !!.!";
        countDot(string);
    }

    private static void countDot(String string) {
        int quantity = 0;
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (currentChar == '.') {
                quantity++;
            }
        }
        System.out.println(quantity);
    }
}
