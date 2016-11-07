package usystem;

class sample6_07_CubeRoot {

	int x,y,z;

	public sample6_07_CubeRoot(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void display(){
		System.out.println(Math.cbrt( x * y * z ));	// 立方根
	}


}
