
public class Package {
	private double width;
	private double height;
	private double length;
	private double weight;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return getWeight() * 3;
	}
	
	@Override
	public String toString() {
		return "Paket (" +
				getWidth() + "x" +
				getHeight() + "x" +
				getLength() + "), težina: " +
				getWeight() + ", cijena: " +
				getPrice();
	}
}
