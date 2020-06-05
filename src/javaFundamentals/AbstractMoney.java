package javaFundamentals;

abstract class AbstractMoney{
    protected int quantity;
    protected String name;
    protected double value;

    public AbstractMoney(String name, double value, int quantity){
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }
    public AbstractMoney(){
        quantity = 1;
    }
    public String getName(){
        return name;
    }
    public double getTotal(){
        return quantity*value;
    }
    public double getValue(){
        return value;
    }
    @Override
    public String toString(){
        if(quantity>1){
            return quantity + " " + name + 's';
        }else{
            return quantity + " " + name;
        }
    }



    

}