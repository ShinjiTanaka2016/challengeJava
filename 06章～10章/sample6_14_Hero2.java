package usystem;

public class sample6_14_Hero2 {

	private String name;
	private int height;
	private int weight;
	private int age;


	public sample6_14_Hero2(String name, int height, int weight, int age ){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}


	public String getName()	{ return this.name; }
	public int getHeight()	{ return this.height; }
	public int getWeight()	{ return this.weight; }
	public int getAge()		{ return this.age; }


	public void setName(String name)	{ this.name = name; }
	public void setHeight(int height)	{ this.height = height; }
	public void setWeight(int weight)	{ this.weight = weight; }
	public void setAge(int age)			{ this.age = age; }


	//	太るメソッド
	public void gainWeight(int weight){
		this.weight += weight;
	}

	//	やせるメソッド
	public void reduceWeight(int weight){
		this.weight -= weight;
	}

}
