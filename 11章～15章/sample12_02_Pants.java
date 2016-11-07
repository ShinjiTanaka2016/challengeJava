package usystem;

abstract class sample12_02_Pants {

	String code;
	int size;
	String color;
	sample12_02_Pants(String code,int size,String color){
		this.code = code;
		this.size = size;
		this.color = color;
	}

	public boolean sizeIs(int size){
		return this.size == size;
	}

	public boolean colorIs(String color){
		return this.color.equals(color);
	}

	public String toString(){
		return code + "," + size + "," + color;
	}

}


class Slacks extends sample12_02_Pants{

	Slacks(String code, int size, String color) {
		super(code, size, color);
	}
}

class Jeans extends sample12_02_Pants{
	boolean buttonFront;
	Jeans(String code, int size, String color,boolean buttonFrint) {
		super(code, size, color);
		this.buttonFront = buttonFront;
	}
	public String toString(){
		return super.toString() + "," + (buttonFront ? "button":"zipper");
	}
}

