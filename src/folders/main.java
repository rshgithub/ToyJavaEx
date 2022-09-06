package folders;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Toy toy1 = new Toy("first", "red", Quality.Hight, 20.0);
		toy1.display();
		System.out.println("total price = " + toy1.discount(toy1.price) + "\n");
	
		Toy toy2 = new Toy("secound", "yellow", Quality.Mediam, 10.0);
		toy2.display();
		System.out.println("total price = " + toy2.discount(toy2.price) + "\n");
	
		Toy toy3 = new Toy("third", "white", Quality.Low, 15.0);
		toy3.display();
		System.out.println("total price = " + toy3.discount(toy3.price) + "\n");
	
	}

}
