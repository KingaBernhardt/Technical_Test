import java.math.BigDecimal;

public class Calculator implements RevenueCalculator {
  
  private BigDecimal marginPercentage;
  private BigDecimal costOfGoods;
  
  public Calculator(BigDecimal marginPercentage, BigDecimal costOfGoods) {
    this.marginPercentage = marginPercentage;
    this.costOfGoods = costOfGoods;
  }
  
  public BigDecimal getMarginPercentage() {
    return marginPercentage;
  }
  
  public BigDecimal getCostOfGoods() {
    return costOfGoods;
  }
  
  @Override
  public BigDecimal calculateRevenue(BigDecimal marginPercentage, BigDecimal costOfGoods) {
  
  }
  
}
