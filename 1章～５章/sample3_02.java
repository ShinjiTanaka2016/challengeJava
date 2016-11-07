package usystem;

class sample3_02 {

	public static void main(String[] args) {

		int x = new java.util.Scanner(System.in).nextInt();

		if(x <= 0){
			System.out.println("０より大きい数を指定してください。");
		}else if( x%2 == 0 ){
			System.out.println("入力されたデータは偶数です。");
		}else{
			System.out.println("入力されたデータは奇数です。");
		}

	}

}
