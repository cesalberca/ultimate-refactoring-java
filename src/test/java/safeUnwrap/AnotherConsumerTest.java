package safeUnwrap;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnotherConsumerTest {

    @Test
    public void should_get_amount_of_model_of_another_consumer() {
        final AnotherConsumer anotherConsumer = new AnotherConsumer();

        int amount = anotherConsumer.getAmount(new Model("red", 10));

        assertEquals(10, amount);
    }

    @Test
    public void should_get_amount_of_model_of_consumer() {
        final Consumer consumer = new Consumer();

        String color = consumer.getColor(new Model("red", 10));

        assertEquals("red", color);
    }
}