package usystem;

class Sample64{
	private int a;
	private int b;
	private int c;

	//	コンストラクタ
	public Sample64(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	int getSum(){return a + b + c ;}

	void print(){
		System.out.println("a=" + a + "  b=" + b + "  c=" + c);
	}
}


public class sample6_16_SampleTest {

	public static void main(String[] args) {

		Sample64 x = new Sample64(1,2,3);
		Sample64 y = new Sample64(2,4,6);

		int xs = x.getSum();
		int ys = y.getSum();

		System.out.print("x :");
		x.print();
		System.out.println("xs = " + xs);

		System.out.print("y :");
		y.print();
		System.out.println("ys = " + ys);
	}
}
