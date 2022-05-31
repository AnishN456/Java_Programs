import java.util.Scanner;
//number is the variable for getting a number.
//sum is used to calculate the sum of cube of digits.
//temp will temporarily store a number.
//digits is used to get the digits in the number.
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum=0;
		int temp=number;
		int digits;
		while (number>0)
		{
			digits=number%10;
			sum+=digits*digits*digits;
			number=(int)(number/10);
		}
		if(temp==sum)
		{
			System.out.println(temp+" is an armstrong number.");
		}
		else
		{
			System.out.println(temp+" is not an armstrong number.");
		}

	}

}
