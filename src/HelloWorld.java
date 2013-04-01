
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		double[] aIni;
		aIni = new double [10];
		double IniTemp;
		int i;
		
		System.out.println("Hello World");
		
//		NatTemp natTemp2 = new NatTemp(19.5);
//		natTemp2.fellslike();
//		natTemp.change(1);
		
		IniTemp = 15.5;
		
		for (i=0; i<10; i++){	
			aIni[i] = IniTemp;
			IniTemp = IniTemp++;
		}
		
		NatTemp natTemp = new NatTemp(aIni,10);
		System.out.println("The average is "+ natTemp.Average_Temp());
			
//		for (i=1; i<=10; i++){
//			natTemp.change(1);
//			natTemp.fellslike();
//		}		
//		while(i<=10){
//			natTemp.change(i);
//			natTemp.fellslike();
//			i++;
//		}
	}

}
