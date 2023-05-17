public abstract class DiceAnalyzer {
    
    public static int getLongestIncreasingSequence (int[] diceRolls) {

		int maxSequence = 0;
		int currentSequence = 0;
		
		for (int i = 1; i < diceRolls.length; i++) {
			if (diceRolls[i] > diceRolls[i-1]) {
				currentSequence++;
			} 
			else {
				if (currentSequence > maxSequence) {
					maxSequence = currentSequence;
				}
				currentSequence = 1;
			}
		}
		if (currentSequence > maxSequence) {
			maxSequence = currentSequence;
		}
		return maxSequence;
    }
    
    public static boolean isTargetSumPossible (int[] diceRolls, int target) {
    
        boolean isPossible = false;
        for (int i = 0; i < diceRolls.length && !(isPossible); i++) {
        
            for (int j = i + 1; j < diceRolls.length && !(isPossible); j++) {
            
                if(diceRolls[i] + diceRolls[j] == target) {
                    isPossible = true;
                }
            }
        }
        return isPossible;
    }

}