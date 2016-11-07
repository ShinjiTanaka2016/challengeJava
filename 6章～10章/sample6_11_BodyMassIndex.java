package usystem;

public class sample6_11_BodyMassIndex {

	private String name;	// 氏名
	private int height;		// 身長
	private int weight;		// 体重
	private double bmi;		// ＢＭＩ
	private String message;	// 判定結果

	//	コンストラクタ
	public sample6_11_BodyMassIndex(String name, int height, int weight ){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	//	getterとsetter
	public String getName(){return this.name;}
	public int getHeight(){return this.height;}
	public int getWeight(){return this.weight;}

	//	BMIの計算
	public double getBmi(){
		this.bmi = this.weight / Math.pow(this.height/100.0, 2);
		return this.bmi;
	}

	public String getMessage(){
		if(this.bmi < 18.5){
			this.message = "[やせすぎ]";
		}else if(18.5 <= this.bmi && this.bmi < 25.0 ){
			this.message = "[標準]";
		}else if(25.0 <= this.bmi && this.bmi < 30.0 ){
			this.message = "[肥満(1度)]";
		}else if(30.0 <= this.bmi && this.bmi < 35.0 ){
			this.message = "[肥満(2度)]";
		}else if(35.0 <= this.bmi && this.bmi < 40.0 ){
			this.message = "[肥満(3度)]";
		}else{
			this.message = "[肥満(4度)]";
		}
		return this.message;
	}

}


