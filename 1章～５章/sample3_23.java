package usystem;

class sample3_23 {

	public static void main(String[] args) {

		int data = new java.util.Scanner(System.in).nextInt();

		if(( 100 <= data) && (data <= 999)){
			System.out.println("３ケタの整数値です。");

		}else{
			System.out.println("入力されたデータは３ケタの整数値ではありません。");
		}

	}

}
