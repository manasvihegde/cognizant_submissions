public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext p1 =
                new PaymentContext(new CreditCardPayment());
        p1.execute(1000);

        PaymentContext p2 =
                new PaymentContext(new PayPalPayment());
        p2.execute(2000);
    }
}