package usystem;

class sample1_4 {

	public static void main(String[] args) {
		int[] tests = { 80, 63, 40, 90, 50 };
		int sum = 0;
		double avg;

		for( int i = 0; i < tests.length; i++){
			sum = tests[i] + sum;
		}

		avg = (double)sum / tests.length;

		System.out.println("合計　＝　" + sum + "点");
		System.out.println("平均　＝　" + avg + "点");
	}

}
