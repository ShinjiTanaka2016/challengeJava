package usystem;

import java.util.Scanner;

class sample5_04 {

	public static void printSeason(int m){
		if( 3 <= m && m <= 5){
			System.out.print("春");
		}else if( 6 <= m && m <= 8){
			System.out.print("夏");
		}else if( 9 <= m && m <= 11){
			System.out.print("秋");
		}else{
			System.out.print("冬");
		}
	}


	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);
		int month;

		do{
			System.out.println("何月ですか？（１～１２）：");
			month = stdln.nextInt();
		}while( month < 1 || 12 < month);
		System.out.print("その月の季節は");
		printSeason(month);
		System.out.print("です。");

	}

}
