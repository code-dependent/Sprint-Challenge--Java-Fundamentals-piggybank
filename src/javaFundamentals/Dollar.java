package javaFundamentals;

public class Dollar extends AbstractMoney
{
    public Dollar(int quantity)
    {
        super("Dollar",1.0, quantity);
    }
    public Dollar()
    {
        super("Dollar",1.0, 1);

    }
    
}