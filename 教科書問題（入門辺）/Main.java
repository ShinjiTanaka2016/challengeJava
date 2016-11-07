package rpg;

public class Main {

	public static void main(String[] args) {


		Hero h = new Hero();


		h.name = "タナカ";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました。");


		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();


		Cleric c = new Cleric("スズキ",10);

		System.out.println("聖職者" + c.name + "を生み出しました。");

		c.selfAid();
		c.play(2);

		PoisonMatango pm = new PoisonMatango('A');

		pm.attack(h);
		h.run();

	}

}
