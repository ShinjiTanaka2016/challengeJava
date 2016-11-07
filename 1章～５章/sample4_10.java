package usystem;

class sample4_10 {

	public static void main(String[] args) {

		int[] year = { 31, 60, 91, 121, 151, 182, 213, 244, 274, 305, 335, 366};
		int month;
		int day;


		System.out.println("月を入力して下さい。");
		int putMonth = new java.util.Scanner(System.in).nextInt();
		if(putMonth == 1){
			month = 0;
		}else{
			month = year[putMonth - 2];
		}


		System.out.println("日を入力して下さい。");
		int putDay = new java.util.Scanner(System.in).nextInt();
		day = putDay - 1;


		System.out.println("通算日数" + (month + day) + "日です。");

	}

}
