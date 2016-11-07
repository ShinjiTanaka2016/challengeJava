package usystem;

class sample3_09 {

	public static void main(String[] args) {

		int turi;
		int ohYen;
		int ftYen;
		int tenYen;

		System.out.println("コーヒーの定価");
		int coffee = new java.util.Scanner(System.in).nextInt();
		System.out.println("入金額");
		int cash = new java.util.Scanner(System.in).nextInt();

		if( coffee < cash ){

			turi = cash - coffee;

			ohYen = turi / 100;
			turi = turi % 100;
			ftYen = turi / 50;
			turi = turi % 50;
			tenYen = turi / 10;

			System.out.println("お釣り＝100円硬貨は　" + ohYen + "枚　"
									  + "50円硬貨は　" + ftYen + "枚　"
									  + "10円硬貨は　" + tenYen + "枚");

		}else{
			System.out.println("お金が足りません。");
		}

	}

}
