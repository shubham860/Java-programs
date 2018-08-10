interface Abc
{
	int a=400;
	void add();
}

interface Abc2
{
	int a=600;
 public abstract void add();
}

class Interface_Abc3 implements Abc,Abc2
{
	public void add()
	{
		int b = Abc.a + Abc2.a;
		System.out.println("total a:"+b);
	}

public static void main(String []ar)
 {
   Interface_Abc3 ac = new Interface_Abc3();
   ac.add();
 } 

} 