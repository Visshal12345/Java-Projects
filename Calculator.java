import java.util.*;
public class Calculator
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Iam Calci what i want to do");

		System.out.println("Enter the first no : ");
		int n1=sc.nextInt();

		System.out.println("Enter the second no : ");
		int n2=sc.nextInt();

		System.out.println("----------------------------------------------------------");
		System.out.println("                                    ");

		System.out.println("Choose an operation (+, -, *, /): ");
		char operation=sc.next().charAt(0);

		double r;

		switch(operation)
		{

		case '+':

			r=n1+n2;
			break;

		case '-':

			r=n1-n2;
			break;

		case '*':

			r=n1*n2;
			break;

		case '/':

			if (n2 != 0)
			{
				r = n1 / n2;
			}
			else
			{
				System.out.println("Division by zero is not possible");
				return;
			}

			break;

		default:

			System.out.println("Invalid operation! Please try again.");
			return;

		}

		System.out.println("The result of " + n1 + " " + operation + " " + n2 + " is: " + r);
	}
}
