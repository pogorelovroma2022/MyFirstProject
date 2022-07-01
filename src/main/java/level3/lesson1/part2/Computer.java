package level3.lesson1.part2;

public class Computer {
    int memory;
    boolean isBroken;

    // Type() {
    //  initialization
    // }

    Computer(int memory, boolean isBroken) {
        this.memory = memory;
        this.isBroken = isBroken;
    }

    public static void main(String[] args) {
        Computer pc1 = new Computer(500, true);
        Computer pc2 = new Computer(1_200, false);
        System.out.println(pc1.memory);
        System.out.println(pc2.memory);
    }
}
