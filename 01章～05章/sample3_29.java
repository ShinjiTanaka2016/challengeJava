package usystem;

class sample3_29 {

	public static void main(String[] args) {

		int r;
		int n = 0;
		int ans;

		r = new java.util.Random().nextInt(11);

		System.out.println( "０～１０までの数を当ててください" );
		for(;;){
			ans = new java.util.Scanner(System.in).nextInt();
			if(ans == r){
				System.out.println( "当たりです！！"+ (n + 1) + "回目で当たりました。");
				break;
			}else if( ans > r ){
				System.out.println( "もっと小さな数です。");
			}else if( ans < r ){
				System.out.println( "もっと大きな数です。");
			}
			n++;
		}
	}
}
