package optional;

import java.util.Optional;

/**
 * Created by Gaplo917 on 6/12/2015.
 */
public class Main {

  public Country findUserCountry(User user){
    if(user != null){

      String countryId = user.getCountryId();

      if(countryId != null){
        return DB.findCountryById(countryId);
      }
    }
    return null;
  }

  public Optional<Country> findUserCountryOpt(User user){
    return Optional.ofNullable(user)
            .map(User::getCountryId)
            .map(DB::findCountryById);
  }
}
