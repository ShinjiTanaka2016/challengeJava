package usystem;

class sample5_nibun {

	public static void main(String[] args) {

		String[] simei =
			{ "あいこ","かなみ","さゆり","たろう","ななみ","はるこ","まき","やすよ","らん","わかこ" };


		String ans = new java.util.Scanner(System.in).nextLine();

		int hajime = 0;
		int owari = simei.length + 1;
		int chu = 0;


		do{
			chu = ( hajime + owari ) / 2;

			if( simei[chu].equals(ans) ){
				System.out.println("探索完了");
				break;
			}else if( 0 > chu){
				hajime = chu + 1;
			}else{
				owari = chu - 1;
			}

		}while( hajime < owari);


		if( simei[chu].equals(ans) ){
			System.out.println(ans + " は simei[" + chu + "] にあります");
		}else{
			System.out.println(ans + " は simei配列に存在しません");
		}


	}

}
