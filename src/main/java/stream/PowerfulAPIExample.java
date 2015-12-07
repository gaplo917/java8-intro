package stream;

import optional.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Gary Lo on 7/12/2015.
 */
public class PowerfulAPIExample {

  public List<Integer> distinct(List<Integer> list){
    return list
            .stream()
            .distinct()
            .collect(Collectors.toList());
  }

  public Map<String,List<User>> listToMap(List<User> users){

    return users
            .stream()
            .collect(Collectors.groupingBy(
              User::getCountryId,
              Collectors.toList()
            ));
  }
}
