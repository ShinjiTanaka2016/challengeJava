package usystem;

class sample3_19 {

	public static void main(String[] args) {

		int n;
		int data;
		int sum = 0;
		double avg;

		System.out.println("何個のデータですか？");
		n = new java.util.Scanner(System.in).nextInt();

		System.out.println( n + "個のデータを入力してください。" );

		for(int i = 0; i < n; i++){
			data = new java.util.Scanner(System.in).nextInt();
			sum += data;
		}

		avg = (double)sum / n;

		System.out.println("合計値　＝　" + sum );
		System.out.println("平均値　＝　" + avg );

	}

}
