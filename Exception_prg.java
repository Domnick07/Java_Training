package Exception_examples;

public class Exception_prg 
{
	public static void main(String args[])
	{
		int a=0;
		System.out.println("Line 8");
		int b=1;
		System.out.println("Line 10");
		try
		{
		 System.out.println(b/a);//AT this point the execution will get terminated and the furthure code won't be executed, to overcome this we use exceptions.
		}
		catch(IndexOutOfBoundsException e)
		{
		 System.out.println("Error occured");
		}

		catch(Exception e)
		{
			System.err.println("Exceptions");
		}
		finally
		{
		System.out.println("Line 11");
		}
		System.out.println("Line 11");
	}

}
