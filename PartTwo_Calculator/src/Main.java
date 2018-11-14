import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(new BigDecimal(20), new BigDecimal(400));
        System.out.println(calculator.calculateRevenue(new BigDecimal(20), new BigDecimal(400)));
    }
}
