import java.math.BigDecimal;

public class FixedFee implements Fee {

  private final BigDecimal fixedFee;
  
  public FixedFee(BigDecimal fixedFee) {
    this.fixedFee = fixedFee;
  }
  
  @Override
  public BigDecimal getFee() {
    return fixedFee;
  }

  @Override
  public BigDecimal getFee(BigDecimal quantity) {
    return getFee();
  }

}
