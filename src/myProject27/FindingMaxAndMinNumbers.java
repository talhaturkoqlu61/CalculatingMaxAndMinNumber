package myProject27;
import java.util.Scanner;

public class FindingMaxAndMinNumbers {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int number,max,i=2,min,first;
		
		System.out.print("Please enter how many numbers you will enter:");
		number=input.nextInt();
		System.out.print("Please enter first number:");
		first=input.nextInt();
		min=first;
		max=first;
		 
		
		while( i<=number) {
			System.out.print("Please enter "+i+".number:");
			int n=input.nextInt();
			if(n<min) {
				min=n;
				
			}
			else {
				max=n;
			}i++;
		}
		System.out.println("Max number:"+max);
		System.out.println("Min number:"+min);
			
			
		
		
	}

}
