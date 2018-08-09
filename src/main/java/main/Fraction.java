package main;

public class Fraction
{
	private final int numerator;
	private final int denominator;

	public static Fraction of(int numerator, int denominator)
	{
		return new Fraction(numerator, denominator);
	}

	private Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction add(Fraction f)
	{
		int newNumerator = numerator * f.denominator + denominator * f.numerator;
		int newDenominator = denominator * f.denominator;
		int gcd = calcGreatestCommonDivisor(newNumerator, newDenominator);
		newNumerator = Math.abs(newNumerator / gcd);
		newDenominator = Math.abs(newDenominator / gcd);
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
	public enum Sign
	{
		MINUS, PLUS;
	}

	public Sign sign()
	{
		return Sign.MINUS;
	}
}
