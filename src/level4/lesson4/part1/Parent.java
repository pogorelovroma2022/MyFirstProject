package level4.lesson4.part1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Inherited
@Target(ElementType.TYPE)
@interface AnnotationExample1 {

}
@interface AnnotationExample2 {

}

@AnnotationExample1
@AnnotationExample2
public class Parent {
}

class Child extends Parent {
    public static void main(String[] args) {
        new Thread().stop();
    }
}