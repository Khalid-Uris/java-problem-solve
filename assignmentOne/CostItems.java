package assignmentOne;

import java.util.Scanner;

public class CostItems {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cost of 3 Items");

		System.out.println("Enter the pencil value: ");
		float pencil = sc.nextFloat();

		System.out.println("Enter the pen value: ");
		float pen = sc.nextFloat();

		System.out.println("Enter the eraser value: ");
		float eraser = sc.nextFloat();
		float total = (pencil+pen+eraser);
		
		float taxOnPencil= pencil*0.18f;
		float taxOnPen= pen*0.18f;
		float taxOnEraser= eraser*0.18f;

		float totalTax=taxOnPencil+taxOnPen+taxOnEraser;

		float grossCost=total+totalTax;

		System.out.println("The User Bill is: ");
		System.out.println("Pencil cost is "+pencil+" tax is "+taxOnPencil);
		System.out.println("Pen cost is "+pen +" tax is "+taxOnPen);
		System.out.println("Eraser cost is "+eraser +" tax is "+taxOnEraser);
		System.out.println("The net cost of items "+total);

		System.out.println("total tax cost "+totalTax);
		System.out.println("Gross Cost is "+grossCost);



	}
}
