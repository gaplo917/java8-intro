package defaultmethods;

/**
 * Created by Gaplo917 on 5/12/2015.
 */
public class Java7Gap implements Java7Toxic, Java7Programmer {
  @Override
  public void eatTamJai() {
    System.out.println("Chicken rice noodle with medium spicy");
  }

  @Override
  public void surfGolden() {
    System.out.println("CD-ROM");
  }

  @Override
  public int findFriends(){
    return 0;
  }

  @Override
  public int findGirlFriends(){
    return 0;
  }
}
