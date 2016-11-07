package usystem;

class sample3_20 {

	public static void main(String[] args) {

		int data;
		int n = 0;
		int sum = 0;
		double avg;

		System.out.println("データを入力してください。");
		for( int i = 0; i < 10; i++){

			data = new java.util.Scanner(System.in).nextInt();

			if( data != 0){
				sum += data;
				n++;
			}else{
				break;
			}

		}

		avg = (double)sum / n;

		System.out.println( "合計値　＝　" + sum + "　平均値　＝　" + avg );

	}
}
