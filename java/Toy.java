public class Toy implements Comparable<Toy> {
	private int id;
	private String name;
	private int weight;
	
	public Toy() {
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public Toy(int id, String name, int weight) {
		this.id = id;
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return String.format("%s ,Toy ID: %d , Toy weight: %d", name, id, weight);
	}
	
	@Override
	public int compareTo(Toy o) {
		int value = ((Toy) o).id;
		return this.id - value;
	}
}