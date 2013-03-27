
public class NatTemp {
	int iTemperature;
	double dTemperature;
	String sTemperature;
	NatTemp(){
		System.out.println("I am the default constructor.");
	}
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
}
