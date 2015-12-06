package defaultmethods;

/**
 * Created by Gaplo917 on 5/12/2015.
 */
public class Gap implements Toxic, Programmer {
  @Override
  public void eatTamJai() {
    System.out.println("Chicken rice noodle with medium spicy");
  }

  @Override
  public void surfGolden() {
    System.out.println("CD-ROM");
  }

  @Override
  public int findGirlFriends() {
    return Programmer.super.findGirlFriends();
  }
}
