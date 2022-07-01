package level3.lesson3.part2;

public class Doctor {
    void treat() {
        System.out.println("Измеряю температуру, провожу диагностику, отправляю к другому доктору");
    }
}

class Surgeon extends Doctor {
    @Override
    void treat() {
        System.out.println("Режу и зашиваю.");
    }
}

class Dentist extends Doctor {
    @Override
    void treat() {
        System.out.println("Удаляю кариес, ставлю пломбы");
    }
}