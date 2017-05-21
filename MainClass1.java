class Sample
{
	static int a1 = 58;
	static double d1 = 0.531;

	public static void count()
	{
		System.out.println("this is count() of Sample class");
	}
}
class MainClass1
{
	public static void main(String[] args) 
	{
		System.out.println("Prg starts...");
		System.out.println("a1 = "+Sample.a1);
		System.out.println("d1 = "+Sample.d1);
		Sample.count();
		System.out.println("Prg ends...");
	}
}
