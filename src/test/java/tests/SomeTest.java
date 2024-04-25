package tests;

import org.junit.jupiter.api.Test;
import pojo.Pojo;
import ru.testit.annotations.ExternalId;
import ru.testit.annotations.WorkItemIds;

public class SomeTest {

    @Test
    @ExternalId("someTest1")
    @WorkItemIds("3")
    public void someTest1() {
        Pojo pojo = new Pojo();
        pojo.setA("123");
        System.out.println(pojo.getA());
    }
}
