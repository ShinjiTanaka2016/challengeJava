package usystem;

class sample1_7 {

	public static void main(String[] args) {
		int x = 20;
		int y = 30;
		int z;
		System.out.println("実行前　x = " + x + "　y = " + y );

		z = x;
		x = y;
		y = z;


		System.out.println("実行後　x = " + x + "　y = " + y );

	}

}
