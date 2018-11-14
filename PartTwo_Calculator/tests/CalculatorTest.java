import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static org.junit.Assert.*;

public class CalculatorTest {
  
  Calculator calculator;
  
  @Before
  public void setUp() {
    calculator = new Calculator(new BigDecimal(20), new BigDecimal(400));
  }
  
  @Test
  public void getMarginPercentage() {
    assertEquals(new BigDecimal(20), calculator.getMarginPercentage());
  }
  
  @Test
  public void getCostOfGoods() {
    assertEquals(new BigDecimal(400), calculator.getCostOfGoods());
  }
  
  @Test
  public void calculateNotPercentageMargin() {
    BigDecimal value = new BigDecimal(0.2);
    BigDecimal roundedExpectedValue = value.round(new MathContext(1, RoundingMode.HALF_UP));
    assertEquals(roundedExpectedValue, calculator.calculateNotPercentageMargin(calculator.getMarginPercentage()));
  }
  
  @Test
  public void calculateDivider() {
    BigDecimal value = new BigDecimal(0.8);
    BigDecimal roundedExpectedValue = value.round(new MathContext(1, RoundingMode.HALF_UP));
    assertEquals(roundedExpectedValue, calculator.calculateDivider(calculator.calculateNotPercentageMargin(calculator.getMarginPercentage())));
  }
  
  @Test
  public void calculateRevenue() {
    BigDecimal value = new BigDecimal(500);
    BigDecimal roundedExpectedValue = value.round(new MathContext(2, RoundingMode.HALF_UP));
    assertEquals(roundedExpectedValue, calculator.calculateRevenue(calculator.getMarginPercentage(), calculator.getCostOfGoods()));
  }
}
