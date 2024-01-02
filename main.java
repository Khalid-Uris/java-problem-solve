import java.util.Scanner;

/**
 * main
 */
public class main {

	public static void main(String[] args) {
		// System.out.println("Hello World");
		// for(int i=4; i>=1; i--)
		// {
		// 	// System.out.println("*");
		// 	for (int j = 1; j <= i; j++) {
		// 		System.out.print("*");
		// 		// System.out.println("\n");
		// 	}
		// 	System.out.println();
		// }

		Scanner scanner=new Scanner(System.in);
		// System.out.println("Enter a value: ");
		// int a=scanner.nextInt();
		// System.out.println("Enter b value: ");
		// int b=scanner.nextInt();
		// int sum=a+b;
			//int product = a*b;

		//System.out.println("The sum of a and b " + product);

		float radius=scanner.nextFloat();
		float area=3.14f*radius*radius;
		System.out.println(area);
	}
}
