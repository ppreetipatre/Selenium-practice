package Inheritance;

	public class Child extends Parents
	
	{

	public void sun(){
		{
			System.out.println("sun");
		}
	}
	
	public static void doughter()
	{
		System.out.println("doughter");
	}
	
	
	public static void main(String[] args)
	
	{
		Child c1 = new Child();
		c1.grandfather();
		c1.grandmother();
		c1.father();
		c1.mother();
		c1.sun();
		c1.doughter();
				
		
		

	}

}
