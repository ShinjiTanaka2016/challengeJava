package usystem;

class sample3_07 {

	public static void main(String[] args) {

		int cash = new java.util.Scanner(System.in).nextInt();
		final double TAX = 1.08;

		if( cash >= 3000){
			System.out.println("支払い金額は" + (int)(cash * TAX) + "円です。");
		}else{
			System.out.println("支払い金額は" + (int)((cash + 500) * TAX) + "円です。");
		}

	}

}
