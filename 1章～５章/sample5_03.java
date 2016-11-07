package usystem;

import java.util.Scanner;

class sample5_03 {

	public static int sumUp(int n){

		int sum = 0;

		for(int i = 1; i <= n; i++ ){
			sum += i;
		}
		return sum;
	}


	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.println("1からxまでの和を求めます。");
		int x;
		do{
			System.out.print("整数ｘ：");
			x = stdln.nextInt();
		}while(x <= 0);
		System.out.println("1から" + x + "までの和は" + sumUp(x) + "です");

	}

}
