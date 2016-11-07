package usystem;

class sample3_15 {

	public static void main(String[] args) {

		int n = new java.util.Scanner(System.in).nextInt();
		int sum = 0;
		double avg;

		for(int i = 1; i <= n; i++){

			sum += i;

		}

		avg = (double)sum / n;

		System.out.println( "合計値　＝　" + sum );
		System.out.println( "平均値　＝　" + avg );
	}

}
