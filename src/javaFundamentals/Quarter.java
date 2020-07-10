package javaFundamentals;

public class Quarter extends AbstractMoney
{
    public Quarter(int quantity)
    {
        super("Quarter",.25, quantity);
    }
    public Quarter()
    {
        super("Quarter",.25, 1);

    }
    
}