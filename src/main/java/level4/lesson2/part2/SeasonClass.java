package level4.lesson2.part2;

public class SeasonClass {
    public static final SeasonClass WINTER = new SeasonClass();
    public static final SeasonClass SPRING = new SeasonClass();
    public static final SeasonClass SUMMER = new SeasonClass();
    public static final SeasonClass AUTUMN = new SeasonClass();
}

enum SeasonEnum {
    WINTER, SPRING, SUMMER, AUTUMN
}

class SeasonUsage {
    public static void main(String[] args) {
        SeasonClass currentSeason = SeasonClass.SUMMER;
        SeasonEnum currentSeason2 = SeasonEnum.SUMMER;

        System.out.println("class: " + currentSeason);
        System.out.println("enum: " + currentSeason2);

        if (currentSeason == SeasonClass.SUMMER) {
            System.out.println("Ура!! Сейчас лето!!");
        }
        if (currentSeason2 == SeasonEnum.SUMMER) {
            System.out.println("Ура!! Сейчас лето!!");
        }
    }
}