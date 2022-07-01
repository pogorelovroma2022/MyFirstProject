package level4.lesson5;

public class FunctionalInterfaceExample {
}

@FunctionalInterface // @Override
interface MyFunctionalInterface {
    void sayHi(String name);
}

class FunctionalClass implements MyFunctionalInterface {
    @Override
    public void sayHi(String name) {
        System.out.println("Hello " + name);
    }
}

class FunctionalInterfaceUsage {
    public static void main(String[] args) {
        MyFunctionalInterface obj = new FunctionalClass();
        obj.sayHi("Petr");
    }
}