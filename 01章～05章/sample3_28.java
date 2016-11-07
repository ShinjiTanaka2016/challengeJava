package usystem;

class sample3_28 {

	public static void main(String[] args) {

		int n = new java.util.Scanner(System.in).nextInt();

		for( int i = 2; i <= n; i++ ){

			if( i == n ){
				System.out.println( n + "は素数です。");
			}else if( n % i == 0 ){
				System.out.println( n + "は素数ではありません。");
				break;
			}

		}

		if( n == 1 ){
			System.out.println( n + "は素数です。");
		}

	}

}
