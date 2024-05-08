package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pojo.Pojo;
import ru.testit.annotations.ExternalId;
import ru.testit.annotations.WorkItemIds;

public class SomeTest {

//    @BeforeAll
//    public static void beforeAll() {
//        String a = null;
//        a.getBytes();
//        //тут должен быть null pointer exception из за которого junit5 прервет дальнейшнее выполнение тестов/методов
//        //но BaseJunit5Listener ловит exception и не прокидывает дальше
//        //из за этого без каких либо ошибок выполнение следущих методов/тестов продолжается
//    }

    @Test
    @ExternalId("someTest1")
    @WorkItemIds("3")
    public void someTest1() {
        Pojo pojo = new Pojo();
        pojo.setA("123");
        System.out.println(pojo.getA());
    }
}
