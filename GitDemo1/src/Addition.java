import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int num1 , num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		num2 = sc.nextInt();
		System.out.println("Addition of two numbers is : "+(num1+num2));
	}

}
