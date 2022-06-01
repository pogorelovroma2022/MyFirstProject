package level3.lesson1.part1;

/*
    Создайте класс Student, создайте метод “петь песню”. Этот метод должен выводить на
    консоль слова "I believe I can fly". Также у вас должен быть метод playMusic, который
    выводит на экран “tra-tra-tra”. В методе main попросите Петю три раза сыграть музыку
    и три раза спеть.
*/
public class Student {
    void playMusic() {
        System.out.println("Tra-tra-tra");
    }

    void singASong(String lyrics) {
        System.out.println("I can sing a song: " + lyrics);
    }

    public static void main(String[] args) {
        Student petya = new Student();

        petya.playMusic();
        petya.playMusic();
        petya.playMusic();

        petya.singASong("I believe I can fly.");
        petya.singASong("Freestyles");
        petya.singASong("Something else");
    }
}
