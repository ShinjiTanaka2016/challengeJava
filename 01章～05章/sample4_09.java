package usystem;

class sample4_09 {

	public static void main(String[] args) {

		int[] year = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
		int  month = 0;
		int day;

		System.out.println("月を入力して下さい。");
		int putMonth = new java.util.Scanner(System.in).nextInt();

		for(int i = 0; i < putMonth - 1; i++){
			month += year[i];
		}

		System.out.println("日を入力して下さい。");
		int putDay = new java.util.Scanner(System.in).nextInt();
		day = putDay - 1;

		//	【表示】
		if( 0 < putDay && putDay <= year[putMonth - 1] ){
			System.out.println("通算日数＝" + (month + day) + "日です。");
		}else{
			System.out.println("存在する日数を入力して下さい。");
		}



	}

}
