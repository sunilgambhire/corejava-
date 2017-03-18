package java1;

public abstract class Ab

{
	

	abstract void m1();
	
	public void m2()
	{
		System.out.println("inside M1 Ab");
	
	}
	
	public void m3()
	{
		System.out.println("inside m3 Ab");
	}
	
	public static void main(String[] args)
	{
		
	
			Ab a=new Bc();
			a.m1();
			a.m2();
			a.m3();

			Bc b=new Bc();
			b.m1();
			b.m2();
			b.m3();
			b.m4();

			Dc d=new Dc();
			d.m1();
			d.m2();
			d.m3();
			d.m5();

			Ab e=new Dc();
			e.m1();
				e.m2();
			e.m3();
	}




	
}	
class Bc extends Ab
{
	
	void m1()
	{
		System.out.println("inside m1 Bc");
	}
	
	@Override
	public void m2()
	{
		System.out.println("inside m2 Bc");
	}
	
	public void m4()
	{
		System.out.println("inside m4 Bc");
	}
	
}
	class Dc extends Ab
	{
		void m1()
		{
			System.out.println("inside m1 Dc");	
		}
		
		@Override
		public void m2()
		{
			System.out.println("inside m2 Dc");
		}

		public void m3()
		{
			System.out.println("inside m3 Dc");
		}
		
		public void m5()
		{
			System.out.println("inside m5 Dc");
		}

	}
	






