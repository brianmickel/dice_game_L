public class DiceGameLauncher {
  public static void main(String[] args) {
    DiceGame lumps = new DiceGame();
    System.out.println("Current Rolls:");
    for(int i = 0; i<8; i++){
      System.out.print(lumps.rolledValues[i] + "  ");
    }
    System.out.println();
    System.out.println(lumps.rolledValues);

    GamePlayerRandom game_bot = new GamePlayerRandom();
    Moves player_moves = game_bot.determineMove(lumps);
    System.out.println("Moves:");
    System.out.print("To Roll  - ");
    for(int i = 0; i<8; i++){
      System.out.print(player_moves.toRoll[i] + "  ");
    }
    System.out.println();
    System.out.print("To Save  - ");
    for(int i = 0; i<8; i++){
      System.out.print(player_moves.toSave[i] + "  ");
    }
    System.out.println(player_moves.toSave);

    lumps.saveChosenDice(player_moves.toSave);
    lumps.rollChosenDice(player_moves.toRoll);

    System.out.println("Current Rolls:");
    for(int i = 0; i<8; i++){
      System.out.print(lumps.rolledValues[i] + "  ");
    }
    System.out.println();
    System.out.println(lumps.rolledValues);


    // for(int i=0; ){
    //   System.out.println(lumps.game_dice[i].maxValue);
    //   for(int j=0; j<10; j++){
    //     int rollVal = lumps.game_dice[i].rollDice();
    //     System.out.println(rollVal);
    //   }
    // }
  }
}
