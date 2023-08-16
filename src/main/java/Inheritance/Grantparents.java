package Inheritance;

public class Grantparents {

	public void grandfather()
	{
		System.out.println("Grandfather");
	}
	
	public static void grandmother()
	{
		System.out.println("Grantmother");
	}




public static void main(String[] args) {
	//Scenario:-1
	Grantparents obj = new Grantparents();
		obj.grandfather();	
		obj.grandmother();	
		//Scenario:-2
		Grantparents obj1 = new Parents();
		obj.grandfather();
		obj.grandmother();
	Grantparents obj2 = new Parents();
	obj2.grandfather();
	obj2.grandmother();
	
}
}
