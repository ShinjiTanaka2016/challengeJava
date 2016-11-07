package usystem;

class sample3_06_01 {

	public static void main(String[] args) {

		System.out.println("点数を入力してください。");
		int x = new java.util.Scanner(System.in).nextInt();

		if(x >= 80){
			System.out.println("評価はＡです");
		}else if(70 <= x){
			System.out.println("評価はＢです");
		}else if(60 <= x){
			System.out.println("評価はＣです");
		}else{
			System.out.println("評価はＤです");
		}

	}

}
