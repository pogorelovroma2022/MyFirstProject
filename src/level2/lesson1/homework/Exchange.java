package level2.lesson1.homework;
/*
    Курс валют. Создать класс с 2 методами: перевода рублей в доллары и долларов в рубли.
*/

public class Exchange {
    static double bynToDollars(int bynQuantity) {
        double rate = 2.8;
        return bynQuantity / rate;
    }
    static double changeDollarsToByn(int dollars) {
        double rate = 2.8;
        return dollars * rate;
    }
}
