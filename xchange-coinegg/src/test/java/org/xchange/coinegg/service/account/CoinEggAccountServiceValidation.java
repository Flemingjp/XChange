package org.xchange.coinegg.service.account;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.dto.account.AccountInfo;
import org.knowm.xchange.service.account.AccountService;
import org.xchange.coinegg.CoinEggExchange;

public class CoinEggAccountServiceValidation {

  private final Exchange genericExchange =  ExchangeFactory.INSTANCE.createExchange(CoinEggExchange.class.getName());
  private final CoinEggExchange coinEggExchange = (CoinEggExchange) genericExchange;
  
  @Test
  public void testValidAccountInfo() throws Exception {
    AccountService accountService = genericExchange.getAccountService();
    AccountInfo accountInfo = accountService.getAccountInfo();
  
    assertThat(accountInfo.getWallets()).isNotEmpty();
  }
  
  
}
