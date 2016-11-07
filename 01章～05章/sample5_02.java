package usystem;

import java.util.Scanner;

class sample5_02 {

	public static int min(int a, int b, int c){

		int minimum = a;

		if( b < a && b < c){
			minimum = b;
		}else if( c < a && c < b){
			minimum = c;
		}

		return minimum;
	}


	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);

		System.out.print("整数 a:");int a = stdln.nextInt();
		System.out.print("整数 b:");int b = stdln.nextInt();
		System.out.print("整数 c:");int c = stdln.nextInt();

		System.out.println("最小値は" + min(a,b,c) + "です");
	}

}
