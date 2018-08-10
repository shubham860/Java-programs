abstract class One
{
	public One()
	{
		System.out.println("one method called");
	}
}

abstract class Two extends One 
{
	public Two()
	{
		System.out.println("Two method called");
	}
}

class Three extends Two
{
	public Three()
	{
		System.out.println("three method called");
	}
	public static void main(String []ar)
	{
		Three t = new Three();
	}
}