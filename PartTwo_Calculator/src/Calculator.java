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
  
  public BigDecimal calculateNotPercentageMargin (BigDecimal marginPercentage){
    BigDecimal notPercentageMargin = marginPercentage.divide(new BigDecimal(100));
    return notPercentageMargin;
  }
  
  public BigDecimal calculateDivider(BigDecimal calculateNotPercentageMargin){
    BigDecimal divider = calculateNotPercentageMargin.subtract(new BigDecimal(1));
    BigDecimal absOfDividerToDivideCostOfGoods = divider.abs();
    return absOfDividerToDivideCostOfGoods;
  }
  
  @Override
  public BigDecimal calculateRevenue(BigDecimal marginPercentage, BigDecimal costOfGoods) {
  
  }
  
}
