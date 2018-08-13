import java.math.BigDecimal;

public interface Fee {
  
  public BigDecimal getFee();
  
  public BigDecimal getFee(BigDecimal quantity);
  
}
