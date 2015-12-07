package optional;

/**
 * Created by Gaplo917 on 6/12/2015.
 */
public class User {
  private int id;

  private String countryId;

  public User(int id, String countryId) {
    this.id = id;
    this.countryId = countryId;
  }

  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return String.format("User(%d,%s)",id,countryId);
  }
}
