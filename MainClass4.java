class MainClass4 
{
	static int d1 = 50;//Global variable
	static int z1 = 41;//Global variable

	public static void test()
	{
		System.out.println("d1 = "+d1);
		System.out.println("z1 = "+z1);
	}

	public static void main(String[] args) 
	{
		double d1 = 5.12;//Local variable
		double z1 = 8.655;//Local variable
		System.out.println("prg starts...");
		System.out.println("d1 = "+d1);
		System.out.println("z1 = "+z1);
		test();
		System.out.println("prg ends...");
	}
}
