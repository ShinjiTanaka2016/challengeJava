package usystem;

class sample3_21_02 {

	public static void main(String[] args) {

		String keta;
		int num = new java.util.Scanner(System.in).nextInt();

		if( num <= 0){
			System.out.println("０より大きい値を入力してください。");
		}else{
			keta = String.valueOf(num);
			System.out.println("整数値　" + num + "　の桁数は" + keta.length() + "ケタです。");
		}
	}

}
