
package java1;



class Vehicle1 {

	String color;
	int size;
	int speed;
	
	 public void m1()
	{
		System.out.println("vehicle color-"+color);
		System.out.println("Vechicle size-"+size);
		System.out.println("Vechicle speed-"+speed);
	}
}
	class Car extends Vehicle1{
		int cc;
		String name;
		
		public void m2()
		{
			System.out.println("vehicle cc-"+cc);
			System.out.println("vehicle name-"+name);
		}
		public static void main(String[] args) {	
		
			Car a=new Car();
			a.color="red";
			a.speed=70;
			a.size=30;
			a.cc=1200;
			a.name="Audi";
			a.m2();
			a.m1();
		}
}