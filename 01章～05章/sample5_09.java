package usystem;

class MyOverLoad{

	void showType(int i){
		System.out.println("引数" + i + "は整数です。");
	}
	void showType(String s){
		System.out.println("引数" + s + "は文字列です。");
	}

}


public class sample5_09 {


	public static void main(String[] args) {

		MyOverLoad obj = new MyOverLoad();

		obj.showType(10);
		obj.showType("こんにちは");

	}

}
