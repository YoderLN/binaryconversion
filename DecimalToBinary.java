
public class DecimalToBinary {
	
	int decimal;
	
	public DecimalToBinary(int decimal)
	{
		try
		{
		if (decimal < 0)
		{
			throw new IllegalArgumentException("Negative numbers not currently supported");
		}
		this.decimal = decimal;
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e.toString());
		}
	}
	
	public String convertToBinary()
	{
		int numberToConvert = this.decimal;
		StringBuilder binaryNumber = new StringBuilder();
		
		while (numberToConvert > 0)
		{
			int remainder = numberToConvert % 2;
			binaryNumber.insert(0, remainder);
            numberToConvert /= 2;
		}
		
		return binaryNumber.toString();
	}

}
