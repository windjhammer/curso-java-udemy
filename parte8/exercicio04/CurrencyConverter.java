package parte8.exercicio04;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double dollarxReal(double price, double amount){
        amount += (amount * IOF);
        return price * amount;
    }
}
