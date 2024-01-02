package assignmentOne;
import java.util.Scanner;

class SquareArea{
	public static void main(String[] args){


		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the side of a square");		
		int side = sc.nextInt();

		int square= (side*side);

		System.out.println("The area of the Square is "+square);

	}
}