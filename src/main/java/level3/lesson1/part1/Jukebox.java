package level3.lesson1.part1;

/*
    Создайте класс Jukebox. Добавьте в него метод public void music(int position). Внутри
    метода сделайте if else. Если position равно 1, то в консоль должны выводиться слова песни
    "Пусть бегут неуклюже". Если равно 2, то в консоль должны выводиться слова песни
    "Спокойной ночи". Во всех остальных случаях должно появится "Песня не найдена".
    Напишите метод main с демонстрацией работы этого метода и объекта этого класса.
*/
public class Jukebox {
    // modifiers type name(args)
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
            return;
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }

        System.out.println("Конец метода");
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(1);
        jukebox.music(1);
        jukebox.music(17);
        jukebox.music(2);
        jukebox.music(1);
    }
}
