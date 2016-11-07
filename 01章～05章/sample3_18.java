package usystem;

class sample3_18 {

	public static void main(String[] args) {

		int min;
		int firstdata;
		int data;

		firstdata = new java.util.Scanner(System.in).nextInt();
		min = firstdata;

		for(int i = 0; i < 9; i++){
			data = new java.util.Scanner(System.in).nextInt();

			if(data < min){
				min = data;
			}

		}

		System.out.println( "最小値　＝　" + min );

	}

}
