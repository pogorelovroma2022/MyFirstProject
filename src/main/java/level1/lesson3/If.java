package level1.lesson3;

public class If {
    public static void main(String[] args) {
        // if (boolean) {
        //  code1
        // } else {
        //  code2
        // }
        // code3
        int i = 0;
        for (; ;){
            if (i < 10) {
                System.out.println(i);
                i++;
            } else {
                break;
            }
        }

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        // if (boolean) { - hasFood = false
        //  code1 - eat
        // }
        // code2 - go to the office

//        boolean hasFood = true;
//        if (hasFood) {
//            System.out.println("Great");
//            System.out.println("I have breakfast");
//        } else {
//            System.out.println("Okay, I have to buy food");
//        }
//        System.out.println("Put on a coat");
//        System.out.println("Go to the office");


//        System.out.println("Night club");
//        int age = 17;
//        boolean isEnoughAge = age > 17;
//        if (isEnoughAge) {
//            System.out.println("You can come in");
//        } else {
//            System.out.println("Sorry, you are too young.");
//        }

//        int number = 0;
//        if (number < 0) {
//            System.out.println("Меньше 0");
//        } else if (number == 0) {
//            System.out.println("Ноль");
//        } else {
//            System.out.println("Больше нуля");
//        }

//        int number = 0;
//
//        if (number == 1) {
//            System.out.println("One");
//        } else if (number == 2) {
//            System.out.println("Two");
//        } else if (number == 3) {
//            System.out.println("Three");
//        } else if (number == 4) {
//            System.out.println("Four");
//        } else if (number == 5) {
//            System.out.println("Five");
//        } else if (number == 6) {
//            System.out.println("Six");
//        } else if (number == 7) {
//            System.out.println("Seven");
//        } else {
//            System.out.println("Какое-то другое число");
//        }

//        switch
//        int number2 = 5;
//
//        switch (number2) {
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4:
//                System.out.println("Four");
//                break;
//            case 5:
//                System.out.println("Five");
//                break;
//            case 6:
//                System.out.println("Six");
//                break;
//            case 7:
//                System.out.println("Seven");
//                break;
//            default:
//                System.out.println("Какое-то другое число");
//                break;
//        }
    }
}
