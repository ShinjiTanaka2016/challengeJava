package usystem;

class sample4_12 {

	public static void main(String[] args) {
		final int AKI = 1;
		final int SIYOU = 0;

		int[][] hotel = {{101, 4, SIYOU},{102, 4, SIYOU},{201, 3, SIYOU},{202, 4, SIYOU},{301, 6, SIYOU}};

		int seach;
		boolean hantei = false;

		System.out.println("利用人数を入力してください。");
		seach = new java.util.Scanner(System.in).nextInt();


		System.out.print("空いている部屋は");

		//	部屋の表示があればtrue判定
		for(int i = 0; i < 5; i++){
			if(seach <= hotel[i][1] && hotel[i][2] == AKI){
				System.out.print("、" + hotel [i][0] + "号室");
				hantei = true;
			}
		}

		if( hantei == true ){
			System.out.print("です。");
		}else{
			System.out.print("ありません。");
		}

	}

}
