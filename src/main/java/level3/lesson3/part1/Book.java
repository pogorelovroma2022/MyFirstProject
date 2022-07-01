package level3.lesson3.part1;
/*
    Создайте класс Книга, с полями название, кол-во страниц. Поля сделайте закрытыми, добавьте
     геттеры и сеттеры к полям. В сеттеры добавьте проверки для кол-ва страниц нельзя установить
      значения меньше 0, для названия нельзя чтобы в название содержалось слово “name” (У строк
      есть метод “contains()”).
*/
public class Book {
    private String title;
    private int pageQuantity;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.contains("name")) {
            this.title = title;
        }
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        if (pageQuantity > 0) {
            this.pageQuantity = pageQuantity;
        }
    }
}
