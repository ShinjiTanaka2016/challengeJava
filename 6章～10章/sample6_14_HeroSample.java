package usystem;

public class sample6_14_HeroSample {

	public static void main(String[] args) {


		sample6_14_Hero2 suzuki = new sample6_14_Hero2("鈴木次郎",180,75,24);
		sample6_14_Hero2 tanaka = new sample6_14_Hero2("田中大輔",170,68,46);


		suzuki.gainWeight(3);	//	鈴木さんが3kg太っちゃった
		tanaka.reduceWeight(2); //	田中さんが2kg痩せちゃった


		System.out.println
		("氏名：" + suzuki.getName() + "  身長：" + suzuki.getHeight() + "cm  "
		+ "体重：" + suzuki.getWeight() + "kg  年齢" + suzuki.getAge() + "才");


		System.out.println
		("氏名：" + tanaka.getName() + "  身長：" + tanaka.getHeight() + "cm  "
		+ "体重：" + tanaka.getWeight() + "kg  年齢" + tanaka.getAge() + "才");

	}

}
