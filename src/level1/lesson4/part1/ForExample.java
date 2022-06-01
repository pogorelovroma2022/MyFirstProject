package level1.lesson4.part1;

public class ForExample {
    public static void main(String[] args) {
        for (int currentFloor = 1, myFloor = 27; currentFloor <= myFloor; currentFloor++) {
            if (currentFloor >= 10) {
                System.out.println("Еду на лифте дальше: " + currentFloor);
                continue;
            }
            System.out.println("Иду пешком: " + currentFloor);
            // continue
        }
    }
}
