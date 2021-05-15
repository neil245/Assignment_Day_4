package SnakeAndLadderGame;
public class SnakeAndLadderGame {
	public static void main(String[] args) {
		System.out.println("Snakes & Ladder Game");
		int init_position = 0;
		System.out.println(init_position);
			int dice = (int)Math.floor(Math.random()*6+1);
			System.out.println(dice);
			int move = (int)Math.floor(Math.random()*3);
			System.out.println(move);
			if (move==0) {
				System.out.println("No play");
			}
			else if (move==1) {
				System.out.println("Ladder");
			}
			else {
				System.out.println("Snake");
			}
			
			
		}
		
		
	}


