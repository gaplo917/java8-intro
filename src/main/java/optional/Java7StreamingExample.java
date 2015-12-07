package optional;

/**
 * Created by Gary Lo on 7/12/2015.
 */
public class Java7StreamingExample {
  public Country findUserCountry(User user){
    if(user != null){

      String countryId = user.getCountryId();

      if(countryId != null){
        return DB.findCountryById(countryId);
      }
    }
    return null;
  }
}
