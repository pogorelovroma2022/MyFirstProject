package level4.lesson2.part2;

public class StringBuilderExample {
    public static void main(String[] args) {
        String fullName = "Vasiliy" + " " + "Kuznetsov";
        // "Vasiliy"
        // " "
        // "Kuznetsov"
        // "Vasiliy "
        // "Vasiliy Kuznetsov"
//        System.out.println(fullName);

        // StringBuilder / StringBuffer
        // "Vasiliy"
        // " "
        // "Kuznetsov"
        // "Vasiliy Kuznetsov"

//        StringBuffer builder = new StringBuffer();
//        builder.append("Vasiliy");
//        builder.append(" ");
//        builder.append("Kuznetsov");
//        String fullName2 = builder.toString();
//        System.out.println(fullName2);

        StringBuffer builder = new StringBuffer();
        builder.append("abcdef");
        builder.reverse();
        String reversedString = builder.toString();
        System.out.println(reversedString);
    }
}
