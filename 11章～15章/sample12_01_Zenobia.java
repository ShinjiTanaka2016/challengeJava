package usystem;

abstract class sample12_01_Zenobia {

	String grade;
	int price = 0;

	abstract void calcPrice(int price);
	void showPrice(String grade, int price){
		System.out.printf("この商品の%s会員の特別販売価格は%d円です。\n",grade,price);
	}

}
