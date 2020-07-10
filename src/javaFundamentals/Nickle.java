package javaFundamentals;

public class Nickle extends AbstractMoney
{
    public Nickle(int quantity)
    {
        super("Nickle",.05, quantity);
    }
    public Nickle()
    {
        super("Nickle",.05, 1);

    }
    
}