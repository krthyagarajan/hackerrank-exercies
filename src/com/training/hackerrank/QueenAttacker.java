package com.training.hackerrank;

public class QueenAttacker {



	public static void main(String[] args) {

		int length = 4;
		int noOfObstacles = 0;
		int queenRow = 4;
		int queenColumn = 4;
//		int[][] obstaclePositions = {{5,5},{4,2},{2,3}};
		int[][] obstaclePositions = null;

		int noOfSquares  = findSquares(length, noOfObstacles, queenRow, queenColumn, obstaclePositions);

		System.out.println(noOfSquares);


	}

	private static int findSquares(int boardLength, int noOfObstacles, int queenRow, int queenColumn,
			int[][] obstaclePositions) {
		int attackableSquares = 0;

		int bottom = checkBottom(obstaclePositions, boardLength, queenRow, queenColumn);
		int top = checkTop(obstaclePositions, boardLength, queenRow, queenColumn);
		int right = checkRight(obstaclePositions, boardLength, queenRow, queenColumn);
		int left = checkLeft(obstaclePositions, boardLength, queenRow, queenColumn);
		int topLeft = checkTopLeft(obstaclePositions, boardLength, queenRow, queenColumn);
		int topRight = checkTopRight(obstaclePositions, boardLength, queenRow, queenColumn);
		int bottomRight = checkBottomRight(obstaclePositions, boardLength, queenRow, queenColumn);
		int bottomLeft = checkBottomLeft(obstaclePositions, boardLength, queenRow, queenColumn);

		attackableSquares = bottom + top + right + left + topLeft + topRight+ bottomRight + bottomLeft;

		return attackableSquares;
	}

	private static int checkBottomLeft(int[][] obstaclePositions, int boardLength, int queenRow, int queenColumn) {
		int attackableSquares = 0;

		for(int currentCol = queenColumn-1, currentRow = queenRow-1; currentCol > 0 && currentRow > 0 ; currentCol--,currentRow--) {
			if(!checkObstacleInCurrentSquare(obstaclePositions, currentRow, currentCol)) {
				attackableSquares++;
			} else {
				break;
			}
		}
		return attackableSquares;
	}

	private static int checkBottomRight(int[][] obstaclePositions, int boardLength, int queenRow, int queenColumn) {
		int attackableSquares = 0;

		for(int currentCol = queenColumn, currentRow = queenRow-1; currentCol < boardLength && currentRow > 0 ; currentCol++,currentRow--) {
			if(!checkObstacleInCurrentSquare(obstaclePositions, currentRow, currentCol)) {
				attackableSquares++;
			} else {
				break;
			}
		}
		return attackableSquares;
	}

	private static int checkTopRight(int[][] obstaclePositions, int boardLength, int queenRow, int queenColumn) {
		int attackableSquares = 0;

		for(int currentCol = queenColumn, currentRow = queenRow; currentCol > 0 && currentRow < boardLength ; currentCol++,currentRow++) {
			if(!checkObstacleInCurrentSquare(obstaclePositions, currentRow, currentCol)) {
				attackableSquares++;
			} else {
				break;
			}
		}
		return attackableSquares;
	}

	private static int checkTopLeft(int[][] obstaclePositions, int boardLength, int queenRow, int queenColumn) {
		int attackableSquares = 0;

		for(int currentCol = queenColumn, currentRow = queenRow; currentCol > 0 && currentRow < boardLength ; currentCol--,currentRow++) {
			if(!checkObstacleInCurrentSquare(obstaclePositions, currentRow, currentCol)) {
				attackableSquares++;
			} else {
				break;
			}
		}
		return attackableSquares;
	}

	private static int checkLeft(int[][] obstaclePositions, int boardLength, int queenRow, int queenColumn) {
		int attackableSquares = 0;

		for(int currentCol = queenColumn-1; currentCol > 0 ; currentCol--) {
			if(!checkObstacleInCurrentSquare(obstaclePositions, queenRow, currentCol)) {
				attackableSquares++;
			} else {
				break;
			}
		}
		return attackableSquares;
	}

	private static int checkRight(int[][] obstaclePositions, int boardLength, int queenRow, int queenColumn) {
		int attackableSquares = 0;

		for(int currentCol = queenColumn; currentCol < boardLength ; currentCol++) {
			if(!checkObstacleInCurrentSquare(obstaclePositions, queenRow, currentCol)) {
				attackableSquares++;
			} else {
				break;
			}
		}
		return attackableSquares;
	}

	private static int checkTop(int[][] obstaclePositions, int boardLength, int queenRow, int queenColumn) {
		int attackableSquares = 0;

		for(int currentRow = queenRow; currentRow < boardLength ; currentRow++) {
			if(!checkObstacleInCurrentSquare(obstaclePositions, currentRow, queenColumn)) {
				attackableSquares++;
			} else {
				break;
			}
		}
		return attackableSquares;
	}

	private static int checkBottom(int[][] obstaclePositions, int boardLength, int queenRow, int queenColumn) {
		int attackableSquares = 0;

		for(int currentRow = queenRow-1; currentRow > 0 ; currentRow--) {
			if(!checkObstacleInCurrentSquare(obstaclePositions, currentRow, queenColumn)) {
				attackableSquares++;
			} else {
				break;
			}
		}
		return attackableSquares;
	}

	private static boolean checkObstacleInCurrentSquare(int[][] obstaclePositions, int row, int column) {

		if(obstaclePositions != null) {
			for(int i = 0; i < obstaclePositions.length; i++) {

				int[] currentPosition =  obstaclePositions[i];
				if(currentPosition[0] == row ) {
					if(currentPosition[1] == column) {
						return true;
					}
				} else {
					continue;
				}
			}
		}
		return false;
	}
}
