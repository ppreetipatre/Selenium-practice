package Inheritance;

public class Parents extends Grantparents
{

	public void father()
	{
		System.out.println("Father");
	}
	
	public void mother()
	{
		System.out.println("Mother");
		
	}
		
	public static void main(String[] args) {
		Parents p1 = new Parents();
				p1.grandfather();
				p1.grandmother();
				p1.father();
				p1.mother();
				
	}
	
	
	
	
}


