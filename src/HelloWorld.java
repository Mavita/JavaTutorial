
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		NatTemp natTemp = new NatTemp(25.5);
		natTemp.fellslike();
		NatTemp natTemp2 = new NatTemp(19.5);
		natTemp2.fellslike();
	}

}
