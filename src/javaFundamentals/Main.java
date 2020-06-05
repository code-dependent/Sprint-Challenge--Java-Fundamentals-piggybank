package javaFundamentals;
import java.text.DecimalFormat;
import java.util.*;

public class Main{
    public static void main(String[] args){
        double sum = 0.;
        DecimalFormat convt = new DecimalFormat("$###,###.00");
        System.out.println("\n*** Piggy Bank App 🐖 ***");

        ArrayList<AbstractMoney> bank = new ArrayList<>();

        bank.add(new Dime(1));
        bank.add(new Penny(1));
        bank.add(new Quarter(1));
        bank.add(new Quarter(4));
        bank.add(new Dollar(4));



        for(AbstractMoney currency:bank){
            System.out.println(currency.toString());
            sum += currency.getTotal();
        }
        System.out.println("The piggy bank holds "+convt.format(sum));




        
    }
}