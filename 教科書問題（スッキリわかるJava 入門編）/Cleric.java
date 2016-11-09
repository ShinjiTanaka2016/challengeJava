package rpg;

public class Cleric {

	String name;
	static final int MAXHP	= 50;
	int hp		= 50;
	static final int MAXMP	= 10;
	int mp		= 10;


	public Cleric( String shokiname, int shokihp, int shokimp ){
		this.name = shokiname;
		this.hp = shokihp;
		this.mp = shokimp;
	}

	public Cleric( String shokiname, int shokihp ){
		this( shokiname, shokihp, Cleric.MAXMP);
	}

	public Cleric( String shokiname ){
		this( shokiname, Cleric.MAXHP, Cleric.MAXMP);
	}


	//	「セルフエイド」メソッド
	void selfAid(){
		this.mp -= 5;
		this.hp = MAXHP;
		System.out.println(this.name + "のHPは全回復した！");
	}

	//	「祈る」メソッド
	void play(int sec){

		int r = new java.util.Random().nextInt(3);

		int kaihuku = sec + r;
		this.mp += kaihuku;

		if( this.mp > this.MAXMP){
			kaihuku = MAXMP - mp;
			mp = MAXMP;
		}

		System.out.println(this.name + "は" + sec + "秒祈った");
		System.out.println(this.name + "のMPは" + kaihuku + "ポイント回復した！");

	}

}
