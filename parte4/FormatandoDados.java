import java.util.Locale;

public class FormatandoDados{
    public static void main(String[] args) {
      String product1 = "Computer";
      String product2 = "Office Desk";

      int age = 30;
      int code = 5290;
      char gender = 'F';

      double price1 = 2100.00;
      double price2 = 650.50;
      double measure = 53.234567;

      System.out.printf("Products: %n");
      System.out.printf("%s, which price is $%.2f%n", product1, price1);
      System.out.printf("%s, which price is $%.2f%n", product2, price2);
      System.out.printf("%n");
      System.out.printf("Record: %d, years old, code %d and gender: %c%n", age, code, gender);
      System.out.printf("%n");
      System.out.printf("Measure with eight decimal places: %.8f%n", measure);
      System.out.printf("Rounded (three decimal places): %.3f%n", measure);
      Locale.setDefault(Locale.US);
      System.out.printf("US Decimal point: %3f%n", measure);

    }
}
