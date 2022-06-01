package level1.lesson4.part2;

public class TaskFizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean isDivByThree = i % 3 == 0;
            boolean isDivByFive = i % 5 == 0;
            if (isDivByThree && isDivByFive) {
                System.out.println("FizzBuzz");
            } else if (isDivByThree) {
                System.out.println("Fizz");
            } else if (isDivByFive) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
