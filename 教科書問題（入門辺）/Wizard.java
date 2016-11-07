package rpg;


public class Wizard {

	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h){
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * this.getWand().getPower());


		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した");

	}


//	HPゲッターセッター
	public int getHp(){
		return this.hp;
	}
	public void setHp(int hp){
		if(hp < 0){
			hp = 0;
		}else{
			this.hp = hp;
		}
	}

	//	MPゲッターセッター
	public int getMp(){
		return this.mp;
	}
	public void setMp(int mp){
		if(mp < 0){
			throw new IllegalArgumentException("MPの値が適正範囲外です。中断します。");
		}
		this.mp = mp;
	}

	//	名前ゲッターセッター
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if(name == null){
			throw new IllegalArgumentException("魔法使いの名前がありません。中断します。");
		}else if(name.length() < 3){
			throw new IllegalArgumentException("魔法使いの名前が短すぎます。中断します。");
		}
		this.name = name;
	}

	public Wand getWand(){
		return this.wand;
	}
	public void setWand(Wand wand){
		if(wand == null){
			throw new IllegalArgumentException("魔法使いの杖がありません。中断します。");
		}
		this.wand = wand;
	}

}
