package moveResponsibility;

import org.junit.Test;

public class GreeterTest {

    @Test
    public void sayHello() {
        new Greeter().sayHello();
    }

    @Test
    public void sayBye() {
        new Greeter().sayBye();
    }
}