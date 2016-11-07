package usystem;

import java.util.Random;

class sample5_08_ex {

	public static void main(String[] args) {

		System.out.println("サイを振ります。1 回目です。");
		int firstGame = rollDice();
		System.out.println("出目の合計は " + firstGame + "です。");

		if( firstGame == 7 || firstGame == 11 ){
			System.out.println("あなたの勝ちです。");
			
		}else if( firstGame == 2 || firstGame == 3 || firstGame == 12 ){
			System.out.println("わたしの勝ちです。");
			
		}else{

			System.out.println();
			System.out.println( firstGame + " が出ればあなたの勝ち、7 が出ればわたしの勝ちです。");

			int game = 0;
			int n = 2;

			while( game != firstGame && game != 7 ){
				System.out.println("サイを振ります。" + n + " 回目です。");
				game = rollDice();
				System.out.println("出目の合計は " + game + "です。");
				System.out.println();
				n++;
			}

			if( game == firstGame ){
				System.out.println("あなたの勝ちです。");
			}else if( game == 7){
				System.out.println("わたしの勝ちです。");
			}
		}
	}

	static int rollDice(){
		Random rdm = new Random();

		int one = rdm.nextInt(6);
		int two = rdm.nextInt(6);

		int sum = (one+1) + (two+1);

		return sum;
	}

}
