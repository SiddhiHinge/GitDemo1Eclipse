import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int num1 , num2 , num3;
		Scanner sc = new Scanner(System.in);
		
		//Addition of two numbers
		System.out.println("Addition of two numbers :=\n");
		System.out.println("Enter first number : ");
		num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		num2 = sc.nextInt();
		System.out.println("Result is : "+(num1+num2)+"\n");
		
		//Addition of three numbers
		System.out.println("Addition of three numbers :=\n");
		System.out.println("Enter first number : ");
		num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		num2 = sc.nextInt();
		System.out.println("Enter third number : ");
		num3 = sc.nextInt();
		System.out.println("Result is : "+(num1+num2+num3)+"\n");
	}

}
