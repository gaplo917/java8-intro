package stream;

import optional.User;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Gary Lo on 7/12/2015.
 */
public class PowerfulAPIExampleTest {

  @Test
  public void testDistinct() throws Exception {
    new PowerfulAPIExample()
      .distinct(Arrays.asList(1,1,2,2,3,3,3,3,4))
      .forEach(System.out::println);
  }

  @Test
  public void testListToMap() throws Exception {
    new PowerfulAPIExample().listToMap(Arrays.asList(
      new User(1, "a"),
      new User(2, "b"),
      new User(3, "b"),
      new User(4, "c")
    )).entrySet()
      .forEach(System.out::println);
  }
}