package Composition;

public class Car 
{ 
	
	//private Engine eng; //agggreation
	private final Engine eng; //composiiton coz final

	public Car(Engine eng) {
		super();
		this.eng = eng;
	}
	
	public void move()
	{
		eng.work();
		System.out.println("car movinng...");
	}
	public static void main(String[] args) {
		
		Engine en = new Engine();
		Car c = new Car(en);
		c.move();
		
		
	}

}
