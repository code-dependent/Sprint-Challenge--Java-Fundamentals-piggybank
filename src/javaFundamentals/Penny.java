package javaFundamentals;

public class Penny extends AbstractMoney
{
    public Penny(int quantity)
    {
        super("Penny",.01, quantity);
    }
    public Penny()
    {
        super("Penny",.01, 1);

    }
    
}