//SampleJenkinsProgram
//hello
//this is a program
import java.util.Scanner;
class add
{
	public static void  main(String []args)
	{  
	 Scanner s=new Scanner(System.in);
	System.out.println("enter value for A and B:");
	int A=s.nextInt();
	int B=s.nextInt();
	int sum;
	sum=A+B;
	System.out.println("the sum of the given two number is:"+sum );
	}
}