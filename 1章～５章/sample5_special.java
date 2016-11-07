package usystem;

import java.util.Scanner;

class sample5_special {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("三角形の三辺の長さを入力して下さい。(０より大きい数)");
		int a = 0;
		int b = 0;
		int c = 0;

		while(a <=0 ){
			System.out.print("a:");
			a = scan.nextInt();
		}
		while(b <=0 ){
			System.out.print("b:");
			b = scan.nextInt();
		}
		while(c <=0 ){
			System.out.print("c:");
			c = scan.nextInt();
		}

		Triangle( a, b, c );

	}


	public static void Triangle( int a, int b, int c ){

		if(a == b && b == c ){
			System.out.println("正三角形です。");
		}else if( (a < b + c && b == c) || (b < a + c && a == c) || ( c < a + b && a == b) ){
			System.out.println("二等辺三角形です。");
		}else if((a != b && b != c && c != a) && (a + b > c && b + c > a && a + c > b)){
			System.out.println("不等辺三角形です。");
		}else{
			System.out.println("三角形ではありません。");
		}

	}

}
