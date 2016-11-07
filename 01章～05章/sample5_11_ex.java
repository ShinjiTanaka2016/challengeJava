package usystem;

import java.util.Calendar;
import java.util.Scanner;

class sample5_11_ex {

	private static final int[] WEEK ={
			Calendar.SUNDAY,
			Calendar.MONDAY,
			Calendar.TUESDAY,
			Calendar.WEDNESDAY,
			Calendar.THURSDAY,
			Calendar.FRIDAY,
			Calendar.SATURDAY,
	};
	private static final String[] WEEK_JA =
		{"日","月","火","水","木","金","土",};

	public static void main(String[] args) {

		sample5_11_ex ct = new sample5_11_ex();
		Scanner sc = new Scanner(System.in);

		//	年月日の入力
		System.out.print("年：");
		int y = sc.nextInt();
		System.out.print("月：");
		int m = sc.nextInt();
		System.out.print("日：");
		int d = sc.nextInt();

		String day = ct.getDayOfWeek( y, m, d);

		System.out.println( y + "/" + m + "/" + d + "は" + day + "曜日です");


		System.out.println("月　火　水　木　金　土　日");
		int[][] hiduke = new int[6][7];
		int[] month;

		//	うるう年判定
		if( y % 400 == 0 || (y%100 != 0 && y%4 == 0)){
			month = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
		}else{
			month = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		}

		int hi = 0;

		// 曜日による1日の位置調整
		if( day == "月"){
			hi = 1;
		}else if( day == "火"){
			hi = 0;
		}else if( day == "水"){
			hi = -1;
		}else if( day == "木"){
			hi = -2;
		}else if( day == "金"){
			hi = -3;
		}else if( day == "土"){
			hi = -4;
		}else if( day == "日"){
			hi = -5;
		}

		for(int i = 0; i < hiduke.length; i++){
			for(int j = 0; j < hiduke[0].length; j++){
				hiduke[i][j] = hi;
				hi++;
			}
		}

		for(int i = 0; i < hiduke.length; i++){
			for(int j = 0; j < hiduke[0].length; j++){

				if(hiduke[i][j] <= 0 || month[m-1] < hiduke[i][j]){
					System.out.print("    ");
				}else{
					System.out.printf("%2d  ",hiduke[i][j]);
				}

			}
			System.out.println();
		}
	}

	//	曜日取得メソッド
	public String getDayOfWeek( int y, int m, int d ){
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.YEAR, y);
		cal.set(Calendar.MONTH, m - 1);
		cal.set(Calendar.DAY_OF_MONTH, d);

		int w = cal.get(Calendar.DAY_OF_WEEK);
		for(int i = 0; i < sample5_11_ex.WEEK.length; i++ ){
			if(w == sample5_11_ex.WEEK[i]){
				return sample5_11_ex.WEEK_JA[i];
			}
		}

		return null;
	}
}