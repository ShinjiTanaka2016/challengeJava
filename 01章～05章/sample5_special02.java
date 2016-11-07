package usystem;


class sample5_special02 {

	public static void main(String[] args) {


		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);


		Triangle( a, b, c );

	}


	//	三角形の種類取得メソッド
	public static void Triangle( int a, int b, int c ){

		if( a <= 0 || b <= 0 || c <= 0){
			System.out.println("０より大きい数を指定してください。");
		}else if(a == b && b == c ){
			System.out.println("正三角形です。");

		}else if(a + b > c && b + c > a && a + c > b){
			if(a == b || b == c || a == c){
				System.out.println("二等辺三角形です。");
			}else if(a != b && b != c && c != a){
				System.out.println("不等辺三角形です。");
			}

		}else{
			System.out.println("三角形ではありません。");
		}
	}
}
