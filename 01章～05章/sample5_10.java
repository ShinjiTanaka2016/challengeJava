package usystem;


class MyOverLoad2{


	static double myArea(int x){
		double enArea =  (x / 2) * (x / 2) * 3.14;

		return enArea;
	}


	static int myArea(int x, int y){
		int chohokeiArea =  x * y;

		return chohokeiArea;
	}
}


class sample5_10 {

	public static void main(String[] args) {

		MyOverLoad2 obl2 = new MyOverLoad2();

		System.out.printf("%3.2f\n" ,obl2.myArea(10));
		System.out.println(obl2.myArea( 10, 20));

	}
}
