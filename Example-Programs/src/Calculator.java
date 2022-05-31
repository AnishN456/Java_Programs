import java.util.Scanner;
//Program to implement a calculator Program.
public class Calculator {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char operator;
	int sum=0;
	//Here We take the input for two numbers
	System.out.println("Enter the two numbers:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	//Then we will Select the operators like +,-,*,/
	System.out.println("Enter operators like +,-,*,/");
	operator = sc.next().charAt(0);//Here in order to get a single character we take next with charAt().
	//Based on the operator the essential case will be executed in switch case.
	switch(operator)
	{
	 case '+':    sum=a+b;
				  System.out.println("The addition of two numbers:"+sum);
		          break;
		case '-': if(b>a)
				  {
				  sum=b-a;
				  System.out.println("The Subtraction of two numbers:"+sum);

				  }
				  else
				  {
					  System.out.println("Give a number such that second number is greater than first");
				  }
				  break;
		case '*':sum=a*b;
				 System.out.println("The Multiplication of two numbers:"+sum);
				 break;
				 
		case '/': sum=a/b;
				  System.out.println("The Division of two numbers:"+sum);
				  break;
	}

	}

}
