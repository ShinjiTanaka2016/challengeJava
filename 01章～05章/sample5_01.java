package usystem;

import java.util.Scanner;

class sample5_01 {


	public static int signOf(int n){
		int seihu;
		if( n == 0){
			seihu = 0;
		}else if( n > 0 ){
			seihu = 1;
		}else{
			seihu = -1;
		}
		return seihu;
	}


	public static void main(String[] args) {
		int x = new Scanner(System.in).nextInt();
		int s = signOf(x);
		System.out.println("signOf(x)は" + s + "です。");
	}

}
