package usystem;

class sample3_21_01 {

	public static void main(String[] args) {

		int num;
		int keta = 0;
		int data;

		num = new java.util.Scanner(System.in).nextInt();
		data = num;

		if( num > 0){

			while( num > 0){
				num = num / 10;
				keta++;
			}

			System.out.println("整数値　" + data + "　の桁数は" + keta + "ケタです。");

		}else{
			System.out.println("０より大きい値を入力してください。");
			}



	}

}
