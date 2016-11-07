package usystem;

public class sample11_05_ArrayDeviation extends sample11_05_ArrayProcessor{

	private int[] devArray;
	private double[] dev;		//	偏差
	private double varia;		//	分散
	private double stdDev;		//	標準偏差
	private double[] devVal;	//	偏差値

	public sample11_05_ArrayDeviation(int[] devArray){
		super(devArray);
		this.devArray = devArray;
		calcDev();
	}

	public void calcDev(){
		dev = new double[getLength()];
		devVal = new double[getLength()];

		for( int i = 0; i < getLength(); i++ ){
			dev[i] = devArray[i] - getAverage();
			varia +=  dev[i] * dev[i];
		}
		stdDev = Math.sqrt(varia) / getLength();
		for(int i = 0; i < getLength(); i++){
			devVal[i] = 50 + dev[i] / stdDev;
		}

	}
	public int[] getDevArray(){
		return this.devArray;
	}

	public double[] getDev(){
		return this.dev;
	}

	public double getVaria(){
		return this.varia;
	}

	public double getStdDev(){
		return this.stdDev;
	}

	public double[] getDevVal(){
		return this.devVal;
	}


}
