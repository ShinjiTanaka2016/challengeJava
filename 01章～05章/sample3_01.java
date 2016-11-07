package usystem;

class sample3_01 {

	public static void main(String[] args) {

		int x = new java.util.Scanner(System.in).nextInt();

		if(x > 0){
			System.out.println("入力されたデータは正の数です。");
		}else if(x < 0){
			System.out.println("入力されたデータは負の数です。");
		}else{
			System.out.println("０以外の整数を入力してください。");
		}

	}

}
