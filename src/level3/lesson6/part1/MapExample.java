package level3.lesson6.part1;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // put
        Map<String, String> contacts = new HashMap<>();
//        System.out.println("size: " + contacts.size());

        contacts.put("Alexander", "+375-25-333-33-33");
        contacts.put("Vika", "+375-25-444-44-44");
//        System.out.println(contacts);

        for(Map.Entry<String, String> pair: contacts.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " = " + value);
        }

//        System.out.println("size: " + contacts.size());
//        // get
//        System.out.println("Vika number: " + contacts.get("Vika"));
//
//        // remove
//        contacts.remove("Vika");
//        System.out.println("size: " + contacts.size());
//        System.out.println("Vika number: " + contacts.get("Vika"));
//
//        // put
//        System.out.println("Alexander number: " + contacts.get("Alexander"));
//        contacts.put("Alexander", "+7(921)-333-33-33");
//        System.out.println("size: " + contacts.size());
//        System.out.println("Alexander number: " + contacts.get("Alexander"));

    }
}
