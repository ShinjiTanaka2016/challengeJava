package usystem;

public class sample6_13_HeroSample {

	public static void main(String[] args) {

		sample6_13_Hero suzuki = new sample6_13_Hero();
		sample6_13_Hero tanaka = new sample6_13_Hero();


		suzuki.name 	= "鈴木次郎";
		suzuki.height 	= 180;
		suzuki.weight	= 75;
		suzuki.age		= 24;


		tanaka.name 	= "田中大輔";
		tanaka.height 	= 170;
		tanaka.weight	= 68;
		tanaka.age		= 46;


		System.out.println
		("氏名：" + suzuki.name + "  身長：" + suzuki.height + "cm  "
		+ "体重：" + suzuki.weight + "kg  年齢" + suzuki.age + "才");

		System.out.println
		("氏名：" + tanaka.name + "  身長：" + tanaka.height + "cm  "
		+ "体重：" + tanaka.weight + "kg  年齢" + tanaka.age + "才");

	}

}
