import java.math.BigDecimal;

public class PercentageFee implements Fee {

  private final BigDecimal percentage;
  
  public PercentageFee(BigDecimal percentage) {
    this.percentage = percentage;
  }
  
  @Override
  public BigDecimal getFee(BigDecimal quantity) {
    return quantity.multiply(percentage);
  }

  @Override
  public BigDecimal getFee() {
    return percentage;
  }
}
