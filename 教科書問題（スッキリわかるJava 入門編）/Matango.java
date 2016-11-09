package rpg;

public class Matango {

	int hp = 50;
	private char suffix;

	public Matango(char suffix){
		this.setSuffix(suffix);
	}

	public void attack(Hero h){

		System.out.println( "キノコ" + this.getSuffix() + "の攻撃" );
		System.out.println("10のダメージ");
		h.setHp(h.getHp() - 10);
	}

	public char getSuffix() {
		return suffix;
	}

	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}


}
