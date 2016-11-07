package usystem;

class sample3_12 {

	public static void main(String[] args) {
		
		int[] height = { 150,155,160,165,170,175,180 };
		double bmi = 0;

		System.out.println("身長　　　標準体重");

		for(int i = 0; i < height.length; i++){

				bmi = (height[i] - 100) * 0.9;
				System.out.println(  height[i] + "　　　　" + bmi );

		}


	}

}
