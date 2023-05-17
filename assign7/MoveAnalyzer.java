/**
 This is a move analyzer program.
 @author Zohaib Khan - 3740572
*/

public class MoveAnalyzer {

    /**
     This method checks if the hero's attempted move can be completed or not.
     @param maze the 2d array on which the maze is based on.
     @param direction the direction in which we want the hero to move.
     @return whether or not the hero’s attempted move can be completed
    */
    public static boolean checkMove (char[][] maze, char direction) {

		int row = -1;
		int col = -1;
	
		boolean flag = false;
	
		for (int i = 0; i < maze.length && !flag; i++) {
			for (int j = 0; j < maze[0].length && !flag; j++) {
				if (maze[i][j] == 'H') {
					row = i;
					col = j;
					flag = true;
				}
			}
		}
		if (row == -1 || col == -1) {
			return false;
		}

		int newRow = row;
		int newCol = col;
		if (direction == 'D') {
			newRow++;
			if (newRow >= maze.length) {
				return false;
			}
		} 
		else if (direction == 'L') {
			newCol--;
			if (newCol < 0) {
				return false;
			}
		} 
		else {
			return false;
		}

		if (maze[newRow][newCol] == 'U') {
			return true;
		} 
		else if (direction == 'D' && newRow + 1 < maze.length && maze[newRow + 1][newCol] == 'U') {
			return true;
		} 
		else if (direction == 'L' && newCol - 1 >= 0 && maze[newRow][newCol - 1] == 'U') {
			return true;
		} 
		else {
			return false;
		}
	}
}
