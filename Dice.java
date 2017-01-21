public class Dice {
  public int maxValue;

  /** Rolls the dice to obtain a rolled value
  for a given dice with a max value */
  public int rollDice(){
    /* soln from stack overflow
    http://stackoverflow.com/questions/35488619/how-to-get-a-random-number-in-a-range-using-math-random
    */
    int min = 1;
    int max = this.maxValue;
    int randomNum = (int)(Math.random()*(max)) +1 ; /* plus one to make it [1-max] rather than [0-max)*/
    return randomNum;
  }
  public Dice(int mV){
    maxValue = mV;
  }
}
