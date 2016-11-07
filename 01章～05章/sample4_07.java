package usystem;

class sample4_07 {

	public static void main(String[] args) {

		int youso;
		int a[];
		int r = 0;

		//	要素数を入力
		System.out.println("要素数を入力して下さい");
		youso = new java.util.Scanner(System.in).nextInt();
		a = new int[youso];

		//	ランダム変数を要素数分作成し、要素に代入
		for(int i = 0; i < a.length; i++ ){
			r = new java.util.Random().nextInt(10);
			a[i] = r + 1;
		}

		for(int i = 0; i < a.length; i++ ){
			System.out.println("a[" + i + "] = " + a[i] );
		}


	}

}
