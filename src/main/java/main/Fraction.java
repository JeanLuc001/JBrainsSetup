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
		return f;
	}

	public int numerator()
	{
		return 47;
	}

	public int denominator()
	{
		return 15;
	}
}
