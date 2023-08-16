package Tutorial5;

public class demo8 {
	
	public int add(int a, int b)
	{
		
		int c=a+b;
		
		return c;
	}
	public int sub(int c,int d)
	{
		int f=c-d;
		return f;
	}
	
	public static void main(String[] args) {
	
		demo8 obj = new demo8();
		int p =obj.add(300,400);
		int e = obj.sub(900,800);
		System.out.println(p);
		System.out.println(e);
		
	}

}
