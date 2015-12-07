package stream;

import org.junit.Test;

import java.util.stream.Stream;

/**
 * Created by Gary Lo on 7/12/2015.
 */
public class StreamExampleTest {
  @Test
  public void testStreamExample() throws Exception {
    Stream.of(5,4,2,1,3)
      .filter(x -> x > 3)
      .sorted()
      .forEach(System.out::println);
  }
}