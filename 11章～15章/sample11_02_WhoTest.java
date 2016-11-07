package usystem;


class SuperClass{
	String name;

	SuperClass(){
		System.out.println("I am John.");
	}

	SuperClass(String name){
		this();
		this.name = name;
		System.out.printf("I am a father of %s.\n\n", name);
	}
}

class SubClass extends SuperClass{
	String name;
	SubClass(String name){
		super("Johnson");
		System.out.printf("I am a son of %s.\n", name);
	}
}


public class sample11_02_WhoTest {

	public static void main(String[] args) {
		SubClass johnson = new SubClass("John");

	}

}
