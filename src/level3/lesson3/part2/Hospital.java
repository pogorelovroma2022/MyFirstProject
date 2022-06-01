package level3.lesson3.part2;

public class Hospital {
    public static void main(String[] args) {
        Doctor[] doctors = new Doctor[5];
        doctors[0] = new Doctor();
        doctors[1] = new Surgeon();
        doctors[2] = new Surgeon();
        doctors[3] = new Dentist();
        doctors[4] = new Dentist();

        for (int i = 0; i < doctors.length; i++) {
            Doctor currentDoctor = doctors[i];
            currentDoctor.treat();
        }
    }
}
