package usystem;

class sample3_06_02 {

	public static void main(String[] args) {

		System.out.println("点数を入力してください。");
		int x = new java.util.Scanner(System.in).nextInt();
		String hyouka;

		if(x >= 80){
			hyouka = "Ａ";
		}else if( 70 <= x ){
			hyouka = "Ｂ";
		}else if( 60 <= x ){
			hyouka = "Ｃ";
		}else{
			hyouka = "Ｄ";
		}

		System.out.println("評価は" + hyouka + "です。");

	}

}
