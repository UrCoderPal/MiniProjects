package Game;

public class Board {

	char[][] c = new char[3][3];

	public Board() {
		print();
	}

	public void player1(int i, int j) {
		if (c[i][j] == 'X' || c[i][j] == 'O') {
			System.out.println("Invalid Input");
		} else
			c[i][j] = 'X';
		print();
	}

	public void player2(int i, int j) {
		if (c[i][j] == 'X' || c[i][j] == 'O') {
			System.out.println("Invalid Input");
		} else
			c[i][j] = 'O';
		print();
	}

	public boolean isWinner() {
		if (c[0][0] == c[0][1] && c[0][1] == c[0][2] && c[0][2] != '\u0000')
			return true;
		if (c[1][0] == c[1][1] && c[1][1] == c[1][2] && c[1][2] != '\u0000')
			return true;
		if (c[2][0] == c[2][1] && c[2][1] == c[2][2] && c[2][2] != '\u0000')
			return true;
		if (c[0][0] == c[1][1] && c[1][1] == c[2][2] && c[2][2] != '\u0000')
			return true;
		if (c[0][2] == c[1][1] && c[1][1] == c[2][0] && c[2][0] != '\u0000')
			return true;
		if (c[0][0] == c[1][0] && c[1][0] == c[2][0] && c[2][0] != '\u0000')
			return true;
		if (c[0][1] == c[1][1] && c[1][1] == c[2][1] && c[2][1] != '\u0000')
			return true;
		if (c[0][2] == c[1][2] && c[1][2] == c[2][2] && c[2][2] != '\u0000')
			return true;
		return false;
	}

	public void print() {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + "|");
			}
			System.out.println();
		}
	}

	public void choice(int choice, boolean flag) {
		switch (choice) {
		case 1:
			if (flag)
				player1(0, 0);
			else
				player2(0, 0);
			break;
		case 2:
			if (flag)
				player1(0, 1);
			else
				player2(0, 1);
			break;
		case 3:
			if (flag)
				player1(0, 2);
			else
				player2(0, 2);
			break;
		case 4:
			if (flag)
				player1(1, 0);
			else
				player2(1, 0);
			break;
		case 5:
			if (flag)
				player1(1, 1);
			else
				player2(1, 1);
			break;
		case 6:
			if (flag)
				player1(1, 2);
			else
				player2(1, 2);
			break;
		case 7:
			if (flag)
				player1(2, 0);
			else
				player2(2, 0);
			break;
		case 8:
			if (flag)
				player1(2, 1);
			else
				player2(2, 1);
			break;
		case 9:
			if (flag)
				player1(2, 2);
			else
				player2(2, 2);
			break;
		}
	}
}
