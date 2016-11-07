package usystem;

class sample3_25 {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		int n = 5;

		System.out.print( a );		//	初項

		for(int i = 0; i < n - 1; i++ ){
			a += b;
			System.out.print( " "  + a );
		}

	}

}
