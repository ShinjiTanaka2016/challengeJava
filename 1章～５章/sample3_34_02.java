package usystem;

class sample3_34_02 {

	public static void main(String[] args) {

		int year;
		int month;
		int[] lastDay;
		boolean uru;


		//	年月日入力
		System.out.println("年：");
		year = new java.util.Scanner(System.in).nextInt();
		System.out.println("月：");
		month = new java.util.Scanner(System.in).nextInt();


		//	うるう年判定
		if( (year % 400) == 0 || (year%100 != 0 && year%4 == 0) ){
			uru = true;
		}else{
			uru = false;
		}


		//	各月最終日をlastDayに代入
		if( uru == true ){
			lastDay = new int[]{31, 29, 31 ,30, 31, 30, 31, 31, 30, 31, 30, 31};
		}else{
			lastDay = new int[]{31, 28, 31 ,30, 31, 30, 31, 31, 30, 31, 30, 31};
		}

		System.out.println("月　火　水　目　金　土　日");

		for(int i = 1; i <= lastDay[month - 1]; i++){

			if(i < 10){
				System.out.print(" " + i + "  ");
			}else{
				System.out.print( i + "  ");
			}

			if(i%7 == 0){
				System.out.println("");
			}

		}


	}

}
