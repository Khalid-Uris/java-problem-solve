package assignmentOne;
import java.util.Scanner;

class VaribleAndDataType {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value A: ");
		float a = sc.nextFloat();
		System.out.println("Enter value B: ");
		float b=sc.nextFloat();
		System.out.println("Enter value C: ");
		float c=sc.nextFloat();

		float average = (a+b+c)/3f;
		
		System.out.println("The Average is "+average);

	}
	
}
