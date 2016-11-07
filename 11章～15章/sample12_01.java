package usystem;

class Bronz extends sample12_01_Zenobia{

	String grade = "ブロンズ";

	void calcPrice(int price){
		showPrice(grade,(int)(price*(1-0.03)));
	}

}

class Silver extends sample12_01_Zenobia{

	String grade = "シルバー";

	void calcPrice(int price){
		showPrice(grade,(int)(price*(1-0.05)));
	}

}

class Gold extends sample12_01_Zenobia{

	String grade = "ゴールド";

	void calcPrice(int price){
		showPrice(grade,(int)(price*(1-0.07)));
	}

}
