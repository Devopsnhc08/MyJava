//SampleJenkinsProgram
//hello
//this is a program

class add
{
	public static void  main(String []args)
	{  
	
	System.out.println("enter value for A and B:");
	int A=Integer.parseInt(args[0]);
	int B=Integer.parseInt(args[1]);
	int sum;
	sum=A+B;
	System.out.println("the sum of the given two number is:"+sum );
	}
}