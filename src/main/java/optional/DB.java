package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Gaplo917 on 6/12/2015.
 */
public class DB {

  public static final List<Country> countries = new ArrayList<>(
    Arrays.asList(new Country("A"),new Country("B"),new Country("C"))
  );

  public static final List<User> users = new ArrayList<>(
    Arrays.asList(new User(0,"A"),new User(1,"B"),new User(2,"C"))
  );

  public static User findUserById(int id){
    for(User u : users){
      if(u.getId() == id)
        return u;
    }
    return null;
  }

  public static Optional<User> findUserByIdOpt(int id){
    for(User u : users){
      if(u.getId() == id)
        return Optional.of(u);
    }
    return Optional.empty();
  }

  public static Country findCountryById(String id){
    for(Country c : countries){
      if(c.getId().equals(id))
        return c;
    }
    return null;
  }
}
