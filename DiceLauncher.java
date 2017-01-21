public class DiceLauncher {
  public static void main(String[] args) {
    Dice four_sider = new Dice(4);
    for(int i=1; i<10; i++){
      int roll_value = four_sider.rollDice();
      System.out.println(roll_value);
    }
    Dice twenty_sider = new Dice(20);
    for(int i=1; i<10; i++){
      int roll_value = twenty_sider.rollDice();
      System.out.println(roll_value);
    }
  }
}
