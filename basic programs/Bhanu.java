class Bhanu extends Abstract
{
	public void calc(int a)
	{
		System.out.println("cube is:"+(a*a*a));
	}
	public void display()
	{
	  System.out.println("bhanu method called");	
	}
	public static void main(String ar[])
	{
		Bhanu b = new Bhanu();
		b.calc(5);
		b.display();
	}
}