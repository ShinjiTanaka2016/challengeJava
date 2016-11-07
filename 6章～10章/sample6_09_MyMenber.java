package usystem;

public class sample6_09_MyMenber {

	static int myStatic = 10;
	int myInstance = 100;

	public static void main(String[]args){

		myStatic = 20;
		System.out.println(myStatic);

		sample6_09_MyMenber obj = new sample6_09_MyMenber();
		obj.myInstance = 200;

		System.out.println(obj.myInstance);
	}

}
