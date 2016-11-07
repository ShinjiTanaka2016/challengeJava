package usystem;

class sample3_22 {

	public static void main(String[] args) {

		int firstData = new java.util.Scanner(System.in).nextInt();
		int secondData = new java.util.Scanner(System.in).nextInt();

		if( firstData < secondData ){
			System.out.println("結果　＝　" + firstData + "　" + secondData );
		}else{
			System.out.println("結果　＝　" + secondData + "　" + firstData );
		}


	}

}
