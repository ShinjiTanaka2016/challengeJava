package usystem;

class sample3_32 {

	public static void main(String[] args) {

		int m;
		int n;
		int r;

		m = new java.util.Scanner(System.in).nextInt();
		n = new java.util.Scanner(System.in).nextInt();

		if( m < n ){
			System.out.println( "mにはnより大きい値を入力してください。" );
		}else{
			r = m % n;
			while( r != 0){
				m = n;
				n = r;
				r = m % n;
			}
			System.out.println( "最大公約数は" + n + "です。" );
		}

	}

}
