package defaultmethods;

/**
 * Created by Gaplo917 on 5/12/2015.
 */
public class Peter implements Toxic, Programmer {
  @Override
  public void eatTamJai() {
    System.out.println("Beef rice noodle with ching soup");
  }

  @Override
  public void surfGolden() {
    System.out.println("Always LM");
  }

  @Override
  public int findGirlFriends() {
    return 0;
  }
}
