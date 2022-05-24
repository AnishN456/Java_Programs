import java.util.Scanner;
//Program generates multiplication table for even numbers.
public class ForLoopDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range:");
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		for(int i=m;i<=n;i++)
		{
			if(i%2==0)
			{
				
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
		}

	}

}
}
