package usystem;

class sample3_16 {

	public static void main(String[] args) {

		int data;
		int sum = 0;
		double avg;


		for(int i = 0; i < 10; i++){
			data = new java.util.Scanner(System.in).nextInt();
			sum += data;
		}

		avg = sum / 10.0;

		System.out.println( "合計値　" + sum );
		System.out.println( "平均値　" + avg );

	}

}
