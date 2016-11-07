package usystem;

public class sample12_02_TestPants {

	public static void main(String[] args) {

		sample12_02_Pants[] pants = {
				new Slacks("S1",31,"Black"),
				new Slacks("S2",31,"Black"),
				new Jeans("J1",32,"Black",false),
				new Jeans("J2",34,"blue",true),
		};
		String black = new String("Black");
		for(int i = 0; i < pants.length; i++){
			System.out.println(pants[i]);
		}
		System.out.println(pants[0].sizeIs(31));
		System.out.println(pants[1].colorIs(black));
		System.out.println(pants[2].sizeIs(30));
		System.out.println(pants[3].colorIs(black));

	}

}
