package BridgeDesignPattern;

public class Implementation2 implements Implementor {

	@Override
	public void encryptMessage(String message) {
		System.out.println("Message Encrypted with AES Algo");
	}

}
