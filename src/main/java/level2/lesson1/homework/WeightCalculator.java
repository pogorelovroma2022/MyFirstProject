package level2.lesson1.homework;
/*
Идеальный вес. Создать класс с методом расчета идеального веса по формуле:
 вес равен росту минус коэффициент. При росте до 165 см коэффициент равен 100,
 до 175 см — 105, выше 175 см — 110.
*/

/**
 * Ca
 */
public class WeightCalculator {
    // JavaDoc

    /**
     * Этот метод рассчитывает вес
     * @param height это рост
     * @return возвращает вес
     */
    static int calculateIdealWeight(int height) {
        int ratio;
        if (height < 165) {
            ratio = 100;
        } else if (height < 175) {
            ratio = 105;
        } else {
            ratio = 110;
        }
        return height - ratio;
    }
}
