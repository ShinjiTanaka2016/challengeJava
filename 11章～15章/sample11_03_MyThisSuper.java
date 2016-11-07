package usystem;


class MyOverride{
	public String whoName = "親";
}


class MyOverrideNew extends MyOverride{
	public String whoName = "子";
	void getWho(){
		System.out.println(super.whoName);
		System.out.println(this.whoName);
	}
}


public class sample11_03_MyThisSuper {

	public static void main(String[] args) {

		MyOverrideNew obj = new MyOverrideNew();

		obj.getWho();
		System.out.println(obj.whoName);
	}

}
