package sec06.exam02_reflection;

public class Car {
	
	private String model;
	private String owner;
	
	public Car() {
		
	}
	
	public Car(String model) {
		this.model = model;
	}
	
	//필드에 대한 Setter, Getter메소드
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel ( ) {
		return model;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner () {
		return owner;
	}
}
