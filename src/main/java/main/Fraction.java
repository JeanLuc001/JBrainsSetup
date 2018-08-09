package main;

public class Fraction
{
	private final int numerator;
	private final int denominator;
	private final Sign sign;

	public static Fraction of(int numerator, int denominator)
	{
		return new Fraction(numerator, denominator);
	}

	private Fraction(int numerator, int denominator)
	{
		this.sign = Sign.get(numerator, denominator);
		this.numerator = Math.abs(numerator);
		this.denominator = Math.abs(denominator);
	}

	public Fraction add(Fraction f)
	{
		int newNumerator = numerator * sign.s * f.denominator + denominator * f.numerator * f.sign.s;
		int newDenominator = denominator * f.denominator;
		int gcd = calcGreatestCommonDivisor(newNumerator, newDenominator);
		newNumerator = newNumerator / gcd;
		newDenominator = newDenominator / gcd;
		return new Fraction(newNumerator, newDenominator);
	}

	/**
	 * Euclidean algorithm
	 * 
	 * @param x1
	 * @param x2
	 * @return
	 */
	private static int calcGreatestCommonDivisor(int x1, int x2)
	{
		int x3 = 0;
		while ((x3 = x1 % x2) != 0)
		{
			x1 = x2;
			x2 = x3;
		}
		return x2;
	}

	public int numerator()
	{
		return numerator;
	}

	public int denominator()
	{
		return denominator;
	}

	public Sign sign()
	{
		return sign;
	}
	public enum Sign
	{
		MINUS(-1), PLUS(1);
		private final int s;

		private Sign(int s)
		{
			this.s = s;
		}

		static Sign get(int numerator, int denominator)
		{
			if (numerator * denominator < 0)
			{
				return MINUS;
			}
			return PLUS;
		}
	}
}
