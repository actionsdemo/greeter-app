import org.junit.Test;
import static org.junit.Assert.assertEquals;

import hello.Greeter;

public class GreeterTest {

  @Test
  public void testGreeterSayHello() {
    assertEquals("Hello world!", new Greeter().sayHello());
  }

}
