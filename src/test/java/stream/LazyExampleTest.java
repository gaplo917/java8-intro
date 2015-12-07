package stream;

import org.junit.Test;

/**
 * Created by Gary Lo on 7/12/2015.
 */
public class LazyExampleTest {

  @Test
  public void testRun() throws Exception {
    new LazyExample().run();
  }

  @Test
  public void testFunctionalStyleRun() throws Exception {
    new LazyExample().functionalStyleRun();
  }
}