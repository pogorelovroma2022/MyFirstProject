package level1.lesson4.part1;

public class ForExample2 {
    public static void main(String[] args) {
        for (int quantity = 500, currentStep = 1; currentStep <= quantity; currentStep++) {
            System.out.println("Приседаю: " + currentStep);
            // break;
            if (currentStep == 100) {
                break;
            }
            System.out.println("Hi");
        }
    }
}
