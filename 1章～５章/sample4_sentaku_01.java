package usystem;

public class sample4_sentaku_01 {

	public static void main(String[] args) {

		int[] apple = { 4, 2, 5, 1, 3 };
		int min;
		int box;

		//	配列の（要素数－１）だけ繰り返す
		for(int kai = 0; kai < apple.length - 1; kai++ ){

			min = kai;

			//	最小のりんごの数を選び出してminに代入
			for(int kazu = kai + 1; kazu < apple.length; kazu++ ){
				if(apple[min] > apple[kazu]){
					min = kazu;
				}
			}

			//	最小のりんごと入れ替え
			if(kai != min){
				box = apple[kai];
				apple[kai] = apple[min];
				apple[min] = box;
			}
		}


		//	【apple配列】を表示
		for(int i = 0; i < apple.length; i++){
			System.out.print(apple[i] + "  ");
		}

	}

}
