import java.util.Scanner;

public class exempleScanner {

    public static void main(String[] args) {
	// concatenation avec un integer
	String chaine = "Fabien";
	int numero = 72;

	System.out.println("Hello " + chaine + " (dossard " + Integer.toString(numero) + ").");

	Scanner monScanner = new Scanner(System.in);

	System.out.println("Please enter your name, age and salary.");

	String name = monScanner.nextLine();
	int age = monScanner.nextInt();
	double salary = monScanner.nextDouble();

	System.out.println("Name: " + name);
	System.out.println("Age : " + age);
	System.out.println("Salary (basic): " + salary);

	System.out.format("Salary (format raw n): " + salary + "%n");
	System.out.format("Salary (format 10.3f): %10.3f %n", salary);

	monScanner.close();
    }
}
