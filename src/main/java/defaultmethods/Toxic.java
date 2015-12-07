package defaultmethods;

/**
 * Created by Gaplo917 on 5/12/2015.
 */
public interface Toxic {
  void eatTamJai();

  void surfGolden();

  default int findFriends(){
    return 0;
  }

  default int findGirlFriends(){
    return 0;
  }
}
