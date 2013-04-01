
public class NatTemp {
	double dTemperature;
	int iTemperature;	
	String sTemperature;
	double[] aTemperature;
	int iTemperature_size;
	
	public NatTemp(double[] aIni, int i){
		
		int j;
		
		if(i>0){
			aTemperature = new double[i];
		} else {
			System.out.println("Wrongggg");
		}
		
		iTemperature_size = i;
		for (j=0; j<iTemperature_size; j++){
			aTemperature[j]=aIni[j];	
		}
		
	}
	double Average_Temp(){
		double Sum;
		double Average;
		int i;
		
		Sum=0;
		Average=0;
		
		if (iTemperature_size>0){
			for (i=0; i<iTemperature_size; i++){
				Sum = aTemperature[i]+Sum;
			}
		} else {
			System.out.println("Wrongggggg!!!!!");
		}
		
		Average = Sum/iTemperature_size;
		return Average;
			
	}
//	public void NatTemp(){
//		System.out.println("I am the default constructor.");
//	}
	NatTemp(double temp){
		dTemperature = temp;
		iTemperature = (int) dTemperature;
		sTemperature = (String) "The current temperature is " + iTemperature;
		System.out.println(sTemperature);
	}
	public void fellslike(double temp){
		System.out.println("If feels like " + temp*0.9);
	}
	public void fellslike(){
		System.out.println("If feels like " + (int)( dTemperature*0.9));
		if (dTemperature < 20){
			System.out.println("It is very cold");
		} else {
			System.out.println("Is is a very nice day");
		}
	}
	public void change(int temp1){
		dTemperature = dTemperature + temp1;
		iTemperature = (int) dTemperature;
		sTemperature = (String) "The current temperature is " + iTemperature;
		System.out.println(sTemperature);
	}
	
}
