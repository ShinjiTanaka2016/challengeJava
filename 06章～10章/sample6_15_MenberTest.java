package usystem;

public class sample6_15_MenberTest {

	public static void main(String[] args) {

		Menber[] me = new Menber[3];
		me[0] = new Menber( "田中", 1, 33 );
		me[1] = new Menber( "吉中", 2, 23 );
		me[2] = new Menber( "千葉", 3, 27 );


		for(int i = 0; i < 3; i++){
			me[i].print();
		}

	}

}



class Menber{

	private String name;
	private int no;
	private int age;

	Menber(String name, int no, int age ){
		this.name = name;
		this.no = no;
		this.age = age;
	}


	int getNo(){return this.no;}
	void setNo(int no){this.no = no;}
	void print(){
		System.out.println("No." + no + "：" + name + "：" + age + "才" );
	}


}
