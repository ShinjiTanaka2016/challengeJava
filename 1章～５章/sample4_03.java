package usystem;

class sample4_03 {

	public static void main(String[] args) {

		char[] s = new char[8];
		char box = 0;

		s[0] = 'U';
		s[1] = 'T';
		s[2] = 'S';
		s[3] = 'Y';
		s[4] = 'S';
		s[5] = 'T';
		s[6] = 'E';
		s[7] = 'M';

		System.out.print("【実行前】");
		for(int i = 0; i < s.length; i++ ){
			System.out.print("s[" + i + "]=" + s[i] + "  ");
		}

		for(int i = 0; i < s.length -1; i++){
			for(int j = 0; j < s.length -(1 + i); j++){
				box = s[j];
				s[j] = s[j+1];
				s[j+1] = box;
			}
		}

		System.out.println();
		System.out.print("【実行後】");
		for(int i = 0; i < s.length; i++ ){
			System.out.print("s[" + i + "]=" + s[i] + "  ");
		}

	}

}
