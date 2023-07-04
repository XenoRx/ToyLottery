
public class Main {
	public static void main(String[] args) {
		Toy toy1 = new Toy(1, "Lego", 2);
		Toy toy2 = new Toy(2, "Bionicle", 4);
		Toy toy3 = new Toy(3, "Doll", 6);
		
		ToyList toyList = new ToyList();
		toyList.addToQueue(toy1);
		toyList.addToQueue(toy2);
		toyList.addToQueue(toy3);
		
		Lottery lottery = new Lottery();
		for (int i = 0; i < 10; i++) {
			Toy toy = lottery.win(toyList.toyList);
			System.out.println(i + "Prize: " + toy);
			try (FileEntry fileEntry = new FileEntry()) {
				fileEntry.writeToFile(toy);
			} catch (Exception e) {
				throw new RuntimeException("Error writing to file", e);
			}
		}
//		Toy toy4 = lottery.win(toyList.toyList);
//		Toy toy5 = lottery.win(toyList.toyList);
//		System.out.println("Winner: " + toy4);
//		System.out.println("Winner: " + toy5);
	
	}
}
