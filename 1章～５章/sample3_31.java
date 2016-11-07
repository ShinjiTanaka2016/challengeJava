package usystem;

class sample3_31 {

	public static void main(String[] args) {
		int taro;
		int hanako;

		System.out.println("グー：１　　チョキ：２　　パー：３");

		System.out.println("太郎さんの手を入力してください。");
		taro = new java.util.Scanner(System.in).nextInt();
		System.out.println("花子さんの手を入力してください。");
		hanako = new java.util.Scanner(System.in).nextInt();

		switch(taro){

			case 1:				//	太郎がグーのとき
				switch(hanako){
					case 1:
						System.out.println("あいこです。");
						break;
					case 2:
						System.out.println("太郎さんの勝ちです。");
						break;
					case 3:
						System.out.println("花子さんの勝ちです。");
						break;
					default:
						System.out.println("１～３の値を入力してください。");
				};
				break;

			case 2:				//	太郎がチョキのとき
				switch(hanako){
					case 1:
						System.out.println("花子さんの勝ちです。");
						break;
					case 2:
						System.out.println("あいこです。");
						break;
					case 3:
						System.out.println("太郎さんの勝ちです。");
						break;
					default:
						System.out.println("１～３の値を入力してください。");
				};
				break;

			case 3:				//	太郎がパーのとき
				switch(hanako){
					case 1:
						System.out.println("太郎さんの勝ちです。");
						break;
					case 2:
						System.out.println("花子さんの勝ちです。");
						break;
					case 3:
						System.out.println("あいこです。");
						break;
					default:
						System.out.println("１～３の値を入力してください。");
				};
				break;

			default:
				System.out.println("１～３の値を入力してください。");

		}

	}

}
