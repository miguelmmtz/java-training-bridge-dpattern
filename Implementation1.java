package BridgeDesignPattern;

public class Implementation1 implements Implementor{

	@Override
	public void encryptMessage(String message) {
		System.out.println("Message Encrypted with DES Algo");
	}

}
