package usystem;

class sample4_sonyu_03 {

	public static void main(String[] args) {

//		りんご５箱と空き箱を用意
			int[] apple = { 4, 2, 5, 1, 3, };
			int box = 0;

			//	２番目のから最終要素まで繰り返す
			for(int kai = 1; kai < apple.length; kai++){


				//	１つ後の要素と比較して移動する
				for(int kazu = kai-1; kazu >= 0; kazu--){

					if(apple[kazu] > apple[kazu + 1]){
						box = apple[kazu];
						apple[kazu] = apple[kazu + 1];
						apple[kazu + 1] = box;
					}
				}
			}

			//	【表示】
			for(int k = 0; k < apple.length; k++){
				System.out.print(apple[k] +  "  ");
			}
	}

}
