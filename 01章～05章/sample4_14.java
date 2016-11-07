package usystem;

class sample4_14 {

	public static void main(String[] args) {

		int[][] jihan = new int[4][4];
		int m = 0;
		int oturi = 0;


		//	使用硬貨の設定
		jihan[0][0] = 10;
		jihan[0][1] = 50;
		jihan[0][2] = 100;
		jihan[0][3] = 500;


		//	お金の投入
		for(int i = 0; i < 4; i++){
			System.out.println(jihan[0][i] + "円硬貨を何枚入れますか？");
			jihan[2][i] = new java.util.Scanner(System.in).nextInt();
		}


		//	投入した合計金額を求める
		for(int i = 0; i < 4; i++){
			m += jihan[2][i] * jihan[0][i];
		}
		System.out.println("投入合計金額は　" + m + " 円です。");


		//	入金額が足りた場合
		if( m >= 150){


			//	おつりの金額を求める
			oturi = m - 150;
			System.out.println("お釣りは" + oturi + " 円です。");


			//	投入された硬貨を自販機の中の硬貨に加える
			for(int i = 0; i < 4; i++){
				jihan[1][i] += jihan[2][i];
				jihan[2][i] = 0;
			}


			//	お釣りの払い出しを計算
			int keisan = 3;
			while( oturi > 0 && keisan >= 0 ){

				while( oturi >= jihan[0][keisan] && jihan[1][keisan] > 0 ){
					oturi -= jihan[0][keisan];
					jihan[1][keisan] -= 1;
				}
				keisan -= 1;
			}


			//	お釣りが出せた場合
			if( oturi == 0){
				System.out.println("ありがとうございました。");
			}else{		//	お釣りが出せなかった場合
				for(int i = 0; i < 4; i++ ){
					jihan[1][i] += jihan[3][i] - jihan[2][i];
					jihan[3][i] = 0;
				}
				System.out.println("つり銭がありません。係員を及びください。");
			}


		}else{			//	入金額が足りない場合
			System.out.println("入金不足です。");
		}

	}

}
