package optional;

import java.util.Optional;

/**
 * Created by Gary Lo on 7/12/2015.
 */
public class ReplaceNullExample {

  public User defaultValueUseCase1(){
    User user = DB.findUserById(1);

    if(user == null) user = new User(1,"a");

    return user;
  }

  public User defaultValueUseCase1InOptional() {
    return Optional.ofNullable(DB.findUserById(1))
            .orElse(new User(1,"a"));
  }

  public User throwExceptionUseCase2() throws Exception {
    User user = DB.findUserById(1);

    if(user == null) throw new Exception();

    return user;
  }

  public User throwExceptionUseCase2InOptional() throws Exception {
    return Optional.ofNullable(DB.findUserById(1))
            .orElseThrow(Exception::new);
  }

}
