
public class BinaryToDecimalTest {
	
	public static void main(String[] args)
	{
		BinaryToDecimal test1 = new BinaryToDecimal("010101");
		BinaryToDecimal test2 = new BinaryToDecimal("1111");
		
		System.out.println(test1.convert());
		System.out.println(test2.convert());
	}

}
