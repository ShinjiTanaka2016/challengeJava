package usystem;

class sample3_30_02 {

	public static void main(String[] args) {

		int year;

		System.out.println("西暦を入力してください。");
		year = new java.util.Scanner(System.in).nextInt();

		if( year % 400 == 0 || (year%100 != 0 && year%4 == 0)){
			System.out.println(year + "年はうるう年です。");
		}else{
			System.out.println(year + "年はうるう年ではありません。");
		}

	}

}
