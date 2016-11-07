package usystem;

class sample3_17 {

	public static void main(String[] args) {

		int max = 0;
		int data;

		for(int i = 0; i < 10; i++){
			data = new java.util.Scanner(System.in).nextInt();

			if(data > max){
				max = data;
			}

		}

		System.out.println( "最大値　＝　" + max );

	}

}
