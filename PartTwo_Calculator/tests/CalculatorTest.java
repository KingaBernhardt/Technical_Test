import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

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
  }
  
  @Test
  public void calculateNotPercentageMargin() {
  }
  
  @Test
  public void calculateDivider() {
  }
  
  @Test
  public void calculateRevenue() {
  }
}