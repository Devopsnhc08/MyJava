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
	int A=Integer.parsInt(args[0]);
	int B=Integer.parsInt(args[1]);
	int sum;
	sum=A+B;
	System.out.println("the sum of the given two number is:"+sum );
	}
}