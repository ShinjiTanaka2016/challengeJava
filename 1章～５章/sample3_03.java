package usystem;

class sample3_03 {

	public static void main(String[] args) {

		int data = new java.util.Scanner(System.in).nextInt();

		if(data <= 0){
			System.out.println("０より大きい数を指定してください。");
		}else if( data % 10 == 0 ){
			System.out.println("入力去れたデータは１０の倍数です。");
		}else{
			System.out.println("入力去れたデータは１０の倍数ではありません。");
		}

	}

}
