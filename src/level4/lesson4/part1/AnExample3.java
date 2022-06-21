package level4.lesson4.part1;

public @interface AnExample3 {
    String name();
    int age() default 21;
}

@AnExample3(name = "Alex")
class MyClass {

}