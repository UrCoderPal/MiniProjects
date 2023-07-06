package PlayerSide;

import Game.Board;
import java.util.Scanner;

public class GameDemo {

	public static void main(String[] args) {

		Board b = new Board();
		Scanner s = new Scanner(System.in);

//		Method 1

		while (true) {
			System.out.println("Player 1 Turn enter choice");
			int ch = s.nextInt();
			b.choice(ch, true);
			if (b.isWinner()) {
				System.out.println("!!!!!!!!!PLAYER 1 Wins!!!!!!!!!!!!!!!!!");
				break;
			}

			System.out.println("Player 2 Turn enter choice");
			ch = s.nextInt();
			b.choice(ch, false);
			if (b.isWinner()) {
				System.out.println("!!!!!!!!!PLAYER 2 Wins!!!!!!!!!!!!!!!!!");
				break;
			}
		}

		// Method 2 for menu driven
//		int count = 1;
//		int ch;
//		do {
//			if (count % 2 != 0)
//				System.out.println("Player 1 turn");
//			else
//				System.out.println("Player 2 Turn");
//			System.out.println("Choose Block\n0. to exit");
//			ch = s.nextInt();
//			switch (ch) {
//			case 1:
//				if (count % 2 != 0) {
//					b.player1(0, 0);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 1 Wins");
//						System.exit(0);
//					}
//				} else {
//					b.player2(0, 0);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 2 Wins");
//						System.exit(0);
//					}
//				}
//				break;
//			case 2:
//				if (count % 2 != 0) {
//					b.player1(0, 1);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 1 Wins");
//						System.exit(0);
//					}
//				} else {
//					b.player2(0, 1);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 2 Wins");
//						System.exit(0);
//					}
//				}
//				break;
//			case 3:
//				if (count % 2 != 0) {
//					b.player1(0, 2);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 1 Wins");
//						System.exit(0);
//					}
//				} else {
//					b.player2(0, 2);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 2 Wins");
//						System.exit(0);
//					}
//				}
//				break;
//			case 4:
//				if (count % 2 != 0) {
//					b.player1(1, 0);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 1 Wins");
//						System.exit(0);
//					}
//				} else {
//					b.player2(1, 0);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 2 Wins");
//						System.exit(0);
//					}
//				}
//				break;
//			case 5:
//				if (count % 2 != 0) {
//					b.player1(1, 1);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 1 Wins");
//						System.exit(0);
//					}
//				} else {
//					b.player2(1, 1);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 2 Wins");
//						System.exit(0);
//					}
//				}
//				break;
//			case 6:
//				if (count % 2 != 0) {
//					b.player1(1, 2);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 1 Wins");
//						System.exit(0);
//					}
//				} else {
//					b.player2(1, 2);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 2 Wins");
//						System.exit(0);
//					}
//				}
//				break;
//			case 7:
//				if (count % 2 != 0) {
//					b.player1(2, 0);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 1 Wins");
//						System.exit(0);
//					}
//				} else {
//					b.player2(2, 0);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 2 Wins");
//						System.exit(0);
//					}
//				}
//				break;
//			case 8:
//				if (count % 2 != 0) {
//					b.player1(2, 1);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 1 Wins");
//						System.exit(0);
//					}
//				} else {
//					b.player2(2, 1);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 2 Wins");
//						System.exit(0);
//					}
//				}
//				break;
//			case 9:
//				if (count % 2 != 0) {
//					b.player1(2, 2);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 1 Wins");
//						System.exit(0);
//					}
//				} else {
//					b.player2(2, 2);
//					count++;
//					if (b.isWinner()) {
//						System.out.println("PLAYER 2 Wins");
//						System.exit(0);
//					}
//				}
//				break;
//			default:
//				System.out.println("Invalid Input");
//			}
//		} while (ch != 0);
		/*
		 * while (true) { System.out.println("Player 1 Turn"); x = s.nextInt(); y =
		 * s.nextInt(); b.player1(x, y); if (b.isWinner()) {
		 * System.out.println("PLAYER 1 Wins"); break; }
		 * 
		 * System.out.println("Player 2 Turn"); x = s.nextInt(); y = s.nextInt();
		 * b.player2(x, y); if (b.isWinner()) { System.out.println("PLAYER 2 Wins");
		 * break; } }
		 */

	}

}
