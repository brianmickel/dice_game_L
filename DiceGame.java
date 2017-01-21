public class DiceGame {
  public Dice[] game_dice = new Dice[8];
  public int[] rolledValues = new int[8];
  public boolean[] savedStatus = new boolean[] {false,false,false,false,false,false,false,false};
  public int currentRoll = 0;


  /** Constructs a game of 8 dice and gives each dice in game_dice array its max value */
  public DiceGame(){
    int[] maxVals = new int[] {4,4,6,6,8,8,10,10};
    int i = 0;
    while(i<8){
      game_dice[i] = new Dice(maxVals[i]);
      i += 1;
    }
    int[] all_dice = new int[] {0,1,2,3,4,5,6,7};
    rollChosenDice(all_dice);
  }

  public void rollChosenDice(int[] chosen_dice){
    for(int i = 0; i < chosen_dice.length; i++){
      //System.out.println(lumps.game_dice[i].maxValue);
      int rollVal = game_dice[chosen_dice[i]].rollDice();
      rolledValues[chosen_dice[i]] = rollVal;
      System.out.println(rollVal);
    }
    currentRoll += 1;
  }


}
