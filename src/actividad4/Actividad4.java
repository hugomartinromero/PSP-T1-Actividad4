package actividad4;

import java.io.File;
import java.io.IOException;

public class Actividad4 {

	public static void main(String[] args) throws InterruptedException, IOException {

		ProcessBuilder pb = new ProcessBuilder("ls");
		
		pb.inheritIO();
		
		System.out.println("Directorio por defecto: " + pb.directory());
		
		pb.directory(new File("/etc"));
		System.out.println("Comando " + pb.command() + " en " + pb.directory() + ".");
		Process p1 = pb.start();
		
		System.out.println();
		
		pb.directory(new File("/home/hugo"));
		System.out.println("Comando " + pb.command() + " en " + pb.directory() + ".");
		Process p2 = pb.start();
	}
}
