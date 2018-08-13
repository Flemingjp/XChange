package org.xchange.coinegg;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.currency.Currency;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.meta.CurrencyMetaData;

public class CoinEggMetadataTest {
  
  private final Exchange genericExchange =  ExchangeFactory.INSTANCE.createExchange(CoinEggExchange.class.getName());
  private final CoinEggExchange coinEggExchange = (CoinEggExchange) genericExchange;
 
  @Test
  public void testCurrenciesMetadata() throws Exception {
    Map<Currency, CurrencyMetaData> currencies = genericExchange.getExchangeMetaData().getCurrencies();
    assertThat(currencies).isNotEmpty();
  }

  @Test
  public void testCurrencyPairsMetadata() throws Exception {
    List<CurrencyPair> currencyPairs = genericExchange.getExchangeSymbols();
    assertThat(currencyPairs).isNotEmpty();
  }

}
