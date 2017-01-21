public class GamePlayerRandom {
  public Moves determineMove (DiceGame board_state){
      Moves current_moves = new Moves();
      if (board_state.currentRoll == 1){
        int[] chosen_to_roll = new int[] {0,1,2,3};
        for (int i=0;i<chosen_to_roll.length;i++){
          current_moves.toRoll[i] = chosen_to_roll[i];
        }

        int[] chosen_to_save = new int[] {4,5,6,7};
        for (int i=0;i<chosen_to_save.length;i++){
          current_moves.toSave[i] = chosen_to_save[i];
        }

      } else if (board_state.currentRoll == 2){

      }
      return current_moves;
  }
}
