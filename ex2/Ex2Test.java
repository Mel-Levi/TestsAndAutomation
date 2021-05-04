import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Ex2Test {
  @Test
  public void evaluatesExpression() {
    Ex2 ex2 = new Ex2();
    int sum = ex2.evaluate("1+2+3");
    assertEquals(6, sum);
  }
}
