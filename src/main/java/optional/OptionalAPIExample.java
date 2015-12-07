package optional;

import java.util.Optional;

/**
 * Created by Gary Lo on 7/12/2015.
 */
public class OptionalAPIExample {

  Optional<Integer> optional = Optional.of(1);

  {
    // Check the value exist in the Optional
    optional.isPresent();    // return true;

    // print the value if it exist
    optional.ifPresent( x -> System.out.println(x));

    // filter the value
    optional.filter(x -> x == 0).isPresent(); // return false;

    // FlatMap to other Optional
    optional.flatMap((x) -> Optional.of( x * x ));

  }



}
