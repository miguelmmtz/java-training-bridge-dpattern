package BridgeDesignPattern;

public class Client {

	public static void main(String[] args) {
		Abstraction bridge = new Abstraction(new Implementation1(),"Hello123");
		//Abstraction bridge = new Abstraction(new Implementation2(),"Hello123");
		bridge.encryptMessage();
	}

}
