package level4.lesson10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    private ElectricEngine engine;
}

@Component
class ElectricEngine  {
}