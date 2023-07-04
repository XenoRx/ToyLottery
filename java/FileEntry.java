import java.io.FileWriter;
import java.io.IOException;

public class FileEntry implements AutoCloseable{
	public void writeToFile(Toy toy) throws IOException {
		FileWriter writer = new FileWriter
				("C:\\java\\java_toy_machine_app\\toyMachineApp\\src\\main\\java\\results.txt",
				true);
		writer.write(toy.toString());
		writer.write("\n");
		writer.flush();
	}
	
	@Override
	public void close() {
	}
}
