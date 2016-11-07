package usystem;

public class sample11_04_Rectangle {

	//	フィールド
	private int width;
	private int height;


	//	コンストラクタ
	public sample11_04_Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}


	//	ゲッターメソッド
	public int getWidth(){ return this.width; }
	public int getHeight(){ return this.height; }
	public int getCircum(){ return (this.width + this.height) * 2; }
	public int getArea(){ return this.width * this.height; }


	//	セッターメソッド
	public void setWidth(int width){
		this.width = width;
	}
	public void setHeight(int height){
		this.height = height;
	}



}
