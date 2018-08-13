import java.math.BigDecimal;

public class PercentageFixedFee implements Fee {
  
  private final BigDecimal percentageFee;
  private final BigDecimal fixedFee;
  
  public PercentageFixedFee(BigDecimal percentage, BigDecimal fixedFee) {
    this.percentageFee = percentage;
    this.fixedFee = fixedFee;
  }
  
  @Override
  public BigDecimal getFee(BigDecimal quantity) {
    return quantity.multiply(percentageFee).add(fixedFee);
  }

  @Override
  public BigDecimal getFee() {
    return fixedFee;
  }
  
  public BigDecimal getFixedFee() {
    return fixedFee;
  }
  
  public BigDecimal getPercentageFee() {
    return percentageFee;
  }

}
