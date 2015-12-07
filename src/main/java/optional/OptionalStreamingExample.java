package optional;

import java.util.Optional;

/**
 * Created by Gaplo917 on 6/12/2015.
 */
public class OptionalStreamingExample {

  // version 1
  public Optional<Country> findUserCountryOpt(User user){
    return Optional.ofNullable(user)
            .map(User::getCountryId)
            .map(DB::findCountryById);
  }

  // version 2, with exception
  public Country findUserCountry(User user) throws Exception {
    return Optional.ofNullable(user)
                .map(User::getCountryId)
                .map(DB::findCountryById)
                .orElseThrow(Exception::new);
  }

}
