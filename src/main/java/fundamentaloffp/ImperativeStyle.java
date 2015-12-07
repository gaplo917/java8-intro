package fundamentaloffp;

import optional.User;

import java.util.List;

/**
 * Created by Gary Lo on 7/12/2015.
 */
public class ImperativeStyle {

  public void addEvenUserIdToList(List<User> users, List<Integer> ids){

    for(User user : users){
      if(user.getId() % 2 == 0)
        ids.add(user.getId());
    }

  }
}
