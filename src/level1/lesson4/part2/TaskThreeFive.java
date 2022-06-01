package level1.lesson4.part2;

public class TaskThreeFive {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean isDivideByThree = i % 3 == 0;
            boolean isDivideByFive = i % 5 == 0;

            if (isDivideByThree && isDivideByFive) {
                System.out.println(i);
            }
        }
    }
}
