package BridgeDesignPattern;

public class Abstraction {
	Implementor implementation;
	String message;
	public Abstraction(Implementor impType, String message) {
		this.implementation = impType;
		this.message = message;
	}
	
	public void encryptMessage() {
		implementation.encryptMessage(message);
	}
}
