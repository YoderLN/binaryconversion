
public class BinaryToDecimal {

	String statement;
	
	public BinaryToDecimal(String statement)
	{
		try
		{
		if(!statement.matches("[01]+"))
		{
			throw new IllegalArgumentException(
					"Binary statement can only contain 0 or 1.");	
		}
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e.toString());
		}
		
		this.statement = new StringBuilder(statement).reverse().toString();
		
	}
	
	public int convert()
	
	{
		int soFar = 0;
		for (int i = 0; i < statement.length(); i++)
		{
			char current = statement.charAt(i);
			if(current == '1')
			{
				soFar += calcExponent(2, i);
			}
		}
		
		return soFar;
	}
	
	
	public int calcExponent(int base, int exponent)
	{
		int result = 1;
		
		if (exponent == 0)
		{
			result = 1;
		}
		
		else if(exponent == 1)
		{
			result = base;
		}
		
		else
		{
			for (int i = exponent; i >= 1; i-- )
				result = result * base;
		}
		
		return result;
	}
}
