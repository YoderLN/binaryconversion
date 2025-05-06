
public class DecimalToBinaryTest {

	public static void main(String[] args)
	{
		DecimalToBinary test1 = new DecimalToBinary(24);
		DecimalToBinary test2 = new DecimalToBinary(255);
		
		System.out.println("24 converts to: " + test1.convertToBinary());
		System.out.println("255 converts to: " + test2.convertToBinary());
	
}
}