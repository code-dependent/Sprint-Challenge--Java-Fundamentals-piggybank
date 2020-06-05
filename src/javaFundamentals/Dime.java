package javaFundamentals;

public class Dime extends AbstractMoney{
    public Dime(int quantity){
        super("Dime",.1,quantity);
    }
    public Dime(){
        super("Dime", .1, 1);
    }
    
}