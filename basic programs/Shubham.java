class Shubham extends Abstract
{
	public void calc(int a)
	{
		System.out.println("square is:"+(a*a));
	}
	public static void main(String ar[])
	{
		Shubham s = new Shubham();
		s.calc(5);
		s.display();
	}
}