package usystem;

class sample4_sentaku {

	public static void main(String[] args) {

		int[] apple = {4,2,5,1,3};
		int shou;
		int work;

		for(int kai = 0; kai < apple.length - 1; kai++){

			shou = kai;


			for(int j = kai + 1; j < apple.length; j++){
				if(apple[shou] > apple[j]){
					shou = j;
				}
			}


			if( kai != shou ){
				work = apple[kai];
				apple[kai] = apple[shou];
				apple[shou] = work;
			}
		}

		for(int i = 0; i < 5; i++){
			System.out.print(apple[i] + "  ");
		}

	}

}
