package lambda;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Gary Lo on 7/12/2015.
 */
public class HighOrderFunctionExampleTest {
  @Test
  public void test(){
    // h(g(f(x)), where h(x) = x * 2 , g(x) = x * x , f(x) = x + 1;
    int result = HighOrderFunctionExample.func.apply(1);

    // h(g(f(1)) => h(g(2)) => h(4) => 8
    assertEquals(result,8);
  }

  @Test
  public void testWithLogging(){
    int result = HighOrderFunctionExample.funcWithLogging.apply(1);

    assertEquals(result,8);
  }
}