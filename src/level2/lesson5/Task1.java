package level2.lesson5;

/*
            Написать метод, который принимает строку и индекс.
        Метод печатает на экран текст вида: “Символ на позиции 0 это П”,
        либо “Символ на позиции 3 это В”. Пример выше для слова “Привет” и
        переданными индексами 0 и 3 соответственно.
*/
public class Task1 {
    public static void main(String[] args) {
        String string = "Привет";
        print(string, 0);
        print(string, 3);
    }

    static void print(String string, int index) {
        char c = string.charAt(index);
        System.out.println("Символ на позиции " + index + " это " + Character.toUpperCase(c));
    }
}
