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
		return new Fraction(newNumerator, newDenominator);
	}

	public int numerator()
	{
		return numerator;
	}

	public int denominator()
	{
		return denominator;
	}
}
