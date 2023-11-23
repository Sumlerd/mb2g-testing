import guru.springframework.JavaHelloWorld;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {
    
    @Test
    public void testgetHello()
    {
        JavaHelloWorld hihi = new JavaHelloWorld();

        assertEquals("Hello World", hihi.getHello());
    }
}
