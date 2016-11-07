package usystem;

class sample3_05 {

	public static void main(String[] args) {

		int x = new java.util.Scanner(System.in).nextInt();

		if( x <= 0){
			System.out.println("０より大きい数を指定してください。");
		}else if((9 < x) && (x < 100)){
			System.out.println(x + "　は２ケタの数字です。" );
		}else{
			System.out.println(x + "　は２ケタの数字ではありません。" );
		}

	}

}
