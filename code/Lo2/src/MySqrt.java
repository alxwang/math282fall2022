
public class MySqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(4.0,0.0001));
		System.out.println(mySqrt(4.0,0.000000001));
		System.out.println(mySqrt(3.0,0.0001));
		System.out.println(mySqrt(2.0,0.0001));
		System.out.println(mySqrt(49.0,0.0001));
	}

	public static double mySqrt(double dValue, double dPrecision)
	{
		double dResult = 0.0;
		if(dValue<0.0)
		{
			return Double.NaN;
		}
		else
		if(dValue>0.0)
		{
			double dUpper = dValue;
			double dLower = 1.0;
			double dGuess = dValue;
			boolean bKeepGoing = true;
			while(bKeepGoing)
			{
				dGuess = (dUpper+dLower)/2.0;
				double dTest = dGuess * dGuess;
				if(dTest==dValue)
				{
					bKeepGoing = false;
				}
				else if(dTest>dValue)
				{
					dUpper = dGuess;
				}
				else
				{
					dLower = dGuess;
				}
				if((dUpper-dLower)<dPrecision)
				{
					bKeepGoing = false;
				}
			}
			dResult = dGuess;
		}
		return dResult;
	}
}
