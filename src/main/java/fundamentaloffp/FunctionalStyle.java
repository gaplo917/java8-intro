package fundamentaloffp;

import optional.User;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Gary Lo on 7/12/2015.
 */
public class FunctionalStyle {

  Predicate<Integer> filterEventNumber =  x -> x % 2 == 0;

  public List<Integer> filterEvenAndTransformToUserId(List<User> users){
    return users
      .stream()
      .map(User::getId)
      .filter(id -> id % 2 == 0)
      .collect(Collectors.toList());
  }

  public List<Integer> filterEvenAndTransformToUserId2(List<User> users){
    return users
      .stream()
      .map(User::getId)
      .filter(filterEventNumber)
      .collect(Collectors.toList());
  }


}
