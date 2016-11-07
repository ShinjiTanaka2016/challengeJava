package usystem;

class sample3_14 {

	public static void main(String[] args) {

		int sum = 0;
		double avg;

		for(int i = 1; i <= 10; i++){

			sum += i;

		}

		avg = sum / 10.0;

		System.out.println( "合計値　＝　" + sum );
		System.out.println( "平均値　＝　" + avg );

	}

}
