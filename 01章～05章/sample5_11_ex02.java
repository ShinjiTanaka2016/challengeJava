package usystem;

import java.util.Calendar;
import java.util.Scanner;

class sample5_11_ex02 {


		public static void main(String[] args) {


			sample5_11_ex02 ct = new sample5_11_ex02();
			Scanner sc = new Scanner(System.in);


			//	年月日の入力
			System.out.print("年：");
			int y = sc.nextInt();
			System.out.print("月：");
			int m = sc.nextInt();
			int d = 1;
			int day = ct.getDayOfWeek( y, m, d);


			//	うるう年判定
			int[] month;
			if( y % 400 == 0 || (y%100 != 0 && y%4 == 0)){
				month = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
			}else{
				month = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
			}


			//	日付を代入
			int[][] hiduke = new int[6][7];
			int lastDay = 7;

			for(int j = 0; j < 6; j++ ){
				for(int i = 0; i < 7 ; i++ ){
					if(j == 0 && i == day){
						hiduke[j][i] = 1;
						lastDay = hiduke[0][i] + 1;
					}else if(j == 0 && i < day){
						hiduke[j][i] = 0;
					}else if(j == 0){
						hiduke[j][i] = hiduke[j][i-1] + 1;
						lastDay = hiduke[0][i] + 1;
					}else if(lastDay <= month[m-1]){
						hiduke[j][i] = lastDay;
						lastDay++;
					}
				}
			}

			//	表示
			System.out.println();
			System.out.println( y + "年" + m + "月のカレンダー");
			System.out.println("月  火  水  木  金  土  日");

			for(int j = 0; j < 6; j++){
				for(int i = 0; i < 7; i++){
					if(hiduke[j][i] != 0  ){
						System.out.printf("%2d  ",hiduke[j][i]);
					}else{
						System.out.print("    ");
					}
				}
				System.out.println();
			}
		}


		//	初日位置取得メソッド
		public int getDayOfWeek( int y, int m, int d ){
			Calendar cal = Calendar.getInstance();

			cal.set(Calendar.YEAR, y);
			cal.set(Calendar.MONTH, m - 1);
			cal.set(Calendar.DAY_OF_MONTH, d);

			int w = cal.get(Calendar.DAY_OF_WEEK);

			if(w == 1){
				return 6;
			}else{
				return w - 2;
			}
		}
	}