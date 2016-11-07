package usystem;

import java.util.Random;


class sample5_08 {


	public static void main(String[] args) {

		Random rdm = new Random();

		System.out.println("サイを振ります。1回目です。");
		int firstOne = rdm.nextInt(6);
		int firstTwo = rdm.nextInt(6);
		int point = rollDice(firstOne,firstTwo);
		System.out.println
			("出目は " + (firstOne + 1) + " と " + (firstTwo + 1) + "、合計 " + point + " です");


		//	勝敗ルール
		if( point == 7 || point == 11){
			System.out.println(point + " が出たので、あなたの勝ちです。");

		}else if( point == 2 || point == 3 || point == 12 ){
			System.out.println(point + " が出たので、わたしの勝ちです。");

		}else{
			System.out.println(point + " が出ればあなたの勝ち、7 が出ればわたしの勝ちです。");
			int sum = 0;
			int n = 2;

			while( sum != point || sum != 7 ){
				System.out.println();
				System.out.println("サイを振ります。" + n + "回目です。");
				int one = rdm.nextInt(6);
				int two = rdm.nextInt(6);
				sum = rollDice( one, two);
				System.out.println
				("出目は " + (one + 1) + " と " + (two + 1) + "、合計 " + sum + " です");


				if(sum == point){
					System.out.println("あなたの勝ちです。");
					break;

				}else if(sum == 7){
					System.out.println("わたしの勝ちです。");
					break;
				}
				n++;
			}

		}

	}



	public static int rollDice(int one, int two){
		int sum = 0;

		sum = (one + 1) + (two + 1);

		return sum;
	}

}
