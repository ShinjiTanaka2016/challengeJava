package usystem;

class sample1_6 {

	public static void main(String[] args) {

		System.out.println( "四角錐の底辺の一辺の長さを入力してください。" );
		int length = new java.util.Scanner(System.in).nextInt();
		System.out.println( "四角錐の高さを入力してください。" );
		int height = new java.util.Scanner(System.in).nextInt();

		double taiseki = length * length * height / 3.0;

		System.out.println( "length = " + length );
		System.out.println( "height = " + height );
		System.out.println( "体積 = " + taiseki );

	}

}
