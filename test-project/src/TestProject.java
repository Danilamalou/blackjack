import java.util.Scanner;

public class TestProject {
	
	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Entrez votre nom: ");
		String nom = inputReader.nextLine();
		System.out.println("Hello" +nom);
	}
}