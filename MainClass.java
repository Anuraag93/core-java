class Sample
{
	int a1 = 58;
	double d1 = 0.531;

	public void count()
	{
		System.out.println("this is count() of Sample class");
	}
}
class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Prg starts...");
		System.out.println("a1 = "+new Sample().a1);
		System.out.println("d1 = "+new Sample().d1);
		new Sample().count();
		System.out.println("Prg ends...");
	}
}
