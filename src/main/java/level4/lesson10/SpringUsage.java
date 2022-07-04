package level4.lesson10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringUsage {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("level4.lesson10");

        Message msg = context.getBean(Message.class);
        System.out.println(msg);

//        Message msg1 = new Message();
//        Message msg2 = new Message();
//        System.out.println(msg1);
//        System.out.println(msg2);

//        Car car = context.getBean(Car.class);
//        Car car = (Car) context.getBean("car");
//        System.out.println(car);

        context.close();
    }
}
