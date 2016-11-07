package usystem;

class sample4_sonyu {

	public static void main(String[] args) {

		//	りんご５箱と空き箱を用意
		int[] apple = { 4, 2, 5, 1, 3, };
		int box = 0;

		//	２番目のから最終要素まで繰り返す
		for(int i = 1; i < apple.length; i++){

			//	１つ前の要素と比較して小さければ前に移動する
			for(int j = i; j > 0; j--){

				if(apple[j] < apple[j-1]){
					box = apple[j];
					apple[j] = apple[j-1];
					apple[j-1] = box;
				}
			}
		}

		//	【表示】
		for(int k = 0; k < apple.length; k++){
			System.out.print(apple[k] +  "  ");
		}

	}

}
