package folders;

public class Toy implements ToyFace{

	 String name;
	 String color;
	 Quality quality;
	 double price;
	
	
	public Toy(String name, String color, Quality quality, double price) {
		this.name = name;
		this.color = color;
		this.quality = quality;
		this.price = price;
	}

	@Override
	public void display() {
		System.out.print("Toy  information : name = " + name + "\n"+ "color = " + price + "\n"+ "price = " + color + "\n" + "quality = " + quality + "\n\n");
	}

	@Override
	public double discount(double price) {
		// TODO Auto-generated method stub
		return this.price * 0.5;
	}

	
	
}
