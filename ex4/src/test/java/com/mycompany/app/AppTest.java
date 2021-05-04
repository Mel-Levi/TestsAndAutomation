package app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
  @Test
  public void evaluatesExpression() {
    App ex4 = new App();
    int sum = ex4.evaluate("1+2+3");
    assertEquals(6, sum);
  }
}
