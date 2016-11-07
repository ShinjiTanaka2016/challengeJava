package rpg;

public class Wand {

	private String name;		//	杖の名前
	private double power;		//	杖の魔力


	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if(name == null){
			throw new IllegalArgumentException("杖の名前がありません。中断します。");
		}else if(name.length() < 3 ){
			throw new IllegalArgumentException("杖の名前が短すぎます。中断します。");
		}
		this.name = name;
	}


	public double getPower(){
		return this.power;
	}
	public void setPower(int power){
		if( power > 0.5 || 100.0 < power ){
			throw new IllegalArgumentException("杖の魔力が適正範囲外です。中断します。(0.5～100.0)");
		}
		this.power = power;
	}




}
