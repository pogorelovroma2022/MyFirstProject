package level3.lesson3.part1;

public class Cat {
    public void feed() {
        activateBrain();
        feelEnjoyment();
        createSaliva();
        chew();
        swallow();
        startStomach();
        createAcids();
        removeWasteFromTheBody();
    }

    private void activateBrain() {
        System.out.println("Запускаю процессы в мозгу");
    }

    private void feelEnjoyment() {
        System.out.println("Чувствую удовольствие");
    }

    private void createSaliva() {
        System.out.println("Создать слюну");
    }

    private void chew() {
        System.out.println("Жую");
    }

    private void swallow() {
        System.out.println("Проглотить");
    }

    private void startStomach() {
        System.out.println("Запускается желудок");
    }

    private void createAcids() {
        System.out.println("Создать нужные кислоты");
    }

    private void removeWasteFromTheBody() {
        System.out.println("Вывести отходы из организма");
    }
}

class CatUsage {
    public static void main(String[] args) {
        Cat murzik = new Cat();
        murzik.feed();
    }
}
