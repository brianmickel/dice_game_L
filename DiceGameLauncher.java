public class DiceGameLauncher {
  public static void main(String[] args) {
    DiceGame lumps = new DiceGame();
    System.out.println(lumps.rolledValues);
    // for(int i=0; i<8; i++){
    //   System.out.println(lumps.game_dice[i].maxValue);
    //   for(int j=0; j<10; j++){
    //     int rollVal = lumps.game_dice[i].rollDice();
    //     System.out.println(rollVal);
    //   }
    // }
  }
}
