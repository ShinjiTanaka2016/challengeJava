package usystem;

class sample4_08 {

	public static void main(String[] args) {

		int youso;
		int a[];
		int r = 0;
		boolean hantei;

		System.out.println("要素数を入力して下さい。");
		youso = new java.util.Scanner(System.in).nextInt();
		a = new int[youso];


		for(int i = 0; i < a.length; i++ ){

			do{
				hantei = true;

				r = new java.util.Random().nextInt(10);
				a[i] = r + 1;

				for(int j = i - 1; j >= 0; j-- ){
					if(a[i] == a[j]){
						hantei = false;
					}
				}
			}while(hantei == false);

		}


		//	表示
		for(int i = 0; i < a.length; i++ ){
			System.out.println("a[" + i + "] = " + a[i] );
		}

	}

}
