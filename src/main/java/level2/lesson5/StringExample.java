package level2.lesson5;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String day = "Day";
        String and = new String("and");
        String night = "night";

//      concat()

//      concatenation
//      конкатенация
        String dayAndNight = day + " " + and + " " + night;
        String dayAndNight2 = day.concat(" ").concat(and).concat(" ").concat(night);
        System.out.println(dayAndNight);
        System.out.println(day + " " + and + " " + night);
        System.out.println(dayAndNight2);

//      equals()
//      equalsIgnoreCase()
        String name = "Marina";
        String name2 = "maRinA";
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));

//      valueOf()
        int age = 18;
        String strAge = "" + age;
        String strAge2 = String.valueOf(age);

//      Integer.parseInt, Boolean.parseBoolean
        String x = "10";
        String y = "20";
        System.out.println(x + y);

        int xFromString = Integer.parseInt(x);
        int yFromString = Integer.parseInt(y);
        System.out.println(xFromString + yFromString);
        String booleanStr = "true";
        boolean b = Boolean.parseBoolean(booleanStr);

//      length()
//      charAt()
        String name3 = "Marina";
        System.out.println(name3.length());
        for (int i = 0; i < name3.length(); i++) {
            // name[i]
            System.out.print(name3.charAt(i) + " ");
        }
        System.out.println();

//      toCharArray()
        char[] chars = name3.toCharArray();
        System.out.println(Arrays.toString(chars));

//      toUpperCase()
//      toLowerCase()
        System.out.println(name3.toUpperCase());
        System.out.println(name3.toLowerCase());

//      split()
        String file = "10-20-3-7-14-17";
        String[] strings = file.split("-");
        System.out.println(Arrays.toString(strings));
    }
}
