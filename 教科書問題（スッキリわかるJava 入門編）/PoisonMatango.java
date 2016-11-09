package rpg;

public class PoisonMatango extends Matango {

	private int poisonKaisu = 5;

	public PoisonMatango(char suffix){
		super(suffix);
	}

	public void attack(Hero h){

		System.out.print("ポイズン");
		super.attack(h);

/*
		System.out.println( "ポイズンキノコ" + super.getSuffix() + "のものすごい攻撃" );
		System.out.println("50のダメージ");
		h.setHp(h.getHp() - 50);
*/

		if(this.poisonKaisu != 0){
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.getHp()/5;
			h.setHp( h.getHp() - dmg );
			System.out.println(dmg + "ポイントのダメージ");
		}
		this.poisonKaisu--;
	}

}
